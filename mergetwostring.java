import java.util.Scanner;
public class mergetwostring{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	s1=sc.nextLine();
	s2=sc.nextLine();
	StringBuilder s3=new StringBuilder();
		for(int i=0;i<s1.length()||i<s2.length();i++){
		if(i<s1.length()){
		s3.append(s1.charAt(i));
	}
		if(i<s2.length()){
		s3.append(s2.charAt(i));
}}
	System.out.println(s3.toString());

}
}
