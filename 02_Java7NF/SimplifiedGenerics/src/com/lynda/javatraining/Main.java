package com.lynda.javatraining;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;

public class Main {

	public static void main(String[] args) throws Exception {

		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);
		
//		Olive[] olives = {o1, o2, o3};
//		System.out.println(olives);
		ArrayList<Olive> olives2 = new ArrayList<>(); 
		// variable declaration = constructor method
//		 we don't need to declare the data type of the contained object m
		olives2.add(o1);
		olives2.add(o2);
		olives2.add(o3);
		System.out.println(olives2);
	}
	
}
/*
 [name: Kalamata: color: 0, name: Picholine: color: 65280, name: Ligurio: color: 0] 
 */
