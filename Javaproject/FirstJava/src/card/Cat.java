package card;

public class Cat {
	String name;
	double weight;
	int age;
	
	Cat(String s, double d, int i) {
		name = s;
		weight = d;
		age = i;
	}

//클래스로부터 객체를 만드는 특별한 메소드
//객체를 생성함은 물론 필드값을 초기화
//생성자는 호출과 정의로 나뉨

	public static void main(String[] args) {
		Cat cat1 = new Cat("네로", 3.87, 3);
	}
}
