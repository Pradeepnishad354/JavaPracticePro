package com.abstarct;


interface Inter1{
	
	public void print();
}

interface Inter2{
	
	public void print1();
}

public class Inter implements Inter1,Inter2{

	@Override
	public void print() {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		Inter i=new Inter();
		i.print();
		i.print1();
	}
	@Override
	public void print1() {
		System.out.println("Hello2");
		
	}

}
