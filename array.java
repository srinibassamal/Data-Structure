import java.util.Scanner;
public class Deno{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int [] arr;
	arr=new int[5];
	System.out.println("Enter the value of an array");

	for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
}
System.out.println("The array elements are");
for(int i=0;i<arr.length;i++){
   System.out.println(arr[i]);
}
	}
}
