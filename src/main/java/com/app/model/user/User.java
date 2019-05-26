package com.app.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.persistence.*;
import lombok.*;
import javax.validation.constraints.*;
import java.util.EnumSet;

@Entity
public class User {
    @Id
    @Getter @Setter private String userId;
    @Getter @Setter private String password = "";
    @Getter @Setter private String company;
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private String email;

    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSecurityProviderId() {
		return securityProviderId;
	}

	public void setSecurityProviderId(int securityProviderId) {
		this.securityProviderId = securityProviderId;
	}

	public int getDefaultCustomerId() {
		return defaultCustomerId;
	}

	public void setDefaultCustomerId(int defaultCustomerId) {
		this.defaultCustomerId = defaultCustomerId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getSecretQuestion() {
		return secretQuestion;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public boolean isEnableBetaTesting() {
		return enableBetaTesting;
	}

	public void setEnableBetaTesting(boolean enableBetaTesting) {
		this.enableBetaTesting = enableBetaTesting;
	}

	public boolean isEnableRenewal() {
		return enableRenewal;
	}

	public void setEnableRenewal(boolean enableRenewal) {
		this.enableRenewal = enableRenewal;
	}

	@JsonIgnore @Getter @Setter private int    securityProviderId;
    @JsonIgnore @Getter @Setter private int    defaultCustomerId;

    @JsonIgnore @Getter @Setter private String phone;
    @JsonIgnore @Getter @Setter private String address1;
    @JsonIgnore @Getter @Setter private String address2;
    @JsonIgnore @Getter @Setter private String country;
    @JsonIgnore @Getter @Setter private String postal;

    @Enumerated(EnumType.STRING)
    @Getter @Setter private Role role;

    //@JsonIgnore
    @JsonIgnore @Getter @Setter private boolean isActive;
    //@JsonIgnore
    @JsonIgnore @Getter @Setter private boolean isBlocked;
    @JsonIgnore @Getter @Setter private String  secretQuestion;
    @JsonIgnore @Getter @Setter private String  secretAnswer;
    @JsonIgnore @Getter @Setter private boolean enableBetaTesting;
    @JsonIgnore @Getter @Setter private boolean enableRenewal;

    public User(){
        this("new", "PASSWORD", Role.USER, "new", "new", true, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, String firstName, String lastName){
        this(userId, password, Role.USER, firstName, lastName, true, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, Role role, String firstName, String lastName){
        this(userId, password, role, firstName, lastName, true, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, Role role, String firstName, String lastName, boolean isActive){
        this(userId, password, role, firstName, lastName, isActive, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, Role role, String firstName, String lastName, boolean isActive,
         String company, String phone, String address1, String address2, String country, String postal,
         String secretQuestion, String secretAnswer, boolean enableRenewal, boolean enableBetaTesting){
        this.setUserId(userId);
        this.setEmail(userId);
        this.setPassword(new BCryptPasswordEncoder().encode(password));
        this.setRole(role);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setActive(isActive);
        this.setCompany(company);
        this.setPhone(phone);
        this.setAddress1(address1);
        this.setAddress2(address2);
        this.setCountry(country);
        this.setPostal(postal);
        this.setSecretQuestion(secretQuestion);
        this.setSecretAnswer(secretAnswer);
        this.setEnableRenewal(enableRenewal);
        this.setEnableBetaTesting(enableBetaTesting);
    }

    public String getFullName(){
        return this.firstName + this.lastName;
    }
}
