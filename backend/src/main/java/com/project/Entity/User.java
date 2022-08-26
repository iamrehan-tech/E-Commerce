package com.project.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	@Column
	private String username;
	
	@Column(unique=true)
	private String useremail;
	
	@Column
	private String userpassword;
	
	@Column
	private String userconfirmpassword;
	
	@Column
	private String useraddress;
	
	@Column
	private String usertype;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String username, String useremail, String userpassword, String userconfirmpassword,
			String useraddress, String usertype) {
		super();
		this.userId = userId;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userconfirmpassword = userconfirmpassword;
		this.useraddress = useraddress;
		this.usertype = usertype;
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

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", useremail=" + useremail + ", userpassword="
				+ userpassword + ", userconfirmpassword=" + userconfirmpassword + ", useraddress=" + useraddress
				+ ", usertype=" + usertype + "]";
	}

	

//	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//	 private List<Product> product;
}

