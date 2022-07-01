package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.User;

public class UserDao {
	private DataSource dataSource;
	public UserDao() {
		dataSource = new DataSource();
	}
	//새로운 유저 생성
	public int create(User user) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt=con.prepareStatement(UserSql.INSERT_USER_INFO);
		ptmt.setString(1, user.getUserId());
		ptmt.setString(2, user.getUserName());
		ptmt.setString(3, user.getUserPhNum());
		ptmt.setString(4, user.getUserJumin());
		ptmt.setString(5, user.getUserEmail());
		ptmt.setString(6, user.getUserPassword());
		int rCount=ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;
		
	}
	//유저 전화번호 수정
	public int update(User user) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement ptmt=con.prepareStatement(UserSql.UPDATE_USER_PH_NUM);
		ptmt.setString(1, user.getUserPhNum());
		int rCount=ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;
		
	}
	//유저 이메일 수정
	public int update(User user) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement ptmt=con.prepareStatement(UserSql.UPDATE_USER_EMAIL);
		ptmt.setString(1, user.getUserEmail());
		int rCount=ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;
		
	}
	//유저 비밀번호 수정
	public int update(User user) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement ptmt=con.prepareStatement(UserSql.UPDATE_USER_PASSWORD);
		ptmt.setString(1, user.getUserPassword());
		int rCount=ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;
		
	}



}
