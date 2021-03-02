import java.util.Scanner;
public class wavearray{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int []arr;
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("After wave array");
	printwavearray(arr,n);
	printarray(arr,n);
}
static void printwavearray(int arr[],int n){
	int temp=0;
	for(int i=0;i<n-1;i+=2){
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
}
static void printarray(int arr[],int n){
	for(int i=0;i<n;i++){
	    System.out.println(arr[i]+" ");
		}
	}
}
