import java.util.Arrays;
import java.util.Scanner;
public class kthmaxandmin{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr;
	arr=new int[5];
	System.out.println("Enter the value of an array");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("Sorted arrays are:"+Arrays.toString(arr));
	System.out.println("Enter the  kth position: ");
	int k=sc.nextInt();
	System.out.println(arr[k]);
}
}

