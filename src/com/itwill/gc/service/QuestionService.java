package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.QuestionDao;
import com.itwill.gc.vo.Question;

public class QuestionService {
	private QuestionDao questionDao;
	public QuestionService() {
		questionDao = new QuestionDao();
	}
	/*
	 * 로그인후 문의내역확인
	 */
	
	public List<Question> selectAll(String userId) throws Exception{	
	return questionDao.selectAll(userId);	
	}
	
	
	
	
	/*
	 * 하나의 문의내역 답변확인(?)
	 */
	public Question selectByNo(String userId,int question_no)throws Exception{
		return questionDao.selectByNo(userId, question_no);
	}
	
	/*
	 * 문의등록
	 */
	public int addQuestion(Question question) throws Exception {
		return questionDao.add(question);
	}
	
	/*
	 * 문의수정
	 */
	public int updateQuestion(String userId, int question_no, String question_title,String question_content) throws Exception{
		return questionDao.update(userId, question_no,question_title, question_content);
	}
	
	/*
	 * 문의삭제
	 */
	//하나의 문의 삭제
	public int deleteQuestion(int question_no)throws Exception{
		return questionDao.deleteQuestionByNo(question_no);
	}
	//유저한명의 모든 내역 삭제
	public int deleteQuestionAll(String userId) throws Exception{
		return questionDao.deleteQuestionAll(userId);
	}
	
}
