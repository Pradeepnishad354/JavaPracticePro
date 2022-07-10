package com.collection;

import java.util.*;

class Student{

public static void main(String[] args){


ArrayList<String> a=new ArrayList<>();
a.add("mohan");
a.add("rohan");
a.add("pradeep");
a.add("arpit");

Collections.sort(a);

System.out.println(a);



for(String b:a)

System.out.println(b);


}

}


