import java.util.Scanner;
public class unionandintersection{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr;
	arr=new int[5];
	System.out.println("Enter the value of an arrays");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
	int[] arr1;
	arr1=new int[5];
	System.out.println("Enter the value of an arrays1");
		for(int i=0;i<arr.length;i++){
			arr1[i]=sc.nextInt();
			}
	findUnion(arr,arr1);
	}
	private static void findUnion(int[] arr,int[] arr1){
	int i=0;
	int j=0;
	    while(i<arr.length && j<arr1.length){
		if(arr[i]<arr1[j]){
		System.out.println(arr[i]+" ");
		i++;
		}else if(arr1[j]<arr[i]){
		System.out.println(arr1[j]+" ");
		j++;
		}else{
		System.out.println(arr[i]+" ");
		i++;
		j++;
		}
	}
		while(i<arr.length){
		System.out.println(arr[i]+"");
		i++;
	}
		while(j<arr.length){
		System.out.println(arr[j]+"");
		j++;
	}
//	findUnion(arr,arr1);
}
}
