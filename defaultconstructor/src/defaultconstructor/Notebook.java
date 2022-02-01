package defaultconstructor;

public class Notebook {

	Notebook(){
		System.out.println("default constructor");
	}
	public void mymethod()
	{
		System.out.println("void method of the class");
	}
	public static void main(String args[]) {
		Notebook obj = new Notebook();
		obj.mymethod();
		
	}

}
