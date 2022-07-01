package com.itwill.gc.vo;

public class FoodReceipt {
	private int food_rv_num;
	private String user_id;
	private int food_code;
	private int cart_qty;
	private int cart_price;
	private String food_image;
	
	
	public FoodReceipt(int food_rv_num, String user_id, int food_code, int cart_qty, int cart_price,
			String food_image) {
		super();
		this.food_rv_num = food_rv_num;
		this.user_id = user_id;
		this.food_code = food_code;
		this.cart_qty = cart_qty;
		this.cart_price = cart_price;
		this.food_image = food_image;
	}


	public int getFood_rv_num() {
		return food_rv_num;
	}


	public void setFood_rv_num(int food_rv_num) {
		this.food_rv_num = food_rv_num;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public int getFood_code() {
		return food_code;
	}


	public void setFood_code(int food_code) {
		this.food_code = food_code;
	}


	public int getCart_qty() {
		return cart_qty;
	}


	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}


	public int getCart_price() {
		return cart_price;
	}


	public void setCart_price(int cart_price) {
		this.cart_price = cart_price;
	}


	public String getFood_image() {
		return food_image;
	}


	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}


	@Override
	public String toString() {
		return "FoodReceipt [food_rv_num=" + food_rv_num + ", user_id=" + user_id + ", food_code=" + food_code
				+ ", cart_qty=" + cart_qty + ", cart_price=" + cart_price + ", food_image=" + food_image + "]";
	}
	

}
