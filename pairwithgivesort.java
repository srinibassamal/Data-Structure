import java.util.Scanner;
public class pairwithgivensort{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	System.out.println("Enter the value of k");
	int k=sc.nextInt();
	System.out.println("Pairs are: ");
	pairwithgiven(arr,n,k);
}
static void pairwithgiven(int []arr,int n,int k){
	int count=0;
	for(int i=0;i<n;i++){
	    for(int j=0;j<n-1;j++){
		if(k==arr[i]+arr[j])
		count++;
		if(k!=arr[i]+arr[j])
		count--;
		}
	}	System.out.println(count/2);
}
}



