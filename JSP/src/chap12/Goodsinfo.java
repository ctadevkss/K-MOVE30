package chap12;

/* gcode CHAR(5),
title VARCHAR(50),
writer VARCHAR(20),
price int(8),*/

public class Goodsinfo {

	String gcode;
	String title;
	String writer;
	int price;
	
	public String getGcode() {
		return gcode;
	}
	
	public void setGcode(String gcode) {
		this.gcode = gcode;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

}
