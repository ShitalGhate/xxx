package com.hello.jbk;

public class B  extends A{
	
	void show1()
	{
		System.out.println("I am in show");
	}
	void m1()
	{
		System.out.println("b-M1");
	}
	void m2()
	{
		System.out.println("b-M2");
	}
public void abc() {
		
		System.out.println("Abc extended");
	}
	public static void main(String[] args) {
		A b=new B();
		b.m1();
		b.m2();
		b.abc();
		b.pqr();
		b.pqr1();
		System.out.println(xyz.x);
		System.out.println(xyz.y);
		System.out.println(xyz.z);
		
		
	}
}
