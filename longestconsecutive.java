import java.util.Scanner;
import java.util.Arrays;
public class longestconsecutive{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	arr=new int[n];

	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	System.out.println("Longest consecutive Subsequence: ");
	subsequence(arr,n);
}
static void subsequence(int [] arr,int n){
	Arrays.sort(arr);
	int count=1;
	for(int i=0;i<n-1;i++){
		if(arr[i+1]==arr[i]+1)//&&(arr[i]!=arr[i+1]))
		count++;
	else
	break;
}		System.out.println(count);
	}

}
