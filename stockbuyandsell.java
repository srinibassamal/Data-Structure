import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class stockbuyandsell{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int [] arr;
	int n=sc.nextInt();
	System.out.println();
	arr=new int[n];

	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	 }
	System.out.println("Maximum profit");
	buyandsell(arr,n);
}
static void buyandsell(int [] arr,int n){
	int maxprofit=0;
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
		int profit=arr[j]-arr[i];
		if(profit>maxprofit)
		maxprofit=profit;
		}
	}
	System.out.println(maxprofit);
}
}

