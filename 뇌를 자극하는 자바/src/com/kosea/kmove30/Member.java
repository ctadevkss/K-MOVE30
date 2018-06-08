package com.kosea.kmove30;
// DataAccessObject

import org.apache.log4j.Logger;

public class Member {

	private final Logger logger = Logger.getLogger(Member.class);
	
	int mno;
	String id;
	String pass;

	
	public Member() {}
		
	public Member(int mno, String id, String pass) {
		super();
		this.mno = mno;
		this.id = id;
		this.pass = pass;
	}

	public void printLog(String logMessage) {
		
		logger.info(logMessage);
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
