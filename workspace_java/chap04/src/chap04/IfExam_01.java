package chap04;

import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {

		int score = 90;

		boolean over90 = score >= 90;

		{
			System.out.println("항상 실행되는 실행 블럭");
		}

		// 참은 실행되고 거짓이면 실행 되지 않는다
		if (over90) {
			System.out.println("90 이상입니다");
		}
		// 중괄호 안쓸수 있긴 하나, 나는 무조건 중괄호 사용한다.
		//if(over90) System.out.println("90 이상입니다");

		if (score < 90) {
			System.out.println("90 미만입니다");

		}

		// 정반대 일 경우 괄호 후 앞에 !사용
		if (!(score >= 90)) {
			System.out.println("90 미만입니다");
		}

		if (score >= 90) {
			System.out.println("90 이상입니다");
		} else// 그렇지 않으면
		{
			System.out.println("90 미만입니다");
		}
		// else가 있으면 무조건 하나는 실행되는게 보장된다

		score = 95;

		if (score >= 90) {
			System.out.println("90 이상");
		}
		//*이전과 관계없이 무조건 다시 판단
		if ((score < 100) && (score >= 80)) {
			System.out.println("80 ~ 100");
		}

		System.out.println("----------");

		if (score >= 90) {
			System.out.println("90 이상");
		}
// 		else if((score < 100) && (score >=80)) {
// 		System.out.println("90미만 80이상");}
		// 위에 if에서 참이면 아래 else if는결과를 산출하지 않음
		// 단 위에 if에서 참이 아니면 아래 else if는결과를 산출한다
		else if (score >= 80) {
			//*위의 if나 else if가 거짓일때만 판단한다
			System.out.println("90미만 80이상");
		} else if (score >= 70) {
			System.out.println("80미만 70이상");
		} else {
			System.out.println("70미만");
		}
		
		// 97점이면
		//  90이상 
		//  95이상
		// 92점이면 
		// 90이상만 출력할꺼임 
		
		if (score >= 95) {
			System.out.println("90 이상");
			System.out.println("95 이상");
		}else if(score >= 90) {
			System.out.println("90 이상");
		}
		
		if (score >= 95) {
//			System.out.println("90 이상");
			if (score >= 95) {
				System.out.println("95 이상");
			}
		}
		
		if(score >= 90 
			&& score >=95) {
				System.out.println("95 이상");
			}
		
		
		
		
		
		//홀짝
		int x = 3;
//		if(x % 2 == 0) {
		if(x % 2 != 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//랜덤
		double random1 = Math.random();
		System.out.println("random1 :" +random1 );
		
		// Math.random()
		// 0 <= Math.random() < 1
		// 0 ~ 09999
		 
		// 0과 1을 구하는(홀짝)
		// 정교한 계산 방식
		// 0*2 <= Math.random()*2 < 1*2
		// 0 ~ 1.99999999999
		// int로 형변환 해서 정수만 남기기
		double rand2 = Math.random(); // 0~0.9999 구하기
		double temp1 = rand2 * 2; //0~1.99999구하기
		int result = (int) temp1;
		System.out.println("랜덤 홀짝");
		if(result == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		// 1~6까지 구하기(주사위)
		// 0*6 <= Math.random()*6 < 1*6
		// 0 ~ 5.999까지 나옴
		// int 바꾸고
		// +1 하면 1 ~ 6 나옴 
		rand2 = Math.random();
		double temp2 = rand2 * 6; // 0~5.999999가 됨
		int result0 = (int)temp2; //0~5까지 나옴
		result = result0 + 1; // 1~6까지 나옴 
		System.out.println("주사위 결과 :" + result);
		
		// 5~10까지 구하기
		// 0~5 구하고 +5면 됨
		rand2 = Math.random();
		temp2 = rand2 * 6; // 0~ 5.9999
		result0 = (int)temp2; // 0~5 
		result = result0 + 5 ; // 5~10까지 나옴
		System.out.println("5~10 결과:" + result);
		
		//변수로 범위를 잡아서 보편화 해보기 
		int min = 5;
		int max = 10;
		rand2 = Math.random();
//		temp2 = (int) (rand2 * (max - min + 1)) + min;
		
		//쉬운방식
		rand2 = Math.random();
		temp2 = rand2 * 100000;
		result0 = (int) temp2;
//		result = result0 % 6) + 1; 
		
		// 로또 만들기 
		// 1 ~ 45 6개의 숫자를 랜덤으로 뽑아서 제출하시오
		//단, 중복없이 출력해야 함
		int min1 = 1;
		int max1 = 45;
		rand2 = Math.random();
		int temp3 = (int)(rand2 * (max1 - min1 + 1))+min1;
		System.out.println("1번 숫자:" + temp3);

		double rand3 = Math.random();
		int temp4 = (int)(rand3 * (max1 - min1 + 1))+min1;
		System.out.println("2번 숫자:" + temp4);

		double rand4 = Math.random();
		int temp5 = (int)(rand4 * (max1 - min1 + 1))+min1;
		System.out.println("3번 숫자:" + temp5);
		
		double rand5 = Math.random();
		int temp6 = (int)(rand5 * (max1 - min1 + 1))+min1;
		System.out.println("4번 숫자:" + temp6);
		
		double rand6 = Math.random();
		int temp7 = (int)(rand6 * (max1 - min1 + 1))+min1;
		System.out.println("5번 숫자:" + temp7);
		
		double rand7 = Math.random();
		int temp8 = (int)(rand7 * (max1 - min1 + 1))+min1;
		System.out.println("6번 숫자:" + temp8);
		
		//----꼭 풀수 있어야 하는----
		// 임의의 수를 입력받아 
		// 문제1
		// "양수",0,"음수" 판단하여 출력
		int q1 = 0;
		if(q1 > 0) {
			System.out.println("1번 문제: "+ "양수");
		} else if(q1 == 0) {
			System.out.println("1번 문제: "+ "0");
		} else if(q1 < 0)	{
			System.out.println("1번 문제: "+ "음수");
		}
		
		// 문제2
		// 홀수인지 짝수인지 판단하여 출력 
//		int q2 = 6;
//		if(q2 % 2 == 0) {
//			System.out.println("2번 문제: "+ "짝수");
//		} else {
//			System.out.println("2번 문제: "+ "홀수");
//		}
//		Scanner scan = new Scanner (System.in);
//		int q2 = scan.nextInt();
//		if(q2 % 2 == 0) {
//			System.out.println("2번 문제: "+ "짝수");
//		} else {
//			System.out.println("2번 문제: "+ "홀수");
//		}
		
		// 문제3
		// 임의의 두 수 X,Y를 받아서
		// 둘 중에 큰 값 출력
		int x1 = 10;
		int y1 = 10;
		if ( y1 < x1) {
			System.out.println("3번 문제: "+ "x");
		} else if ( y1 > x1 ) {
			System.out.println("3번 문제: "+ "y");
		}
				
		// 문제4
		// 임의의 money를 입력받아서
		// 7000원 이상이면 "택시타자" 출력
		// 7000원 ~ 3000원 사이이면 "버스타자" 출력
		// 3000원 미만이면 "걸어가자" 출력
		int mn1 = 10000;
		if (mn1 >= 7000) {
			System.out.println("4번 문제: "+ "택시타자");
		} else if((mn1 <=7000) && (mn1 >=3000)) {
			System.out.println("4번 문제: "+ "버스타자");
		} else if(mn1 < 3000) {
			System.out.println("4번 문제: "+ "걸어가자");
		}
		
		//----도전 해볼만한----
		// 문제5
		// '가위', '바위', '보' 입력 받아서
		// 5-1 컴퓨터는 항상 '바위'만 낼 경우
		// 5-2 컴퓨터도 random으로
		// '이겼다', '비겼다', '졌다' 출력
		
//		Scanner scan = new Scanner(System.in);
//		String q5 = scan.nextLine();
//      System.out.print("문제 5번 컴VS령 : ");
//
//      String q51 = "바위";
//
//      if (q5.equals("가위")) {
//        System.out.println("문제 5번 결과 : " + q51 + " /령 패배");
//      } else if (q5.equals("바위")) {
//        System.out.println("문제 5번 결과 : " + q51 + " /무승부 재도전");
//      } else if (q5.equals("보")) {
//        System.out.println("문제 5번 결과 : " + q51 + " /령 승리");
//      }

        System.out.println("-----------------");
        
        Scanner scan1 = new Scanner(System.in);
        String q5 = scan1.nextLine(); 
        System.out.print("문제 5번 : ");

        int com = (int)(Math.random() * 3);

        String q51 = ""; // 컴퓨터 값
        if (com == 0) {
            q51 = "가위";
        } else if (com == 1) {
            q51 = "바위";
        } else {
            q51 = "보";
        }

        if (q5.equals(q51)) { // q5 내선택 //q51 컴퓨터 선택
            System.out.println("문제 5번 결과 : " + q51 + " /무승부 재도전");
        } else if (
                (q5.equals("가위") && q51.equals("보")) ||
                (q5.equals("바위") && q51.equals("가위")) ||
                (q5.equals("보") && q51.equals("바위"))
        ) {
            System.out.println("문제 5번 결과 : " + q51 + " /령 승리");
        } else if (
                (q5.equals("가위") && q51.equals("바위")) ||
                (q5.equals("바위") && q51.equals("보")) ||
                (q5.equals("보") && q51.equals("가위"))
        ) {
            System.out.println("문제 5번 결과 : " + q51 + " /령 패배");
        } else {
            System.out.println("정확히 입력해주세요");
        }
		
		// 문제6
		// 임이의 두수 x,y,z를 받아서
		// z 가 x ~ y 사이에 있는지 (포함) 판단
		
        
		// 문제7
		// 월을 입력 받아서
		// 계절 출력
		// 13, -1 등 입력하면 "정확히 입력해주세요"출력
		
		// 문제8
		// 임의의 수를 입력받아서 다음과 같이 출력
		// 예 : 125
		// 입력한 수는 100보다 크고, 양수이고, 홀수입니다.
		
		// 문제9
		// 온도를 입력받아서 다음과 같이 출력
		// 예: -3
		// 영하3도 입니다.
		// 예: 5
		// 영상 5도 입니다.
		
		//----멘탈챙길 자신 있으면----
		// 문제10 
		// 시,분을 입력받아서 35분 후의 시, 분을 출력
		// 3, 51을 입력받으면
		// 4시 26분 출력
		
		// 문제11
		// 두자리 숫자를 입력받아서 
		// 10의 자리와 1의 자리가 같은지 판단
		// 예: 77=> 같음, 94 => 다름
		
		// 문제12
		// 1~99까지 369게임 
		// 임의의 수를 받아서 369숫자가 있으면 "박수" 출력
		// 없으면 그 숫자 그대로 출력 
		// 예: 33=>박수 , 31=>박수, 12=>12, 14=>14
		
		// 문제13
		// 사각형의 한쪽 모서리 : x1: 10, y1:20
		// 반대편 모서리 : x2:90 , y2:100
		// 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
		
		// Scanner 사용법
//		Scanner scan = new Scanner (System.in);
		//컨트롤 + 쉬프트 + o 누르기
		//글씨 받기
//		String input = scan.nextInt();
		//숫자 받기
//		int num = scan.nextInt();
	
	
	
	}

}
