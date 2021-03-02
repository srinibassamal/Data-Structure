import java.util.Scanner;
public class majorityelements{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Majority elements");
	majorityElements(arr,n);
	}
public static void majorityElements(int arr[],int n){
	int maxcount=0;
	int index=-1;
	for(int i=0;i<n;i++){
		int count=0;
		for(int j=0;j<n;j++){
			if(arr[i]==arr[j])
			count++;
		}

	if(maxcount<count){
		maxcount=count;
		index=i;
	}
}
	if(maxcount>n/2){
		System.out.println(arr[index]);
	}else{
		System.out.println("No maximum elemenets");
	}
}
}

