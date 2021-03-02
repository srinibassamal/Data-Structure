import java.util.Scanner;
public class leaders{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	arr=new int[n];

	System.out.println("Enter the value of an array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(arr[i]<arr[j]){
					break;
				}
				if(j==n-1){
					System.out.println(arr[i]+" leaders array");
				}
			}
		}
	}
}
