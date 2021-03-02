import java.util.Arrays;
import java.util.Scanner;
public class subsequent{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	int a=subsequent(arr,n);
	System.out.println("subsequent: "+a);
}
static int subsequent(int [] arr,int n){
	int count=0;
	for(int j=0;j<n;j++){
	    for(int k=j+1;k<n;k++){
		for(int l=k+1;l<n;l++){
		    if(arr[j]<arr[k] && arr[k]<arr[l])
			count++;
			}
		}
	}
	return count;
	}
}
