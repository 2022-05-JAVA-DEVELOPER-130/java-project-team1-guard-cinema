package com.itwill.gc.test;

import java.util.List;

import com.itwill.gc.dao.CartItemDao;

import com.itwill.gc.vo.CartItem;
import com.itwill.gc.vo.Food;
import com.itwill.gc.vo.User;


public class CartItemTestMain {

	public static void main(String[] args) throws Exception {
		CartItemDao cartDao = new CartItemDao();

		System.out.println("5.selectfoodCount");
		int foodC1 = cartDao.selectfoodCount("guard1", 8);
	}
}
