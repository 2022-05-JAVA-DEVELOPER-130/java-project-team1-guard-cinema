package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Gongji;

public class GongjiDao {
	private DataSource dataSource;
	public GongjiDao() {
		dataSource = new DataSource();
	}
  //선택한 공지사항 보기
	public Gongji selectByNo(int gongji_no) throws Exception{
		Gongji gongji = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GongjiSql.GONGJI_SELECT_BY_NO);
		pstmt.setInt(1, gongji_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			gongji = 
					new Gongji(
							rs.getInt("gongji_no"),
							rs.getString("gongji_title"),
							rs.getString("gongji_content"),
							rs.getDate("gongji_date"),
							rs.getString("gongji_category"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return gongji;
	}
	
	//선택한 카테고리의 공지 전체보기
	public List<Gongji> selectAllByCate(String gongji_category) throws Exception{
		List<Gongji> gongjiList = new ArrayList<Gongji>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GongjiSql.GONGJI_LIST);
		pstmt.setString(1, gongji_category);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Gongji gongji = 
					new Gongji(
							rs.getInt("gongji_no"),
							rs.getString("gongji_title"),
							rs.getString("gongji_content"),
							rs.getDate("gongji_date"),
							rs.getString("gongji_category")
							);
			gongjiList.add(gongji);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return gongjiList;
	}
	
	//전체 공지 보기
	public List<Gongji> selectAll() throws Exception{
		List<Gongji> gongjiList = new ArrayList<Gongji>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GongjiSql.GONGJI_ALL_LIST);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Gongji gongji = 
					new Gongji(
							rs.getInt("gongji_no"),
							rs.getString("gongji_title"),
							rs.getString("gongji_content"),
							rs.getDate("gongji_date"),
							rs.getString("gongji_category")
							);
			gongjiList.add(gongji);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return gongjiList;
	}

}
