package com.itwill.gc.dao;

public class FoodReceiptSql {

   
	
   public final static String FOOD_RECEIPT_SELECT_BY_ID =
         "select * from food_receipt f join food s on f.food_code = s.food_code where user_id=?";
   public final static String FOOD_RV_SELECT_BY_NO =
         "select * from food_receipt f join food s on f.food_code = s.food_code where food_rv_num=?";
   public static final String INSERT_FOOD_RECEIPT=
         "insert into food_receipt SELECT  user_id,food_code,cart_qty,food_name,food_price FROM cart WHERE user_id = ?";
   public static final String DELETE_FOOD_RECEIPT=
         "delete from cart where food_rv_num=?";
   

}
