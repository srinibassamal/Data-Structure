import java.util.Scanner;
public class minimumdistance{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int [] arr;
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the value of an array");
	int i;
	for(i=1;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the value of x:");
	int x=sc.nextInt();
	System.out.println("Enter the value of y:");
	int y=sc.nextInt();
	int px=-1,py=-1,mindist=Integer.MAX_VALUE;
	for(i=0;i<n;i++){
		if(arr[i]==x)
		px=i;
		if(arr[i]==y)
		py=i;
		int dist=Math.abs(px-py);
		if(px!=-1&&py!=-1&dist<mindist)
		 mindist=dist;
	}
	if(px==-1||py==-1)
		System.out.println(-1);
	else
		System.out.println("Minimumdistance: "+mindist);
	}
}

