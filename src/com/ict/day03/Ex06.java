package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어는 90, 영어는 80, 수학은 80이다.
		// 총점과 평균을 구하자
		// 출력은 이름, 총점 , 평균을 출력하자 (단, 출력은 소수점 첫째자리 까지 구하자)
		
		// 이름
		String name = "홍길동";
		
		// 국어
		int ko = 90;
		
		// 영어
		int eng = 80;
		
		// 수학
		int math = 60;
		
		// 요구사항 (처리 = 비즈니스로직)
		// 총점과 평균
		
		int sum = ko + eng + math;
		// 정수와 실수가 산술연산을 하면 실수가 된다. (소수점이 있다.)
		double avg = (int)(sum / 3.0 * 10) / 10.0 ;
		double avg2 = (int)(sum / 3.0 * 100) / 100.0 ;
		
		// 출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + avg2);
		System.out.println();
		
		// 끝에 5를 버리고자 한다.
		int k1 = (198745 / 10) * 10;
		//  끝 두자리 45를 버릴 때
		int k2 = (198745 / 100) * 100;
		
		
		System.out.println(k1);
		System.out.println(k2);
		
	}
}
