package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.MovieReserveDao;
import com.itwill.gc.vo.MovieReserve;

public class MovieReserveService {

	private MovieReserveDao movieReserveDao;
	public MovieReserveService()throws Exception{
		movieReserveDao = new MovieReserveDao();
	}
	/*
	 * 영화 예매하기 
	 */
	public int movieReserve(MovieReserve movieReserve) throws Exception {
		int result=movieReserveDao.add(movieReserve);;
		if(result==1) {
			//영화 예매 성공
			return result;
		}else
		{	//영화 예매 실패
			return result;
		}
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
}
