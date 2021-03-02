import java.util.Scanner;
public class duplicate1{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	arr=new int[n];

	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	System.out.println("Duplicate elements are: ");
	duplicate(arr,n);
}
static void duplicate(int [] arr,int n){
	for(int i=0;i<n;i++){
	   int index=arr[i]%n;
	   arr[index]+=n;
	}
	    for(int j=0;j<n;j++){
		if((arr[j]/n)>=2)
		System.out.println(j+" ");
		}
	}
}


