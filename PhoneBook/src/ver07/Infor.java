package ver07;

import java.io.Serializable;

public interface Infor extends Serializable { // 조상클래스에 상속시 자손클래스도 구현하게 된다.

		void showInfor();
		void showBasicInfor();
		
}
