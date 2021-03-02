import java.util.Scanner;
public class subsequence{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1,s2="";
	s1=sc.nextLine();
	s2=sc.nextLine();
	int m=s1.length();
	int n=s2.length();
	boolean res=subsequence(s1,s2,m,n);
	if(res)
	System.out.println("Yes");
	else
	System.out.println("No");
}
static boolean subsequence(String s1,String s2,int m,int n){
	if(m==0)
	return true;
	if(n==0)
	return false;
	if(s1.charAt(m-1)==s2.charAt(n-1))
	return subsequence(s1,s2,m-1,n-1);
	else
	return subsequence(s1,s2,m,n-1);

}
}
