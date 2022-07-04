package com.itwill.gc.test;



import com.itwill.gc.dao.ReviewDao;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.Review;
import com.itwill.gc.vo.User;

public class ReviewTestMain  {
	public static void main(String[] args) throws Exception {
		ReviewDao reviewdao = new ReviewDao();
	
	/*
		System.out.println("insert");
		
		Review insertReview =new Review(0,  
				new User("qkrrjsxo", null, null, null, null, null),
				"리뷰제목", 
				null, 
				new Movie(1,null,null,0,null,null,null,0,null,0,null,""),
				"리뷰본문");
		
		System.out.println(reviewdao.insertReivew(insertReview));
		 
	*/
		 
	
		System.out.println("update");
		
		reviewdao.updateReview("guard3", 3, "제목수정", "내용수정");
		
		
		
		
		
	//	System.out.println("delete");
		
	//	System.out.println(reviewdao.deleteReview(2));
	
		
	//	System.out.println("리뷰상세보기");
	//	Review review1 = reviewdao.selectReviewbyNo(5);
	//	System.out.println(review1);
	
	
	}
}
