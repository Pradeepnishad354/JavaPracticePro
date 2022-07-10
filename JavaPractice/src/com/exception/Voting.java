package com.exception;

class YoungerAgeExcetion extends RuntimeException{


YoungerAgeExcetion(String msg)
{
	
super(msg);

}


}
class Voting
{
public static void main(String[] args)
{
int age=20;
try {
if(age<18)
throw new YoungerAgeExcetion("you r not eligible for voting ");

else{

System.out.println("vote success");
}}catch(Exception e) {
	System.out.println(e);
	
}
}

}




