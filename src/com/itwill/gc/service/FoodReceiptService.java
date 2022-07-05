package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.FoodReceiptDao;
import com.itwill.gc.vo.FoodReceipt;

public class FoodReceiptService {
	private FoodReceiptDao foodReceiptDao;
	
	public FoodReceiptService() {
		FoodReceiptDao foodReceiptDao = new FoodReceiptDao();
	}
	/*
	 * 구매내역 확인
	 */
	public boolean selectFoodReceipt(String userId) throws Exception{
		boolean isExist = false;
		List<FoodReceipt> findFoodReceipt=foodReceiptDao.selectById(userId);
		if(findFoodReceipt!=null) {
			foodReceiptDao.selectById(userId);
			isExist = true;
		}else {
			isExist = false;
		}
		
		return isExist;
	}
	
	/*
	 * 구매내역추가
	 */
	
	/*
	 * 구매내역삭제
	 */
	
}
