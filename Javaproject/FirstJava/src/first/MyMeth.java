package first;

public class MyMeth {

	
		// 변수 선언
		int num = 10;
		
		// 정수 2개를 받아    덧셈 연산을 하고    그 결과를 반환하는 메서드
		long add(long n1, long n2) {
			
			long result = n1 + n2 ;
			
			return result;                       //데이터 필요하면 return. 필요없으면 return 안해도 됨
		}
		
		
		
		void sayHello() {
			System.out.println("안녕하세요~ 여러분!!");
		}
	
		// 정수 두개를 받아서 덧셈의 결과를 출력하는 메서드
		void plus(int num1, int num2) {
			
			int result = num1 + num2;       //위의 result는 {}안에서만 유효하기 때문에 위의 result와 관련 X
			
			System.out.println(result);
		}
		
		
		
		
		boolean check() {
			boolean result = num > 20;     //num = 10 결과는 false
			return result;
		}
		
		
		//정수 두개를 받아서 나눗셈한 결과를 출력하는 메서드
		void div(int num1, int num2) {
			
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;   // 메서드의 종료
			}
			
			System.out.println("나눗셈의 결과 : " + num1/num2);
		}
		
		
	
		
		
		
}
