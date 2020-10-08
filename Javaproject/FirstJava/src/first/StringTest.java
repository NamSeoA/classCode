package first;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "My String";
		String str2 = "My String";  // 같은 문자열을 찾아 있다면 똑같이 출력
		String str3 = "Your String";
		String str4 = new String("My String");  //같은 문자열을 찾지 않고 이대로 출력
		
		//참조변수 값의 동등 비교 : 같은 인스턴스를 참조한다
		if(str1 == str2) {
			System.out.println("같은 인스턴스를 참조");
		} else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		if(str1 == str3) {
			System.out.println("같은 인스턴스를 참조");
		} else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		if(str1 == str4) {
			System.out.println("같은 인스턴스를 참조");
		} else {
			System.out.println("다른 인스턴스를 참조");
		}

		System.out.println(str1.equals(str4));  //문자 내용 비교할 때 equals 사용하기
		
		
	}

}
