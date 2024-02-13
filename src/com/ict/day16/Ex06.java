package com.ict.day16;

import java.util.*;

public class Ex06 {
	// 대한민국, 캐나다 , 영국 , 스위스의 수도가 각각 HashMap 에 저장시키고
	// 원하는 나라가 Key값이 되어 , 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
	// 출력되는 프로그램 작성
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();

		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		Set<String>key = map.keySet()	;

		esc: while (true) {
			System.out.print("나라를 입력하세요");
			String str = scan.next();
			if (map.containsKey(str)) {
				System.out.println(map.get(str));
			} else {
				System.out.println("데이터에 없는 나라입니다.");
				continue esc;
			}
			while (true) {
				System.out.print("계속하시겠습니까? 1. Yes 2. No");
				str = scan.next();
				if (str.equalsIgnoreCase("Y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("N")) {
					break esc;
				} else{
					System.out.println("다시 입력하세요.");
					continue;
				}
			}
		}
	}

}
