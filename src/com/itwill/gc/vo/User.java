 package com.itwill.gc.vo;

public class User {
   private String userId;
   private String userName;
   private String userPhNum;
   private String userJumin;
   private String userEmail;
   private String userPassword;
   
   
   public User() {
      
   }
   

   public User(String userId) {
	super();
	this.userId = userId;
}


public User(String userId, String userName, String userPhNum, String userJumin, String userEmail,
         String userPassword) {
      super();
      this.userId = userId;
      this.userName = userName;
      this.userPhNum = userPhNum;
      this.userJumin = userJumin;
      this.userEmail = userEmail;
      this.userPassword = userPassword;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserPhNum() {
      return userPhNum;
   }

   public void setUserPhNum(String userPhNum) {
      this.userPhNum = userPhNum;
   }

   public String getUserJumin() {
      return userJumin;
   }

   public void setUserJumin(String userJumin) {
      this.userJumin = userJumin;
   }

   public String getUserEmail() {
      return userEmail;
   }

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

   public String getUserPassword() {
      return userPassword;
   }

   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }
   
   @Override
   public String toString() {
      return "User [userId=" + userId + ", name=" + userName + ", phNum= " +userPhNum+ ", jumin= " +userJumin+ ", email=" + userEmail + ", password= " +userPassword+ "]";
   }
}