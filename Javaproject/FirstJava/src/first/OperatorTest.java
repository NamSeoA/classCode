package first;

import java.lang.Math;
import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 8;
		
		System.out.println("10/8 = " + num1/num2);
		
		System.out.println("10/8 = " + num1%num2);
		
		System.out.println("10/-8 = " + num1%-num2);
		
		System.out.println("10f/8f = " + 10f/8f);
		
		System.out.println("10f/8 = " + 10f/8);
		
		System.out.println("10/8 = " + num1/(float)num2);
		
		
		
		
		
		char c1 ='A';
		char c2 = 'B';
		
		
		
		System.out.println("'A' < 'B' => " + (c1 < c2)); // 65 < 66으로 바뀌어서 처리
		System.out.println("'0' == 0 => " + ('0' == 0));  // 48 == 0
		
		System.out.println("10.0d == 10.0f =>" + (10.0d == 10.f)); // 10.0d == 10.0d
		
		System.out.println("0.1d == 0.1f =>" + (0.1d == 0.1f)); // 0.1d == 0.1d
		
		double d =  (double)0.1f;
		
		System.out.println("d => " + d);
		
		System.out.println(" (float)d == 0.1f => " + ((float)d == 0.1f));
		
		
		
		
		num1 = 10;
		num2 = 20;
		
		boolean result1 = num1 == 10 && num2 == 20;  // num1 == 10(1) true 나오면 num2 == 20(2)
		boolean result2 = num1 <= 12 || num2 >= 30;
		
		System.out.println(" num1 == 10 && num2 == 20 => " + result1);
		System.out.println(" num1 <= 12 || num2 >= 30 => " + result2);
		
		
		// ****잘기억해두기
		if( !( num1 == num2 ) ) {     //!를 잊지말자 (짜기 어려운 조건이 있다면 반대로 생각해보기
			System.out.println("num1과 num2는 같지않다");
		}else {
			System.out.println("num1과 num2는 같다");
		}
		
		
		float pi = 3.141592f;
		
	//	 float sPi = (pi*100) ;
	//	System.out.println(sPi);          //314.1592
		
		
	//	float sPi = (int)(pi*100) ;
		
	//	System.out.println(sPi);           //314.0
		
		
		float sPi = (int)(pi*100)/100f ;
		System.out.println(sPi);            //3.14
		
		
		int price = 11234;     //돈 (100단위까지 절사 하고싶음)
		
	//	int price2 = price/1000;             //11
		
		int price2 = price/1000*1000;        //11000
		System.out.println(price2);
		
		
//		float sPi2 = pi*100;
//		System.out.println(sPi2);          //314.1592
		
		//소수점 첫째자리에서 반올림
//		float sPi2 = Math.round(pi*100);      //java.lang.Math(풀네임_패키지)
//		System.out.println(sPi2);             //314.0     round는 int로 변환. 근데 float이기때문에 뒤에 0이 붙음
		
		
		float sPi2 = Math.round(pi*100)/100f;    //3.14
		System.out.println(sPi2);
		
		
		
		
		
		int i=5;
		int j=5;
		
		System.out.println(i++);  //출력 : 5, i=6
		System.out.println(++j);  //출력 : 6, j=6
		
		System.out.println("i = "+i+", j = "+j);   //***********
		
		
		
		
		//반복, 조건문
		//문자열처리 : String 클래스 이용 -> 객체 생성 -> 클래스가 가지는 변수와 메서드를 메모리에 로드한다.
		
		//참조 변수 : 객체의 메모리 주소값을 저장하는 변수
		String str = null;   // null -> '참조변수가 객체의 주소값을 저장하고 있지 않는다'를 표현
		
		str = "abc";   //주소값을 넣어줘야함  //" " 공백문자열을 이용한 객체를 생성하고 주소값을 반환
		
		System.out.println(str.toString());
		System.out.println(str.equals("abc"));      //equals = str 문자열과 가로안의 문자열이 같으면 true
		
		//이거 다시 보기** 잘 모르겠음
		if(str != null && str.equals("")) {
			System.out.println(   str.charAt(1)   );      // index  0~3 -1  --> 0. 1. 2
		}                                                 // 두번째인 b 출력
		
		
		
		//
		num1 = 50;
		num2 = 20;
		
		int big = 0 ;    //큰수
		int diff = 0;;    //두 수의 차이
		
		//삼항 연산자 이용
//		big = num1>num2 ? num1 : num2;        // big = num1 ;
		
//		diff = num1>num2 ? num1 - num2 : num2 - num1;
		
		
		//if문으로 해보기
		if(num1>num2) {
			big = num1;
			diff = num1 - num2;
		} else {
			big = num2;
			diff = num2 - num1;
		}
		
		System.out.println("큰수 : "+big+", 큰 수와 작은 수의 차이는 "+diff+" 입니다.");   //큰수 : 50, 큰 수와 작은 수의 차이는 30 입니다.

		System.out.println("----------------------------------------------------");

		int n = 0;
		
		System.out.println("메뉴를 선택하세요\n1.입력 2.보기 3.수정 4.삭제");
		
		Scanner sc = new Scanner(System.in);
				
		n = sc.nextInt();
		
		switch(n) {
			
			case 1:
				 System.out.println("입력합니다.");
				 System.out.println("Simple JAVA");
			    break;
			case 2:
				System.out.println("데이터를 열람합니다.");
				System.out.println("Funny JAVA");
				 break;
			case 3:
				System.out.println("정보를 수정합니다.");
				System.out.println("Fantastic JAVA");
				 break;
			case 4:
				System.out.println("데이터를 삭제합니다.");
				break;
		 /*
			default :
				System.out.println("Best JAVA");
		 */
		}
		
		
		
		
		
		
		
		
	}

}
