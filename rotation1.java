import java.util.Scanner;
public class rotation1{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	System.out.println("Enter the string");
	s1=sc.nextLine();
	s2=sc.nextLine();
	boolean res=rotation(s1,s2);
	System.out.println(res);
}
static boolean rotation(String s1,String s2){
	return(s1.length()==s2.length())&&((s1+s1).indexOf(s2)!=-1);
}
/*static boolean rotation(String s1,String s2){
	if(s1.length()!=s2.length())
		return false;
	if(s1.length()==0)
		return true;
	for(int i=0;i<s1.length();i++){
	    for(int j=0;j<s1.length();j++){
		if(s1.charAt((i+j)%s1.length())!=s2.charAt(i))
		continue;
	}
		return true;
	}
	return false;
}*/
}
