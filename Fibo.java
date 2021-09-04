package week1.day1;

public class Fibo {

	public static void main(String[] args) {
		int num=8;
		int sum=0;
		int fn=0;
		int sn=1;
		System.out.println(fn);
		System.out.println(sn);
		for(int i=2;i<num;i++)
		{
			sum=fn+sn;
			System.out.println(sum);
			fn=sn;
			sn=sum;
		
		}
	}
}
