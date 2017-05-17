package corejava.basicprogrms;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		int sum=0,temp;
		temp=no;
		while(no>0)
		{
			int r=no%10;
			no=no/10;
			sum=(sum*10)+r;
		}
		if(temp==sum)
			System.out.println(temp+ " Is a Palindrom no");
		else
			
			System.out.println(temp+ " Is not a Palindrom no");

	}

}
