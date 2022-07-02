package com.itwill.gc.test;

import com.itwill.gc.dao.GongjiDao;

public class GongjiTestMain {
	public static void main(String[] args) throws Exception{
		GongjiDao gongjiDao = new GongjiDao();
		System.out.println("1. 전체공지 보기");
		System.out.println(" "+gongjiDao.selectAll());
		System.out.println("2. 카테코리 안의 전체공지 보기");
		System.out.println(" "+gongjiDao.selectAllByCate("전체공지"));
		System.out.println("1번 공지");
		System.out.println(gongjiDao.selectByNo(1));
	}

}
