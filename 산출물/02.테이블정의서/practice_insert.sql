/***********user insert***********/
-- 회원가입 페이지에서 이름,아이디,비밀번호 등등 입력하고 가입버튼 누름 ---> insert user_info에 데이터 넣기

insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password)
        values ('guard1', '김민주', '01011111111', '9011111111111', 'guard1@gmail.com', '1111');
insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password)
        values ('guard2', '김성준', '01022222222', '9111111111111', 'guard2@gmail.com', '2222');
insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password)
        values ('guard3', '김용찬', '01033333333', '9211111111111', 'guard3@gmail.com', '3333');
insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password)
        values ('guard4', '박건태', '01044444444', '9311111111111', 'guard4@gmail.com', '4444');
insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password)
        values ('guard5', '이정욱', '01055555555', '9411111111111', 'guard5@gmail.com', '5555');
insert into user_info (user_id, user_name, user_ph_num, user_jumin, user_email, user_password)
        values ('guard6', '조재형', '01066666666', '9511111111111', 'guard6@gmail.com', '6666');
        
        
/***********movie insert***********/
insert into movie values(1,'지구멸망좀',sysdate,4.4,'19금','지구멸망을 꿈꾸는 1조','공포',120,'한국',20000,'true','movie_a.jpg');
insert into movie values(2,'흙흙흙',sysdate,3.3,'만17세','흙이되어버린 1조','스릴러',110,'스페인',6,'true','movie_b.jpg');
insert into movie values(3,'여름시러',sysdate,3.1,'만12세','녹아버린 1조','SF',80,'영국',6,'true','movie_c.jpg');
insert into movie values(4,'팥빙수조아',sysdate,2.4,'전체이용가','먹고자는 1조','코믹',130,'일본',6,'false','movie_d.jpg');


/**********food insert***********/
insert into food  values (10, '콜라','콜라는 역시 코카콜라, 사실 제로가 더 맛있음' ,2000,'food_a.jpg');
insert into food  values (20,'사이다', '사이다는 역시 칠성 사이다, 콜라보다는 아니지만',2000,'food_b.jpg');
insert into food  values (30,'환타',  '환타는 역시 오렌지맛 환타,듣는 포도맛 섭섭해',2000,'food_c.jpg');
insert into food  values (100,'기본 팝콘',  '팝콘은 역시 오리지널 팝콘,노맛..',5000,'food_d.jpg');
insert into food  values (200,'카라멜',  '팝콘은 역시 단짠 카라멜 팝콘,이건 인정',6000,'food_e.jpg');
insert into food  values (300, '치즈', '팝콘은 역시 고소한 치즈 팝콘,나쁘지않아',6000,'food_f.jpg');


/*******cart insert**********/
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard1', 100, 2);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard1', 200, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard1', 20, 3);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard2', 100, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard2', 300, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard2', 30, 3);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard3', 300, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard3', 20, 2);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard4', 10, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard4', 100, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard5', 20, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard5', 200, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard6', 30, 1);
insert into cart (cart_no, user_id, food_code, cart_qty) values (CART_CART_NO_SEQ.nextval, 'guard6', 300, 1);


/***********food receipt*************/
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard1', 100, 2);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard1', 200, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard1', 20, 3);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard2', 100, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard2', 300, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard2', 30, 3);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard3', 300, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard3', 20, 2);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard4', 10, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard4', 100, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard5', 20, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard5', 200, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard6', 30, 1);
insert into food_receipt (food_rv_num, user_id, food_code, cart_qty) values (FOOD_RECEIPT_FOOD_RV_NUM_SEQ.nextval, 'guard6', 300, 1);


/********************review insert*******************/
insert into review(review_no,user_id,review_title,review_date,movie_code,review_content)
            values(review_review_no_SEQ.nextval,'guard1','리뷰제목1',sysdate,1,'리뷰본문1');
insert into review(review_no,user_id,review_title,review_date,movie_code,review_content)
            values(review_review_no_SEQ.nextval,'guard2','리뷰제목2',sysdate,2,'리뷰본문2');
insert into review(review_no,user_id,review_title,review_date,movie_code,review_content)
            values(review_review_no_SEQ.nextval,'guard3','리뷰제목3',sysdate,3,'리뷰본문3'); 


/*************gongji insert******************/
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항1','공지사항 내용1',sysdate,'전체공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항2','공지사항 내용2',sysdate,'전체공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항3','공지사항 내용3',sysdate,'전체공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항4','공지사항 내용4',sysdate,'전체공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항5','공지사항 내용5',sysdate,'이벤트공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항6','공지사항 내용6',sysdate,'이벤트공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항7','공지사항 내용7',sysdate,'이벤트공지');
insert into gongji values (GONGJI_GONGJI_NO_SEQ.nextval,'공지사항8','공지사항 내용8',sysdate,'이벤트공지');

/*************faq insert*******************/
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문1','자주찾는질문내용1','카테고리1');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문2','자주찾는질문내용2','카테고리1');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문3','자주찾는질문내용3','카테고리1');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문4','자주찾는질문내용4','카테고리2');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문5','자주찾는질문내용5','카테고리2');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문6','자주찾는질문내용6','카테고리2');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문7','자주찾는질문내용7','카테고리3');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문8','자주찾는질문내용8','카테고리3');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문9','자주찾는질문내용9','카테고리3');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문10','자주찾는질문내용10','카테고리4');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문11','자주찾는질문내용11','카테고리4');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문12','자주찾는질문내용12','카테고리4');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문13','자주찾는질문내용13','카테고리5');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문14','자주찾는질문내용14','카테고리5');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문15','자주찾는질문내용15','카테고리5');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문16','자주찾는질문내용16','카테고리6');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문17','자주찾는질문내용17','카테고리6');
insert into faq values(FAQ_FAQ_NO_SEQ.nextval,'자주찾는질문18','자주찾는질문내용18','카테고리6');

/***********question insert****************/
--guard1님의 문의
insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,'guard1','문의타이틀','문의내용','문의분류1','문의종류1',sysdate);
insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,'guard1','문의타이틀','문의내용','문의분류2','문의종류2',sysdate);

--guard2님의 문의
insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,'guard2','문의타이틀','문의내용','문의분류1','문의종류1',sysdate);
insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,'guard2','문의타이틀','문의내용','문의분류2','문의종류3',sysdate);
insert into question values(QUESTION_QUESTION_NO_SEQ.nextval,'guard2','문의타이틀','문의내용','문의분류1','문의종류3',sysdate);
commit;