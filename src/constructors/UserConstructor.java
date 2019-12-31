package constructors;

public class UserConstructor {
	
	 static ConstructorBasic obj; //instantiation or creating instance
	 
	public static void main(String args[]) {
		obj = new ConstructorBasic();  //object creation 
		//By default constructor
		
		//empty box
		
		//Parameterized constructor ------
		obj = new ConstructorBasic("Sarthak", 12);
		obj.printName();
		
		
		
		//bydefault consturctor
		//parameterized constructor
		//how we can initilize value from constructor
		//by default value of string = null
		//by default value of int = 0
		
	}
}
