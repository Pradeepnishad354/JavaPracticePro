package com.override;

class Parent{
	
	
	void show() {
		
		System.out.println("parent");
	}
	
	
} 
 class Child extends Parent{
	 
	 void show() {
		 System.out.println("child");
	 }
 }



public class Main {
	
	public static void main(String[] args) {
		
	
	
	Child c=new Child();
	c.show();
	Parent p=new Child();
	p.show();
	}
}
