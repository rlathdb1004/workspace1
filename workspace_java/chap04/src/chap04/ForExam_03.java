package chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {
		
		// for문의 기본 형식
//		for (;;) {
//			
//		}
//		
		int sum = 0;
		
//		for( int i=1; i<=100; i = i + 2 ) {
		//홀수의 값을 구함 - 1+2=3
//		for( int i=1; i<=100; i++ ) {
		int i = 0;
		for( i = 1; i<=100; i++ ) {
			sum = sum + i;
//			sum += i;
		}
		System.out.println(sum);
		System.out.println(i); 
//		기본 포문에 있는 i는 지역변수임 
		
		
		// 깜짝 퀴즈
		// 1~10까지 출력
		
		for (int j=1; j <= 10; j++) {
			System.out.println(j);
		}
		
		// 1+1+1+1+1
		// 1씩 더하는 것을 5번 하고 싶다
		// 반복 되는게 변경되지 않았을때
		int sum1 = 0;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		System.out.println(sum1);

		// 시작 값
		// 종료 조건
		int sum2 = 0;
		for( int j=1; j<=5; j++ ){
			sum2 = sum2 +1;
		}
		System.out.println(sum2);
		
		//1~5까지 합을 구한다
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		sum = 0;
		int k = 1; 
		sum = sum + k; //k==1
		k++;
		sum = sum + k; //k==2
		k++;
		sum = sum + k; //k==3
		
		for(k=1;k<=5; k++) {
			sum = sum + k;
		}
		System.out.println(sum);
		
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복되는거 찾기
		 *    Ctrl+c,v 했을때 바뀌지 않는것 찾기
		 *    
		 * 2. 반복 되지 않는 것의
		 *    2-1. 규칙(패턴) 찾기
		 *    2-2. 변수로 변환 후 더 이상 바뀌지 않게 만들기
		 *    
		 * 3. 시작 값 파악
		 * 4. 종료 조건 파악 
		 */
		
		//깜짝퀴즈
		//구구단 2단 출력 
		
		// "2 x 1 = 2"
		// "2 x 2 = 4"
		
		System.out.println("2 X 1 = 2");
		System.out.println("2 X 2 = 4");
		System.out.println("2 X 3 = 6"); //슬로우 모션 

		int a = 1; //초기값
		int b = 2 * a;
		System.out.println("2 X "+ a +" = "+b);
		a = a + 1; //증가 규칙을 작성하면 됨
		b = 2 * a;
		System.out.println("2 X "+ a +" = "+(2 * a)); //a = 2 , b = 4

		//(선언 ; 조건문 ; 증감값)
		for( a=1; a<=9; a = a + 1 ) {
			System.out.println("2 X "+ a +" = "+(2 * a));
		}
		System.out.println("----------");
	
		
		//{2번 문제} 10부터 1까지 출력
		
		for( int c=10; c>=1; c--) {
			System.out.println(c);
		}
		
		System.out.println("----------");
		//{3번 문제} 10부터 2까지 짝수만 출력 
		
//		for( int c=10; c>=1; c--) {
//			if(c%2 == 0) {
//			System.out.println(c);
//		}
//		}
		
		//사용하기 좋은 코드
		for( int c = 10; c >= 1; c = c-2) {
			// 1. 10
			// 2. 8
			System.out.println(c);
		}
		System.out.println("----------");
		//-------꼭 풀 수 있어야 함------
		// 문제 1 
		// 1~5까지 출력하되 홀수인지 짝수인지 같이 출력
		// 예) 1: 홀수
		//     2: 짝수
		int q1 = 1;
		for(q1=1; q1<=5; q1++){
			System.out.print(q1);
			if(q1%2==1) {
				System.out.println(":" + "홀수");
			} else {
				System.out.println(":" + "짝수");
			}
		}
		
		System.out.println("----------");
		// 문제2
		// 1~100까지 홀수의 합과 개수
		int sum0 = 0;
		int cou = 0;
		for(int q2=99; q2>=1; q2=q2-2) {
			System.out.println(q2);
			sum0 = sum0+q2; // 홀수의 합 구하기 
			cou = cou+1;
//			cou += 1;
//			cou++;
		}System.out.println("총합 :" + sum0);
		System.out.println("개수합 :" + cou);
		
		// 문제3
		// 1 ~ 입력 받은 수까지 더하기
 		 Scanner scan = new Scanner(System.in);
	        int = scan.nextInt(); 
	        System.out.print("총합 :" );
		

		// -------조금 난이도-----------
		// 문제4
		// 1~10까지 3개씩 옆으로 찍기
		// 예) 1 2 3 
		// 	   4 5 6
		
		//--- 2중 for 문 --
		// 문제5
		// 구구단 모든 단 출력 
		
	    //문제2
	    //구구단 단마다 옆으로 출력
	    //2*1=2 2*2=4......
	        
	    //문제3
	    // 구구단 3단씩 옆으로 출력  
	    //2*1=2 3*1=3 4*1=4
	    
	    //문제4
	    // 주사위 2개를 굴려서
	    // 나올수 있는 모든 조합 출력   
	    // [1,1] [1,2]
	        
	    //문제5
	    // 주사위 2개를 굴려서
	    //합 별로 출력
	    //합2 : [1,1]
	        
	        
	    // 문제6
	    // 주사위 2개를 굴려서 나올 조합에서 
	    // 중복없이 출력
	     // [1,1] [1,2]  중복이라 [1.1]만 나와야함  
		        
		
		
	}

}
