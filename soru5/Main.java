package com.cse202pack.w4.recursion;

public class Main {
	public static void main(String[] args) {
		RecursiveOperations rop = new RecursiveOperations();
		int res = rop.findFactorial(4);
		System.out.println(res);
		res = rop.findSumUpToN(5);
		System.out.println(res);
		res = rop.findPower(2,5);
		System.out.println(res);
		res = rop.findNthFibonacciNumber(4);
		System.out.println(res);
		int[] a = {2,9,1,8,16,15};
		res = rop.findMaxOfArray(a, 0);
		System.out.println(res);
		res = rop.findSumOfArray(a, 0);
		System.out.println(res + "\n--------");
		rop.writeContentsOfArray(a, 0);
	}
}
