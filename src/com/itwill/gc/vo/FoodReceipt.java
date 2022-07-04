package com.itwill.gc.vo;

public class FoodReceipt {
	private int food_rv_num;
	private String user_id;
	private int food_code;
	private int cart_qty;
	private String food_name;
	private int food_price;
	
	
	public FoodReceipt(int food_rv_num, String user_id, int food_code, int cart_qty, String food_name, int food_price) {
		super();
		this.food_rv_num = food_rv_num;
		this.user_id = user_id;
		this.food_code = food_code;
		this.cart_qty = cart_qty;
		this.food_name = food_name;
		this.food_price = food_price;
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
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public int getFood_price() {
		return food_price;
	}
	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	@Override
	public String toString() {
		return "FoodReceipt [food_rv_num=" + food_rv_num + ", user_id=" + user_id + ", food_code=" + food_code
				+ ", cart_qty=" + cart_qty + ", food_name=" + food_name + ", food_price=" + food_price + "]";
	}
	
	

}
