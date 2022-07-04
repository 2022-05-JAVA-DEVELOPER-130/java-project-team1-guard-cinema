package com.itwill.gc.dao;
/*
 /*******리뷰**********
--리뷰리스트
select * from review;
--리뷰 상세보기
select * from review where review_num=5;
--로그인한 회원 리뷰수정 
update review set review_title='리뷰제목333'review_content='리뷰본문수정' where review_no=6 and user_id='abc1';
--로그인한 회원 리뷰삭제
delete review where review_num=8';

 */
public class ReviewSql {

	public static final String Review_INSERT = 
			"insert into review(review_no,user_id,review_title,review_date,movie_code,review_content) values(REVIEW_REVIEW_NO_SEQ.nextval,?,?,sysdate,?,?)";
	public static final String Review_UPDATE =
			"update review set review_title=?,review_content=? where review_no=? and user_id =?";
	public static final String Review_DELETE =
			"delete review where review_no=?";
	public static final String ReviewselectbyNo=
			"select * from review where review_no=?";
}
