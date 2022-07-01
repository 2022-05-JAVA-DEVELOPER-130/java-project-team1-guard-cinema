
/******************question*********************/
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

