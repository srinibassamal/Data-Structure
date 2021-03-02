import java.util.Scanner;
public class rotation{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1,s2="";
	s1=sc.nextLine();
	s2=sc.nextLine();
	boolean res=rotation(s1,s2);
	System.out.println(res);
}
static boolean rotation(String s1,String s2){
	return(s1.length()==s2.length())&&((s1+s1).indexOf(s2)!=-1);
	}
}
