package com.itwill.gc.dao;

public class FoodReceiptSql {
	
	public final static String FOOD_RECEIPT_SELECT_BY_ID =
			"select * from food_receipt where user_id=?";
	public final static String FOOD_RV_SELECT_BY_NO =
			"select * from food_receipt where food_rv_num=?";

}
