package com.itwill.gc.vo;

public class FoodReceipt {
	private int food_rv_num;
	
	private User user;
	private Food food;
	private CartItem cartitem;
	
	
	
	public FoodReceipt(int food_rv_num, User user, Food food, CartItem cartItem) {
		super();
		this.food_rv_num = food_rv_num;
		this.user = user;
		this.food = food;
		this.cartitem = cartitem;
	}



	public int getFood_rv_num() {
		return food_rv_num;
	}



	public void setFood_rv_num(int food_rv_num) {
		this.food_rv_num = food_rv_num;
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



	public CartItem getCartitem() {
		return cartitem;
	}



	public void setCartitem(CartItem cartitem) {
		this.cartitem = cartitem;
	}
	
	
	@Override
	public String toString() {
		return "FoodReceipt [food_rv_num=" + food_rv_num + ", User=" + user + ", Food=" + food + ", CartItem=" + cartitem + "]";
	}
	
	

}
