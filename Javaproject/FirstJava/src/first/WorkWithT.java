package first;

public class WorkWithT {

	public static void main(String[] args) {
		//연산자 챕터의 문제풀이
		
		System.out.println("문제1 =========================");
		//문제 1번
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		System.out.println(num1+ ", "+num2+", "+num3);
		
		
		num1 = num2 = num3;
		System.out.println(num1+ ", "+num2+", "+num3);
		
		num1 = num2 = num3 = 50;
		System.out.println(num1+ ", "+num2+", "+num3);

		
		System.out.println("문제2 =========================");
		//문제 2번
		int result = (((25*5)+(36-4))-72)/5;
		System.out.println("(((25*5)+(36-4))-72)/5 = "+result);
		
		
		System.out.println("문제3 =========================");
		//문제 3번
		int oper1 = 3+6;
//		int oper2 = 3+6+9;  //oper2 = oper1 + 9
//		int oper3 = 3+6+9+12; //oper3 = oper2 + 12
		
		int oper2 = oper1 + 9;
		int oper3 = oper2 + 12;
		
		
		System.out.println("문제4 =========================");
		//문제 4번
		int a = (((25+5)+(36/4))-72)*5;
		int b = (((25*5)+(36-4))-71)/4;
		int c = (128/4)*2;
		
		// a>b>c (논리연산)
		boolean check = a>b && b>c;
		System.out.println(check);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
