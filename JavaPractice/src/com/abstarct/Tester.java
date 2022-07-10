package com.abstarct;

 abstract class Animal {
	
	public void disp() {
		
		System.out.println("animal eaten the  food");
	}
	
	public abstract void food();

}
 
 class Tester extends Animal{

	@Override
	public void food() {
		System.out.println("food");
		
	}
	 public static void main(String[] args) {
		
		 Tester t=new Tester();
		 t.disp();
		 t.food();
		 
	}
 }
