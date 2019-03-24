package com.tutorial.sample.number.example;

public class NumberProgram {

	
	public int sumTwoNumber(int n1,int n2){
		int sum=n1+n2;
		return sum;
		
	}
	
	public int getGreaterNumber(int n1,int n2) throws Exception{
		int greater=0;
		 if(n1>n2){
			 return n1;
		 }else if (n1<n2){
			 return n2;
		 }else if(n1==n2){
			 throw new Exception("invalid");
		 }
		return greater;

		
	}
	
	
	
	
	
}
