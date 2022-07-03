DROP TABLE faq CASCADE CONSTRAINTS;
DROP TABLE question CASCADE CONSTRAINTS;
DROP TABLE food_receipt CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE review CASCADE CONSTRAINTS;
DROP TABLE gongji CASCADE CONSTRAINTS;
DROP TABLE food CASCADE CONSTRAINTS;
DROP TABLE movie_reserve CASCADE CONSTRAINTS;
DROP TABLE user_info CASCADE CONSTRAINTS;
DROP TABLE movie CASCADE CONSTRAINTS;
DROP TABLE event CASCADE CONSTRAINTS;

CREATE TABLE event(
		event_no                      		NUMBER(10)		 NULL ,
		event_name                    		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE event_event_no_SEQ;

CREATE SEQUENCE event_event_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE movie(
		movie_code                    		NUMBER(10)		 NULL ,
		movie_title                   		VARCHAR2(20)		 NULL ,
		movie_opening                 		DATE		 NULL ,
		movie_grade                   		NUMBER(10)		 NULL ,
		movie_category                		VARCHAR2(20)		 NULL ,
		movie_content                 		VARCHAR2(200)		 NULL ,
		movie_genre                   		VARCHAR2(20)		 NULL ,
		movie_totaltime               		NUMBER(10)		 NULL ,
		movie_country                 		VARCHAR2(10)		 NULL ,
		movie_audience                		NUMBER(30)		 NULL ,
		movie_ing                     		VARCHAR2(10)		 NULL ,
		movie_image                   		VARCHAR2(20)		 NULL 
);


CREATE TABLE user_info(
		user_id                       		VARCHAR2(20)		 NULL ,
		user_name                     		VARCHAR2(10)		 NULL ,
		user_ph_num                   		NUMBER(20)		 NULL ,
		user_jumin                    		VARCHAR2(20)		 NULL ,
		user_email                    		VARCHAR2(20)		 NULL ,
		user_password                 		VARCHAR2(20)		 NULL 
);


CREATE TABLE movie_reserve(
		movie_rv_num                  		NUMBER(20)		 NULL ,
		movie_code                    		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(20)		 NULL ,
		movie_day                     		DATE		 NULL ,
		movie_seat_num                		NUMBER(10)		 NULL ,
		movie_daytime                 		VARCHAR2(20)		 NULL ,
		movie_order_pr                		NUMBER(20)		 NULL ,
		movie_title                   		VARCHAR2(20)		 NULL ,
		movie_totaltime               		NUMBER(10)		 NULL ,
		cinema_name                   		VARCHAR2(20)		 NULL ,
		cinema_place                  		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE movie_reserve_movie_rv_num_SEQ;

CREATE SEQUENCE movie_reserve_movie_rv_num_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE food(
		food_code                     		NUMBER(20)		 NULL ,
		food_info                     		VARCHAR2(200)		 NULL ,
		food_name                     		VARCHAR2(20)		 NULL ,
		food_price                    		NUMBER(10)		 NULL ,
		food_image                    		VARCHAR2(20)		 NULL 
);


CREATE TABLE gongji(
		gongji_no                     		NUMBER(10)		 NULL ,
		gongji_title                  		VARCHAR2(50)		 NULL ,
		gongji_content                		VARCHAR2(500)		 NULL ,
		gongji_date                   		DATE		 NULL ,
		gongji_category               		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE gongji_gongji_no_SEQ;

CREATE SEQUENCE gongji_gongji_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE review(
		review_no                     		NUMBER(20)		 NULL ,
		user_id                       		VARCHAR2(20)		 NULL ,
		review_title                  		VARCHAR2(20)		 NULL ,
		review_date                   		DATE		 NULL ,
		movie_code                    		NUMBER(10)		 NULL ,
		review_content                		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE review_review_no_SEQ;

CREATE SEQUENCE review_review_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE cart(
		cart_no                       		NUMBER(20)		 NULL ,
		user_id                       		VARCHAR2(20)		 NULL ,
		food_code                     		NUMBER(20)		 NULL ,
		cart_qty                      		NUMBER(10)		 NULL ,
		food_name                     		VARCHAR2(20)		 NULL ,
		food_price                    		NUMBER(10)		 NULL 
);

DROP SEQUENCE cart_cart_no_SEQ;

CREATE SEQUENCE cart_cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE food_receipt(
		food_rv_num                   		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(20)		 NULL ,
		food_code                     		NUMBER(20)		 NULL ,
		cart_qty                      		NUMBER(10)		 NULL ,
		food_name                     		VARCHAR2(20)		 NULL ,
		food_price                    		NUMBER(10)		 NULL 
);

DROP SEQUENCE food_receipt_food_rv_num_SEQ;

CREATE SEQUENCE food_receipt_food_rv_num_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE question(
		question_no                   		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(20)		 NULL ,
		question_title                		VARCHAR2(50)		 NULL ,
		question_content              		VARCHAR2(500)		 NULL ,
		question_cate_one             		VARCHAR2(50)		 NULL ,
		question_cate_two             		VARCHAR2(50)		 NULL ,
		question_date                 		DATE		 NULL 
);

DROP SEQUENCE question_question_no_SEQ;

CREATE SEQUENCE question_question_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE faq(
		faq_no                        		NUMBER(10)		 NULL ,
		faq_category                  		VARCHAR2(50)		 NULL ,
		faq_title                     		VARCHAR2(50)		 NULL ,
		faq_content                   		VARCHAR2(500)		 NULL 
);

DROP SEQUENCE faq_faq_no_SEQ;

CREATE SEQUENCE faq_faq_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




ALTER TABLE event ADD CONSTRAINT IDX_event_PK PRIMARY KEY (event_no);

ALTER TABLE movie ADD CONSTRAINT IDX_movie_PK PRIMARY KEY (movie_code);

ALTER TABLE user_info ADD CONSTRAINT IDX_user_info_PK PRIMARY KEY (user_id);

ALTER TABLE movie_reserve ADD CONSTRAINT IDX_movie_reserve_PK PRIMARY KEY (movie_rv_num);
ALTER TABLE movie_reserve ADD CONSTRAINT IDX_movie_reserve_FK0 FOREIGN KEY (movie_code) REFERENCES movie (movie_code);
ALTER TABLE movie_reserve ADD CONSTRAINT IDX_movie_reserve_FK1 FOREIGN KEY (user_id) REFERENCES user_info (user_id);

ALTER TABLE food ADD CONSTRAINT IDX_food_PK PRIMARY KEY (food_code);

ALTER TABLE gongji ADD CONSTRAINT IDX_gongji_PK PRIMARY KEY (gongji_no);

ALTER TABLE review ADD CONSTRAINT IDX_review_PK PRIMARY KEY (review_no);
ALTER TABLE review ADD CONSTRAINT IDX_review_FK0 FOREIGN KEY (user_id) REFERENCES user_info (user_id);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (food_code) REFERENCES food (food_code);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (user_id) REFERENCES user_info (user_id);

ALTER TABLE food_receipt ADD CONSTRAINT IDX_food_receipt_PK PRIMARY KEY (food_rv_num);
ALTER TABLE food_receipt ADD CONSTRAINT IDX_food_receipt_FK0 FOREIGN KEY (user_id) REFERENCES user_info (user_id);
ALTER TABLE food_receipt ADD CONSTRAINT IDX_food_receipt_FK1 FOREIGN KEY (food_code) REFERENCES food (food_code);

ALTER TABLE question ADD CONSTRAINT IDX_question_PK PRIMARY KEY (question_no);
ALTER TABLE question ADD CONSTRAINT IDX_question_FK0 FOREIGN KEY (user_id) REFERENCES user_info (user_id);

ALTER TABLE faq ADD CONSTRAINT IDX_faq_PK PRIMARY KEY (faq_no);

