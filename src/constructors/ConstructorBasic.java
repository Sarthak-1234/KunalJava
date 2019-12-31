package constructors;

public class ConstructorBasic {
	
	//1. Class Name = Constructor name
	//2. Return type nhi hota
	//3. used for initialization
	//4. Called when object is created
	
	String name;
	int id;
	
	public ConstructorBasic(){
		System.out.println("By default constructor");
	}
	
	public ConstructorBasic(String value, int value1) {
		System.out.println("I am paramterized constructor and name = "+value);
		name = value;
		id = value1;
		//System.out.println(name);
	}
	
	public void printName() {
		System.out.println(name);
		System.out.println(id);
	}

}
