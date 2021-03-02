import java.util.Scanner;
import java.util.Arrays;
public class chocaltedistribution{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int [] arr;
	int n=sc.nextInt();
	System.out.println();
	arr=new int[n];
	System.out.println();
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	System.out.println("total");
	distribution(arr,n,m);
}
static void distribution(int []arr,int n,int m){
	Arrays.sort(arr);
	for(int i=1;i<m;i++){
		int mindifference=arr[m-1]-arr[0];
		System.out.println(mindifference);
		break;
}
}
}
