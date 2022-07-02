package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Gongji;
import com.itwill.gc.vo.Movie;


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
		PreparedStatement pstmt=con.prepareStatement(MovieSql.MOVIE_BY_TITLE);
		pstmt.setString(1, movie_title);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			movie=
					new Movie(
							rs.getInt("movie_code"),
							rs.getString("movie_title"), 
							rs.getDate("movie_opening"), 
							rs.getDouble("movie_grade"),
							rs.getString("movie_category"), 
							rs.getString("movie_content"), 
							rs.getString("movie_genre"), 
							rs.getInt("movie_totaltime"),
							rs.getString("movie_country"), 
							rs.getInt("movie_audience"), 
							rs.getString("movie_ing"),
							rs.getString("movie_image")
							); 
		}
		rs.close();
		pstmt.close();
		con.close();
		return movie;
	}
	//상영중인 영화
	public List<Movie> selectByIng(String movie_ing) throws Exception{
		List<Movie> movieIngList=new ArrayList<Movie>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MovieSql.MOVIE_ING_LIST);
		pstmt.setString(1, movie_ing);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			
			Movie movie=
					new Movie(
							rs.getInt("movie_code"),
							rs.getString("movie_title"), 
							rs.getDate("movie_opening"), 
							rs.getDouble("movie_grade"),
							rs.getString("movie_category"), 
							rs.getString("movie_content"), 
							rs.getString("movie_genre"), 
							rs.getInt("movie_totaltime"),
							rs.getString("movie_country"), 
							rs.getInt("movie_audience"), 
							rs.getString("movie_ing"),
							rs.getString("movie_image")
							); 
			movieIngList.add(movie);
		}
		rs.close();
		pstmt.close();
		con.close();
		return movieIngList;
	}
	
	
}
