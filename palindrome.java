import java.util.Scanner;
public class palindrome{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	System.out.println("Enter the value of string");
	s1=sc.nextLine();
	int n=s1.length();
	for(int i=n-1;i>=0;i--){
	    s2=s2+s1.charAt(i);
	}
	palindrome(s1,s2);
}
static void palindrome(String s1,String s2){
	if(s1.equalsIgnoreCase(s2)){
		System.out.println("The string is a pallindrome");
	}else{
		System.out.println("The string is not a pallindrome");
}
}
}
