package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am a software tester";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			if(i==0) 
				System.out.print(str1[0]);
			else if(i%2==0)
				System.out.print(str1[i]);
			else if(i%2==1)
			{
				char[] a=str1[i].toCharArray();
				for(int j=(a.length)-1;j>=0;j--)
				{
					System.out.print(a[j]);
				}
			}
			System.out.print(" ");
		}
	}
}
