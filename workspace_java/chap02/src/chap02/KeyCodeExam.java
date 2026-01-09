package chap02;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		//println - ln에 엔터 기능이 있음
		System.out.println(1);
		System.out.println(2);
		
		//ln이 없어서 엔터 기능이 없음 / 글짜가 옆으로 작성됨
		System.out.print(3);
		System.out.print(4);
		// 5가 옆에 붙어 있는 이유는 바로 전 
		// print에서 옆에 작성 해서임
		// 5 작성이 후에 엔터가 쳐짐 
		System.out.println(5);
		System.out.println(); // br처럼 그냥 엔터 
		System.out.println(6);
		
		
		String name="최민수";
		int age = 20;
//		System.out.printf("이름: "+name+", 나이: "+age);
		System.out.printf("이름:%s, 나이:%d\n", name, age);
		System.out.println();
		
		///////////////////
		//입력
		int keyCode;
		//scanner 연습하려고 주석처리함 
/*		
		try {
            System.out.print("입력하시오 >> ");
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		//이클립스 단축키
		/* 한줄 지우기: Ctrl + d
		 * 한줄 복사 :  Ctrl + alt + 위 아래 방향키
		 * 한줄 이동 : Alt + 위 아래 방향키 
		 * 주석단축키 : Ctrl + /(키패드 옆 나누기 아님)
		 * 자동 정렬 : Ctrl + shift + f
		 * import 자동 : Ctrl + shift + o(o는 영어임)
		 * */
		
		Scanner scanner = new Scanner(System.in);
		//엔터까지의 모든 글씨
		String inputDate = scanner.nextLine();
		System.out.println("inputDate: " + inputDate);
		
//		//next는 띄어쓰기 안됨/ 엔터 쳤을때 첫번째 띄어쓰기 까지만
//		inputDate = scanner.next();
//		System.out.println("inputDate: " + inputDate);
		
		//문제
		//나이를 입력하고+1해서 출력 
		
		System.out.println("나이를 입력하세요");
//		String age2 = scanner.nextLine();
//		int age3 = Integer.parseInt(age2); 
		
		int age3 = scanner.nextInt();
		System.out.println("내년엔 "+(age3 + 1) +"살 입니다");
		
		
	}

}
