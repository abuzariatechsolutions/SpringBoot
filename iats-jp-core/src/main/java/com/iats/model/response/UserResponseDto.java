package com.iats.model.response;

import java.text.Format;
import java.text.SimpleDateFormat;

import com.iats.entity.User;

public class UserResponseDto {

	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String birthDate;
	private String phoneNumber;
	private String summary;
	private int experience;
	private String profImg;

	Format formatter = new SimpleDateFormat("yyyy-MM-dd");

	public UserResponseDto() {
	}

	public void populateObject(User user) {
		if (user.getEmail() != null) {
			email = user.getEmail();
		}
		if (user.getFirstName() != null) {
			firstName = user.getFirstName();
		}
		if (user.getMiddleName() != null) {
			middleName = user.getMiddleName();
		}
		if (user.getLastName() != null) {
			lastName = user.getLastName();
		}
		if (user.getGender() != null) {
			gender = user.getGender();
		}
		if (user.getBirthDate() != null) {
			birthDate = formatter.format(user.getBirthDate());
		}
		if (user.getPhNumber() != null) {
			phoneNumber = user.getPhNumber();
		}
		if (user.getSummary() != null) {
			summary = user.getSummary();
		}
		if (user.getExperience() != 0) {
			experience = user.getExperience();
		}
		if (user.getProfImg() != null) {
			profImg = user.getProfImg();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getProfImg() {
		return profImg;
	}

	public void setProfImg(String profImg) {
		this.profImg = profImg;
	}
}
