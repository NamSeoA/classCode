package first;

import java.util.Scanner;

//조건문과 반목문 문제 풀이
public class ExamFlowControl2 {

	public static void main(String[] args) {
		
		int num = 0;
		//C+S+O -> 자동 import
		
		Scanner s = new Scanner(System.in);
		
		//[1]
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 15;
		boolean chk1 = x>10 && x<20;
		
		System.out.println("1. int형 변수x가 10보다 크고 20보다 작을 때 true인 조건식");
		System.out.println("x>10 && x<20 => "+chk1);
		
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 'k';
		boolean chk2 = ch!=' ' || ch !='\t'; //' '스페이스를 넣어주지 않으면 오류가 뜸
		boolean chk22 = !(ch == ' '&& ch=='\t');  //이렇게 두가지 경우로 만들 수 있다
		
		System.out.println("2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식");
		System.out.println("ch!=' ' || ch !='\\t' => "+chk2);
		System.out.println("!(ch == ' '&&ch=='\\t') => "+chk22);
		 

//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		ch = 'x';
		boolean chk3 = ch =='x' || ch == 'X';
		System.out.println("3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식");
		System.out.println("ch =='x' || ch == 'X' => "+chk3);
		
		 
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식

		 ch = '7';
		 boolean chk4 = ch>='0' && ch<='9' ;
		 System.out.println("4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식");
		 System.out.println("ch>='0' && ch<='9' => " +chk4);


//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		 ch = 'A';
		 boolean chk5 = ch >='a' && ch<='z' || ch>='A' && ch <= 'Z' || chk4;
		 System.out.println("5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식");
		 System.out.println("ch >='a' && ch<='z' || ch>='A' && ch <= 'Z' => "+chk5);
		 	 

//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로나눠떨어지지않을 때 true인 조건식
		int year = 400;
		boolean chk6 = year%400==0 || (year%4==0 && year%100!=0);
		System.out.println("6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로나눠떨어지지않을 때 true인 조건식");
		System.out.println("year%400==0 || (year%4==0 && year%100!=0) => " +chk6);
		 

//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
		boolean chk7 = powerOn;
		System.out.println("7. boolean형 변수 powerOn가 false일 때 true인 조건식");
		 System.out.println("!powerOn => " +chk7);


//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		boolean chk8 = str =="yes";  //참조값 비교
		boolean chk88 = str.equals("yes"); //str 값인 문자열과 비교 (저장하는 문자열을 비교)
		System.out.println("8. 문자열 참조변수 str이 “yes”일 때 true인 조건식");
		System.out.println("str == \"yes\" => " +chk8);
		System.out.println("str.equals(\"yes\") => " + chk88);
		
		
		
		
		
	}

}
