package corejava.basicprogrms;

import java.util.Scanner;

public class Power {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int res=1;
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter power");
		int pow=sc.nextInt();
		for(int i=1;i<=pow;i++)
			res=res*base;
		System.out.println("Ans= "+res);

	}

}
