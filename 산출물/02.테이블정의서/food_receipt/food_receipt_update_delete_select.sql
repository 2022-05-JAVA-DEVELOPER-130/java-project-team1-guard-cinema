delete from food_receipt where user_id='guard6';

update food_receipt set cart_qty=6 where user_id='guard6' and food_code=300;

select * from food_receipt where user_id='guard5';
select food_code from food_receipt where user_id ='guard5';