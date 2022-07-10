package com.rev;

public class Rev2 {
	
	public static void main(String[] args) {
		
		
		String name="Mohan";
		int length=name.length();
		
		String rev="";
		
		for(int i=length-1; i>=0; i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
