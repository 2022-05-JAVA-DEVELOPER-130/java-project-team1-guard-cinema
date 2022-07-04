package com.itwill.gc.servicetest;

import com.itwill.gc.service.MovieReserveService;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;

public class MovieReserveServiceTest {

	public static void main(String[] args) throws Exception {
		MovieReserveService movieReserveService = new MovieReserveService();
		System.out.println("영화 예매하기");
		System.out.println(">>성공1 실패0 "+movieReserveService.movieReserve(new MovieReserve(0,"2월5일",2,"11시~13시",0,"건대","서울",
				new Movie(1,"",null,0,"","","",0,"",0,"",""),
				new User("qkrrjsxo","","","","",""))));
		
	}

}
