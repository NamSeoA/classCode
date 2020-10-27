package thread;

public class Calculator {

	int opPlusCnt = 0; //더하기 연산 횟수
	int opMinCnt = 0;
	
	public int add(int n1, int n2) {
	  synchronized (this) {
		  opPlusCnt++;
     }
		return n1+n2;
	}
	
	
	public int min(int n1, int n2) {
	  synchronized (obj) {
		  opMinCnt++;
	  }
		return n1-n2;
	}
	
	// 새로운 동기화 키를 만들어 혼동을 막는다.
	Object obj = new Object();
	
	
	
	
	
	
}
