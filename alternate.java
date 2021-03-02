import java.util.Scanner;
public class alternate{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter how many elements do you want to enter");
	int n=sc.nextInt();
	arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
}
		for(int i=0;i<n;i=i+2){
		System.out.println("alternate "+arr[i]);
}
}
}
