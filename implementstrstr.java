import java.util.Scanner;
public class implementstrstr{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string value");
	String s1,s2="";
	s1=sc.nextLine();
	s2=sc.nextLine();
	int x=implementstrstr(s1,s2);
	System.out.println(x);
}
static int implementstrstr(String s1,String s2){
	if(s1.contains(s2))
		return s1.indexOf(s2);
	else
		return -1;
}
}
