package com.cse202pack.w4.recursion;

public class RecursiveOperations {

	public int findFactorial(int i) {
		// TODO Auto-generated method stub
		
		if(i==0)
			return 1;
		else
			return i*findFactorial(i-1);
	}

	public int findSumUpToN(int i) {
		
		if(i==1)
			return 1;
		else
			return i+findSumUpToN(i-1);
	}

	public int findPower(int i, int j) {
		if(j==0)
			return 1;
		else
			return i*findPower(i,j-1);
	}

	public int findNthFibonacciNumber(int n) {
		if(n<=1) 
			return n;
		else
			return findNthFibonacciNumber(n-1) + findNthFibonacciNumber(n-2);
	}
	
	public int findSumOfArray(int[] a,int ind) {
		if(ind==a.length) {
			return 0;
		}else {
			return a[ind] + findSumOfArray(a, ind+1);
		}
	}
	
	public int findMaxOfArray(int[] a,int ind) {
		if(ind==a.length-1) {
			return a[ind];
		}else {
			int t = findMaxOfArray(a,ind+1);
			if(a[ind]>=t) {
				return a[ind];
			}else {
				return t;
			}
		}
	}
	
	public void writeContentsOfArray(int[] a, int ind) {
		
		if(ind==a.length) {
			return;
		}else {
			System.out.println(a[ind]);
			writeContentsOfArray(a, ind+1);
		}
	}
}
