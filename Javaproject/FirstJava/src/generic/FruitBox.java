package generic;

public class FruitBox<T> {  //T -> Apple 들어옴

	
	T fruit; //Apple fruit;
	
	public FruitBox(T fruit) { //생성자가 public FruitBox(Apple fruit)
		this.fruit = fruit;
	}

	public void store(T fruit) {
		this.fruit = fruit;  //public void store(Apple fruit)
	}
	
	public T pullOut() {
		return fruit;    //public Apple pullOut()
	} 
	
}
