import java.util.Scanner;
public class saveironman{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a string");
	String str1=sc.nextLine();
	boolean b=saveironman1(str1);
	System.out.println(b);
}
static boolean saveironman1(String str1){
	int i=0;
	String str2="";
	String str3="";
	while(i<str1.length()){
	      char ch1=str1.charAt(i);
	      int e=(int) ch1;
	      if(((int)'a'<=e && e<=(int)'z')||((int)'A'<=e&& e <=(int)'Z')){
		  str2+=ch1;
		}
		i++;
		}
		int n=str2.length();
		for(int j=n-1;j>=0;j--){
			str3+=str2.charAt(j);
		}
		if(str2.equalsIgnoreCase(str3))
		  return true;
		else
		  return false;
}
}

