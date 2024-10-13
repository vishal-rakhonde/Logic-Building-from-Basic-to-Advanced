import java.util.Scanner;
class ReverseNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int reversedNumber=0;
		while (num!=0){
			int remainder=num % 10;
			reversedNumber=reversedNumber*10+remainder;
			num/=10;
		}
		System.out.println("Reversed number is "+reversedNumber);
	}
}