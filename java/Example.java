public abstract class Person {

	public int getAge() {
		return this.age;
	}

	public abstract void drinkWater();

}


public class Student extends Person implements MyInterface {
	public void drinkWater() {

	}

	public void methodA() {}
	public void methodB() {}

}


public interface MyInterface {
	public abstract void methodA();

	public void methodB();


}


public static void main(String[] args){

	Person p = new Student();
	p.getAge();
	p.drinkWater();

	MyInterface mi = new Student();
	mi.methodA();

	mi.drinkWater();


}




public class BoxInt {
	private int data;

}

public class BoxString {
	private String data;
}

public class BoxDog {
	private Dog data;

}

public class Box<T> {
	private T data;

	public T get(index i) {}
}

public class PrettyBox<T> extends Box<T> {}

public class PrettyDogBox extends PrettyBox<Dog> {}



