package thread;

// 쓰래드 클래스 정의는 Thread 클래스를 상속해서 정의
public class ShowThread extends Thread {
    
	String threadName;
	
	//생성자  초기화
	public ShowThread(String name) {
		threadName = name;
	}
	
	// 메서드 오버라이딩 (run())
	@Override
	public void run() {
	   // 새로운 실행 환경에서 처리할 코드를 작성
	   for(int i=0; i<100; i++) {
		   System.out.println("안녕하세요. "+threadName+" 입니다.");
		   try {
			 //sleep(ms) - Object 클래스의 메서드_ 현재 쓰래드를 1/1000 간격으로 멈춤 -> 100/1000
		   sleep(100);   
	      } catch (InterruptedException e){
	    	  e.printStackTrace();
	      }
	  }
	   System.out.println(threadName+"쓰래드가 종료되었습니다.");
	
	
	}

	
}
