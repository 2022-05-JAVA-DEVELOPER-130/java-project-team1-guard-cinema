package com.itwill.gc.dao;

public class FoodReceiptSql {

   
	
   public final static String FOOD_RECEIPT_SELECT_BY_ID =
         "select * from food_receipt where user_id=?";
   public final static String FOOD_RV_SELECT_BY_NO =
         "select * from food_receipt where food_rv_num=?";
   public static final String INSERT_FOOD_RECEIPT=
         "insert into food_receipt (food_rv_num, user_id, food_code, cart_qty, food_name, food_price) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval,?,?,?,?,?)";
   public static final String DELETE_FOOD_RECEIPT=
         "delete from cart where food_rv_num=?";
   

}
