import java.util.Scanner;
import java.io.*;
public class uppercaseconversion{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Write a sentence");
	String s1="";
	s1=sc.nextLine();
	convertToUpperCase(s1);
}
static void convertToUpperCase(String s1){
	String s3="";
	String s4="";
	String s5="";
	String s6="";
	String s2[]=s1.split("");
	for(int i=0;i<s2.length;i++){
		s3=s2[i].substring(1);
		s4=s2[i].substring(0,1);
		s5=s4.toUpperCase();
		s6=s5+s3;
		System.out.println(s6+" ");
		}
	}
}
