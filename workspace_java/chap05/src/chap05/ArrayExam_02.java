package chap05;

public class ArrayExam_02 {

	public static void main(String[] args) {

		/*
		 * 배열 array
		 * 
		 * 한번에 여러 변수를 만드는 방법 같은 타입만 선언할수 있음 생성할 때 전체 크기를 지정해줘야 함 생성된 여러 변수들은 index로 관리한다
		 * index는 0번부터 시작한다.
		 */

		// 선언 방법
		int[] a1; // java 스타일
		int a3[]; // C언어 스타일 -

		// 배열 변수는 참조 타입이라서 null을 넣을수 있다.
		a1 = null;

		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 70;

		/*
		 * 첫번쨰 [] : int[] int 만으로 구성된 배열 변수 타입
		 * 
		 * 두번째 [] : new int[] 배열의 크기. 즉, 한번에 만들 변수의 개수
		 * 
		 * 세번째 [] : score[0] 만들어진 변수 중에서 몇번째인가? index(목차)는 0부터 시작한다
		 */

		// 배열을 선언하는 첫번째 방법
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 85;
		score[2] = 70;
//		score[3] = null;

		System.out.println("score[0]: " + score[0]);

		// ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
		// 길이가 30이라서 0~29까지는 가능한데 50은 범위를 벗어났다.
//		score[50] = 2;

		String[] str = new String[3];
		System.out.println("str[0]: " + str[0]);
		System.out.println("score[5]: " + score[5]);

//		int a;
//		System.out.println(a);

		// 배열 생성 후 기본값
		// 0, false, null로 초기화 됨

		// 배열을 선언하는 두번째 방법

		int[] i1 = new int[] { 90, 85, 70 };
		System.out.println("il[1]: " + i1[1]);

		// 모든 변수는 선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[] { 90, 85, 70 };

		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용 가능
		// new int[]를 생략할수 있다
		int[] i3 = { 90, 85, 70 };
// 		i3 = {90,85,70} - new가 있어야 사용가능

		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[1];

//		for(int i=0; i<=2)
		for (int i = 0; i < 3; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총합: " + sum);
		System.out.println("총합: " + (sum / 3.0));

		sum = 0;
		System.out.println("배열의 길이: " + i3.length);
		for (int i = 0; i < i3.length; i++) {
			sum = sum + i3[i];
		}

		// 순차적 연습
		// 5개 변수를 한번에 만들기
		// 즉 5개 크기의 int 배열 만들기

		int[] a5 = new int[5];
		// 첫번째 변수에 1넣기
		a5[0] = 1;
		// 두번째 변수에 2넣기
		a5[1] = 2;
		a5[2] = 3;
		a5[3] = 4;
		a5[4] = 5;

		// 문제 1 
		// 첫번째 반복문에서
		// 10개의 변수에 1~10 값 담기
		// 두번째 반복문에서
		// 모든 값을 순서대로 출력

		int[] s1 = new int[10];
		// 배열을 만들었다.변수의 배열이다 s1은
//		s1[0] = 1;
//		s1[1] = 2;
//		s1[2] = 3;
//		s1[3] = 4;
//		s1[4] = 5;
//		s1[5] = 6;
//		s1[6] = 7;
//		s1[7] = 8;
//		s1[8] = 9;
//		s1[9] = 10;
		for (int i = 0; i < 10; i++) { // i는 무조건 0~9까지 돌아간다
			s1[i] = i + 1;
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println("배열길이:" + s1.length);

//		s1.length = 4; // 변경 불가하다

		// 혹시 몰라서 출력
		System.out.println("args :" + args);
		if (args != null) {

			// args의 개수 출력
			System.out.println("args 개수:" + args.length);

			// args의 모든 내용 출력

			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		
		// 문제 2 
		// 7, 12, 8을 순서대로 저장한 배열이 있을때
		// 다른 배열에도 7, 12, 8으로 저장되게 복사
		// 단 B = A 안됨
		
		int[] i = new int[3];
		i[0] = 7;
		i[1] = 12;
		i[2] = 8;
		
		int[] q = new int[3];
		for (int q2 = 0; q2 < q.length; q2++) {
			q[q2] = i[q2];
		System.out.println("순서대로 저장: "+ i[q2]);
		}
		// 문제 3 
		// 7, 12, 8을 순서대로 저장한 배열이 있을때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게 하시오
		
		// 문제 4
		// {3, 4, 7, 5, 1, 4, 6}
		// 4-1 배열에서 홀수의 개수 구하기 
		// 4-2 4보다 큰 수의 개수 구하기 
		
		// --- 응용(멘탈 챙겨)---
		
		// 문제 5(어려움)
		/* 
		 * 마라톤에서 5며의 선수가 참여했음
		 * 선수들은 1번부터 5번까지 등번호를 부여 받음
		 * 대회가 종료 시 완주하지 못한 선수가 한명 있음
		 * 그 선수를 찾으시오 
		 * 완주 목록 {2, 4, 5, 1}
		 */
		
		// 문제6
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 가장 큰 수 찾기 
		

	}

}
