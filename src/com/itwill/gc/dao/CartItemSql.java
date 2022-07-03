package com.itwill.gc.dao;

public class CartItemSql {
	public static final String INSERT_CART=
	"insert into cart (cart_no, user_id, food_code, cart_qty,food_name) values (CART_CART_NO_SEQ.nextval, ?, ?, ?,?)";	
	public static final String CART_SELECT_LIST=
	"select c.*,f.* from cartitem c join food f on c.f_code=f.f_code where user_id=?";
	public static final String DELETE_CART=
	"delete from cart where cart_no=?";
	public static final String UPDATE_CART_SET=
	"update cart set cart_qty=cart_qty+? where user_id=? and food_code=?";
	
	public static final String CART_SELECT_BY_USERID_FOOD_CODE=
	"select count(*) as cnt from cartitem where user_id=? and food_code=?";
	
}
