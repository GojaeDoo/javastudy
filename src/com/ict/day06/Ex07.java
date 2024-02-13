package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 전체 횟수 , 짝수 횟수 , 퍼센트 (소수점 첫째자리까지 출력)
		int total = 0;
		int res2 = 0;
		esc: while (true) {
			total++;
			System.out.print( "숫자를 입력하세요 : " );
			int k1 = scan.nextInt();
			String res = "";
			if (k1 % 2 == 0) {
				res = "짝수";
				res2++;
			} else {
				res = "홀수";
			}
			System.out.println(k1 + "는 " + res + "입니다.");
			
			// System.out.println("짝수횟수 : " + res2);
			// System.out.println("퍼센트 : " + res3);
			
			while (true) {
				System.out.print("계속할까요? ( 1. Yes , 2. No) >>");
				int result = scan.nextInt();
				if (result == 1)continue esc;
				if (result == 2)break esc;

				System.out.println("제대로 입력하세요");
			} // 안쪽 while
		} // 바깥 while
		System.out.println("수고하셨습니다");
		
		double per = (res2 /(total * 1.0)) * 100;
		System.out.println("전체 횟수 : " + total);
		System.out.println("짝수 횟수 : " + res2);
		System.out.println("퍼센트 : " + (int)(per*100)/100.0 + "%");
	}
}
