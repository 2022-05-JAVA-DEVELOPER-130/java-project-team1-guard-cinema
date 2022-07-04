package com.itwill.gc.dao;

public class ReviewSql {

	public static final String Review_INSERT = 
			"insert into review(review_num,user_id,review_title,review_date,movie_code,review_content) values(review_num_seq.nextval,?,?,sysdate,?,?)";
	public static final String Review_UPDATE =
			"update review set review_content=? where review_num=? and user_id=?";
	public static final String Review_DELETE =
			"delete review where review_num=? and user_id=?";


}
