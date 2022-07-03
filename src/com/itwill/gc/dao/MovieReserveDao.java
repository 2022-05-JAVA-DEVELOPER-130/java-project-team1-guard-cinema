package com.itwill.gc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.User;
public class MovieReserveDao {
	private DataSource dataSource;
	public MovieReserveDao() throws Exception{
		dataSource = new DataSource();
		
	}
	public ArrayList<MovieReserve> getMovieReserveListById(String user_id)throws Exception{
		ArrayList<MovieReserve> movieReserve=new ArrayList<MovieReserve>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MovieReserveSql.RESERVE_LIST_BY_ID);
		pstmt.setString(1,user_id);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
		
			movieReserve.add(
					new MovieReserve(rs.getInt("movie_rv_num"),
									rs.getDate("movie_day"),
									rs.getInt("movie_seat_num"),
									rs.getString("movie_daytime"),
									rs.getInt("movie_order_pr"),
									rs.getString("cinema_name"),
									rs.getString("cinema_place"),
			new Movie(rs.getInt("movie_code"),rs.getString("movie_title"),null,0,"","","",rs.getInt("movie_totaltime"),"",0,"",""),
			new User(rs.getString("user_Id"),"","","","","")));
			
		}
		return movieReserve;
		
	}
	
	
}

