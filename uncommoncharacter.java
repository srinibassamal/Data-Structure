import java.util.Scanner;
public class uncommoncharacter{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	System.out.println("Enter the string");
	s1=sc.nextLine();
	s2=sc.nextLine();
	uncommoncharacter(s1,s2);
}
static void uncommoncharacter(String s1,String s2){
	int i=0;
	int j=0;
	char[] s3=s1.toCharArray();
	char[] s4=s2.toCharArray();
	while(i<s3.length-1){
		i++;
	}while(j<s4.length-1){
		j++;
	}if(s1.charAt(i)!=s2.charAt(j)){
		System.out.println(s1.charAt(i));
		System.out.println(s2.charAt(j));
}
}
}

