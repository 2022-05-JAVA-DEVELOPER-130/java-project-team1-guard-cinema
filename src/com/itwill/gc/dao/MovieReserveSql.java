package com.itwill.gc.dao;

public class MovieReserveSql {
	//영화 예매
	public final static String MOVIE_RESERVE="insert into movie_reserve values("
			+ "MOVIE_RESERVE_MOVIE_RV_NUM_SEQ.nextval,"
			+ "1,'qkrrjsxo',(select movie_day from movie where movie_code=1),"
			+ "1,120,12000,'지구멸망좀','건대입구','서울');";
	
	//id로 예매정보
	
	
	
	

/*
	--예매
	insert into movie_reserve values(MOVIE_RESERVE_MOVIE_RV_NUM_SEQ.nextval,1,'qkrrjsxo',(select movie_day from movie where movie_code=1),1,120,12000,'지구멸망좀','건대입구','서울');
			--(movie_code말고도 영화제목,user_id등등도 변수나 select로 뽑아서 사용)
	--id로 예매정보
	select* from movie_reserve where user_id='qkrrjsxo';

	--영화취소
	delete from movie_reserve where user_id='qkrrjsxo';
*/
}
