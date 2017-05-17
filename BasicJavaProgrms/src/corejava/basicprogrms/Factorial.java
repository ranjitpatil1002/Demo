package corejava.basicprogrms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		int facto=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
			facto=facto*i;
		System.out.println("Fatorial=" +facto);

	}
	
	

}
