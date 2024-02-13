package com.ict.day02;

public class Ex07 {
	public static void main(String[] args) {
		// String : 문자열을 처리하기 위한 클래스이다.
		//          기본 자료형이 아니다. 참조 자료형(클래스를 자료형으로 사용)이다.
		//          기본 자료형과 사용법이다.
		//          데이터에는 반드시 "내용"(쌍따옴표) 사용
		// String  이름 = "내용";
		
		
		// + 연산자를 사용할 수 있다.
		// 실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역할이다.
		// + 연산을 하면 무조건 결과는 문자열 (String)이다.
		
		String s1 = "hello";
		System.out.println(s1);
		
		String s5 = "a";
		System.out.println(s5);
		
		
		String k1 = "1000";
		System.out.println(k1 + 100);
		
		int k2 = 1000;
		System.out.println(k2 + 100);
		
		
		// 문자열에 + 연산자를 사용하면 무조건 결과는 String이다.
		// int k3 = 105 + "105";
		String k4 = 105 + "105";
		
		
		int su1 = 20;
		int su2 = 4;
		System.out.println(su1+su2);
		System.out.println("합계 : " + su1+su2);
		System.out.println("합계 : " + (su1 + su2));
		
	}
}
