package com.itwill.gc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.gc.common.DataSource;
import com.itwill.gc.vo.Faq;

public class FaqDao {
	private DataSource dataSource;
	public FaqDao() {
		dataSource = new DataSource();
	}
  //선택한 공지사항 보기
	public Faq selectByNo(int faq_no) throws Exception{
		Faq faq = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(FaqSql.FAQ_SELECT_BY_NO);
		pstmt.setInt(1, faq_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			faq = 
					new Faq(
							rs.getInt("faq_no"),
							rs.getString("faq_category"),
							rs.getString("faq_title"),
							rs.getString("faq_content")
							
							);
		}
		rs.close();
		pstmt.close();
		con.close();
		return faq;
	}
	
	//선택한 카테고리의 공지 전체보기
	public List<Faq> selectAllByCate(String faq_category) throws Exception{
		List<Faq> faqList = new ArrayList<Faq>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(FaqSql.FAQ_LIST);
		pstmt.setString(1, faq_category);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Faq faq = new Faq(
							rs.getInt("faq_no"),
							rs.getString("faq_category"),
							rs.getString("faq_title"),
							rs.getString("faq_content"));
							
		faqList.add(faq);				
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return faqList;
	}
	
	//전체 공지사항 보기
	public List<Faq> selectAll() throws Exception{
		List<Faq> faqList = new ArrayList<Faq>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(FaqSql.FAQ_ALL_LIST);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Faq faq = new Faq(
							rs.getInt("faq_no"),
							rs.getString("faq_category"),
							rs.getString("faq_title"),
							rs.getString("faq_content"));
							
		faqList.add(faq);				
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return faqList;
	}


}
