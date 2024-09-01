//find Factorial of given number

import java.util.Scanner;
public class Factorial
{
    static int fact(int n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number to find its factorial: ");
	    int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is : "+fact(n));
		sc.close();
	}
}
