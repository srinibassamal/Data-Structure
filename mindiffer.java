import java.util.Scanner;
public class mindiffer{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	arr=new int[5];
	int i;
	System.out.println("Enter the value of an array");
	for(i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
	arr[i]=arr[i+3];
	System.out.println(arr[i]);

	}
}
