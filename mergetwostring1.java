import java.util.Scanner;
public class mergetwostring1{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	System.out.println("Enter two words");
	s1=sc.next();
	s2=sc.next();
	StringBuilder s3=new StringBuilder();
	mergetwostring(s1,s2,s3);
}
static void mergetwostring(String s1,String s2,StringBuilder s3){
	for(int i=0;i<s1.length()||i<s2.length();i++){
		if(i<s1.length()){
			s3.append(s1.charAt(i));
		}
		if(i<s2.length()){
			s3.append(s2.charAt(i));
		}
	}
	System.out.println(s3.toString());
	}
}
