package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// while 문 : for문과 같은 반복문
		// 형식2 )
		// 초기식 또는 현재 변수
		// while ( true ){
		// if ( 빠져나갈 조건 ) break;
		// 실행할 내용 ;
		// 증감식
		// }
		// * while 끝을 만나면 조건식으로 이동

		// 0~10 까지 출력 }

		int k1 = 0;

		while (k1 <= 11) {
			if (k1 >= 11)
				break;
			System.out.println(k1);
			k1++;
		}

		// 10 ~ 20 까지 짝수만 출력하자

		int k2 = 10;

		System.out.println();
		
		while (true) {
			if (k2 > 20)
				break;
			if (k2 % 2 == 0)
				System.out.println(k2);
			k2++;
		}
		System.out.println();
		// a-h 까지 출력하자
		
		char k3 = 'a';
		
		while (true) {
			if (k3 >= 'h'+1) break;
			System.out.println(k3);
			k3++;
		}
	}
}
