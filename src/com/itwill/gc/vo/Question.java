package com.itwill.gc.vo;

import java.sql.Date;

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
public class Question {
	private int question_no;
	private User user;
	private String question_title;
	private String question_content;
	private String question_cate_one;
	private String question_cate_two;
	private Date question_date;

	public Question() {
		
	}

	public Question(int question_no, User user, String question_title, String question_content,
			String question_cate_one, String question_cate_two, Date question_date) {
		super();
		this.question_no = question_no;
		this.user = user;
		this.question_title = question_title;
		this.question_content = question_content;
		this.question_cate_one = question_cate_one;
		this.question_cate_two = question_cate_two;
		this.question_date = question_date;
	}

	public int getQuestion_no() {
		return question_no;
	}

	public void setQuestion_no(int question_no) {
		this.question_no = question_no;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getQuestion_title() {
		return question_title;
	}

	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}

	public String getQuestion_content() {
		return question_content;
	}

	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}

	public String getQuestion_cate_one() {
		return question_cate_one;
	}

	public void setQuestion_cate_one(String question_cate_one) {
		this.question_cate_one = question_cate_one;
	}

	public String getQuestion_cate_two() {
		return question_cate_two;
	}

	public void setQuestion_cate_two(String question_cate_two) {
		this.question_cate_two = question_cate_two;
	}

	public Date getQuestion_date() {
		return question_date;
	}

	public void setQuestion_date(Date question_date) {
		this.question_date = question_date;
	}

	@Override
	public String toString() {
		return "Question [question_no=" + question_no + ", user=" + user + ", question_title=" + question_title
				+ ", question_content=" + question_content + ", question_cate_one=" + question_cate_one
				+ ", question_cate_two=" + question_cate_two + ", question_date=" + question_date + "]";
	}
	
	
}
