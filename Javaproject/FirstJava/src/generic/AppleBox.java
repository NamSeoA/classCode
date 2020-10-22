package generic;

public class AppleBox {

	Apple apple;
	
	public void store(Apple apple) { //사과만
		this.apple = apple; //사과 박스에 넣음
	}

	public Apple pullOut() {
		return apple;  //사과 꺼냄
	}
	
}
