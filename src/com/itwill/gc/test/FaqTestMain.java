package com.itwill.gc.test;

import com.itwill.gc.dao.FaqDao;

public class FaqTestMain {
	public static void main(String[] args) throws Exception{
		FaqDao faqDao = new FaqDao();
		System.out.println("1. 전체공지 보기");
		System.out.println(" "+faqDao.selectAll());
		System.out.println("2. 카테코리 안의 전체공지 보기");
		System.out.println(" "+faqDao.selectAllByCate("카테고리1"));
		//이거 테이블 고쳐야함... 카테고리랑 컨텐트 위치가 바뀜
		System.out.println(faqDao.selectByNo(1));
	}
}
