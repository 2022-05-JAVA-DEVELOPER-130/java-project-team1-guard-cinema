package com.itwill.gc.service;

import java.util.List;

import com.itwill.gc.dao.FoodDao;
import com.itwill.gc.vo.Food;

public class FoodService {

   private FoodDao foodDao;
   public FoodService()throws Exception{
      foodDao = new FoodDao();
   }
   
   /*
    * 상품번호로 검색
    */
   public Food selectByFoodNo(int food_code) throws Exception{
      return foodDao.selectByFoodNo(food_code);
   }
   
   /*
    * 상품전체 검색
    */
   public List<Food> selectAllFood() throws Exception {
      return foodDao.selectAllFood();
   }
   
}