package org.company;

public class Bank {
	public void fixed() {
		System.out.println("5000");
	}
	public void saving() {
		System.out.println("2500");
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		b.fixed();
		b.saving();
	}
	}

