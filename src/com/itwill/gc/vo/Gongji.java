package com.itwill.gc.vo;


import java.sql.Date;
/*
이름              널?       유형            
--------------- -------- ------------- 
GONGJI_NO       NOT NULL NUMBER(10)    
GONGJI_TITLE             VARCHAR2(50)  
GONGJI_CONTENT           VARCHAR2(500) 
GONGJI_DATE              DATE          
GONGJI_CATEGORY          VARCHAR2(50)  
*/
public class Gongji {
	private int gongji_no;
	private String gongji_title;
	private String gongji_content;
	private Date gongji_date;
	private String gongji_category;
	
	public Gongji() {
		
	}

	public Gongji(int gongji_no, String gongji_title, String gongji_content, Date gongji_date, String gongji_category) {
		super();
		this.gongji_no = gongji_no;
		this.gongji_title = gongji_title;
		this.gongji_content = gongji_content;
		this.gongji_date = gongji_date;
		this.gongji_category = gongji_category;
	}

	public int getGongji_no() {
		return gongji_no;
	}

	public void setGongji_no(int gongji_no) {
		this.gongji_no = gongji_no;
	}

	public String getGongji_title() {
		return gongji_title;
	}

	public void setGongji_title(String gongji_title) {
		this.gongji_title = gongji_title;
	}

	public String getGongji_content() {
		return gongji_content;
	}

	public void setGongji_content(String gongji_content) {
		this.gongji_content = gongji_content;
	}

	public Date getGongji_date() {
		return gongji_date;
	}

	public void setGongji_date(Date gongji_date) {
		this.gongji_date = gongji_date;
	}

	public String getGongji_category() {
		return gongji_category;
	}

	public void setGongji_category(String gongji_category) {
		this.gongji_category = gongji_category;
	}

	@Override
	public String toString() {
		return "Gongji [gongji_no=" + gongji_no + ", gongji_title=" + gongji_title + ", gongji_content="
				+ gongji_content + ", gongji_date=" + gongji_date + ", gongji_category=" + gongji_category + "]";
	}
	
	
}
