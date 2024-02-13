package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		// 형식 ) 자료형 변수 = (조건식1) ? ((조건식2)? 참일 때 : 거짓일 때): 거짓일때 실행할 문장 ;
		// **형식 ) 자료형 변수 = (조건식1) ? 참일때 실행할 문장 : ((조건식2)? 참일때 : 거짓일때) ;
		
		// int k1이 90사이면 "A학점" , 80점이상이면 "B학점", 나머지는 "F학점"
		
		int k1 = 91;
		
		String result = (k1 >=90) ? "A학점" : ((k1 >= 80 )? "B학점" : "F학점");
		System.out.println("결과 : " + result);
		
		// char k2 가 대문자인지 소문자인지 기타문지인지 판별하자
		
		char k2 = 'c';
		
		String en = (k2 >= 'A' && k2 <= 'Z' ) ? "대문자" : ((k2 >= 'a' && k2 <= 'z' )? "소문자" : "기타문자") ;
		System.out.println(k2 + " : " + en);
		
		// int k3가 1 또는 3 이면 남자 , 나머지 여자
		
		int k3 = 1;
	
		String ge = (k3 == 1 || k3 == 3) ? "남자": "여자" ;
		System.out.println(k3 + " : " + ge);
		
		// int k4 가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		// 2이면 1900년대 태어난 여자 4이면 2000년대 태어난 여자
		
		int k4 = 1;
		
		String result4 = (k4==1 || k4==3) ? "남자" : ((k4 ==2 || k4 ==4)? "여자" : "외계인") ;
		System.out.println("결과 : " + result4);
		
		// int k4 가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		// 2이면 1900년대 태어난 여자 4이면 2000년대 태어난 여자
		
		int k5 = 1;
		String result5 = ( k5 == 1 || k5 == 3 ) ? (( k5 == 1 ) ? "1900년대 태어난 남자" : "2000년대 태어난 남자"):
				(( k5 == 2 || k5 == 4) ? (( k5 == 2 ) ? "1900년대 태어난 여자" : "2000년대 태어난 여자"): "외계인") ;
		System.out.println("결과 : " + result5);
		
		
		// int k6 가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
				// 2이면 1900년대 태어난 여자 4이면 2000년대 태어난 여자
				
		int k6 = 3;
				
		// 두 수 중 큰 수를 구하자
		
		int su1 = 4;
		int su2 = 9;
		int res = (su1 > su2) ? su1:su2;
		System.out.println("결과 : " + res);
		
		
		int res2 = Math.max(su1, su2);
		
		
		
		
		

	}
}