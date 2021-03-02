import java.util.Scanner;
import java.util.Arrays;
public class dupicate{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	arr=new int[8];
	System.out.println("Enter the value of an array: ");
	int i;
	for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	for(i=0;i<arr.length;i++){
	if(arr[i]==arr[arr.length-1]){
	System.out.println(arr[i]);
		break;
		}
	if(arr[i]!=arr[i+1]){
	System.out.println(arr[i]);


}
}


		}
}
