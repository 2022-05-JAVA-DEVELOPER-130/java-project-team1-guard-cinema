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

   // 유저 정보 수정
   public int update(User user) throws Exception{
      Connection con=dataSource.getConnection();
      PreparedStatement pstmt=con.prepareStatement(UserSql.USER_UPDATE);
      pstmt.setString(1, user.getUserId());
      pstmt.setString(2, user.getUserName());
      pstmt.setString(3, user.getUserPhNum());
      pstmt.setString(4, user.getUserJumin());
      pstmt.setString(5, user.getUserEmail());
      pstmt.setString(6, user.getUserPassword());
      pstmt.setString(7, user.getUserId());
      int rowCount=pstmt.executeUpdate();
      pstmt.close();
      con.close();
      return rowCount;
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
         user = new User(rs.getString("user_id"), rs.getString("user_name"), rs.getString("user_ph_num"),
               rs.getString("user_jumin"), rs.getString("user_email"), rs.getString("user_password"));
      }
      return user;
   }

   //유저 아이디 찾기
   public User findUser(String userId)throws Exception {
      User user=null;
      Connection con=dataSource.getConnection();
      PreparedStatement pstmt=con.prepareStatement(UserSql.SELECT_USER_ID);
      pstmt.setString(1, userId);
      ResultSet rs = pstmt.executeQuery();
      if(rs.next()) {
         user=new User(
               rs.getString("user_id"),
               rs.getString("user_name"), 
               rs.getString("user_ph_num"), 
               rs.getString("user_jumin"),
               rs.getString("user_email"),
               rs.getString("user_password"));
      }
      return user;
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