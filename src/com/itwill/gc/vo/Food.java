package com.itwill.gc.vo;

public class Food {
	private int food_code;
	private String food_name;
	private String food_info;
	private int food_price;
	private String food_image;
	
	
	public Food(int food_code, String food_name, String food_info, int food_price, String food_image) {
		super();
		this.food_code = food_code;
		this.food_name = food_name;
		this.food_info = food_info;
		this.food_price = food_price;
		this.food_image = food_image;
	}


	public int getFood_code() {
		return food_code;
	}


	public void setFood_code(int food_code) {
		this.food_code = food_code;
	}


	public String getFood_name() {
		return food_name;
	}


	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}


	public String getFood_info() {
		return food_info;
	}


	public void setFood_info(String food_info) {
		this.food_info = food_info;
	}


	public int getFood_price() {
		return food_price;
	}


	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}


	public String getFood_image() {
		return food_image;
	}


	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}


	@Override
	public String toString() {
		return "Food [food_code=" + food_code + ", food_name=" + food_name + ", food_info=" + food_info
				+ ", food_price=" + food_price + ", food_image=" + food_image + "]";
	}

	
}
