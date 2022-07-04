package com.itwill.gc.dao;

public class MovieReserveSql {
	//영화 예매
	//public static final String MOVIE_RESERVE_INSERT="insert into movie_reserve values(MOVIE_RESERVE_MOVIE_RV_NUM_SEQ.nextval,?,?,?,?,?,?,?,?)";
	
	
	//영화예매 1.영화 예매.
	public static final String INSERT_RESERVE = "insert into movie_reserve(movie_rv_num,movie_code,user_id,movie_day,movie_seat_num,movie_daytime,movie_order_pr,cinema_name,cinema_place) "
			+ "values(MOVIE_RESERVE_MOVIE_RV_NUM_SEQ.nextval,?,?,?,?,?,?,?,?)";
	

	
	
	//id로 예매정보
	public static final String RESERVE_LIST_BY_ID= 
			"select* from movie_reserve m join user_info u on m.user_id=u.user_id "
			+ "join movie s on m.movie_code = s.movie_code where "
			+ "u.user_id = ?";
	
	//예매 번호로 영화취소
	public static final String DELETE_MOVIE_RESERVE = "delete from movie_reserve where movie_rv_num=?";
	
	//로그인한 멤버 아이디로 영화취소
	public static final String DELETE_MOVIE_RESERVE_ID = "delete from movie_reserve where movie_rv_num=? and user_id=?";
	


	//좌석찾기 
		public static final String SELECT_BY_MANY= 
				"select * from movie_reserve where movie_code = ? and movie_day =? and movie_daytime = ? and\r\n"
				+ "cinema_name=? and cinema_place=? and movie_seat_num = ?";
	
	
	
		
		
		
		
		
	
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


	//영화예매 2.날짜, 시간대 선택
	public static final String INSERT_PAGE_TWO = "update  movie_reserve set movie_day=?,movie_daytime=?,cinema_name=?,cinema_place=? where movie_rv_num=?";

	//영화예매 3.좌석 선택,가격
	public static final String INSERT_PAGE_THREE = "update  movie_reserve set movie_seat_num=?,movie_order_pr=? where movie_rv_num=?";
	
	////영화예매 1.영화 취소.
	public static final String DELETE_MOVIE_ONE = "delete from movie_reserve where movie_rv_num=?";
	
	//영화예매 2.날짜, 시간대 선택 취소
	public static final String DELETE_PAGE_TWO = "update  movie_reserve set movie_day=null,movie_daytime=null,cinema_name=null,cinema_place=null where movie_rv_num=?";

	//영화예매 3.좌석 선택,가격 취소
	public static final String DELETE_PAGE_THREE = "update  movie_reserve set movie_seat_num=null,movie_order_pr=null where movie_rv_num=?";
*/