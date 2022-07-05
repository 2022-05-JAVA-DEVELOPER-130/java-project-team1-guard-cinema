package com.itwill.gc.servicetest;

import java.util.List;

import com.itwill.gc.service.QuestionService;
import com.itwill.gc.vo.Question;
import com.itwill.gc.vo.User;

public class QuestionServiceTest {

	public static void main(String[] args)throws Exception {
		QuestionService questionService = new QuestionService();
		int rowCount = 0;
		
		System.out.println("1.add");
		Question question = new Question(0, new User("guard2", null, null, null, null, null), 
				"문의제목추가", "문의내용추가", "카테고리1", "카테고리2", null);
		rowCount = questionService.addQuestion(question);
		System.out.println(">>"+rowCount);
		
		/*
		System.out.println("2.update");
		Question question1 = questionService.selectByNo("guard1", 16);
		question1.setQuestion_title("문의제목바꿔요");
		question1.setQuestion_title("문의내용도바꿔요~");
		*/
		
		/*
		System.out.println("3.deleteByNo");
		rowCount = questionService.deleteQuestion(16);
		System.out.println(">>"+rowCount);
		*/
		
		/*
		System.out.println("4.deleteAll");
		rowCount = questionService.deleteQuestionAll("guard1");
		System.out.println(">>"+rowCount);
		*/
		
		System.out.println("5.selectList");
		List<Question> questionList1 = questionService.selectAll("guard2");
		System.out.println(questionList1);
		
		System.out.println("5.selectOne");
		Question question2 = questionService.selectByNo("guard1", 16);
		System.out.println(question2);
		
	}
	
}
