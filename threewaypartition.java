import java.util.Scanner;
public class threewaypartition{
public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	System.out.println("Enter the value of lowval highval: ");
	int lowval=sc.nextInt();
	int highval=sc.nextInt();
	System.out.println();
	threewaypartition(arr,lowval,highval);
}
static void threewaypartition(int [] arr,int lowval,int highval){
	int n=arr.length;
	int start=0,end=n-1;
	for(int i=0;i<=end;){
	    if(arr[i]<lowval){
		int temp=arr[start];
		arr[start]=arr[i];
		arr[i]=temp;
		start++;
		i++;
	}
	    else if(arr[i]>highval){
		int temp=arr[end];
		arr[end]=arr[i];
		arr[i]=temp;
		end--;
	}
	    else{
		i++;
}
	System.out.println(arr[i]+" ");
}
}
}

