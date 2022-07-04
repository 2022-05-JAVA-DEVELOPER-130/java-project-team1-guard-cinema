package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.CartItem;
import com.itwill.gc.vo.Food;
import com.itwill.gc.vo.FoodReceipt;
import com.itwill.gc.vo.User;

public class FoodReceiptDao {
	private DataSource dataSource;
	public FoodReceiptDao() {
		dataSource=new DataSource();
	}
	/*
	 * selelctByPK : 상품번호로 검색
	 */
	public FoodReceipt selectByNo(int food_rv_num) throws Exception{
		FoodReceipt foodReceipt=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		con = dataSource.getConnection();
		pstmt = con.prepareStatement(FoodReceiptSql.FOOD_RV_SELECT_BY_NO);
		pstmt.setInt(1, food_rv_num);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			foodReceipt=
					new FoodReceipt(
							rs.getInt("food_rv_num"),
							new User(rs.getString("user_id"), "", "", "", "", ""),
							new Food(rs.getInt("food_code"), rs.getString("food_name"), "", rs.getInt("food_price"), ""),
							new CartItem(0,rs.getInt("cart_qty"),null,null));
		
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return foodReceipt;
	}
	
	/*
	 * selelctByID : 아이디로 검색
	 */
	public FoodReceipt selectById(String user_id) throws Exception{
		FoodReceipt foodReceipt=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(FoodReceiptSql.FOOD_RECEIPT_SELECT_BY_ID);
		pstmt.setString(1, user_id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			
			foodReceipt=
					new FoodReceipt(
							rs.getInt("food_rv_num"),
							new User(rs.getString("user_id"), "", "", "", "", ""),
							new Food(rs.getInt("food_code"), rs.getString("food_name"), "", rs.getInt("food_price"), ""),
							new CartItem(0,rs.getInt("cart_qty"),null,null));
							 
		}
		rs.close();
		pstmt.close();
		con.close();
		return foodReceipt;
	}


}
