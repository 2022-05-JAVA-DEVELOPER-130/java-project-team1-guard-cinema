package com.itwill.gc.vo;
/*
 이름           널?       유형            
------------ -------- ------------- 
FAQ_NO       NOT NULL NUMBER(10)    
FAQ_CATEGORY          VARCHAR2(50)  
FAQ_TITLE             VARCHAR2(50)  
FAQ_CONTENT           VARCHAR2(500) 
 */
public class Faq {
	private int faq_no;
	private String faq_category;
	private String faq_title;
	private String faq_content;
	
	public Faq() {
		
	}

	public Faq(int faq_no, String faq_category, String faq_title, String faq_content) {
		super();
		this.faq_no = faq_no;
		this.faq_category = faq_category;
		this.faq_title = faq_title;
		this.faq_content = faq_content;
	}

	public int getFaq_no() {
		return faq_no;
	}

	public void setFaq_no(int faq_no) {
		this.faq_no = faq_no;
	}

	public String getFaq_category() {
		return faq_category;
	}

	public void setFaq_category(String faq_category) {
		this.faq_category = faq_category;
	}

	public String getFaq_title() {
		return faq_title;
	}

	public void setFaq_title(String faq_title) {
		this.faq_title = faq_title;
	}

	public String getFaq_content() {
		return faq_content;
	}

	public void setFaq_content(String faq_content) {
		this.faq_content = faq_content;
	}

	@Override
	public String toString() {
		return "Faq [faq_no=" + faq_no + ", faq_category=" + faq_category + ", faq_title=" + faq_title
				+ ", faq_content=" + faq_content + "]";
	}
	

}
