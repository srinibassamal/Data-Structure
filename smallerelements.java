import java.util.Scanner;
import java.util.Arrays;
public class smallerelements{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Elements want to enter:");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");

	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println("Enter any a number:");
	int m=sc.nextInt();
	int i, count=0;
	for(i=0;i<m-1;i++)
		count=arr[i];
//	if(arr[i]<count)
//		count++;
	System.out.println("Total numbers: "+count);


}
}
