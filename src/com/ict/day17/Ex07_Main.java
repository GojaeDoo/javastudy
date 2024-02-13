package com.ict.day17;

public class Ex07_Main {
	public static void main(String[] args) {
		Ex07_Atm atm = new Ex07_Atm();
		Thread mother = new Thread(atm,"mother");
		Thread sun = new Thread(atm,"sun");
		mother.start();
		sun.start();
	}
}
