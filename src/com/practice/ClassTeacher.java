package com.practice;

public class ClassTeacher {
	int id;
	String name;
	int age;
	int salary;
	String sub;
	public ClassTeacher(int id, String name, int age, int salary, String sub) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sub = sub;
	}
	public ClassTeacher() {
	}
	public void printteacherdeatail(int id,String name,int age,int salary,String sub) {
		System.out.println("Teacher id:"+id);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher subject:"+sub);
				
	}
	}

