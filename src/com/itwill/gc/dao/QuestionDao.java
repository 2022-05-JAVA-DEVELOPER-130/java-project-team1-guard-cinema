package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Question;
import com.itwill.gc.vo.User;

public class QuestionDao {
   private DataSource dataSource;
   public QuestionDao() {
      dataSource = new DataSource();
   }
   
   
   //1:1문의 작성
   public int add(Question question) throws Exception{
      String insertQuestion = 
            "insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,?,?,?,?,?,sysdate)";
      Connection con = null;
      PreparedStatement pstmt = null;
      int insertRowCount = 0;
      //왜 트라이가 들어가는거지
      try {
         con = dataSource.getConnection();
         pstmt = con.prepareStatement(insertQuestion);
         pstmt.setString(1, question.getUser().getUserId());
         pstmt.setString(2, question.getQuestion_title());
         pstmt.setString(3, question.getQuestion_content());
         pstmt.setString(4, question.getQuestion_cate_one());
         pstmt.setString(5, question.getQuestion_cate_two());
         insertRowCount = pstmt.executeUpdate();
      }finally {
         if(con!=null) {
            con.close();
         }
      }
      return insertRowCount;
   }
   
   //1:1문의 수정
   public int update(String sUserId, int question_no, String question_title,String question_content)throws Exception{
      String updateQuestion = 
            "update question set question_title = ?,question_content = ? where question_no = ? and user_id = ?";
      Connection con = null;
      PreparedStatement pstmt = null;
      int updateRowCount = 0;
      try {
         con = dataSource.getConnection();
         pstmt = con.prepareStatement(updateQuestion);
         pstmt.setString(1, question_title);
         pstmt.setString(2, question_content);
         pstmt.setInt(3, question_no);
         pstmt.setString(4, sUserId);
         updateRowCount = pstmt.executeUpdate();
      }finally {
         if(con!=null) {
            con.close();
         }
      }
      return updateRowCount;
   }
   
   
   //1:1문의 삭제
   
   //1:1문의 선택하여 삭제
   public int deleteQuestionByNo(int question_no)throws Exception{
      String deleteQustion = "delete question where question_no = ?";
      Connection con = null;
      PreparedStatement pstmt = null;
      int deleteRowCount = 0;
      try {
         con = dataSource.getConnection();
         pstmt = con.prepareStatement(deleteQustion);
         pstmt.setInt(1, question_no);
         deleteRowCount = pstmt.executeUpdate();
      }finally {
         if(con!=null) {
            con.close();
         }
      }
      return deleteRowCount;
   }
   
   //1:1문의 전체 삭제
   public int deleteQuestionAll(String sUserId)throws Exception{
      String deleteQustion = "delete question where user_id = ?";
      Connection con = null;
      PreparedStatement pstmt = null;
      int deleteRowCount = 0;
      try {
         con = dataSource.getConnection();
         pstmt = con.prepareStatement(deleteQustion);
         pstmt.setString(1, sUserId);
         deleteRowCount = pstmt.executeUpdate();
      }finally {
         if(con!=null) {
            con.close();
         }
      }
      return deleteRowCount;
   }
   
   //1:1문의 보기(select)
   
   public Question selectByNo(String sUserId, int question_no)throws Exception{
	   Question question = null;
	   Connection con = null;
	   PreparedStatement pstmt = null;
	   con =dataSource.getConnection();
	   pstmt = con.prepareStatement(QuestionSql.QUESTION_SELECT_BY_NO);
	   pstmt.setString(1,question.getUser().getUserId());
	   pstmt.setInt(2,question.getQuestion_no());
	   ResultSet rs = pstmt.executeQuery();
	   if(rs.next()) {
		   question =
	   				new Question(rs.getInt("question_no"), 
	   							new User(rs.getString("user_id"), "", "", "", "", ""), 
	   							rs.getString("question_title"), 
	   							rs.getString("question_content"), 
	   							rs.getString("question_cate_one"), 
	   							rs.getString("question_cate_two"), 
	   							rs.getDate("question_date"));
	   
	   }
	   rs.close();
	   pstmt.close();
	   con.close();
	   
	   return question;
   }
   
   /*
   이름                널?       유형            
  ----------------- -------- ------------- 
  QUESTION_NO       NOT NULL NUMBER(10)    
  USER_ID                    VARCHAR2(20)  
  QUESTION_TITLE             VARCHAR2(50)  
  QUESTION_CONTENT           VARCHAR2(500) 
  QUESTION_CATE_ONE          VARCHAR2(50)  
  QUESTION_CATE_TWO          VARCHAR2(50)  
  QUESTION_DATE              DATE  
   */
   
   public List<Question> selectAll(String sUserId) throws Exception {
	   List<Question> questionList = new ArrayList<Question>();
	   
	   Connection con = dataSource.getConnection();
	   PreparedStatement pstmt= con.prepareStatement(QuestionSql.QUESTION_SELECT_ALL);
	   pstmt.setString(1, sUserId);
	   ResultSet rs = pstmt.executeQuery();
	   while(rs.next()) {
		   questionList.add(
				   				new Question(rs.getInt("question_no"), 
				   							new User(rs.getString("user_id"), "", "", "", "", ""), 
				   							rs.getString("question_title"), 
				   							rs.getString("question_content"), 
				   							rs.getString("question_cate_one"), 
				   							rs.getString("question_cate_two"), 
				   							rs.getDate("question_date"))
				   );
	   }
	   rs.close();
	   pstmt.close();
	   con.close();
	   return questionList;
   }
   
}