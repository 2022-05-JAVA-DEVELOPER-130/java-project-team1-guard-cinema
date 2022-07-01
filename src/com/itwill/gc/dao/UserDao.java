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
	// 새로운 유저 생성
	public int create(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.INSERT_USER_INFO);
		ptmt.setString(1, user.getUserId());
		ptmt.setString(2, user.getUserName());
		ptmt.setString(3, user.getUserPhNum());
		ptmt.setString(4, user.getUserJumin());
		ptmt.setString(5, user.getUserEmail());
		ptmt.setString(6, user.getUserPassword());
		int rCount = ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;

	}

	// 유저 전화번호 수정
	public int updateByPhone(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.UPDATE_USER_PH_NUM);
		ptmt.setString(1, user.getUserPhNum());
		int rCount = ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;

	}

	// 유저 이메일 수정
	public int updateByEmail(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.UPDATE_USER_EMAIL);
		ptmt.setString(1, user.getUserEmail());
		int rCount = ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;

	}

	// 유저 비밀번호 수정
	public int updateByPW(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.UPDATE_USER_PASSWORD);
		ptmt.setString(1, user.getUserPassword());
		int rCount = ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;

	}

	// 회원 탈퇴
	public int remove(String userId) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.DELETE_USER_INFO);
		ptmt.setString(1, userId);
		int rCount = ptmt.executeUpdate();
		ptmt.close();
		con.close();
		return rCount;

	}

	// 유저 정보 가져오기
	public User finduserInfo(String userId) throws Exception {
		User user = null;
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.SELECT_USER_INFO);
		ptmt.setString(1, userId);
		ResultSet rs = ptmt.executeQuery();
		if (rs.next()) {
			user = new User(rs.getString("userId"), rs.getString("userName"), rs.getString("userPhNum"),
					rs.getString("userJumin"), rs.getString("userEmail"), rs.getString("userPassword"));
		}
		return user;
	}

	// 이메일을 이용해 유저 아이디 찾기
	public String findUser(String userEmail) throws Exception {
		String findUser = null;
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.SELECT_USER_ID);
		ptmt.setString(1, userEmail);
		ResultSet rs = ptmt.executeQuery();
		if (rs.next()) {
			findUser = rs.getString("userid");
		}
		return findUser;
	}

	
	// 유저 아이디 중복검사
	public boolean serchUserid(String userId) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement ptmt = con.prepareStatement(UserSql.SELECT_BY_ID_COUNT);
		ptmt.setString(1, userId);
		ResultSet rs = ptmt.executeQuery();
		rs.next();
		int userCount = rs.getInt(1);
		if (userCount == 1) {
			return true;
		} else {
			return false;
		}
	}
}
