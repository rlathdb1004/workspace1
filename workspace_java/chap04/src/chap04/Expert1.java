package chap04;

public class Expert1 {

	public static void main(String[] args) {
		// 심화1
		// 1부터 5까지 출력
		System.out.println("---심화1---");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		// 심화2
		// 5부터 1까지 출력
		System.out.println("---심화2---");
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
		
		// 심화3
		// 1부터 16까지
		//	3의 배수 
		// 		3의 배수 출력하고
		// 		총 몇개인지 출력
		System.out.println("---심화3---");
		
		int cou = 0;
		for(int i=1; i<=30; i++) {
//			System.out.println(i); 1~16까지 확인하는 용도로 출력
			if(i%3 == 0) {// 3의 배수구하는 조건
				System.out.println(i);
				cou=cou+1; // 3의 배수의 갯수를 세는 방법 
			}
		}
		System.out.println("총 개수: " + cou);


	}

}
