package package1;

import java.io.*;
import java.util.*;

public class ArithmeticOperations {
	int add(int a,int b){
		return a+b;
		
	}
	
	int sub(int a,int b) {
		return a-b;
	}
	public static void main(String args[])
	{
		
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First number: ");
		n=s.nextInt();
		System.out.println("Enter second number: ");
		m=s.nextInt();
		
		ArithmeticOperations ao=new ArithmeticOperations();
		//Sum
		int r1=ao.add(n,m);
		System.out.println("Sum of given numbers:"+r1);
		//Difference
		int r2=ao.sub(n,m);
		
		System.out.println("Difference of given numbers:"+r2);
	}

}
