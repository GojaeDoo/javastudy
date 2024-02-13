package com.ict.day17;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		
		new Thread(test, "1st").start();
		new Thread(test, "2nd").start();
		
	}
}

