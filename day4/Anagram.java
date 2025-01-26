package week1.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 strings:");
		int c=0;
		String txt1=s.nextLine();
		String txt2=s.nextLine();
		char[] t1=txt1.toCharArray();
		char[] t2=txt2.toCharArray();
		if(t1.length==t2.length)
		{
			Arrays.sort(t1);
			Arrays.sort(t2);
			for(int i=0;i<t1.length-1;i++)
			{
				if(t1[i]==t2[i])
					c++;
				else
					System.out.println("not an anagram");
			}
			if(c==t1.length-1)
					System.out.println("anagram words");
		}
		else
			System.out.println("mismatched");
	}
}
