package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Review;
import com.itwill.gc.vo.User;

public class ReviewDao {

	private DataSource dataSource;

	public ReviewDao() throws Exception {
		dataSource = new DataSource();
	}
	/*

	 */

	// 리뷰작성
	public int insertReivew(Review reivew) throws Exception {

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.Review_INSERT);

		pstmt.setString(1, reivew.getUserId().getUserId());
		pstmt.setString(2, reivew.getReview_title());
		pstmt.setString(3, reivew.getReview_content());
		pstmt.setInt(4, reivew.getReview_num());
		pstmt.setInt(5, reivew. getMovie_code());
		pstmt.setDate(6, reivew.getReview_date());
		int rCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rCount;
	}
	
	//리뷰수정
	public int updateReview(Review reivew) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.Review_UPDATE);
		pstmt.setInt(1, reivew.getReview_num());
		pstmt.setString(2, reivew.getReview_title());
		pstmt.setString(3, reivew.getReview_content());
	
		int rCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rCount;
	}
	
	
	
	
	// 리뷰삭제
	public int deleteReview(Review reivew) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.Review_DELETE);
		pstmt.setString(1, reivew.getUserId().getUserId());
		pstmt.setInt(2, reivew.getReview_num());
		
		
		int rCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rCount;
	}

}
