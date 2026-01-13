package chap04;

import java.util.Scanner;

public class Pyramid_03_1 {

	public static void main(String[] args) {
/*
 * ___+___
 * __+++__
 * _+++++_
 * +++++++
 */
		// 1단계 
		// +++++
		System.out.println();
		System.out.println("문제1번: ");
//		Scanner qq = new Scanner(System.in);
//		int q11 = qq.nextInt(); // 검색을 하면 보여질 숫자
		int q11 = 5;
		for(int q1 = 1; q1 <= q11; q1++) {
			System.out.print("+");
		}
		System.out.println();
				
		// 2단계
		// +_+_+_+_+_
		System.out.println();
		System.out.println("문제2번: ");
		for(int q1 = 1; q1 <= q11; q1++) {
			System.out.print("+");
			System.out.print("_");
		}
		System.out.println();

		// 3단계 
		// +++++
		// +++++
		// +++++
		System.out.println();
		System.out.println("문제3번: ");
		for(int q1 = 1; q1 <= q11; q1++) {
			System.out.print("+");
		}
		
		// 4단계 
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		System.out.println();
		System.out.println("문제4번: ");
		int q22 = 5;
		for(int q1 = 1; q1 <= q22; q1++ ) {
			for(int q3 = 1; q3 <= q22; q3++ ) {
				System.out.print(q1);
			}
			System.out.println();
		}
		
		// 5단계
		// 1
		// 22
		// 333
		// 4444
		// 55555
		System.out.println();
		System.out.println("문제5번: ");
		int q23 = 5;
		for(int q1 = 1; q1 <= q23; q1++ ) {
			for(int q3 = 1; q3 <= q1; q3++ ) {
				System.out.print(q1);
			}
			System.out.println();
		}
		// 6단계
		// +
		// ++
		// +++
		// ++++
		// ++++++
		System.out.println();
		System.out.println("문제6번: ");
		int q24 = 5;
		for(int q1 = 1; q1 <= q23; q1++ ) {
			for(int q3 = 1; q3 <= q1; q3++ ) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		// 7단계
		// 11111
		// 2222
		// 333
		// 44
		// 5

		System.out.println();
		System.out.println("문제7번: ");
		int q25 = 5;
		for(int q1 = 1; q1 <= q25; q1++ ) {
			for(int q3 = 5; q3 >= q1; q3-- ) {
				System.out.print(q1);	
			}
			System.out.println();
		}
		
		// 8단계
		// +____
		// ++___
		// +++__
		// ++++_
		// +++++
		System.out.println();
		System.out.println("문제8번: ");
		q25 = 5; 
		for(int q1 = 1; q1 <= q25; q1++) {
			for(q1 = 1; q1 <= q25; q1++) {
				System.out.print("+");
			}
			for(int q3 = q1; q3 >= q25-q1; q3--) {
				System.out.print("_");
			}
			System.out.println();
		}
		// 9단계
		// ____+
		// ___++
		// __+++
		// _++++
		// +++++
		
		// 10단계
		// ____+
		// ___+++
		// __+++++
		// _+++++++
		// +++++++++
		
		// 11단계
        // ____+____
        // ___+++___
        // __+++++__
        // _+++++++_
        // +++++++++
        
        // 12단계
        // 입력 받은 줄 수 대로 출력
        

	}
}

