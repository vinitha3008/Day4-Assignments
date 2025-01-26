package week1.day4;

import java.util.Scanner;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a strings:");
		String txt=s.nextLine();
		char[] a=txt.toCharArray();
		System.out.println("odd index to upper case:");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
			System.out.print(Character.toUpperCase(a[i]));
			}
			else
			{
				System.out.print(a[i]);
			}
		}
	}

}
