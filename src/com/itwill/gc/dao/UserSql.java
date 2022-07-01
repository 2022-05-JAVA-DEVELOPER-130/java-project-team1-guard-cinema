package com.itwill.gc.dao;


public class UserSql {
	public static final String INSERT_USER_INFO= 
	"insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password) values(?,?,?,?,?,?)";
	public static final String UPDATE_USER_PH_NUM=
	"update user_info set user_ph_num=? where user_id=?";
	public static final String UPDATE_USER_EMAIL=
	"update user_info set user_email=? where user_id=?";
	public static final String UPDATE_USER_PASSWORD=
	"update user_info set user_password=? where user_id=?";
	public static final String DELETE_USER_INFO=
	"delete from user_info where user_id=?";
	public static final String SELECT_USER_INFO=
	"select user_id, user_name, user_ph_num, user_jumin, user_email, user_password from user_info where user_id=?";
	public static final String SELECT_USER_ID=
	"select user_id from user_info where user_email=?";
	public static final String SELECT_BY_ID_COUNT=
	"select count(*) as cnt from user_info where user_id=?";
}
