package com.ict.day09;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String i = "";		//	사용자 선택 (가위/바위/보)
		String res = "";	//	결과 (승리,무승부,패배)
		String msg = "";	//	Yes or 
		int c_Num = 0;			//	컴퓨터의 수
		int p_Num = 0;		//	사용자의 수
		int playCount = 0;		//	전체 횟수
		int win = 0;		//	이긴 횟수
		int loss = 0;       //	패배 횟수
		
		esc:while (true) {

			c_Num = (int) (Math.random() * 3);

			System.out.print("게임을 시작합니다 낼 것을 정하세요. (가위/바위/보) >>  ");
			i = scan.next();

			switch (i) {
			case "가위":
				p_Num = 0;
				break;
			case "바위":
				p_Num = 1;
				break;
			case "보":
				p_Num = 2;
				break;
			default :
				System.out.println("잘못입력했습니다. 다시 입력하세요.");
				continue;	
			}

			playCount++;

			if (c_Num == p_Num) {
				res = "무승부";
			} else if (c_Num - p_Num == -1 || c_Num - p_Num == 2) {
				res = "승리";
				win++;
			} else {
				res = "패배";
				loss++;
			}
			System.out.println(res);
			
			while (true) {
				
			System.out.print("계속하시겠습니까? (네/아니요) >> ");
			msg = scan.next();

			if (msg.equals("네")) {
				continue esc;
			}
			if (msg.equals("아니요")) {
				break esc;
			}
			System.out.println("잘못입력했습니다. 다시 입력하세요.");
			}
		}
		
		double per = ((win*1.0) / playCount) * 100;
		
		// 출력
		System.out.println();
		System.out.println("승리횟수 : " + win);
		System.out.println("패배횟수 : " + loss);
		System.out.println("승률 : " + (int)(per*10)/10.0);
		System.out.println("전체횟수 : " + playCount);
	}
}
