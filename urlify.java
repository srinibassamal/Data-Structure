import java.util.Scanner;
public class urlify{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a string");
	String s1="";
	s1=sc.nextLine();
	String s3=s1.replace(" ","%20");
	System.out.println(s3);
	}
}
