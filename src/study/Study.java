package study;

import java.util.Iterator;
import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		int su1 = 0;
		int su2 = 0;
		int total = 0;
		
		
		esc:while (true) {
			System.out.print("숫자를 입력하세요");
			int su = scan.nextInt();
			if (su % 2 == 0) {
				str = "짝수";
				su2++;
				total++;
			} else {
				str = "홀수";
				su1++;
				total++;
			}
			System.out.println(su + "는 " + str + "입니다." );
			while (true) {
				System.out.print("계속할까요?  >>>  Y/N");
				String text = scan.next();
				if (text.equalsIgnoreCase("Y")) {
					continue esc;
				}else if (text.equalsIgnoreCase("N")) {
					break esc;
				}else {
					System.out.println("다시 입력하세요");
				}
			}
		}
		System.out.println("게임 끝 고생하셨습니다.");
		System.out.println("총 게임 수 : " + total);
		System.out.println("홀수 : " + su1);
		System.out.println("짝수 : " + su2);
	}
}
