package com.itwill.gc.dao;

public class FaqSql {
	public final static String FAQ_ALL_LIST =
			"select * from faq ";
	public final static String FAQ_LIST =
			"select * from faq where faq_category = ?";
	public final static String FAQ_SELECT_BY_NO =
			"select * from faq where faq_no = ?";
	
}
