import java.util.Scanner;
import java.util.Arrays;
public class triangle{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	arr=new int[n];

	System.out.println("Enter the value of an array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
	int count=0;
	int l=0,r=i-1;
	while(l<r){
		if(arr[l]+arr[r]>arr[i]){
			count+=r-l;
			r--;
		}
	else
		l++;
	}

	System.out.println("Total number of triangle: "+count);
}



//	Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));


	}
}
