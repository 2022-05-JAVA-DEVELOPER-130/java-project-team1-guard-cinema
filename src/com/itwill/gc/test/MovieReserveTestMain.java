package com.itwill.gc.test;
import java.util.ArrayList;
import java.util.List;
import com.itwill.gc.dao.MovieReserveDao;
import com.itwill.gc.vo.MovieReserve;
public class MovieReserveTestMain {
	
	public static void main(String[] args) throws Exception{
		
		MovieReserveDao movieReserveDao = new MovieReserveDao();
		//System.out.println("1.내 예매목록 아이디로 보기");
		//List<MovieReserve> movieReserve1 = movieReserveDao.getMovieReserveListById("qkrrjsxo");
		//System.out.println(movieReserve1);
		
		
		
		//System.out.println("2.예매번호로 예매 삭제");
		int rowCount = -999;
		//rowCount = movieReserveDao.deleteMovieReserveByNo(1);
		//System.out.println(">>"+rowCount);
		
		//System.out.println("3.아이디로 예매 삭제");
		
		//rowCount = movieReserveDao.deleteMovieReserveById("qkrrjsxo");
		//System.out.println(">>"+rowCount);
		
		System.out.println("4.영화 예매 1페이지");
	 
		//rowCount = movieReserveDao.add1("qkrrjsxo", 1);
	    //rowCount = movieReserveDao.add2("12월3일", "22~24","건대입구","서울",1);
	    //rowCount = movieReserveDao.add3(22,1);
		
		rowCount = movieReserveDao.deleteMovieReserveOne(1);
		//rowCount = movieReserveDao.deleteMovieReserveTwo(1);
		//rowCount = movieReserveDao.deleteMovieReserveThree(1);
		
		
	}

}
