package week1.day4;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="We learn java basics as part of java sessions in java week1";
		String[] a=str.split(" ");
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1; j < a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					c++;
					a[j]="0";
					
				}			
			}			
		}
		if(c>0)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!="0")
				{
					System.out.print(a[i]+" ");
				}
				else
				{
					System.out.print(a[i].replaceAll("0",""));
					
				}
			}
		}
	}
}