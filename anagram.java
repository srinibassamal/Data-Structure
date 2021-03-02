import java.util.Scanner;
import java.util.Arrays;
public class anagram{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s1,s2="";
	System.out.println("Enter the value of s1");
	s1=sc.nextLine();
	System.out.println("Enter the value of s2");
	s2=sc.nextLine();

	int n=s1.length();
	int m=s2.length();
	if(n!=m){
		System.out.println("No");
	}else{
		char []s11=s1.toCharArray();
		char []s12=s2.toCharArray();
		Arrays.sort(s11);
		Arrays.sort(s12);
		for(int i=0;i<n;i++){
		    if(s11[i]!=s12[i]){
			System.out.println("No");
			break;
		}else{
			System.out.println("Yes");
			break;
			}
		}
}
}
}

