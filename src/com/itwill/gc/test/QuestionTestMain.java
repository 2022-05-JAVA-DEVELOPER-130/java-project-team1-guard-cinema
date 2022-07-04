package com.itwill.gc.test;

import java.util.List;

import com.itwill.gc.dao.QuestionDao;
import com.itwill.gc.vo.Question;
import com.itwill.gc.vo.User;

public class QuestionTestMain {
   
   public static void main(String[] args) throws Exception{
      QuestionDao questionDao = new QuestionDao();
/*******************문의작성************************/
      System.out.println("1.add(insert)");
      
      int rowCount = -999;
      Question addQuestion = 
            new Question(0, 
                  new User("guard1", null, null, null, null, null), 
                  "문의제목1", "문의내용1", "카테고리1", "카테고리2", null);
      rowCount = questionDao.add(addQuestion);
/*****************문의수정***********************/
      

/*******************문의삭제***********************/      
      
/******************문의확인**********************/
      System.out.println("4.selectByNo");
      
      
      System.out.println("5.selectAll");
      List<Question> questionList1 = questionDao.selectAll("guard1");
      System.out.println("guard1-->"+questionList1);
   }
   
   
   
}
