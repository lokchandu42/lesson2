package com.innerclasses;

public class InnerClassAssisted{

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	InnerClassAssisted  ob=new InnerClassAssisted ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}









