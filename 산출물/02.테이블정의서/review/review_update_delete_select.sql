/*******후기**********/
--후기리스트
select * from review;
--후기 상세보기
select * from review where review_num=5;
--후기제목수정 (abc1)
update review set review_title='리뷰제목333' where review_num=2 and user_id='guard1';
--후기삭제(아이디=abc3)
delete review where review_num=4 and user_id='guard3';