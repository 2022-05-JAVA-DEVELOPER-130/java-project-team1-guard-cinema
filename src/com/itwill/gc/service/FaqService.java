package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.FaqDao;
import com.itwill.gc.vo.Faq;
import com.itwill.gc.vo.Gongji;

public class FaqService {

	private FaqDao faqDao;

	public FaqService() throws Exception {
		faqDao = new FaqDao();
	}

	// 선택한 공지사항 보기
	public Faq selectByNo(int faq_no) throws Exception {
		return faqDao.selectByNo(faq_no);
	}

	// 선택한 카테고리의 공지 전체보기
	public List<Faq> selectAllByCate(String faq_category) throws Exception {
		return faqDao.selectAllByCate(faq_category);
	}

	// 전체 공지사항 보기
	public List<Faq> selectAll() throws Exception {
		return faqDao.selectAll();
	}

}