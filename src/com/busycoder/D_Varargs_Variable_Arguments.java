package com.busycoder;

class Cal{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(int b,int ...a) {
		int total=0;
		for(int temp: a) {
			total+=temp;
		}
		return total;
	}
}

public class D_Varargs_Variable_Arguments {
	
//	public static void main(String[] args) {
//
//	}
	
	public static void main(String...args) {
		
		Cal cal=new Cal();
		System.out.println(cal.add(3,4,5,6));
		
//		for(String arg:args) {
//			System.out.println(arg);
//		}
	}
}
