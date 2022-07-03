package com.itwill.gc.dao;

public class MovieReserveSql {
	//영화 예매
	public final static String MOVIE_RESERVE="insert into movie_reserve values("
			+ "MOVIE_RESERVE_MOVIE_RV_NUM_SEQ.nextval,"
			+ "1,'qkrrjsxo',(select movie_day from movie where movie_code=1),"
			+ "1,120,12000,'지구멸망좀','건대입구','서울');";
	
	//id로 예매정보
	public final static String RESERVE_LIST_BY_ID= 
			"select* from movie_reserve m join user_info u on m.user_id=u.user_id "
			+ "join movie s on m.movie_code = s.movie_code where "
			+ "u.user_id = ?";
	
	
	
	

/*
	--예매
	insert into movie_reserve values(MOVIE_RESERVE_MOVIE_RV_NUM_SEQ.nextval,1,'qkrrjsxo',(select movie_day from movie where movie_code=1),1,120,12000,'지구멸망좀','건대입구','서울');
			--(movie_code말고도 영화제목,user_id등등도 변수나 select로 뽑아서 사용)
	--id로 예매정보
	select* from movie_reserve m join user_info u on m.user_id=u.user_id join movie s on m.movie_code = s.movie_code where
	u.user_id = ?;

	--영화취소
	delete from movie_reserve where user_id='qkrrjsxo';
*/
}
/*"select * from cart c join userinfo u on c.userid=u.userid  "
+ "join product p on p.p_no=c.p_no "
+ "where u.userid=?";
*/