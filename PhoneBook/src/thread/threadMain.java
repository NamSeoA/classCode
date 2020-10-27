package thread;

public class threadMain {

	public static void main(String[] args) {
		
		// Thread 생성
		ShowThread st1 = new ShowThread("1번  쓰래드");
		ShowThread st2 = new ShowThread("2번 쓰래드");
		
		// Runnable 인터페이스 이용한 Thread
		Runnable target = new ShowRunnable();
		Thread st3 = new Thread(target);
		
		// 우선 순위 설정 1 ~ 10 : 기본 5
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		st1.setPriority(Thread.MAX_PRIORITY); //우선순위가 높을 뿐 무조건 빨리 끝나는 것은 아님
		st2.setPriority(Thread.MIN_PRIORITY);
		
		st1.start();
		st2.start();
		//st3.start();
		
		for(int i=0; i<100; i++){
			System.out.println("안녕하세요 메인쓰래드입니다.");
			 try {
				 //sleep(ms) - Object 클래스의 메서드_ 현재 쓰래드를 1/1000 간격으로 멈춤 -> 100/1000
			    Thread.sleep(100);   
		      } catch (InterruptedException e){
		    	e.printStackTrace();
		      }
		}
		System.out.println("메인 쓰래드가 종료되었습니다.");
	}

}
