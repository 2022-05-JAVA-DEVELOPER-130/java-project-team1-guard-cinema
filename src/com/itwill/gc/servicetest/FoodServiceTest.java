package com.itwill.gc.servicetest;

import com.itwill.gc.service.FoodService;

public class FoodServiceTest {

	public static void main(String[] args) throws Exception {
		FoodService foodService = new FoodService();
		
		System.out.println("상품번호로 검색");
		System.out.println(">> "+foodService.selectByFoodNo(10));
		System.out.println("상품전체 검색");
		System.out.println(">> "+foodService.selectAllFood());
	}
}
