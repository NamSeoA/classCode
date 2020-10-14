package first;

public class ExamStringTest {
//String 문제풀이
	public static void main(String[] args) {

		
/*﻿
	문제 1. 다음 형태로 String 인스턴스를 생성.
	String str = “ABCDEFGHIJKLMN”;
   	그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성
*/
		
		String str = "ABCDEFGHIJKLMN";
		int numOfStr = str.length();
		int index = numOfStr=-1;       //배열이나 문자열의 위치 index는 0 ~ N-1
		
		String result ="";
		StringBuffer sb = new StringBuffer();
		
		//String 클래스의 charAt() 메서드를 이용해서 역순으로 출력
		for(int i=index; i>=0; i--) {
//			result += str.charAt(i);    //result = result + String
			sb.append(str.charAt(i));
		}
		
		System.out.println(str);
//		System.out.println(result);
		System.out.println(new String(sb));

		
		System.out.println("====================================");
		
		//StringBuffer 클래스 이용
		sb = new StringBuffer(str);   //"ABCDEFGHIJKLMN"    , reverse는 stringbuffer타입이라 가능  
//		System.out.println(sb); //(sb)만 넣어도 됨
//		sb = sb.reverse();
		
		System.out.println(sb.reverse());
		
		
//StringBuffer 설명 _구글링
/*
String 클래스의 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수는 없습니다. (수정, 삭제x)
하지만 StringBuffer 클래스의 인스턴스는 그 값을 변경할 수도 있고, 추가할 수도 있습니다.
버퍼 크기의 기본값은 16개의 문자를 저장할 수 있는 크기이며, 생성자를 통해 그 크기를 별도로 설정할 수도 있습니다.
하지만 인스턴스 생성 시 사용자가 설정한 크기보다 언제나 16개의 문자를 더 저장할 수 있도록 여유 있는 크기로 생성됩니다.
덧셈(+) 연산자를 이용해 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String 인스턴스를 생성합니다. (result+string)
따라서 문자열을 많이 결합하면 결합할수록 공간의 낭비뿐만 아니라 속도 또한 매우 느려지게 됩니다.
하지만 StringBuffer 인스턴스를 사용하면 문자열을 바로 추가할 수 있으므로, 공간의 낭비도 없으며 속도도 매우 빨라집니다.
이러한 StringBuffer 클래스는 java.lang 패키지에 포함되어 제공됩니다.*/
		
		
		
		
/*﻿
문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
String str = “990929-1010123”
이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.
﻿*/
	System.out.println("문제 2");
		
	str = "990929-1010123";
	sb = new StringBuffer();  // +16개 문자 저장 가능
	
	System.out.println(str);
	
//String charAt() 이용
	for(int i=0; i<str.length(); i++) {
		//'-' 가 아닌 경우, '0'~'9'인 경우만 => 문자열을 추가
		char c = str.charAt(i);
		if(c>='0'&&c<='9') {
			sb.append(c);
		}
	}
		System.out.println(sb);
		
		//String replace()
		result = str.replace("-", "");  // - 찾아서 공백문자열로
		System.out.println("result : " +result);
		
/* String  replace(CharSequence target, CharSequence replacement)
Replaces each substring of this string 
that matches the literal target sequence 
with the specified literal replacement sequence. */
		
		
	}

}
