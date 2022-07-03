package com.itwill.gc.dao;

public class CartItemSql {
	
	public static final String INSERT_CART=
	"insert into cart (cart_no, user_id, food_code, cart_qty,food_name) values (CART_CART_NO_SEQ.nextval, ?, ?, ?,?)";	
	public static final String UPDATE_CART_SET=
	"update cart set cart_qty=cart_qty+? where user_id=? and food_code=?";
	public static final String CART_SELECT_FOOD_NOW=
	"select count(*)  as food_count from cart_item c join user_info u on c.user_id=u.user_id where u.user_id=? and c.food_code=?";
	public static final String CART_SELECT_LISTUP=
	"select * from cart_Item c join user_info u on c.user_id=u.user_id "
    + "join food f on f.food_code=c.food_code "
    + "where u.user_id=?";
	public static final String DELETE_CART=
	"delete from cart where cart_no=?";
	
	
	
	
}
