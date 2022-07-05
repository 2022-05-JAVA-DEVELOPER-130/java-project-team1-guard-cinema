package com.itwill.gc.service;

import com.itwill.gc.dao.UserDao;
import com.itwill.gc.vo.User;

public class UserService {
   
   private UserDao userDao;

   public UserService() {
      userDao=new UserDao();
   }
   //회원가입
   public int create(User user) throws Exception{
      if(userDao.serchUserid(user.getUserId())) {
         return -1;
      }else {
         int rowCount=userDao.create(user);
         return rowCount;
      }   
   }
   //로그인
   public int login(String userId,String password)throws Exception{
      int result=0;
      if(userDao.serchUserid(userId)) {
         
         User loginUser = userDao.finduserInfo(userId);
         if(loginUser.getUserPassword().equals(password)) {
            
            result=1;
         }else {
            
            result=0;
         }
      }else {
         
         result=0;
      }
      return result;
   }
   
   //로그아웃
   public void logout() {
      }
   //회원 이메일로 아이디찾기
   
   public User findUser(String userid) throws Exception{
      return userDao.findUser(userid);
   }
   
   //회원 정보수정
   public int update(User user)throws Exception{
      return userDao.update(user);
   }
   //아이디중복체크
   public boolean chekId(String userId) throws Exception{
      return userDao.serchUserid(userId);
   }
   //회원탈퇴
   public int remove(String userId) throws Exception{
      return userDao.remove(userId);
   }
   
   
   
   
}