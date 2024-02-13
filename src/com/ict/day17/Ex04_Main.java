package com.ict.day17;

public class Ex04_Main {
	public static void main(String[] args) {
		
		Ex04 test = new Ex04();
		
		new Thread(test, "1st").start();
		new Thread(test, "2nd").start();
	}
}
