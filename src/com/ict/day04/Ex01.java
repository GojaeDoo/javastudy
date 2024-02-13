package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		// 삼항연산자
		// 형식) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;
		
		// int k1이 홀수인지 짝수인지 판별하자.
		// 힌트 ) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수

		
		// = (res == 1) ? "홀수" : "짝수" ;
		int k1 = 3;
		
		String result1 = (k1 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(result1);
		
		
		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 70;
		
		String result2 = (k2 >= 60) ? "합격" : "불합격";
		System.out.println(result2);
		
		// k3가 1이면 가격에 0.1 할인 한다.
		
		int k3 = 2;
		int price = 1000;
		
		int sale = ( k3 == 1 ) ? price - ( price / 10 ) : price ;
		System.out.println("최종금액 : " + sale + "원");
		System.out.println();
		
		// char k4 = 대문자인지 , 대문자가 아닌지 판별
		
		// 내가 한 방식
		char k4 = 'A';
		String text = ( k4 >= 96 ) ? "소문자" : "대문자" ;
		System.out.println(k4 + "는 " + text);
		
		// 두번째 방식
		String k5 = "Q";
		result2 = ( k4 >= 'A' && k4 <= 'Z' ) ? "대문자" : "대문자 아님" ;
		System.out.println(k4 + "는 " + result2);
		
		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다.
		// 얼마를 받아야 하는가?
		
		// myworktime - worktime
		
		int time = 10;
		int dan = 9860;
		int res3 = ( time > 8 ) ? (int)( dan * 1.5 * ( time - 8 ))+( 8 * dan ): time * dan;
		System.out.println("결과 : " + res3);
	}
}
