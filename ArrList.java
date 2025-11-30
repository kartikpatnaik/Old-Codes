package com.kartik.collection.arrayList;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(123);
		list.add(345);
		list.add(567);
		
		for(int x:list) {
			System.out.println(x);
			System.out.println(list.size());
		}
		
	}

}
