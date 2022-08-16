package com.hello.jbk;

public abstract class A implements xyz,xyz1{
	/*private void show()
	{
		System.out.println("I am in show");
	}
	/*public static void main(String[] args) {
		A a=new A();
		A a1=new A();
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a.equals(a1));
		a.show();
	}*/
	void m1()
	{
		System.out.println("A-M1");
	}
	void m2()
	{
		System.out.println("A-M2");
	}
	@Override
	public void abc() {
		
		System.out.println("Abc");
	}
	@Override
	public void pqr() {
		// TODO Auto-generated method stub
		System.out.println("pqr");
	}
	@Override
	public void pqr1() {
		// TODO Auto-generated method stub
		System.out.println("pqr1");
	}

}
