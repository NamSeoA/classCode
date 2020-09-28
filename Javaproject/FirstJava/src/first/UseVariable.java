package first;

public class UseVariable {

	public static void main(String[] args) {
		
		// 1. 정수형 타입의 변수 num1변수를 선언하자.
		 	int num1;
		
		// 2. 변수 num1에 숫자 데이터 10을 저장하자.
		 	num1 = 10;
		 
		// 3. 정수형 타입의 변수 num2변수를 선언하고, 숫자 20을 대입하자.
		 	int num2 = 20;
		 	
		// 4. 정수형 타입의 변수 num3을 선언하고 변수 num1과 num2를 합하는 연산한 결과를 변수 num3에 대입한다.
		
		 	int num3 = num1 + num2;         //num1+num2 (첫번째) = num3(두번째) 오른쪽에서 왼쪽으로 대입
		 	
		// 5. 연산의 결과를 출력하자.
		 	
		// 	System.out.println(num3);
		 	
		 	
		 	
		 	
		 	//실수표현의 문제점 해결(부동 소수점 표현)
		 	float n1 = 1.000001f;
		 	double n2 = 1.000001;
		
		// 	System.out.println((double)n1);       //형변환 연산자
		 	
		// 	System.out.println(n1 + n2);
		 	
		 	
		 	char c1 = 'A';
		 	
		 	System.out.println(c1);
		 	System.out.println((int)c1);
		 	
		 	
		 	
		 	// boolean : true / false
		 	
		 	boolean check = true;
		 	
		 	if(check) {
		 //		System.out.println(true);
		 	}
		 	
		 	int i = 0;
		 	
		 	while(check) {
		 		if( i > 5) {
		 			break;
		 		}
		 //		System.out.println(i);
		 		i++;  // 탈출의 연산식
		 	}
		 	
		 	
		 	
		 	//상수처리_처음 한번만 대입이 가능 (final)
		 	
		 	final double PI = 3.141592;
		 	
		 	// PI = 3.14; (x)
		 	
		 	
		 	
		 	
		 	
		 	
		 	//컴파일 오류
		// 	int num5 = 10000000000L;
		 	long num5 = 10000000000L;
		 	
		 	
		 	
		 	
		 	
		 	//자동형 형 변환
		 	
		 	char ch3 = 'A';
		 	
		 	int chNumber = ch3;
		 	
		 	System.out.println("A 유니코드 값 => " + chNumber);
		 	
		 	
		 	//명시형
		 	chNumber += 2;  //chNumber = chNumber +1
		 	System.out.println(chNumber);
		 	System.out.println((char)chNumber);
		 	
		 	
		 	
		 	int age = 200;
		 	
		 	System.out.println((byte)age);   //byte 107 까지여서 -56라고 출력됨
		 	//작은 사이즈로의 역변환은 우리가 예측이 가능한 범위까지만 ! (200이었는데 -56값이 나옴)
		 	//class ByteOverflow (pdf)
		 	
		 	
		 	
		 	

	}

}
