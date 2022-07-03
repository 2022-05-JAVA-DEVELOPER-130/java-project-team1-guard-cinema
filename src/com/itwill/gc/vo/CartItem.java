package com.itwill.gc.vo;

public class CartItem {
	private int cartNo;
	private User userID;
	private int foodCode;
	private int cart_qty;
	private String foodName;
	private int foodPrice;
	
	public CartItem(int cartNo, User userID, int cart_qty, int foodCode, String foodName, int foodPrice) {
		super();
		this.cartNo=cartNo;
		this.userID=userID;
		this.foodCode=foodCode;
		this.cart_qty=cart_qty;
		this.foodName=foodName;
		this.foodPrice=foodPrice;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public int getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(int foodCode) {
		this.foodCode = foodCode;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	@Override
	public String toString() {
		return "CartItem [cartNo=" + cartNo + ", userID=" + userID + ",  cart_qty=" + cart_qty + ", foodCode=" + foodCode + ", foodName=" + foodName + "]";
	}
	
	
	
}
