package com.itwill.gc.dao;

public class MovieSql {
	//영화이름으로 영화정보 찾기
	public final static String MOVIE_BY_TITLE="select* from movie1 where movie_title=?";
	
	//상영중인 영화리스트
	public final static String MOVIE_ING_LIST=
			"select * from movie1 where movie_ing =?";
	
	//영화코드으로 영화정보 찾기
		public final static String MOVIE_BY_CODE="select* from movie1 where movie_code=?";
	
	
	
	
	
	/*
	--영화이름으로 영화정보 찾기
	select* from movie where movie_title='지구멸망좀';

	--code로 찾기
	select movie_title from movie where movie_code = 1;     --(영화 제목 정보)
	select movie_opening from movie where movie_code=1;   --(영화 개봉일 정보)
	select movie_grade from movie where movie_code=1;     --(영화 평점 정보)
	select movie_category from movie where movie_code=1;  --(영화 카테고리 정보)
	select movie_content from movie where movie_code=1;   --(영화 내용 정보)
	select movie_genre from movie where movie_code=1;     --(영화 장르 정보)
	select movie_totaltime from movie where movie_code=1; --(영화 상영 시간 정보)
	select movie_country from movie where movie_code=1;   --(영화 국가 정보)
	select movie_audience from movie where movie_code=1;  --(영화 관객 수 정보)
	select movie_opening from movie where movie_code=1;   --(영화 예매율 정보)
	select movie_day from movie where movie_code=1;       --(영화 상영 날짜 정보)
	select movie_code from movie where user_id='qkrrjsxo';


	--모든 상영영화정보
	select * from movie where movie_ing ='true';
	--예정 영화정보
	select * from movie where movie_ing ='false';

	*/
	
}
