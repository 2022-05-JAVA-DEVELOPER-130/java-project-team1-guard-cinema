package com.itwill.gc.servicetest;

import com.itwill.gc.service.FaqService;

public class FaqServiceTest {

	public static void main(String[] args) throws Exception {
		FaqService faqService = new FaqService();
		
		System.out.println("선택한 공지사항 보기");
		System.out.println(">> "+faqService.selectByNo(1));
		System.out.println("선택한 카테고리의 공지 전체보기");
		System.out.println(">> "+faqService.selectAllByCate("카테고리1"));
	}
}
