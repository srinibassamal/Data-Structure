import java.util.Scanner;
public class implementstrstr1{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	System.out.println("Enter the value of a string");
	s1=sc.nextLine();
	s2=sc.nextLine();
	int m=s1.length();
	int n=s2.length();
	for(int i=0;i<m-n;i++){
	   for(int j=0;j<n;j++){
		if(s1.charAt(i+j)!=s2.charAt(j))
		break;
		if(j==n)
		System.out.println(i);
//		else
//		System.out.println(-1);
		}
	}
	System.out.println(-1);
}
}

