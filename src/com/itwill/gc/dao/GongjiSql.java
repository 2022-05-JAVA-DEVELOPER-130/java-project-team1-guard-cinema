package com.itwill.gc.dao;

public class GongjiSql {
	public final static String GONGJI_ALL_LIST =
			"select * from gongji";
	public final static String GONGJI_LIST =
			"select * from gongji where gongji_category = ?";
	public final static String GONGJI_SELECT_BY_NO =
			"select * from gongji where gongji_no = ?";


}
