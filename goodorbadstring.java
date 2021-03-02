import java.util.Scanner;
public class goodorbadstring{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a string");
	String s1="";
	s1=sc.nextLine();
	int vcount=0;
	int ccount=0;
	s1=s1.toLowerCase();
	for(int i=0;i<s1.length();i++){
	    if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		vcount++;
	    else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
		 ccount++;
	}
	goodorbad(ccount,vcount);
}
static void goodorbad(int ccount,int vcount){
	if(vcount>4||ccount>2)
	System.out.println("0");
	else
	System.out.println("1");
}
}
