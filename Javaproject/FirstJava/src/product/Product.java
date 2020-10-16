package product;

public class Product extends Object {  //다른 클래스는 상속하지 않는 경우 자동으로 object 클래스를 상속

	int price;
	int bonusPoint;
	
	// 생성자 (shift+alt+s)
	public Product(int price) {
		//super(); 생략가능
		this.price = price;
		this.bonusPoint = (int)(price*0.1f);
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
	
	
	
	
	
	
	
	
}
