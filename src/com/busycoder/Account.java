package com.busycoder;

import java.io.Serializable;

public class Account{
	int id;
	String name;
	double balance;
	static String bankName = "SBI";

	public Account() {
		System.out.println("ctr of account class");
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
