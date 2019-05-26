package com.app.model;

import lombok.*;

@Data  // For Getters and Setters
public class VersionModel  {
  private String version = null;
  private Integer major = null;
  private Integer minor = null;
  private Integer patch = null;
public void setVersion(String string) {
	// TODO Auto-generated method stub
	
}
public Integer getMajor() {
	return major;
}
public void setMajor(Integer major) {
	this.major = major;
}
public Integer getMinor() {
	return minor;
}
public void setMinor(Integer minor) {
	this.minor = minor;
}
public Integer getPatch() {
	return patch;
}
public void setPatch(Integer patch) {
	this.patch = patch;
}
public String getVersion() {
	return version;
}
public void setMajor(int i) {
	// TODO Auto-generated method stub
	
}
}
