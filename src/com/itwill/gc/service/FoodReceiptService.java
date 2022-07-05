package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.FoodReceiptDao;
import com.itwill.gc.vo.CartItem;
import com.itwill.gc.vo.FoodReceipt;

public class FoodReceiptService {
	private FoodReceiptDao foodReceiptDao;
	
	public FoodReceiptService() throws Exception {
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
	    * 카트담긴 물건 구매
	    */
	   
	   
	
	/*
	 * 구매내역삭제
	 */
	public FoodReceipt deleteListById(int food_rv_num) throws Exception {
	      return foodReceiptDao.deleteListById(int food_rv_num);
	   }
	

}
