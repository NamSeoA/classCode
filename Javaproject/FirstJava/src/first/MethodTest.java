package first;

public class MethodTest {

	public static void main(String[] args) {
		//********************이때 강의 영상 다시 보기 (1시 20분)
		//MyMeth 클래스 사용할 수 있도록 만들어주기 (코드 만들어놓고 사용 가능)
		MyMeth my = new MyMeth();           //메모리에 만들어짐,올려짐 (Screenshot 보기)
		
		System.out.println(my.add(1,5)); 
		
		my.sayHello();                      //이렇게 해놔서 sayHello가 필요한 곳마다 적용 가능

		my.plus(10, 20);                     //Screenshot2
		
		System.out.println(my.check());
		
		hiEveryone();
		
		my.div(10, 2);
		my.div(10, 0);

		System.out.println(true);
	}

		static void hiEveryone() {
			System.out.println("안녕하세요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
