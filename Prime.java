package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int n=23;
		int flag=0;
		if(n==0||n==1)
		{
			System.out.println("Not a Prime");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a Prime");
					flag++;
					break;
				}	
			}
			if(flag==0)
			{
				System.out.println("prime");
			}
		}
			

	}

}
