package com.kartik;

public class Lambda {

	public static void main(String[] args) {
		Runnable r=()->System.out.println("Hello printing.");
		new Thread(r).start();
	}

}
