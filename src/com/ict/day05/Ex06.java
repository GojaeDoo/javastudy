package com.ict.day05;

import java.util.Scanner;


 // 홀 , 짝 게임
public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("숫자 입력 : ");
			int su = scan.nextInt();

			String result = "";
			if (su % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
			}
			System.out.println(su + " 는 " + result + "입니다.");
			System.out.println();
			System.out.print("계속할까요?( 1. Yes , 2. No )");
			int res = scan.nextInt();
			if(res == 2) break;
		}
	}
}
