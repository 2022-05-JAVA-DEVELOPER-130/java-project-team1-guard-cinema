package com.itwill.gc.service;

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
}
