import java.util.Scanner;
public class cyclicallyrotate{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr;
	arr=new int[5];
	System.out.println("Enter the value of an array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("The cyclically rotate array are: ");
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
			}
		arr[0]=x;
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}
}
