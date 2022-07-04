package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.MovieDao;
import com.itwill.gc.vo.Movie;

public class MovieService {

	private MovieDao movieDao;
	public MovieService() throws Exception {
		movieDao=new MovieDao();
	}
	/*
	 * 영화 이름으로 영화 검색하기
	 */
	public Movie selectByMovieTitle(String movie_title) throws Exception {
		return movieDao.selectByMovieTitle(movie_title);
	}
	
	/*
	 * 상영중인 영화 검색하기
	 */
	public List<Movie> selectByIng(String movie_ing) throws Exception {
		return movieDao.selectByIng(movie_ing);
	}
	
	/*
	 * 영화 코드로 영화 검색하기
	 */
	public Movie selectByMovieCode(int movie_code) throws Exception{
		return movieDao.selectByMovieCode(movie_code);
	}
	
	
}
