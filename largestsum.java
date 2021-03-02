import java.util.Scanner;
public class largestsum{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr;
	arr=new int[5];
	System.out.println("Enter the value of an array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	int max=arr[0];
	int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(sum>max)
			max=sum;
			if(sum<0)
			sum=max;
		}
		System.out.println("largest sum is "+sum);
}
}

