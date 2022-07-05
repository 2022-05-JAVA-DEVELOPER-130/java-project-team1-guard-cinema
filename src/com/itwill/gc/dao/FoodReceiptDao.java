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
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;


public class FoodReceiptDao {
	private DataSource dataSource;
	public FoodReceiptDao() {
		dataSource=new DataSource();
	}
	
	//예약번호검색
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
	
	
	  //selelctByID : 아이디로 검색
	 
	public List<FoodReceipt> selectById(String userId) throws Exception{
		ArrayList<FoodReceipt> foodReceipt=new ArrayList<FoodReceipt>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(FoodReceiptSql.FOOD_RECEIPT_SELECT_BY_ID);
		pstmt.setString(1, userId);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			
			foodReceipt.add(
					new FoodReceipt(
							rs.getInt("food_rv_num"),
							new User(rs.getString("user_id"), "", "", "", "", ""),
							new Food(rs.getInt("food_code"), rs.getString("food_name"), "", rs.getInt("food_price"), ""),
							new CartItem(0,rs.getInt("cart_qty"),null,null)));
							 
		}
		rs.close();
		pstmt.close();
		con.close();
		return foodReceipt;
	}
	//카트담긴물건 구매 
	public int cartToReceipt(String userId)throws Exception{
		String insertQuery=FoodReceiptSql.INSERT_FOOD_RECEIPT;
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		int price = 0;
		
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setString(1,userId);
			
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
	}
	

	
	
	
	//목록삭제
	public int deleteListById(int food_rv_num) throws Exception{
		String deleteQuery=FoodReceiptSql.DELETE_FOOD_RECEIPT;
		Connection con=null;
		PreparedStatement ptmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(deleteQuery);
			ptmt.setInt(1, food_rv_num);
			deleteRowCount = ptmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	
	


}
