package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Food;

public class FoodDao {
	private DataSource dataSource;
	public FoodDao() throws Exception {
		dataSource=new DataSource();
	}
	/*
	 * selelctByPK : 상품번호로 검색
	 */
	public Food selectByNo(int food_code) throws Exception{
		Food food=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(FoodSql.FOOD_SELECT_BY_NO);
		pstmt.setInt(1, food_code);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			food=
					new Food(
							rs.getInt("food_code"),
							rs.getString("food_name"), 
							rs.getString("food_info"),
							rs.getInt("food_price"),
							rs.getString("food_image")
							);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return food;
	}
	/*
	 * selectAll : 상품전체검색
	 */
	public List<Food> selectAll() throws Exception{
		List<Food> foodList=new ArrayList<Food>();
		
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(FoodSql.FOOD_LIST);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Food food=new Food(
					rs.getInt("food_code"),
					rs.getString("food_name"), 
					rs.getString("food_info"),
					rs.getInt("food_price"),
					rs.getString("food_image")
					);
			foodList.add(food);
		}
		rs.close();
		pstmt.close();
		con.close();
		return foodList;
	}
}

