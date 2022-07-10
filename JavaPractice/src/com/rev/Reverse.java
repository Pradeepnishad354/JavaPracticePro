package com.rev;

public class Reverse {
	
	public static void main(String[] args) {
		
		String str="pradeep";
		int leng=str.length();
		String rev="";
		for(int i=leng-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
