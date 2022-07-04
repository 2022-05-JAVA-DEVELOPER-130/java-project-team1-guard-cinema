package com.itwill.gc.servicetest;

import com.itwill.gc.service.MovieService;

public class MovieServiceTest {

	public static void main(String[] args) throws Exception {
		MovieService movieService = new MovieService();
		
		System.out.println("영화이름으로 영화 검색하기");
		System.out.println(">> "+movieService.selectByMovieTitle("흙흙흙"));
		System.out.println("영화코드로 영화 검색하기");
		System.out.println(">> "+movieService.selectByMovieCode(1));
		System.out.println("상영중인 영화 검색하기");
		System.out.println(">> "+movieService.selectByIng("true"));
	}

}
