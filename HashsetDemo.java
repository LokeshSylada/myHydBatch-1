package com.technoelevate.alltest;

import java.util.HashSet;

public class HashsetDemo {
	
	private static HashSet hs = new HashSet();
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(105,"Ikbal");
		hs.add(emp1);
		hs.add(emp1);
		hs.add(emp1);
		hs.add(emp1);
		hs.add(emp1);
		
		Employee emp2 = new Employee(101,"Jeigyanshu");
		Employee emp3 = new Employee(101,"Jeigyanshu");
		hs.add(emp2);
		hs.add(emp3);
		hs.add(new Employee(103,"Ravi Teja"));
		hs.add(new Employee(104,"Ashwini"));
		
		System.out.println(hs);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
	}

}
