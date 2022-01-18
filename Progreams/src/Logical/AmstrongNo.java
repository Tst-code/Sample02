package Logical;

import java.util.Scanner;

public class AmstrongNo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int inpute=num, sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			sum+=(rem*rem*rem);
			num/=10;
		}
		
		if(inpute==sum)
		{
			System.out.println("Given num - "+inpute+" is Amstrong");
		}
		else
		{
			System.out.println("Given num - "+inpute+" is not Amstrong");
		}
	}
	
	

}
