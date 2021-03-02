import java.util.Scanner;
public class negative1{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	arr=new int[5];
	System.out.println("Enter the value of an array");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	int j=0,temp;
	for(int i=0;i<arr.length;i++){
		if(arr[i]<0){
			if(i!=j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			 j++;
			}
		}
	System.out.println("The elements are: ");
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]+" ");
		}
	}
}
