package com.itwill.gc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;
public class MovieReserveDao {
	private DataSource dataSource;
	public MovieReserveDao() throws Exception{
		dataSource = new DataSource();
		
	}
	public MovieReserve getMovieReserveById(String user_id)throws Exception{
		MovieReserve movieReserve=null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectQuery = "select* from movie_reserve where user_id=?";
		con=dataSource.getConnection();
		pstmt=con.prepareStatement(selectQuery);
		pstmt.setString(1,user_id);
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
		
			movieReserve = new MovieReserve(rs.getInt("movie_rv_num"),rs.getDate("movie_day"),
					rs.getInt("movie_seat_num"),rs.getString("movie_daytime"),rs.getInt("movie_order_pr"),
					rs.getString("cinema_name"),rs.getString("cinema_place"),
					new Movie(rs.getInt("movie_code"),rs.getString("movie_title"),"",0,"","","",0,"",0,""),
					new User(rs.getString("user_Id"),"","","","",""));
			
		}
		System.out.println(movieReserve);
		return movieReserve;
		
	}
	
	
}

