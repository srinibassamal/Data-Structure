import java.util.Scanner;
public class wave{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("After wave");
	swap(arr,n);
	waveArray(arr,n);
}
static void swap(int arr[],int n){
	int temp=0;
	for(int j=0;j<n-1;j=j+2){
	temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	}
}
static void waveArray(int arr[],int n){
	for(int j=0;j<n;j++)
		System.out.println(arr[j]+" ");

}
}
