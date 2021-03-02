import java.util.Arrays;
import java.util.Scanner;
public class sortstring{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s1=sc.next();
	char[] ch=s1.toCharArray();
	int n=s1.length();
	sortstring(ch,n);
	System.out.println(String.valueOf(ch));

	}
static void sortstring(char [] ch,int n){
	 Arrays.sort(ch);
	 reverse(ch,n);
}
static void reverse(char []ch,int n){
	char t;
	for(int i=0;i<n/2;i++){
		t=ch[i];
		ch[i]=ch[n-i-1];
		ch[n-i-1]=t;
//	System.out.println(ch[i+1]);
        }
}
}
