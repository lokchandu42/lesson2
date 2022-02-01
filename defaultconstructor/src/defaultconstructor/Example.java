package defaultconstructor;

public class Example {
	Example() {
		System.out.println("default constructor");
	}
	Example(int i, int j) {
		System.out.println("constructor with two parameters");
	}
	Example(int i, int j, int k){
		System.out.println("constructor with three parameters");
	}
	Example(int i, String name){
		System.out.println("constructor with int and String parameters");
	}
	public static void main(String args[]) {
		Example obj = new Example();
		Example obj2 = new Example(10,10);
		Example obj3 = new Example(1,2,3);
		Example obj4 = new Example(1,"chandu");
		
	}

}
