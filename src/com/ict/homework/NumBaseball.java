package com.ict.homework;

import java.util.Scanner;

public class NumBaseball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //0~9까지의 랜덤한 정수가 저장될 배열 
        int[] baseball = new int[3];
        //키보드로 입력한 정수가 저장될 배열 
        int[] answer = new int[3];

        //baseball 배열에 중복없이 랜덤수 저장
        for(int i = 0; i < baseball.length ; i++){
            int rand = (int)(Math.random() * 10);  //0~9사이의 랜덤수 생성 및 저장
            baseball[i] = rand;

            // 중복 값 제거
            for(int j = 0; j < i ; j++){
                if(baseball[i] == baseball[j]){
                    i--;
                    break;
                }
            }
        }
        int tryCnt = 0;
        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");
        while (true){
            System.out.print( ++tryCnt + " >> ");

            //키보드로 입력 받는 숫자 answer 배열에 저장
            for(int i = 0; i < answer.length; i++){
                answer[i] = scan.nextInt();
            }

            //strike, ball 계산
            int strike = 0, ball = 0;
            
            //같은 인덱스에 들어간 동일 데이터 = strike
            //다른 인덱스에 들어간 동일 데이터 = ball
            for(int i = 0; i < baseball.length ; i++){//baseball 배열 크기 만큼 돌면서
                for(int j = 0; j < answer.length; j++){//answer 배열 크기 만큼 또 돌아야 함.
                    if(baseball[i] == answer[j] && i == j){ //위치까지 같음
                        strike++;
                    }
                    else if(baseball[i] == answer[j] && i != j){ //위치 다름
                        ball++;
                    }
                }
            }
            //결과 출력
            System.out.println(strike + "스트라이크" + ball + "볼");

            if(strike == 3){
                break;  //while문 벗어남
            }
            else {
                strike = 0;
                ball = 0;    //초기화 시켜줘야함. 아니면 게임할 때 카운트가 누적됨.
            }
        }
        System.out.println(tryCnt + "회 만에 정답을 맞췄습니다.");
    }
}