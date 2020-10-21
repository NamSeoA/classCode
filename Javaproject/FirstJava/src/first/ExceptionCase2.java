package first;

public class ExceptionCase2 {

	public static void main(String[] args) {
		//배열 관련
		
		try {
			int[] arr = new int[3];  // index --> 0 ~ 2
			//arr[10] = 20;
			
			//arr = new int [-10];
			
			Object obj = new int[10];
			//String str = (String)obj;
			
			String str1 = null;
			int len = str1.length();
		}
		  catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println(e.getMessage());
		} catch (NegativeArraySizeException e) {
			  System.out.println(e.getMessage());
		} catch (ClassCastException e) {
			  System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			  System.out.println(e.getMessage());
		} catch (Exception e) { // 처음에 해두면 상위클래스이기 때문에 처리되서 정확히 어떤 예외인지 확인 불가능
			  System.out.println(e.getMessage());
		}

		System.out.println("메서드가 종료됩니다.");
	
	


	}

}
