package com.itwill.gc.test;
import java.util.ArrayList;
import java.util.List;
import com.itwill.gc.dao.MovieReserveDao;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;
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
		
		//System.out.println("4.영화 예매 페이지");
	 
		//rowCount = movieReserveDao.add(new MovieReserve(0,"2월5일",2,"11시~13시",0,"건대","서울",
		//		new Movie(1,"",null,0,"","","",0,"",0,"",""),
		//		new User("qkrrjsxo","","","","","")));
	   
		
	
		
		
	}

}
