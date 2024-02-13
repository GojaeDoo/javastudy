package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름 , 국어 , 영어 , 수학 점수를 키보드로 입력 받아서 
		// 출력은 이름 , 총점 , 평균만 출력하자 (단, 평균은 소수점 둘째자리 까지 구하자)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.println("이름은 :" + name);
		
		System.out.print("국어 : ");
		int ko  = scan.nextInt();
		System.out.println("국어 점수 :" + ko);
		
		System.out.print("영어 : ");
		int en  = scan.nextInt();
		System.out.println("영어 점수 :" + en);
		
		System.out.print("수학 : ");
		int ma  = scan.nextInt();
		System.out.println("수학 점수 :" + ma);
		
		
		// 요구사항 구하기
		// 처리 = 비즈니스로직
		
		int total = ko + en + ma;
		double avg = (int)(total / 3.0 * 100) / 100.0 ;
		
		System.out.println("이름 : " + name);
		System.out.println("총점은 " + total + "점 입니다.");
		System.out.println("평균은 " + avg + "입니다.");
	}
}
