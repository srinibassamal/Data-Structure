import java.util.Scanner;
import java.util.StringTokenizer;
public class titlecaseconversion{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s1="";
	s1=sc.next();
	 StringTokenizer st=new StringTokenizer(s1);
      while(st.hasMoreTokens()){
      System.out.println(st.nextToken());

//	uppercase(s1);
}
//static void uppercase(String s1){
//	StringTokenizer st=new StringTokenizer(s1);
//	while(st.hasMoreTokens()){
//	System.out.println(st.nextToken());
//	}
//	System.out.println(st);
}
}

