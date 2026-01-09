package chap03;

public class OpExam {

	public static void main(String[] args) {
		
		int x = 10;
		
		x++;
		System.out.println("x: "+ x);
		
		x=10;
		x=x+1;
		//나한테 +1해서 다시 나한테 저장할때
		//줄여쓰는 형태
		x += 1; //위와 같은 코드
		x++;    // 위와 같은 코드 
				//단, +1만 가능함 
		x = 10;
		x++;//=10 이 나옴
		++x;
		System.out.println("++x : "+ x);
		
		x = 10;
		x--;
		--x;
		System.out.println("x : "+ x);
		
		x = 10;
		int z = ++x;
		System.out.println("z(++x): "+ z);
		System.out.println("x(++x): "+ x);
		
		System.out.println();
		
		//z가 10을 가지고 있다가 ++되는거임
		x = 10;
		z = x++;
		System.out.println("z(x++) : "+ z);
		System.out.println("x(x++) : "+ x);
		
		x = 10;
//		System.out.println("x++:" + x++);
		System.out.println("x++: " + x++ + " x:"+ x);
		
		x = 10;
		// 10 + 12
		z = x++ + ++x;
		//예측 = 10 + 10+2=23
		System.out.println("z: "+ z);
		
		x = 1;
		// x = 1
		// 예측 = 2 - -2 * 2 - 0 = -2;
		z = x++ - --x * x++ - x--;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		//나누기 할때 0으로 나누지 않도록 조심하자
		int b =10;
//		int c = b/0;
		
		double d = 7.3;
		double e = d/0;
		System.out.println("d/0: "+ e); // Infinity 무한을 뜻함
		
		//% 나머지를 뜻함 10에서 3나누고 나머지 숫자
		//숫자를 가둘때 나누기 많이 씀 
		int f = 10 % 3; 
		System.out.println(f);
		//특징이 0부터 ~ 나머지 하는 숫자보다 하나 작은 것만 나온다.
		
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
		// %를 한번 이상 활용해서 풀어보자
		
		int n1 = 149;
		int n2 = n1/100;
		int n3 = n1%100/10;
		int n4 = n1%10;
		System.out.println("백: " + n2);
		System.out.println("십: " + n3);
		System.out.println("일: " + n4);
		
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f); 
		// 소수점은 근사치로 저장된다.false 나옴 
		// 그나마 같은 타입으로 변환해서 비교하면 수월하다
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println( s1.equals(s2) );
		//글씨는 무조건 equals로 비교한다.
		System.out.println( "dfdsfd".equals(s2) );

		
		int c1 = 22;
		int c2 = 4;
		System.out.println(" 몫 :"+ c1/c2);
		System.out.println(" 나머지 :"+ c1%c2);
		
		//문제1
		//난 돈이 10000원 있음
		// 1번 - 4500원 짜리 쌍화차를 최대 몇잔 마실수 있는가
		// 2번 - 남는 돈은 얼마
		
		int money = 10000;
		int m1 = 4500;
		System.out.println("1번문제: "+money/m1);
		System.out.println("1번문제: "+money%m1);
		
		//문제2
		//올영에서 꿀홍차가 8000원인데
		//15% 세일 그렇다면 가격은 
		
		int money2 = 8000;
		System.out.println("15% 세일시: " + (money2-(money2*15/100)));
		System.out.println("15% 세일시: " + money2/100 *(100-15));
		
		//문제 3-0
		//1234를 10의 자리 이하 버림
		// 결과 : 1200
		
		int d2 = 1234;
		int d3 = d2/100;
		System.out.println("문제3-0: "+ d3*100);
		
		
		//문제3
		 double v1 = 1000;
		 double v2 = 794.0;
		 double v3 = (int)(v1/v2*1000);
		 
		 
		 //v1 / v2를 소수점 3자리까지 출력한다.오칙연산 사용
		 
		 System.out.println("문제3: " + (double)(v3/1000));
		 
		 //문제4
		 //17000원 있을때
		 //5천원 몇장
		 //1천원 몇장-남은돈으로
		 
		 int m4 = 17000;
		 int m5 = m4/5000;
		 int m6 = m4%5000/1000;
		 
		 System.out.println("5천원 몇장: "+m5);
		 System.out.println("천원 몇장: "+m6);
		
		 int x2 = 100;
		 System.out.println(++x2 - x2--);
		 //100 => 101 - 101 => 100 = 0 
		 
		 int s = 90; //정답만 남는다.중첩이 가능하다.자주 사용하진 않음
		 String grade = ( s > 90) ? "A" : "B" ;
		 System.out.println("grade: " + grade);
		 
	}

}
