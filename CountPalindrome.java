import java.util.Scanner;
class CountPalindrome
{
	private static int checkPalindrome(int num1 ,int num2)
	{
		int count=0;
		if(num1>=num2)
			return -1;
		num1=0000000;
		System.out.println(num1++);
		num2=2235322;
		while(num1<=num2)
		{
			int num=num1;
			int rev_num = 0; 
			while(num !=0) 
			{ 
				rev_num = rev_num * 10 + num % 10; 
				num = num / 10; 
			}
			if(num1>=0000000)
			{
				if((num1)==rev_num)
				{
					System.out.println(num1);
					count++;
				}
				
			}
			num1+=1;
		}
		return count;
	}
	
	public static void main(String...args)
	{
		int n0=0;
		int n1=2;
		int count=checkPalindrome(n0,n1);
		System.out.println(count);
	}
}