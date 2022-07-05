package com.itwill.gc.test;

import java.util.List;

import com.itwill.gc.vo.FoodReceipt;

import com.itwill.gc.dao.UserDao;
import com.itwill.gc.dao.CartItemDao;
import com.itwill.gc.dao.FoodDao;
import com.itwill.gc.dao.FoodReceiptDao;

public class FoodReceiptTestMain {
	public static void main(String[] args) throws Exception {
		FoodReceiptDao foodReceiptDao = new FoodReceiptDao();
		//아이디로 검색
		//System.out.println("selelctById 아이디로 검색:" + foodReceiptDao.selectById("guard1"));
		// 예약번호로 검색
		//System.out.println("selelctByNo 예약 번호로 검색:" + foodReceiptDao.selectByNo(1));
		//FoodDao foodDao = new FoodDao();
		//CartItemDao cartItemDao = new CartItemDao();
		// 주문내역
		System.out.println("카트를 영수증으로!!: "+foodReceiptDao.cartToReceipt("qkrrjsxo"));
		// 주문내역 삭제
	//	System.out.println("deleteListById 주문내역삭제:" + foodReceiptDao.deleteListById(1));

	}
}