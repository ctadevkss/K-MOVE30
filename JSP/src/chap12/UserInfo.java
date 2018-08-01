package chap12;
/*
    userinfo 테이블 
	uname	   varchar(50)
	uid	       varchar(50)
	upassword  varchar(50)
*/

public class UserInfo {

	String uname;
	String uid;
	String upassword;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
}
