package com.itwill.gc.servicetest;

import com.itwill.gc.vo.User;
import com.itwill.gc.service.UserService;

public class UserServiceTest {

   public static void main(String[] args) throws Exception{
      UserService  userService=new UserService();
      
     // System.out.println("회원가입");
    //  int rowCount=userService.create(new User("qwer", "김씨", "01071719139", "9510011111111", "qwer@naver.com", "5432"));
    //  System.out.println(">> "+rowCount);
      
   //   System.out.println("로그인");
   //   int result = userService.login("f", "f");
    //  System.out.println("yes"+result);
    //  result = userService.login("yyyy", "1111");
   //   System.out.println("no"+result);
   //   result = userService.login("xxxx", "2222");
     
      System.out.println("3.정보수정");
      int rowCount = userService.update(new User("f", "씨김", "01071719319", "9510012222222" , "rewq@naver.com", "2345"));
      System.out.println(">> "+rowCount);
      System.out.println("   "+userService.findUser("f"));
      
  //    System.out.println("4.삭제");
  //    rowCount = userService.remove("qwer");
   //   System.out.println(">> "+rowCount);
      
      
      
   }
}