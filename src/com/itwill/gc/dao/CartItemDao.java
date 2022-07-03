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
	//cart 제품 보유상태
	public int  selectfoodCount(String sUserId,int food_code) throws Exception{
		int count=0;
		Connection con=null;
		PreparedStatement ptmt=null;
		ResultSet rs=null;
		String selectQ="select count(*)  as f_count from cartitem c join user_info u on c.user_id=u.user_id where u.user_id=? and c.food_code=?";
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(selectQ);
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
	
	
}
