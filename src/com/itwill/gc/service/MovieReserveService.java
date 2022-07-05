package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.MovieReserveDao;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;

public class MovieReserveService {

	private MovieReserveDao movieReserveDao;
	public MovieReserveService()throws Exception{
		movieReserveDao = new MovieReserveDao();
	}
	/*
	 * 영화 예매하기 
	 */
	public boolean movieReserve(MovieReserve movieReserve) throws Exception {
		boolean isSuccess = false;
		MovieReserve findSeat = movieReserveDao.selectByMany(movieReserve.getMovie().getMovie_code(), movieReserve.getMovie_day(), movieReserve.getMovie_daytime(),movieReserve.getCinema_name(), movieReserve.getCinema_place(), movieReserve.getMovie_seat_num());
		if(findSeat == null) {
			int rowCount = movieReserveDao.add(movieReserve);
			isSuccess = true;
			
		}else {
			isSuccess = false;
		}
		return isSuccess;
	}
	
	
	/*
	 * 예매목록 
	 */
	public List<MovieReserve> myReserve(String user_id)throws Exception{
		List<MovieReserve> result = null;
		result = movieReserveDao.getMovieReserveListById(user_id);
		return result;
		
	}
	
	
	/*
	 * 예매번호로 예매 취소 
	 */
	public int movieCancleByNum(int movie_rv_num)throws Exception{
		int result = movieReserveDao.deleteMovieReserveByNo(movie_rv_num);
		if(result==1) {
			//영화 취소 성공
			return result;
		}else
		{	//취소 실패
			return result;
		}
		
		
		
		
	}
	public void movieReserve(int i, String i_day, int i_seat, String i_daytime, int i_price, String i_cname,
			String i_cplace, Movie movie, User user) {
		// TODO Auto-generated method stub
		
	}
}
