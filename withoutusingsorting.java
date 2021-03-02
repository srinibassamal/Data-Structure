import java.util.Arrays;
import java.util.Scanner;

public class withoutusingsort{

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int[] arr;
	arr=new int[5];
	System.out.println("Enter the array value which consist of only 0,1&2");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
