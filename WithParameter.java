package com.kartik;

interface MathOperations{
	int operate(int a, int b);
}
public class WithParameter {

	public static void main(String[] args) {
		MathOperations add=(a,b)->a+b;
		MathOperations mul=(a,b)->a*b;
		
		System.out.println(add.operate(10, 15));
		System.out.println(mul.operate(10, 20));
	}

}
