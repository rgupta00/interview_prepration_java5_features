package com.busycoder;
//Overriding
class P{
}
class Q extends P{
}


class A{
	
	public P foo() {
		System.out.println("foo of class A");
		return new P();
	}
}

class B extends A{
	@Override
	public Q foo() {
		System.out.println("foo of class B");
		return new Q();
	}
}

public class E_Co_varient_retrun_type {
	public static void main(String[] args) {
			A a=new B();
			P ob=a.foo();
			System.out.println(ob.getClass());
	}
}
