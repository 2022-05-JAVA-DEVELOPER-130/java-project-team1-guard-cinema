package com.itwill.gc.dao;

public class FoodReceiptSql {
	
	public final static String FOOD_RECEIPT_SELECT_BY_ID =
			"select * from foodReceipt where user_id=?";
	public final static String FOOD_RV_SELECT_BY_NO =
			"select * from foodReceipt where food_rv_num=?";

}
