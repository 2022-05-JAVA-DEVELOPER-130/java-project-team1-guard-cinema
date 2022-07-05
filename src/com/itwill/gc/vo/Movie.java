package com.itwill.gc.vo;

import java.util.Date;

public class Movie {


	private int movie_code;
	private String movie_title;
	private Date movie_opening;
	private double movie_grade;
	private String movie_category;
	private String movie_content;
	private String movie_genre;
	private int movie_totaltime;
	private String movie_country;
	private int movie_audience;
	private String movie_ing;
	private String movie_image;
	
	public Movie() {
		
	}
	

	public Movie(int movie_code) {
		super();
		this.movie_code = movie_code;
	}


	public Movie(int movie_code, String movie_title, Date movie_opening, double movie_grade, String movie_category,
			String movie_content, String movie_genre, int movie_totaltime, String movie_country, int movie_audience,
		 String movie_ing,String movie_image) {
		super();
		this.movie_code = movie_code;
		this.movie_title = movie_title;
		this.movie_opening = movie_opening;
		this.movie_grade = movie_grade;
		this.movie_category = movie_category;
		this.movie_content = movie_content;
		this.movie_genre = movie_genre;
		this.movie_totaltime = movie_totaltime;
		this.movie_country = movie_country;
		this.movie_audience = movie_audience;
	
		this.movie_ing = movie_ing;
		this.movie_image = movie_image;
	}

	public int getMovie_code() {
		return movie_code;
	}

	public void setMovie_code(int movie_code) {
		this.movie_code = movie_code;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public Date getMovie_opening() {
		return movie_opening;
	}

	public void setMovie_opening(Date movie_opening) {
		this.movie_opening = movie_opening;
	}

	public double getMovie_grade() {
		return movie_grade;
	}

	public void setMovie_grade(double movie_grade) {
		this.movie_grade = movie_grade;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}

	public String getMovie_content() {
		return movie_content;
	}

	public void setMovie_content(String movie_content) {
		this.movie_content = movie_content;
	}

	public String getMovie_genre() {
		return movie_genre;
	}

	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}

	public int getMovie_totaltime() {
		return movie_totaltime;
	}

	public void setMovie_totaltime(int movie_totaltime) {
		this.movie_totaltime = movie_totaltime;
	}

	public String getMovie_country() {
		return movie_country;
	}

	public void setMovie_country(String movie_country) {
		this.movie_country = movie_country;
	}

	public int getMovie_audience() {
		return movie_audience;
	}

	public void setMovie_audience(int movie_audience) {
		this.movie_audience = movie_audience;
	}

	
	public String getMovie_ing() {
		return movie_ing;
	}

	public void setMovie_ing(String movie_ing) {
		this.movie_ing = movie_ing;
	}

	public String getMovie_image() {
		return movie_image;
	}

	public void setMovie_image(String movie_image) {
		this.movie_image = movie_image;
	}

	@Override
	public String toString() {
		return "Movie [movie_code=" + movie_code + ", movie_title=" + movie_title + ", movie_opening=" + movie_opening
				+ ", movie_grade=" + movie_grade + ", movie_category=" + movie_category + ", movie_content="
				+ movie_content + ", movie_genre=" + movie_genre + ", movie_totaltime=" + movie_totaltime
				+ ", movie_country=" + movie_country + ", movie_audience=" + movie_audience + ", movie_ing=" + movie_ing
				+ ", movie_image=" + movie_image + "]";
	}

	
	
	
	

}