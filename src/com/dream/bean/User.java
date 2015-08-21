package com.dream.bean;

import cn.bmob.v3.BmobObject;

public class User extends BmobObject {
	private String username;
	private String password;
	private String mobilePhoneNumber;
	private String nickname;
	private String person_info;
	private Boolean sex;
	private String pic; // 头像文件

	@Override
	public String toString() {
		return "StudentBean [username=" + username + ", password=" + password
				+ ", mobilePhoneNumber=" + mobilePhoneNumber + ", nickname="
				+ nickname + ", person_info=" + person_info + ", sex=" + sex
				+ ", pic=" + pic + "]";
	}
   public User(){
	  
   }

	public User(String username, String password,
			String mobilePhoneNumber, String nickname, String person_info,
			Boolean sex, String pic) {
		super();
		this.username = username;
		this.password = password;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.nickname = nickname;
		this.person_info = person_info;
		this.sex = sex;
		this.pic = pic;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPerson_info() {
		return person_info;
	}

	public void setPerson_info(String person_info) {
		this.person_info = person_info;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}
