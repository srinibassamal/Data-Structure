import java.util.Scanner;
public class productarraypuzzle{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	int [] arr2;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	arr=new int[n];
	arr2=new int[n];
	System.out.println("Enter the values of an array");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}

	System.out.println("Product of all elements");
	puzzle(arr,n,arr2);
	print(arr2,n);
}
static void puzzle(int arr[],int n,int arr2[]){

	int product=1;
	for(int j=0;j<n;j++){
	    for(int k=0;k<n;k++){
		if(j==k)
		  continue;
		else
		  product*=arr[k];
		}
	arr2[j]=product;
	product=1;
	}
	}
static void print(int [] arr2,int n){
	for(int j=0;j<n;j++){
	    System.out.println(arr2[j]+" ");
		}
	}
}
