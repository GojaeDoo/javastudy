package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	esc: while (true) {
			// 숫자를 받아서 홀수인지, 짝수인지 출력하자
			System.out.print("숫자를 입력하세요 : ");
			int k1 = scan.nextInt();
			String res = "";
			if (k1 % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(k1 + "는 " + res + "입니다.");

			while (true) {

				System.out.print("계속할까요? ( 1. Yes , 2. No) >>");
				int result = scan.nextInt();
				if (result == 1)
					continue esc;
				if (result == 2)
					break esc;

				System.out.println("제대로 입력하세요");
			} // 안쪽 while
		} // 바깥 while
		System.out.println("수고하셨습니다");
	}
}
