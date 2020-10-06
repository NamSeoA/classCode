package first;

public class Triangle {

/*
 * 내가 한 거
	//변수, 메서드
	// 밑변, 높이
	
	//변수
	//밑변 
	int a = 0;
	
	//높이
	int b = 0;
	
	//메서드
	//변수의 값을 변경하는 메서드
	
	//삼각형의 넓이를 구하는 메서드 //c= 넓이
	int triangle(int a, int b) {
		
		int c = 0;
		c = (a*b)/2;
		
		return c;
	}
*/
	
	
	// 변수 : 밑변, 높이
	float width;  //삼각형의 밑변  //삼각형 넓이는 소수점자리까지 나올 수 있기 때문에
	float height; //삼각형의 높이
	
	
	// 메서드 : 변수의 값을 변경하는 메서드, 삼각형의 넓이를 구하고 결과를 반환하는 메서드
	// 변수의 값을 변경하는 메서드 , 값을 받아야함
	void changeData(float w, float h) {
		width = w;
		height = h;
	}
	
	// 삼각형의 넓이를 구하고 결과를 반환하는 메서드 : 밑변*높이/2 => 결과는 실수 타입으로
	float area() {
		float result = 0.0f;          //초기화한것, 나중에 할 때는 return width * height/2; 한 줄만 적으면 됨
		result = width * height / 2;  //넓이 구하기
		return result;                //반환
		//return width * height / 2;
	}
	
	
	
	// 수정 용이. 코스 최적화
	
	public static void main(String[] args) {
	
		Triangle t = new Triangle();
		
		// 밑변과 높이 값을 설정
		t.changeData(10, 3);    //이미 형을 float으로 해놨기 때문에 정수를 입력해도 자동으로 float타입으로 변함
		
		// 넓이를 구하고 변수에 담는다.
		float result = t.area();
		
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	



}