package com.itwill.gc.test;

import com.itwill.gc.dao.FoodDao;

public class FoodTestMain {
	public static void main(String[] args) throws Exception{
		FoodDao foodDao=new FoodDao();
		//상품번호로 검색
		System.out.println("selelctByPK 상품번호로 검색:"+foodDao.selectByFoodNo(10));
		// 상품전체검색
		System.out.println("모든상품:"+foodDao.selectAllFood());
	
		
		
	
	}
}
