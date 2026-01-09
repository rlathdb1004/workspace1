package chap02;

public class VarExam {

	public static void main(String[] args) {
		
		//변수 선언
		int value;
		//변수에 값 넣기
		//변수에 할당
		value = 5;
		
		//value의 값을 출력해라
		//value 주머니에 넣은거 출력해줘라는 뜻
		System.out.println(value);
		
		value = 6; // value라는 주머니(변수)에 덮어쓰기
		System.out.println(value);
		
		int result;
		//주석처리한 이유는 에러났기 때문임
//		System.out.println(result); //컨트롤+스페이스바
		result = value + 10;
		System.out.println(result);
		
		//선언과 동시에 초기화 
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour +"시"+ minute +"분");
		System.out.println("value: " + value);
		
		int x = 10;
		{
			System.out.println("x: " + x);	
			int y = 5;
			System.out.println("y: "+ y);
			{
				System.out.println("y: "+ y);
			}
		}
		//System.out.println("y: "+ y);
		
		

	}

}
