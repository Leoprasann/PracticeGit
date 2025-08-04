package com.gitPractice;

public class Vasavi {
	
	private Integer EmployeeId;
	private String EmployeeName;
	private String EmployeeAddress;
	
	public Integer getEmployeeId() {
		
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	
	
	@Override
	public String toString() {
		return "Vasavi [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAddress="
				+ EmployeeAddress + "]";
	}
}
