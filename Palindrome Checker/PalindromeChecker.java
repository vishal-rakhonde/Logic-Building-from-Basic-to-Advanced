import java.util.Scanner;
class PalindromeChecker{
	public static void palindromeChecker(String s){
		String str=s.toLowerCase();
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--){
			reverseString+=str.charAt(i);
		}
		if(str.equals(reverseString)){
			System.out.println(s+" is a palindrome.");
		}
		else
			System.out.println(s+" is not a palindrome.");
	}
			
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String s=sc.nextLine();
		palindromeChecker(s);
		
	}
}