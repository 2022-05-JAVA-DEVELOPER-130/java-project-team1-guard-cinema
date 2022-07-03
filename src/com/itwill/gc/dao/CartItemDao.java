package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.User;
import com.itwill.gc.vo.Food;
import com.itwill.gc.vo.CartItem;

public class CartItemDao {
	private DataSource dataSource;
	public CartItemDao() throws Exception{
		dataSource = new DataSource();
	}
	//cartitem 제품 보유상태
	public int  selectfoodCount(String sUserId,int food_code) throws Exception{
		int count=0;
		Connection con=null;
		PreparedStatement ptmt=null;
		ResultSet rs=null;
		String selectQuery=CartItemSql.CART_SELECT_FOOD_NOW;
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(selectQuery);
			ptmt.setString(1, sUserId);
			ptmt.setInt(2, food_code);
			rs = ptmt.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}
		
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return count;
	}
	//cartitem 담기
	public int add(CartItem cartItem) throws Exception {
		String insertQuery=CartItemSql.INSERT_CART;
		Connection con=null;
		PreparedStatement ptmt=null;
		int insertrCount=0;
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(insertQuery);
			ptmt.setString(1, cartItem.getUserID().getUserId());
			ptmt.setInt(2, cartItem.getFoodCode());
			ptmt.setInt(3, cartItem.getCart_qty());
			ptmt.setString(4, cartItem.getFoodName());
			ptmt.setInt(5, cartItem.getFoodPrice());
			insertrCount = ptmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertrCount;
	}
	//cartItem 추가
	public int update(String sUserId, int food_code, int cart_qty) throws Exception{
		String updateQuery=CartItemSql.UPDATE_CART_SET;
		Connection con=null;
		PreparedStatement ptmt=null;
		int rCount=0;
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(updateQuery);
			ptmt.setInt(1, cart_qty);
			ptmt.setNString(2, sUserId);
			ptmt.setInt(3, food_code);
			rCount = ptmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rCount;
	}
	//cartItem 목록
	public ArrayList<CartItem> getCartList(String sUserId) throws Exception{
		ArrayList<CartItem> cartList=new ArrayList<CartItem>();
		
		Connection con=dataSource.getConnection();
		PreparedStatement ptmt=con.prepareStatement(CartItemSql.CART_SELECT_LISTUP);
		ptmt.setString(1,sUserId);
		ResultSet rs=ptmt.executeQuery();
		
		while(rs.next()) {
			
			 cartList.addCart(
					new CartItem(rs.getInt("cart_no"), 
								rs.getString("user_id"), 
								rs.getInt("food_code"), 
								rs.getInt("cart_qty"), 
								rs.getString("food_name"), 
								rs.getInt("food_price")),
								new User(rs.getString("user_Id"),"","","","",""),
								 new Food(rs.getInt("food_code"),
											rs.getString("food_name"),
											rs.getString("food_info"),
											rs.getInt("food_price"),
											rs.getString("food_image"))	 
							)
					);
					
		}

		return cartList;
	}
	//cart 삭제
	public int deleteCartByNo(int cart_no) throws Exception{
		String deleteQuery=CartItemSql.DELETE_CART;
		Connection con=null;
		PreparedStatement ptmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(deleteQuery);
			ptmt.setInt(1, cart_no);
			deleteRowCount = ptmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
}
