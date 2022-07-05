package com.itwill.gc.vo;

public class MovieItem {
	int i_code;
	String i_day;
	String i_daytime;
	int i_seat;
	int i_price;
	String i_cname;
	String i_cplace;
	
	public MovieItem() {
		super();
	}

	public MovieItem(int i_code, String i_day, String i_daytime, int i_seat, int i_price, String i_cname,
			String i_cplace) {
		super();
		this.i_code = i_code;
		this.i_day = i_day;
		this.i_daytime = i_daytime;
		this.i_seat = i_seat;
		this.i_price = i_price;
		this.i_cname = i_cname;
		this.i_cplace = i_cplace;
	}

	public int getI_code() {
		return i_code;
	}

	public void setI_code(int i_code) {
		this.i_code = i_code;
	}

	public String getI_day() {
		return i_day;
	}

	public void setI_day(String i_day) {
		this.i_day = i_day;
	}

	public String getI_daytime() {
		return i_daytime;
	}

	public void setI_daytime(String i_daytime) {
		this.i_daytime = i_daytime;
	}

	public int getI_seat() {
		return i_seat;
	}

	public void setI_seat(int i_seat) {
		this.i_seat = i_seat;
	}

	public int getI_price() {
		return i_price;
	}

	public void setI_price(int i_price) {
		this.i_price = i_price;
	}

	public String getI_cname() {
		return i_cname;
	}

	public void setI_cname(String i_cname) {
		this.i_cname = i_cname;
	}

	public String getI_cplace() {
		return i_cplace;
	}

	public void setI_cplace(String i_cplace) {
		this.i_cplace = i_cplace;
	}
	
	
	
}
