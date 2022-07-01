package com.itwill.gc.test;

import java.util.List;

import movie.MovieDao;

public class MovieTestMain {

	public static void main(String[] args) throws Exception{
		MovieDao movieDao=new MovieDao();
		
		System.out.println("selectByMovieTitle:"+movieDao.selectByMovieTitle());
		System.out.println("selectByMovieCode:"+movieDao.selectByMovieCode());
		System.out.println("selectAllMovieList");
		System.out.println("  "+movieDao.selectAll());
		
	
	}

}
