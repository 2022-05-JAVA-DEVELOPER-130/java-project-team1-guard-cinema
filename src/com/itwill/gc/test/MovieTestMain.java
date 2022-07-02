package com.itwill.gc.test;

import java.util.List;

import com.itwill.gc.dao.MovieDao;



public class MovieTestMain {

	public static void main(String[] args) throws Exception{
		MovieDao movieDao=new MovieDao();
		
		System.out.println("selectByMovieTitle:"+movieDao.selectByMovieTitle("흙흙흙"));
		System.out.println("selectByIng 상영중:"+movieDao.selectByIng("true"));
		System.out.println("selectByIng 예정:"+movieDao.selectByIng("false"));
		
		
	
	}

}
