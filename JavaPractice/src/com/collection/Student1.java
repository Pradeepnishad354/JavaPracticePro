package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student1 {
public static void main(String[] args) {
	
HashMap<String,Integer> hs=new HashMap<String,Integer>();
hs.put("java",2000);
hs.put("spring",3000);
hs.put("hibernate",4000);

//System.out.println(hs);
	
Integer a=hs.get("java");
System.out.println(a);

Set s=hs.entrySet();
System.out.println(s);

Iterator itr=s.iterator();

while(itr.hasNext()) {
	
	Map.Entry m1=(Entry) itr.next();
	System.out.println(m1.getKey()+"  "+m1.getValue());
	
	if(m1.getKey().equals("spring")){
		m1.setValue(5000);
//		System.out.println(m1);
	}
	
	for(String str:hs.keySet()) {
		System.out.println(str);
	}
	for(Integer i: hs.values()) {
		System.out.println(i);
	}
}
}
}
