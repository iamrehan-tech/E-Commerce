package com.model;


public class User {

	private Long userId;
	

	private String username;
	

	private String useremail;
	
	
	private String userpassword;
	
	
	private String userconfirmpassword;
	

	private String useraddress;
	
	


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long userId, String username, String useremail, String userpassword, String userconfirmpassword,
			String useraddress) {
		super();
		this.userId = userId;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userconfirmpassword = userconfirmpassword;
		this.useraddress = useraddress;
		
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUseremail() {
		return useremail;
	}


	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public String getUserpassword() {
		return userpassword;
	}


	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}


	public String getUserconfirmpassword() {
		return userconfirmpassword;
	}


	public void setUserconfirmpassword(String userconfirmpassword) {
		this.userconfirmpassword = userconfirmpassword;
	}


	public String getUseraddress() {
		return useraddress;
	}


	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}





	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", useremail=" + useremail + ", userpassword="
				+ userpassword + ", userconfirmpassword=" + userconfirmpassword + ", useraddress=" + useraddress
				+ ", usertype=" + "]";
	}
	

	  

		
}


