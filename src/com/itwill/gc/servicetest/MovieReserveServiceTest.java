package com.itwill.gc.servicetest;

import com.itwill.gc.service.MovieReserveService;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieItem;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;

public class MovieReserveServiceTest {

	public static void main(String[] args) throws Exception {
		MovieReserveService movieReserveService = new MovieReserveService();
		
		
		
		System.out.println("영화 예매하기");
		System.out.println(">> "+movieReserveService.movieReserve(new MovieReserve(0,"2월5일",3,"11시~13시",0,"건대","서울",
				new Movie(1,"",null,0,"","","",0,"",0,"",""),
				new User("guard2","","","","",""))));
		
		
		
		System.out.println("내 예매목록 보기");
		System.out.println(">> "+movieReserveService.myReserve("guard1"));
		
		
		System.out.println("예매번호로 예매 취소");
		System.out.println(">> "+movieReserveService.movieCancleByNum(2));
		
		
		//System.out.println(">>"+movieReserveService.searchReserve(new MovieItem(1,1,1,1,1)));
	}

}
