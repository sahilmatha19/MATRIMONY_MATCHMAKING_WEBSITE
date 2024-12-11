package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CustomerMatrimony")
public class Customer {
	@Id
	private String emailId;
	private String password;
	
	private String fullName;
	private String mobileNo;
	private String gender;

	private String dob;
	private String religion;
	private String caste;
	private String motherTongue;
	
	private String maritalStatus;
	private String familyStatus;
	private String familyType;
	private String height;
	private String anyDisability;
	
	private String city;
	private String state;
	private String country;
	
	private String qualification;
	private String occupation;
	private String annualIncome;
	private String hobbies;
	private String aboutUser;
	private String profilePhoto;
	
	public Customer(String emailId, String password, String fullName, String mobileNo, String gender, String dob,
			String religion, String caste, String motherTongue, String maritalStatus, String familyStatus,
			String familyType, String height, String anyDisability, String city, String state, String country,
			String qualification, String occupation, String annualIncome, String hobbies, String aboutUser,
			String profilePhoto) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.fullName = fullName;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.dob = dob;
		this.religion = religion;
		this.caste = caste;
		this.motherTongue = motherTongue;
		this.maritalStatus = maritalStatus;
		this.familyStatus = familyStatus;
		this.familyType = familyType;
		this.height = height;
		this.anyDisability = anyDisability;
		this.city = city;
		this.state = state;
		this.country = country;
		this.qualification = qualification;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.hobbies = hobbies;
		this.aboutUser = aboutUser;
		this.profilePhoto = profilePhoto;
	}
	
	public Customer() {
		super();
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getMotherTongue() {
		return motherTongue;
	}
	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getFamilyStatus() {
		return familyStatus;
	}
	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}
	public String getFamilyType() {
		return familyType;
	}
	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getAnyDisability() {
		return anyDisability;
	}
	public void setAnyDisability(String anyDisability) {
		this.anyDisability = anyDisability;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getAboutUser() {
		return aboutUser;
	}
	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	
	@Override
	public String toString() {
		return "Customer [emailId=" + emailId + ", password=" + password + ", fullName=" + fullName + ", mobileNo="
				+ mobileNo + ", gender=" + gender + ", dob=" + dob + ", religion=" + religion + ", caste=" + caste
				+ ", motherTongue=" + motherTongue + ", maritalStatus=" + maritalStatus + ", familyStatus="
				+ familyStatus + ", familyType=" + familyType + ", height=" + height + ", anyDisability="
				+ anyDisability + ", city=" + city + ", state=" + state + ", country=" + country + ", qualification="
				+ qualification + ", occupation=" + occupation + ", annualIncome=" + annualIncome + ", hobbies="
				+ hobbies + ", aboutUser=" + aboutUser + ", profilePhoto=" + profilePhoto + "]";
	}
	
}
