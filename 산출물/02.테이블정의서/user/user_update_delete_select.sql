--휴대폰번호수정하기
update user_info set user_ph_num=01033334444 where user_id='qkrrjsxo';
/***********user update***********/
--email 수정하기
update user_info set user_email='qkrlsfml@fsmslf.com' where user_id='qkrrjsxo';
--비밀번호 수정하기
update user_info set user_password='0104' where user_id='qkrrjsxo';
/***********user delete***********/
--회원탈퇴
delete from user_info where user_id='qkrrjsxo';
/***********user select***********/
--select 아이디로 찾기 사람찾기
select* from user_info where user_id='qkrrjsxo';
--select All
select * from user_info;
-- select user_info --

select user_id from user_info;  --유저아이디
select user_name from user_info; --유저이름
select user_ph_num from user_info; --유저전화번호 번호출력이상 10칸에서 11칸으로 변경해야할듯
select to_char(user_jumin) from user_info; --유저주민번호 번호출력이상 varchar2로 바꿔서 하면될듯
select user_email from user_info; --유저이메일
select user_password from user_info; --유저비밀번호
-- delete user_info --

delete user_info where user_id = 'guard1';
delete user_info where user_id = 'guard2';
delete user_info where user_id = 'guard3';
delete user_info where user_id = 'guard4';
delete user_info where user_id = 'guard5';
delete user_info where user_id = 'guard6';
delete user_info where user_name = '김민주';
delete user_info where user_name = '김성준';
delete user_info where user_name = '김용찬';
delete user_info where user_name = '박건태';
delete user_info where user_name = '이정욱';
delete user_info where user_name = '조재형';
delete user_info where user_ph_num = '01011111111';
delete user_info where user_ph_num = '01022222222';
delete user_info where user_ph_num = '01033333333';
delete user_info where user_ph_num = '01044444444';
delete user_info where user_ph_num = '01055555555';
delete user_info where user_ph_num = '01066666666';
delete user_info where user_jumin = '9011111111111';
delete user_info where user_jumin = '9111111111111';
delete user_info where user_jumin = '9211111111111';
delete user_info where user_jumin = '9311111111111';
delete user_info where user_jumin = '9411111111111';
delete user_info where user_jumin = '9511111111111';
delete user_info where user_email = 'guard1@gmail.com';
delete user_info where user_email = 'guard2@gmail.com';
delete user_info where user_email = 'guard3@gmail.com';
delete user_info where user_email = 'guard4@gmail.com';
delete user_info where user_email = 'guard5@gmail.com';
delete user_info where user_email = 'guard6@gmail.com';
delete user_info where user_password = '1111';
delete user_info where user_password = '2222';
delete user_info where user_password = '3333';
delete user_info where user_password = '4444';
delete user_info where user_password = '5555';
delete user_info where user_password = '6666';
-- update user_info --

update user_info set user_password = '1234' where user_id = 'guard1';
update user_info set user_id = 'kkkk1' where user_id = 'guard2';
update user_info set user_ph_num = '01012345678' where user_id = 'guard3';
update user_info set user_email = 'kkk1@gmail.com' where user_id = 'guard4';