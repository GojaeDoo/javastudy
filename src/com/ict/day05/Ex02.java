package com.ict.day05;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		// 조건식이 참일때 실행, 거짓이면 실행하지 않음
		// 형식) for ( 초기식 ; 조건식 ; 증감식 ) {
		// 조건식이 참일때 실행할 문장;
		// 조건식이 참일때 실행할 문장;
		// }

		// 1. for문 만나면 초기식에 간다.
		// 2. 초기식 가지고 조건식 간다.
		// 3. 조건식이 참이면 실행, 거짓이면 실행하지 않음
		// 4. 참일때 실행하다가 for문의 끝을 만나면 다시 증감식으로 간다.
		// 5. 증감식에서 증가하거나 감소 후 다시 조건식에 간다.
		// 6. 조건식이 참이면 실행, 거짓이면 실행하지 않음

		// 자바에서는 변수를 만들고 선언하면 해당 블록에서만 사용 가능
		// 해당 블록을 벗어나면 변수는 사라진다.
		// for문의 초기식에서 변수를 만들어 사용한다.
		// 초기식에서 만든 변수는 for문을 벗어나면 사용 못함 ( 즉 , 사라진다. )

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("hi");
			System.out.println("안녕하세요");
		}
		// for문에서 만든 변수는 for문 밖에서 사용 불가
		// System.out.println(i);

		int k1;
		for (k1 = 0; k1 < 10; k1++) {
			System.out.println("hi");
		}
		System.out.println(k1);
		System.out.println();

		// 10 - 20 까지 출력

		System.out.println("10~20 까지 출력");
		int k2;
		for (k2 = 10; k2 < 21; k2++) {
			System.out.println(k2);
		}
		System.out.println();

		// 10 ~ 20 까지 짝수만 출력
		System.out.println("10~20 까지 짝수 출력");
		for (int i = 10; i < 21; i = i + 2) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println();

		// 10 ~ 20 까지 홀수만 출력
		System.out.println("10~20 까지 홀수 출력");
		for (int i = 11; i < 20; i = i + 2) {
			if (i % 2 == 1)
				System.out.println(i);
		}
		System.out.println();

		// 구구단에서 5단 출력

		System.out.println("5단");
		for (int i = 5; i < 46; i++) {
			if (i % 5 == 5 || i % 5 == 0)
				System.out.println(i);
		}

		System.out.println("5단");
		for (int i = 1; i < 10; i++) {

			System.out.println("5 * " + i + " = " + (5 * i));
		}

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}

		System.out.println();
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			
			
			// 4의 배수일 때
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		
		// 0 ~ 10의 누적합 (합계 구하기)
		
		int sum = 0;  // 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i ; // 기억값 = 이전기억값 + 현재 값
		}
		System.out.println("누적합 : " + sum);
		
		
		
		
		// 0 ~ 10 홀수의 합계 , 짝수의 합계를 각각 구하자.
		
		System.out.println("0~10 홀수의 합계.");
		
		int sum1 = 0;
		
		for (int i = 1; i < 11; i = i + 2) {
			if (i % 2 == 1);
			sum1 = sum1 + i ;
		}
		
		System.out.println("누적합 : " + sum1);
		
		
		
		
		System.out.println("0~10 짝수의 합계.");
		int sum2 = 0;
		for (int i = 0; i < 11; i = i + 2) {
			if (i % 2 == 0);
			sum2 = sum2 + i ;
		}
		System.out.println(sum2);
		
		
		
		// 7! ( 7 * 6 * 5 * 4 * 3 * 2 * 1)의 합은?
		
		System.out.println("곱하기");
		int sum3 = 1;
		for (int i = 7; i > 1; i--) {
			sum3 = sum3 * i ; // 누적 값 = 이전 값 * 현재 값
		}
		System.out.println(sum3);
		
		// 1+(-2)+3(-4)+.... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
		
		for (int i = 1; i < 101; i++) {
			
		}
		
	}
}
