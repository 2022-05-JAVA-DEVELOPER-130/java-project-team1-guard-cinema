package com.itwill.gc.test;
import java.util.ArrayList;
import java.util.List;
import com.itwill.gc.dao.MovieReserveDao;
import com.itwill.gc.vo.MovieReserve;
public class MovieReserveTestMain {
	
	public static void main(String[] args) throws Exception{
		
		MovieReserveDao movieReserveDao = new MovieReserveDao();
		System.out.println("1.내 예매목록 아이디로 보기");
		ArrayList<MovieReserve> movieReserve1 = movieReserveDao.getMovieReserveListById("qkrrjsxo");
		System.out.println(movieReserve1);
	}

}
