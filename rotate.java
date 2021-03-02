import java.util.Scanner;
public class rotate{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	arr=new int[n];
	int i;
	System.out.println("Enter the valure of an array");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();

		}
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
	//	int i;
		System.out.println("After rotation:");
		for(i=m;i<n;i++)
			System.out.println(arr[i]);
		for(i=0;i<m;i++)
			System.out.println(arr[i]);



}
}
