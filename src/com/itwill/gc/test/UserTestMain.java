package com.itwill.gc.test;

	import com.itwill.gc.dao.UserDao;
	import com.itwill.gc.vo.User;

	public class UserTestMain {
		
		public static void main(String[] args) throws Exception{
			UserDao userDao=new UserDao();
			System.out.println("1.create:"+ userDao.create(new User("kkkk8", "김용찬", "01011111111", "910000000000000000", "kkkk1@gamil.com", "pass1234")));
			System.out.println("2.findUserInfo:"+userDao.finduserInfo("qkrrjsxo"));
			System.out.println("3.update:"+userDao.update(new User("kkkk4", "김용찬", "001022222222", "910000000000000000", "kkkk1@gamil.com", "pass1234")));
			System.out.println("4.findUserID"+userDao.findUser("qkrrjsxo"));
			System.out.println("4.remove:"+userDao.remove("kkkk1"));
			System.out.println("6.existedUser:"+userDao.serchUserid("guard1"));
			
		
		}
	}

