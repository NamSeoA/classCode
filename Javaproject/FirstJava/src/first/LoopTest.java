package first;

public class LoopTest {

	public static void main(String[] args) {
		// while Loop     //10/5 오전수업
		
		
		//반복의 횟수를 체크하기 위한 인덱스
		int i = 0;
		
		while (i<5) {
			System.out.println("자바 안녕 ~!! -"+i);
			i++;  // 탈출을 위한 연산식(이 식이 없으면 i가 계속 0이 되서 무한반복이 됨)
		}
		
		// i => 5  가 들어가있는 상태***************
		
		System.out.println("======================================");
			
		
		// do while Loop
		// 조건에 상관없이 최소 한 번 실행 후 조건에 맞게 반복 실행
		
		i = 0;
		
		do {
			System.out.println("안녕 자바 !! - " + i);
			i++;
		} while (i<5);       //i<0이어도 조건에 상관없이 최소 한번은 실행됨
		
		
		
		System.out.println("================================");
		
		//for Loop
		
		int sum = 0;  //합을 구하기 위한 변수
		
		for (int j=1; j<11; j++) {          //변수 j는 반복문을 벗어나는 순간 소멸됨(j는 for블럭 안에서만 사용 가능한 변수)
			sum = sum + j;
		}
		System.out.println("1~10 까지의 합 : " + sum);
		
		System.out.println("================================");
		
		
		//0부터 몇까지 더해나갔을 때 합이 100이 넘어가는지 확인하는 프로그램
		
		sum = 0;   //앞에서 sum이 55로 되어있음
		i = 0;
		
		//몇번을 반복해야 하는지 모르는 경우 : 무한반복** 처리 (but 탈출경로 만들어야함)
		while(true) {
			
			// 탈출의 조건
			if(sum > 100) {
				break;
			}
			
			i++;      // 더하는 수의 증가
			sum += i; //합을 구하는 연산
		}
		
		System.out.println(i+"를 더했을 때 합이 100이 넘어갑니다. 합이 100이 넘어가는 최초의 값은 " + sum);
		
		
		
		
		System.out.println("================================");
		// 1~10까지의 수 중 3의 배수를 생략하고 출력
		i = 0;
		for(i=0; i<11; i++) {
			if(i%3==0) { //3의 배수를 찾는 조건
				continue;
			}
		
		System.out.println(i);
		}
	
		
// 3의 배수 출력시		
//		if(!(i%3==0)) {
//		System.out.println(i);
//    	}
		
		System.out.println("=========================================");
		
		//continue를 이용한 숫자 찾기
		// 0 ~ 99 까지의 숫자 중에 5의 배수이며 7의 배수인 숫자를 출력하고 총 몇개가 존재하는지 개수를 출력.
		
		int num = 0;
		int count = 0;
		
		while(num <100) {      //++num으로 해도 되고 (num++)이라고 해도 됨
			num++;                  
			
			if(num%5!=0 || num%7!=0) {  // 앞의 식과 같음.   !(num%5==0 and num%7==0)
				continue;
			}
			count++;
			System.out.println(num);
		}
		
			System.out.println("0~99 사이의 숫자 중에 5의 배쉬면서 7의 배수인 숫자는 모두 " +count+ "개가 있습니다.");
		
		
			System.out.println("=========================================");
		
			outerLoop : for(i=1; i<10; i++) {
			
				for(int j=1; j<10; j++) {
					System.out.println("["+i+","+j+"]");  //[1,1] [1,2]
					if(i%2==0 && j%2==0) {
						break outerLoop;
				}
			}
		}
		
		
		
	}

}
