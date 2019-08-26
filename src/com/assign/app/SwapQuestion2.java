package com.assign.app;

public class SwapQuestion2 {
		
	public int num1;
	public int num2;
	public int num3;
	
	public SwapQuestion2(int num1, int num2) {
		
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	
	
	public void swapNumber() {
	
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("Value of 1 :" + num1);
		System.out.println("Value of 2 :" + num2);
		
	}
	
	public static void main(String[] args) {
		
		SwapQuestion2 swap = new SwapQuestion2(5,10);
		swap.swapNumber();
	}

}
