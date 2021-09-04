package week1.day1;

import java.util.Scanner;

public class LearnIF {

	public static void main(String[] args) {
		int num1;
		num1=11;
		if(num1>0)
		{
			if(num1%3==0 && num1%5==0)
			{
				System.out.println("TRIZZ-FIZZ");
			}
			else {
		if(num1%3==0)
		{
			System.out.println("TRIZZ");
		}
		if(num1%5==0)
		{
			System.out.println("FIZZ");
		}
		if(num1%3!=0 && num1%5!=0)
			System.out.println("not divisible by 3 and 5");
			}
	}
}
}

