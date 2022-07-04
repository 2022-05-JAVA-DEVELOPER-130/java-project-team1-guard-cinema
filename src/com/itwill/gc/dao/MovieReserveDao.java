package com.itwill.gc.dao;
import java.sql.Connection;
import java.sql.Date;
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
	
	//영화 예매 
	public int add(MovieReserve movieReserve)throws Exception{
		String insertQuery=MovieReserveSql.INSERT_RESERVE;
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		int price = 0;
		if(movieReserve.getMovie_seat_num() <=10) {
			price = 10000;
		}else if(movieReserve.getMovie_seat_num()<=20) {price=12000;}
		else if(movieReserve.getMovie_seat_num()<=30) {price=13000;}
		else if(movieReserve.getMovie_seat_num()<=40) {price=15000;}
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, movieReserve.getMovie().getMovie_code());
			pstmt.setString(2, movieReserve.getUser().getUserId());
			pstmt.setString(3, movieReserve.getMovie_day());
			pstmt.setInt(4, movieReserve.getMovie_seat_num());
			pstmt.setString(5, movieReserve.getMovie_daytime());
			pstmt.setInt(6, price);
			pstmt.setString(7, movieReserve.getCinema_name());
			pstmt.setString(8, movieReserve.getCinema_place());
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
	}
	
	
	
	
	//로그인한 아이디 예매 취소
	
	public int deleteMovieReserveById(String user_id)throws Exception{
		String deleteQuery=MovieReserveSql.DELETE_MOVIE_RESERVE_ID;
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(deleteQuery);
			pstmt.setString(1, user_id);
			deleteRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
		
		
		
	}
	//예매번호로
	public int deleteMovieReserveByNo(int movie_rv_num)throws Exception{
		String deleteQuery=MovieReserveSql.DELETE_MOVIE_RESERVE;
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(deleteQuery);
			pstmt.setInt(1, movie_rv_num);
			deleteRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
		
		
		
	}
	
	
	
	//영화 예매 목록
	public ArrayList<MovieReserve> getMovieReserveListById(String user_id)throws Exception{
		ArrayList<MovieReserve> movieReserve=new ArrayList<MovieReserve>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MovieReserveSql.RESERVE_LIST_BY_ID);
		pstmt.setString(1,user_id);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
		
			movieReserve.add(
					new MovieReserve(rs.getInt("movie_rv_num"),
									rs.getString("movie_day"),
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

