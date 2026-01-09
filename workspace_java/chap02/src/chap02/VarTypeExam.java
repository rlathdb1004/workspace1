package chap02;

public class VarTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1;
		b1 = 127;
		System.out.println("b1: "+ b1);
		//b1=128; byte에는 127까지만 들어간다
		
		char c1 = 65;
		System.out.println("c1: "+c1);
		//65가 아스키코드에서 A를 뜻함 그래서 A로 명시되는거임
		char c2 = 65 + 2;
		System.out.println("c2: "+c2);
		char c3 = 'B' ;
		System.out.println("c3 - c1: " + (c3-c1));
		
		//21억까진 에러가 안남 단 22억 부턴 에러남 그래서 숫자 뒤에 L붙어야함
		//L또는 l을 붙이면 명시적인 long
		long l1 = 2100000000;
		long l3 = 2200000000L;
		long l2 = 30;
		
		String s1 = "최민수";
		System.out.println("s1: "+ s1);
		
		String s2 = "최\"민수\"";
		System.out.println("s2: " + s2);
		 
		//t는 띄어쓰기 n은 엔터 쳐줌 
		String s3 = "\\최\t민\n수";
		System.out.println("s3: " + s3);
		
		System.out.println("글씨"+3);
		//연산자는 왼쪽에서 오른쪽으로 흘러간다 글씨+숫자는 글씨다.
		// 계산먼저 하고 글씨를 더해주기 하면 된다.아래 대로 하면 글씨32가 출력
		System.out.println("글씨"+ 3 + 2);
		System.out.println("글씨"+ (3 + 2));//글씨5로 보여짐
		System.out.println(3 + 2 + "글씨"); //5 글씨로 보여짐
		
//		int a = 3.14;
		
		float f1 = 3.14f;
		System.out.println("f1: "+ f1);
		
		double d1 = 3.14;
		System.out.println("d1: "+ d1);
		
		float f2 = 0.1234567890123f;
		System.out.println("f2: "+ f2);
		//float의 정밀도 : 소수점 / 소수점 7자리까지 정리해줌
		
		double d2 = 0.12345678901234567890;
		System.out.println("d2: "+ d2);
		//double의 정밀도: 소수점 16자리 / 소수점 16번째까지 제공해줌
		
		double d3 = 5e3;
		System.out.println("d3: "+ d3);
		//5e3은 대문자 소문자 상관 없음더블은 소수점이라 .0로 명시됨
		
		
		boolean stop = true;
		boolean start = false;
		System.out.println("stop: "+ stop);
		
		
		//문제1
		// 내 나이를 저장합니다.(int 문제 였음)
		
		char m1 = 31;
		System.out.println("m1: "+ 31 );
		
		
		//문제2
		//운전면허가 있다 / 없다
		
		boolean m2 = true;
		System.out.println("m2: "+ m2);
		
		// 문제3
		//우리 집에 있는 스마트 폰의 갯수

		int m3 = 2;
		System.out.println("m3: "+ 2);
		
		//문제4
		//내 이름 저장
		
		String m4 = "김령";
		System.out.println("m4: "+ m4);
		
		//문제 5
		//1평은 3.3 제곱미터 입니다
		//5평은 몇 제곱미터인지 계산해서 저장
		
		double m5 = 3.3*5;
		System.out.println("m5: "+ m5);
		
		//문제 6
		// 1-1 :두 변수 X ,y에 각각 숫자를 넣고
		//출력결과 : "3 > 4 결과는 false 입니다"
		
		int x = 3;
		int y = 4;
		boolean xy = x>y;
		System.out.println(x+">"+y+"결과는"+xy);
		
		//문제 7
		/*
		 * 숫자 149
		 * -----
		 * 출력 결과 
		 * -----
		 * "백의 자리 : 1"
		 * "십의 자리 : 4"
		 * "일의 자리 : 9"
		 */
		
		int num = 149;
		/*  int 149에서 나누기 100을 하면 
		 * 1.49이나 무수리가 자동으로 제외된다 
		 * 그래서 백의자리 1이 나온다
		 */
		System.out.println("백의자리: "+ num/100);
		/* 149에서 나누기 100을 하면 1나오고 
		 * 1에서 * 100하면 100 나오고
		 * 149에서 100을 뺴서 49를 남기고  
		 * 49에서 나누기 10해서 4를 구했다 */
		System.out.println("십의자리: "+ (num-((num/100)*100))/10);
		/*149에서 10을 나누면 14가 나오고
		 * 14에서 10을 곱하면 140이 나오고 
		 * 149에서 140을 뺴면 9가나온다
		 * 뒤에 나누기 1은 설명의 이해를 쉽게하기 위함이다.
		 * */
		System.out.println("일의자리: "+ (num-((num/10)*10))/1);
		
		//문제 8
		//회식비 43000원
		//참석인원 4명
		// 인당 얼마?
		//8-1 : 디테일 하게 백원단위까지
		//8-2 : 무수리떼고 받기 
		//8-3 : 주최자는 얼마
		
		int num1 = 43000; 
		int num2 = 4;
		
		// 1/n -43000원 / 4명 = 10,750원 계산법 
		int n1 = num1/4; 
		/* 43000/4명=10750원에서 
		 * 만원을 나눠서 1을 만들고 
		 * 1에서 만을 곱해서 만원을 만든다
		 */
		int n2 = (n1 / 10000) * 10000;  
		
		System.out.println("8-1번: "+ n1);
		System.out.println("8-2번: "+ n2);
		/* 43000/4명=10750원에서 
		 * 만원을 나눠서 1을 만들고 
		 * 1에서 만을 곱해서 만원을 만든다
		 * 그러고 만원*3 한 금액을 전체 금액에서 뺀다.
		 */
		System.out.println("8-3번: "+ (num1 - (n2*3)));
		
		/* 문제9
		String left = "오예스";
		String right = "사탕";
		
		System.out.println("left: "+ left);사탕
		System.out.println("right: "+ right);오예스
		*/
		
		String left = "오예스";
		String right = "사탕";
		String temp = left;
		left = right;
		right = temp;
		System.out.println("left: "+ left);
		System.out.println("right: "+ right);
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
}
