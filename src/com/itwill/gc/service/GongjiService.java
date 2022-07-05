package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.GongjiDao;
import com.itwill.gc.vo.Gongji;

public class GongjiService {

	private GongjiDao gongjiDao;

	public GongjiService() throws Exception {
		gongjiDao = new GongjiDao();
	}

	// 선택한 공지사항 보기
	public Gongji selectByNo(int gongji_no) throws Exception {
		return gongjiDao.selectByNo(gongji_no);
	}

	// 선택한 카테고리의 공지 전체보기
	public List<Gongji> selectAllByCate(String gongji_category) throws Exception {
		return gongjiDao.selectAllByCate(gongji_category);
	}
	
	// 전체 공지사항 보기
	public List<Gongji> selectAll() throws Exception {
		return gongjiDao.selectAll();	
	}

}
