package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


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
		
		
		String insertQuery=ReviewSql.Review_INSERT;
		Connection con=null;
		PreparedStatement ptmt=null;
		int insertrCount=0;
		try {
			con=dataSource.getConnection();
			ptmt=con.prepareStatement(insertQuery);
			ptmt.setString(1, reivew.getUser().getUserId());
			ptmt.setString(2, reivew.getReview_title());
			ptmt.setInt(3, reivew.getMovie().getMovie_code());
			ptmt.setString(4, reivew.getReview_content());
			
			insertrCount = ptmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertrCount;
		
	}
	
	//리뷰수정
	public int updateReview(String user_id,int review_no, String review_title, String reivew_content) throws Exception {
		//"update review set review_title=? review_content=? where review_no=? and user_id=?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.Review_UPDATE);
		pstmt.setString(1,review_title);
		pstmt.setString(2, reivew_content);
		pstmt.setInt(3, review_no);
		pstmt.setString(4,user_id);
		
		int updaterowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return updaterowCount;
	}
	
	
	
	
	// 리뷰삭제
	public int deleteReview(int review_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.Review_DELETE);
		pstmt.setInt(1, review_no);
		
		
		
		int deleterowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return deleterowCount;
	}
	// 리뷰 상세보기
	public Review selectReviewbyNo(int review_no) throws Exception {
		Review selectreview = null;
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.ReviewselectbyNo);
		
		pstmt.setInt(1, review_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			selectreview = new Review(rs.getInt("review_no"),
					new User(rs.getString("user_id"), "", "", "", "", ""),
					rs.getString("review_title"),
					rs.getDate("review_date"),
					null, rs.getString("review_content"));
					
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return selectreview;
	}

}
