package com.practice;

public class Student {
	private String name;
	private int marks;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public String getname() {
		return name;
	}
	public void setmarks(int marks) {
		if(marks>0&&marks<=100) {
			this.marks=marks;
			System.out.println("good");
		}
		else {
			System.out.println("marks are not good");
		}
	}
	public int getmarks() {
		return marks;
	}

}
