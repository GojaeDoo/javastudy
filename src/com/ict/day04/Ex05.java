package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~ else 문
		// 삼항연산자와 비슷하게 처리
		// 즉, 조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
		// 주의사항 ) 한줄은 블록 생략 가능
		// if ( 조건식 ) {
		//      조건식이 참일 때 실행 ;
		//      조건식이 참일 때 실행 ;
		//      조건식이 참일 때 실행 ;
		//  } else {
		//      조건식이 거짓일 때 실행 ;
		//      조건식이 거짓일 때 실행 ;
		//      조건식이 거짓일 때 실행 ;
		//  }
		
		
		
		// 문제 1
		// int k1이 홀수인지 짝수인지 판별하자
		
		int k1 = 7;
		
		String result = "";
		
		if ( k1 % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		System.out.println( k1 + "은 " + result +"입니다.");
		
		
		
		
		// 문제 2
		// int k2가 60이상이면 합격 아니면 불합격
		
		int k2 = 62;
		
		String result2 = "";
		
		if (k2 >= 60) {
			result2 = "합격입니다. 축하드립니다.";
		} else {
			result2 = "불합격입니다. 재시험 응시바랍니다.";
		}
		
		System.out.println(result2);
		
		
		
		
		// 문제 3
		// int k3가 1이면 가격에 0.1 할인(10%)한다. (얼마에 살 수 있나)
		
		int k3 = 1;
		
		int price = 15000;
		
		int result3 = 0;
		
		if ( k3 == 1 ) {
			result3 = price - ( price / 10);
		} else {
			result3 = price;
		}
		
		System.out.println(result3);
		
		
		
		
		
		// 문제 4
		// char k4 = 대문자인지 , 대문자가 아닌지 판별하자.
		
		char k4 = '3';
		
		String result4 = "";
		
		if (k4 >= 'a' && k4 <='z') {
			result4 = "소문자";
		} else if (k4 >= 'A' && k4 <= 'Z'){
			result4 = "대문자";
		} else {
			result4 = "외계어";
		}
		System.out.println(result4);
		
		
		
		// 문제 5
		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		
		
		int worktime = 8;
		int mywork = 10;
		int price1 = 9860;
		
		int result5 = 0;
		
		if (mywork > worktime) {
			result5 = (int)(( worktime * price1 ) + (( mywork - worktime ) * price1 * 1.5 )) ;
		} else {
			result5 = worktime * price1;
		}
		
		System.out.println(result5);
	}
}
