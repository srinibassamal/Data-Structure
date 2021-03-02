import java.util.Scanner;
public class reverseword{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a string");
	String s1="";
	s1=sc.nextLine();
	String s2[]=s1.split("\\.");
	int i=0;
	int n=s2.length-1;
	while(i<n){
	String s3=s2[i];
	s2[i]=s2[n];
	s2[n]=s3;
	i++;
	n--;
}
	String res=String.join(".",s2);
	System.out.println(res);
}
}
