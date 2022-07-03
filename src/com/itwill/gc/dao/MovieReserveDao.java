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
	
	//영화 예매 (rv_num,아이디,영화코드)
	public int add1(String user_id,int movie_code)throws Exception{
		String insertQuery=MovieReserveSql.INSERT_PAGE_ONE;
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setString(1, user_id);
			pstmt.setInt(2, movie_code);
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
	}
	
	//영화 예매 (상영날짜, 상영 시간대,영화관이름,장소)
		public int add2(String movie_day,String movie_daytime,String cinema_name,String cinema_place,int movie_rv_num)throws Exception{
			String insertQuery=MovieReserveSql.INSERT_PAGE_TWO;
			Connection con=null;
			PreparedStatement pstmt=null;
			int insertRowCount=0;
			try {
				con=dataSource.getConnection();
				pstmt=con.prepareStatement(insertQuery);
				pstmt.setString(1,movie_day);
				pstmt.setString(2, movie_daytime);
				pstmt.setString(3, cinema_name);
				pstmt.setString(4, cinema_place);
				pstmt.setInt(5, movie_rv_num);
				insertRowCount = pstmt.executeUpdate();
			}finally {
				if(con!=null) {
					con.close();
				}
			}
			return insertRowCount;
		}
		//영화 예매 (좌석,가격)
				public int add3(int movie_seat_num,int movie_rv_num)throws Exception{
					int price = 0;
					if(movie_seat_num <=10) {
						price = 10000;
					}else if(movie_seat_num<=20) {price=12000;}
					else if(movie_seat_num<=30) {price=13000;}
					else if(movie_seat_num<=40) {price=15000;}
					
					String insertQuery=MovieReserveSql.INSERT_PAGE_THREE;
					Connection con=null;
					PreparedStatement pstmt=null;
					int insertRowCount=0;
					try {
						con=dataSource.getConnection();
						pstmt=con.prepareStatement(insertQuery);
						pstmt.setInt(1,movie_seat_num);
						pstmt.setInt(2,price);
						pstmt.setInt(3, movie_rv_num);
						
						
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

