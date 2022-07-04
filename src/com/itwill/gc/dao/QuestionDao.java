package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Question;

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
   
}