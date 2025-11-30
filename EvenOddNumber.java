//Print Even and Odd Numbers from 1 to 100

package com.kartik.simplestuff;

public class EvenOddNumber {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i+" Its Even.");
			}else {
				System.out.println(i+" Its Odd.");
			}
		}
	}

}
