import java.util.Scanner;

public class UnionAndIntersection{
public static void main(String[] args){

	Scanner sc= new Scanner(System.in);
	int[] arr1;
	int[] arr2;
	int m,n;

	if(m>n){
		int tempp[]=arr1;
		arr1=arr2;
		arr2=tempp;

		int temp=m;
		m=n;
		n=temp;
}

	arr1=new int[5];
	System.out.println("Enter the value of an array");

	for(int i=0;i<m;i++){
	   arr1[i]=sc.nextInt();
}

	arr2=new int[5];
	System.out.println("Enter the value of array2");

	for(int i=0;i<n;i++){
	    arr2[i]=sc.nextInt();
}



}
}
