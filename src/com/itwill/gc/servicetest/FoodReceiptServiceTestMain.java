package com.itwill.gc.servicetest;

import com.itwill.gc.service.FoodReceiptService;

public class FoodReceiptServiceTestMain {

	public static void main(String[] args)throws Exception {
		FoodReceiptService foodReceiptService = new FoodReceiptService();
		
		System.out.println(">>"+foodReceiptService.selectFoodReceipt("guard1"));

	}

}
