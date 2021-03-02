import java.util.Scanner;
public class reverse1{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr;
	arr=new int[5];
	System.out.println("Enter the value of an array");

	for(int i=0;i<arr.length;i++){
		   arr[i]=sc.nextInt();
}
	System.out.println("The reverse array are");
	for(int j=arr.length-1;j>=0;j--){
		System.out.println(arr[j]);
		}
	}
}
