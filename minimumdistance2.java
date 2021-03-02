import java.util.*;
public class arrayminimumdistance{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr;                     //array declaration
        int n = sc.nextInt();
        System.out.println();
        arr = new int[n];
        for(int i = 0;i < n;i++){      //array initialization
       	arr[i] = sc.nextInt();      
       }
       System.out.println();
       int x = sc.nextInt();
       int y = sc.nextInt();
       System.out.println();
       int a = minimumdistance(arr,n,x,y);
       System.out.println(a);
    }
    public static int minimumdistance(int[] arr,int n,int x,int y){
    	int minimumdistance1 = 0;
    	int index_of_x = -1;
    	int index_of_y = -1;
    	for(int j = 0;j < n;j++){
    		if(arr[j] == x && index_of_x == -1)
    			index_of_x = j;
    		if(arr[j] == y && index_of_y == -1)
    			index_of_y = j;
    		
    		}
    		if((index_of_x == -1 && index_of_y == -1) || (index_of_x == -1) || (index_of_y == -1))  
               return -1;
            else   
    	        minimumdistance1 = index_of_y - index_of_x;
    	        return minimumdistance1;

    }
}       
