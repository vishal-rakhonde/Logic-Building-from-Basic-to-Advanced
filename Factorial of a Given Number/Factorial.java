import java.util.Scanner;
class Factorial {
	public static void findFactorial(int num){
		int fact=1;
		for(int i=num;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		if(num>=0)
			findFactorial(num);
		else
			System.out.println("Enter valid number.");
		
	}
}