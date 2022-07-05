package com.itwill.gc.service;

import com.itwill.gc.dao.CartItemDao;

public class CartItemService {
	private CartItemDao cartItemDao;
	public CartItemService()throws Exception{
		cartItemDao = new CartItemDao();
	}
	
	
}
