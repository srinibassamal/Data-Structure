import java.util.Scanner;
import java.util.Arrays;
public class Secondndlargest{
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
	}Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
		for(int i=n-2;i>=0;i--){
			if(arr[i]!=arr[arr.length-1]){
		arr[i]=arr[n-2];
		System.out.println("2nd largest element "+arr[i]);
			break;
	}
		}

}
}
