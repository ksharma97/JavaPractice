import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(isPresent(arr,key));
	}
    
    public static int isPresent(int[] arr,int key){
           for(int j=0;j<arr.length;j++){
            if(arr[j] == key)
                return j;
        }
        return -1;
    }
}
