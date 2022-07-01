******************gongji*********************/
--하나의 카테고리 전체 공지리스트보기
select gongji_title,gongji_date from gongji where gongji_category = '전체공지';
select gongji_title,gongji_date from gongji where gongji_category = '이벤트공지';

--선택한 공지사항 보기
select gongji_title,gongji_category,gongji_date,gongji_content from gongji where gongji_no = 1;
