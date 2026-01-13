package chap04;

import java.util.Scanner;

public class BreakExam_05 {

	public static void main(String[] args) {

		int count = 0;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("주사위: "+ num);
			if(num == 6) {
				break; // break 만나면 반복이 끝남
			}
			
			count++;
		} 
		System.out.println("게임 종료 : 총 :"+ count);

		// 총 5명이 순차 적으로 주사위를 던져서 
		// 각자 6이 나올때 까지 6이 나오면 다음사람
		
		for (int i=1; i<=5; i++) {
			
			while(true) {
				int num = (int)(Math.random()*6) + 1;
				System.out.println(i+": 주사위: "+ num);
				
				if(num == 6) {
					break; //while 소속이라 while만 중단한다
				}
				
			} 
		}
		
		// 총 4층의 주차건물이 있음
		// 각 층에는 10대의 자리가 있음
		// 내 차는 1층 첫번째 부터 17번째에 있음
		int count2 = 0;
		boolean flag = false;
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=10;j++) {
				count2++;
				System.out.println(i+", "+j);
				if(count2 >= 17) {
					System.out.println("!!!!!!!!!!");
					flag = true;
					break;
				}
			
			}
			
			if(flag) {
				break;
			}
		}
		
		for(int i =1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		// 문제1(while로 풀기)
		// 은행 ATM기 만들기
		// 1-1 : 책 183 페이지 처럼 만들기
		// 1-2 : 
		//       예금 : -금액(음수) 불가
		//       출금 : -금액(음수) 불가 + 잔고 초과 불가
		//       메뉴 외 선택 불가
		
		
	}

}
