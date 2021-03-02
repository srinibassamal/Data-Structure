//if((arr[i+1]!=arr[i])+1)
import java.util.Scanner;
import java.util.Arrays;
public class misingandrepeating{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an arrays");
	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}
	System.out.println("Missing Element: ");
	findingelement(arr,n);
}
static void findingelement(int []arr,int n){
	Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	for(int i=0;i<n-1;i++){
		if((arr[i+1]!=arr[i]+1) && (arr[i]!=arr[i+1]))
		System.out.println("Miising elements: "+(arr[i]+1)+" ");
		if(arr[i]==arr[i+1])
		System.out.println("Repeating elements: "+arr[i]+" ");
}
}
}
