import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++)
            arr[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(isPresent(arr,key));
	}
    
    public static int isPresent(int[] arr,int key){
        int c=-1;
        for(int j=0; j<arr.length;j++){
            if(arr[j] == key)
                c = j;
        }
        if(c==-1)
            return c;
        else
            return c;
    }
}
