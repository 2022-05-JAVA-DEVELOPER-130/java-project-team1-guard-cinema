/******************faq********************/
--하나의 카테고리 전체 자주찾는질문리스트 보기
select faq_title from faq where faq_category = '카테고리1';

--선택한 자주찾는질문 보기
select faq_category,faq_title,faq_content from faq where faq_no = 1;
