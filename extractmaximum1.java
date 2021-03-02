import java.util.Scanner;
public class extractmaximum1{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a string");
	String s1="";
	s1=sc.nextLine();
	int num=0;
	int res=0;
	extractmax(s1,num,res);
}
static void extractmax(String s1,int num,int res){
	for(int i=0;i<s1.length();i++){
		if(Character.isDigit(s1.charAt(i))){
		num=num*10+(s1.charAt(i)-'0');
		}else{
		res=Math.max(res,num);
		num=0;
	}
}
	System.out.println(Math.max(num,res));
}
}
