package com.itwill.gc.vo;

import java.sql.Date;
import com.itwill.gc.vo.User;
import com.itwill.gc.vo.Movie;
public class Review {
	private int review_no;
   private User user;
   private String review_title;
   private Date review_date;
   private Movie movie;
   private String review_content;
   
   public Review() {
      
   }
   
   public Review(int review_no,User user,String review_title,Date review_date,Movie movie,String review_content) {
      super();
      this.review_no=review_no;
      this.user=user;
      this.review_title=review_title;
      this.review_date=review_date;
      this.movie=movie;
      this.review_content=review_content;
   }


   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public int getReview_no() {
      return review_no;
   }

   public void setReview_no(int review_no) {
      this.review_no = review_no;
   }

   public String getReview_title() {
      return review_title;
   }

   public void setReview_title(String review_title) {
      this.review_title = review_title;
   }

   public Date getReview_date() {
      return review_date;
   }

   public void setReview_date(Date review_date) {
      this.review_date = review_date;
   }

   public Movie getMovie() {
      return movie;
   }

   public void setMovie(Movie movie) {
      this.movie = movie;
   }

   public String getReview_content() {
      return review_content;
   }

   public void setReview_content(String review_content) {
      this.review_content = review_content;
   }
  
   @Override
   public String toString() {
      return "Review [review_no=" + review_no + "user=" + user + ", review_title=" + review_title
            + ", review_date=" + review_date + ", movie=" + movie + ", review_content=" + review_content
            + "]";
   }
}