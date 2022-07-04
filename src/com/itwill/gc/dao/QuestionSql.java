package com.itwill.gc.dao;

public class QuestionSql {
/*
 --guard1님의 문의
insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,'guard1','문의타이틀','문의내용','문의분류1','문의종류1',sysdate); 
 
 --로그인한 회원 문의내역 리스트
select * from question where user_id = 'guard1';


--로그인한 회원 문의 한개 삭제
delete question where question_no = 1;

--로그인한 회원 문의 전체 삭제
delete question where user_id = 'guard1';

--로그인한 회원 문의 수정(필요한가?)
update question set question_title = '문의내용변경해요~',
                    question_content = '근데 누가 문의내용을 바꾸냐고'
where question_no = 3 and user_id = 'guard2';

 */
   /*
    문의내용과 유저정보를 조인할 필요가 있나..?
    */
   
   public static final String QUESTION_INSERT =
         "insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,?,?,?,?,?,sysdate)";
   public static final String QUESTION_UPDATE =
         "update question set question_title = ?,question_content = ? where question_no = ? and user_id = ?";
   public static final String QUESTION_DELETE_BY_NO =
         "delete question where question_no = ?";
   public static final String QUESTION_DELETE_ALL =
         "delete question where user_id = ?";
   public static final String QUESTION_SELECT_BY_NO =
         "select * from question where user_id = ? and question_no = ?";
   public static final String QUESTION_SELECT_ALL =
         "select * from question where user_id = ?";
}
