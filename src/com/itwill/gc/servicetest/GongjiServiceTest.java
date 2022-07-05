package com.itwill.gc.servicetest;

import com.itwill.gc.service.GongjiService;

public class GongjiServiceTest {

	public static void main(String[] args) throws Exception {
		GongjiService gongjiService = new GongjiService();

		System.out.println("선택한 공지사항 보기");
		System.out.println(">> " + gongjiService.selectByNo(1));
		System.out.println("선택한 카테고리의 공지 전체보기");
		System.out.println(">> " + gongjiService.selectAllByCate("이벤트공지"));
		System.out.println("전체 공지사항 보기");
		System.out.println(">> " + gongjiService.selectAll());

	}
}
