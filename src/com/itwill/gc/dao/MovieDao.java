package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MovieDao {
	private DataSource dataSource;
	public MovieDao() throws Exception{
		dataSource = new DataSource();
	}
	/*
	 * selelctByMovieTitle : 영화 이름으로 검색
	 */
	public Movie selectByMovieTitle(String movie_title) throws Exception{
		Movie movie=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MovieSQL.MOVIE_TITLE);
		pstmt.setString(1, movie_title);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			movie=
					new Movie(
							rs.getInt("movie_code"),
							rs.getString("movie_title"), 
							rs.getString("movie_opening"), 
							rs.getInt("movie_grade"),
							rs.getString("movie_category"), 
							rs.getInt("movie_reservation_rate"), 
							rs.getString("movie_content"), 
							rs.getString("movie_genre"), 
							rs.getInt("movie_totaltime"),
							rs.getString("movie_country"), 
							rs.getInt("movie_audience"), 
							rs.getInt("movie_day")); 
		}
		return movie;
	}
	
	/*
	 * selelctByMovieCode(PK) : 영화 코드로 검색
	 */
	public Movie selectByMovieCode(Int movie_code) throws Exception{
		Movie movie=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MovieSQL.MOVIE_CODE);
		pstmt.setInt(1, movie_code);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			movie=
					new Movie(
							rs.getInt("movie_code"),
							rs.getString("movie_title"), 
							rs.getString("movie_opening"), 
							rs.getInt("movie_grade"),
							rs.getString("movie_category"), 
							rs.getInt("movie_reservation_rate"), 
							rs.getString("movie_content"), 
							rs.getString("movie_genre"), 
							rs.getInt("movie_totaltime"),
							rs.getString("movie_country"), 
							rs.getInt("movie_audience"), 
							rs.getInt("movie_day")); 
			}
			return movie;
		}
	/*
	 * selectAll : 영화 전체 검색
	 */
	public List<Movie> selectAll() throws Exception{
		List<Movie> movieList=new ArrayList<Movie>();
		
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MovieSQL.MOVIE_LIST);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Movie product=new Movie(
						rs.getInt("movie_code"),
						rs.getString("movie_title"), 
						rs.getString("movie_opening"), 
						rs.getInt("movie_grade"),
						rs.getString("movie_category"), 
						rs.getInt("movie_reservation_rate"), 
						rs.getString("movie_content"), 
						rs.getString("movie_genre"), 
						rs.getInt("movie_totaltime"),
						rs.getString("movie_country"), 
						rs.getInt("movie_audience"), 
						rs.getInt("movie_day")); 
			movieList.add(movie);
		}
		return movieList;
	}
	/*
	 *  : 상영 예정 영화 검색(?) // 잘 모르겠음..ㅠ
	 */
	
}
