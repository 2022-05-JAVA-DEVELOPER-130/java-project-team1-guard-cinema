package com.itwill.gc.vo;

public class CartItem {
	private int cartNo;
	private int cart_qty;
	
	private User user;
	
	private Food food;
	
	public CartItem() {
		
	}
	
	public CartItem(int cartNo, int cart_qty, User user, Food food) {
		super();
		this.cartNo=cartNo;
		this.cart_qty=cart_qty;
		this.user=user;
		this.food=food;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	
	
	@Override
	public String toString() {
		return "CartItem [cartNo=" + cartNo + ", cart_qty=" + cart_qty + ", user=" + user + ", food=" + food + "]";
	}
	
	
	
}
