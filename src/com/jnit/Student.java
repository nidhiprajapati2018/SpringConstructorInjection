package com.jnit;



public class Student {
	
	private int sid;
	private String sname;
	private int marks;
	
	public Student(){
		
	}
	
	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	
	}
	
	
	void display() {
		System.out.println("sid="+sid);
		System.out.println("sname="+sname);
		System.out.println("marks="+marks);
	}
	
	
	 
	
	

}
