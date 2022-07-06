package com.itwill.gc.dao;

public class FoodSql {
	public final static String FOOD_LIST =
			"select * from food";
	public final static String FOOD_SELECT_BY_NO =
			"select * from food where food_code=?";

}
