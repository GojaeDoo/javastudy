package com.ict.day14;

import java.util.Scanner;

// throws : 예외전가 , 예외양도
//          예외가 발생하면 예외처리를 하지 않고 자신을 호출한 곳으로 예외객체를 전달.
//          나중에라도 예외처리를 하는 것이 좋다.

public class Ex11 {

	public void setData(String str) {
		try {
		// str의 길이가 0보다 크면 ( str이 null이 아니면 )
		if (str.length() >= 1) {
			String res = str.substring(0, 1);
			prnData(res);
		}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
		}
	}
	// NumberFormatException 발생하면 해당 메서드를 호출한 곳으로 NumberFormatException를 던진다.
	public void prnData(String str) throws NumberFormatException{
		// 예외 처리
		//try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		//} catch (NumberFormatException e) {
		//	System.out.println("첫글자는 반드시 숫자여야 한다.");

		//}
	}

	public static void main(String[] args) {
		try {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
		String msg = scan.next();

		Ex11 ex11 = new Ex11();
		ex11.setData(msg);
		} catch (NumberFormatException e) {
			System.out.println("제데로 입력하세요");
		}
		System.out.println("수고하셨습니다.");

	}
}
