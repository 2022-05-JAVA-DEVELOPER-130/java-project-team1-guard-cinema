package com.itwill.gc.vo;

import java.util.Date;

/*
MOVIE_RV_NUM        NUMBER(20,0)
MOVIE_CODE         	NUMBER(10,0)
USER_ID             VARCHAR2(20 BYTE)
MOVIE_DAY			DATE
MOVIE_SEAT_NUM		NUMBER(10,0)
MOVIE_DAYTIME		NUMBER(10,0)
MOVIE_ORDER_PR		NUMBER(20,0)
MOVIE_TITLE			VARCHAR2(20 BYTE)
CINEMA_NAME			VARCHAR2(20 BYTE)
CINEMA_PLACE		VARCHAR2(10 BYTE)
*/
public class MovieReserve {
	private int movie_rv_num;
	private Date movie_day;
	private int movie_seat_num;
	private String movie_daytime;
	private int movie_order_pr;
	private String cinema_name;
	private String cinema_place;

	// movie_code, movie_title
	private Movie movie;

	// user_id
	private User user;

	public MovieReserve() {
	}

	public MovieReserve(int movie_rv_num, Date movie_day, int movie_seat_num, String movie_daytime, int movie_order_pr,
			String cinema_name, String cinema_place, Movie movie, User user) {
		super();
		this.movie_rv_num = movie_rv_num;
		this.movie_day = movie_day;
		this.movie_seat_num = movie_seat_num;
		this.movie_daytime = movie_daytime;
		this.movie_order_pr = movie_order_pr;
		this.cinema_name = cinema_name;
		this.cinema_place = cinema_place;
		this.movie = movie;
		this.user = user;
	}

	public int getMovie_rv_num() {
		return movie_rv_num;
	}

	public void setMovie_rv_num(int movie_rv_num) {
		this.movie_rv_num = movie_rv_num;
	}

	public Date getMovie_day() {
		return movie_day;
	}

	public void setMovie_day(Date movie_day) {
		this.movie_day = movie_day;
	}

	public int getMovie_seat_num() {
		return movie_seat_num;
	}

	public void setMovie_seat_num(int movie_seat_num) {
		this.movie_seat_num = movie_seat_num;
	}

	public String getMovie_daytime() {
		return movie_daytime;
	}

	public void setMovie_daytime(String movie_daytime) {
		this.movie_daytime = movie_daytime;
	}

	public int getMovie_order_pr() {
		return movie_order_pr;
	}

	public void setMovie_order_pr(int movie_order_pr) {
		this.movie_order_pr = movie_order_pr;
	}

	public String getCinema_name() {
		return cinema_name;
	}

	public void setCinema_name(String cinema_name) {
		this.cinema_name = cinema_name;
	}

	public String getCinema_place() {
		return cinema_place;
	}

	public void setCinema_place(String cinema_place) {
		this.cinema_place = cinema_place;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "MovieReserve [movie_rv_num=" + movie_rv_num + ", movie_day=" + movie_day + ", movie_seat_num="
				+ movie_seat_num + ", movie_daytime=" + movie_daytime + ", movie_order_pr=" + movie_order_pr
				+ ", cinema_name=" + cinema_name + ", cinema_place=" + cinema_place + ", movie=" + movie + ", user="
				+ user + "]";
	}
	
	
	

}
