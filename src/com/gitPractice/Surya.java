package com.gitPractice;

public class Surya {
	private Integer employeid;
	private String employeename;
	private String employelocation;
	public Integer getEmployeid() {
		return employeid;
	}
	public void setEmployeid(Integer employeid) {
		this.employeid = employeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployelocation() {
		return employelocation;
	}
	public void setEmployelocation(String employelocation) {
		this.employelocation = employelocation;
	}
	@Override
	public String toString() {
		return "surya [employeid=" + employeid + ", employeename=" + employeename + ", employelocation="
				+ employelocation + "]";
	}
	
	
	
	

}
