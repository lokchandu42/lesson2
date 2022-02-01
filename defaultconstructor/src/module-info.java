
class NoteBook{
	NoteBook(){
		System.out.println("default constructor");
	}
	public void mymethod()
	{
		System.out.println("void method of the class");
	}
	public static void main(String args[]) {
		NoteBook obj = new NoteBook();
		obj.mymethod();
		
	}
}