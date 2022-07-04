package com.itwill.gc.test;

import com.itwill.gc.dao.FaqDao;

import java.util.List;

import com.itwill.gc.dao.CartItemDao;

import com.itwill.gc.vo.CartItem;
import com.itwill.gc.vo.Food;
import com.itwill.gc.vo.User;

public class CartItemTestMain {

	public static void main(String[] args) throws Exception {
		CartItemDao cartitemDao = new CartItemDao();

		System.out.println("1.cartItem 목록보기");
		
		int rowCount = -999;		
		
		/*
				new CartItem(0, 2, new User("qkrrjsxo",null,null,null,null,null), new Food(10, null, null, rowCount, null));	
				new User("kkkk1", null, null, null, null, null),
				new Food(1, "팝콘", null, 1000, null),
				new CartItem(null, 1, null, null);	
		rowCount = cartitemDao.add1(addCart);
		System.out.println(">> "+rowCount);


		/*
			System.out.println("2.updateByCartNo");
			rowCount=cartitemDao.update("kkkk1",3,2);
			System.out.println(">> "+rowCount);
	*/	
		/*
			System.out.println("3.delete");
			rowCount=cartitemDao.deleteCartByNo(5);
			System.out.println(">> "+rowCount);
		*/
		/*
		System.out.println("4.cartList[select]");
		 List<CartItem> cartList1=cartitemDao.getCartList("guard1");
		 System.out.println("guard1-->"+cartList1);
		*/
		/*
		System.out.println("5.selectProductCount");
		int foodCount1 = cartitemDao.selectfoodCount("guard1", 8);
		*/
	}
}
