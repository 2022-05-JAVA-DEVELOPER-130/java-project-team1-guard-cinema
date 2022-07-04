package com.itwill.gc.vo;
import java.sql.Date;
import com.itwill.gc.vo.User;

public class Review {
   private User userId;
   private int review_num;
   private String review_title;
   private Date review_date;
   private int movie_code;
   private String review_content;
   
   public Review() {
      
   }
   
   public Review(User userId,int review_num,String review_title,Date review_date,int movie_code,String review_content) {
      super();
      this.userId=userId;
      this.review_num=review_num;
      this.review_title=review_title;
      this.review_date=review_date;
      this.movie_code=movie_code;
      this.review_content=review_content;
   }


   public User getUserId() {
      return userId;
   }

   public void setUserId(User userId) {
      this.userId = userId;
   }

   public int getReview_num() {
      return review_num;
   }

   public void setReview_num(int review_num) {
      this.review_num = review_num;
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

   public int getMovie_code() {
      return movie_code;
   }

   public void setMovie_code(int movie_code) {
      this.movie_code = movie_code;
   }

   public String getReview_content() {
      return review_content;
   }

   public void setReview_content(String review_content) {
      this.review_content = review_content;
   }
   @Override
   public String toString() {
      return "Review [userId=" + userId + ", review_num=" + review_num + ", review_title=" + review_title
            + ", review_date=" + review_date + ", movie_code=" + movie_code + ", review_content=" + review_content
            + "]";
   }
}