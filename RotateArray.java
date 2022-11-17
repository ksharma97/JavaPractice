import java.util.* ;
import java.io.*; 
class RotateArray {
	
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=m; i<n;i++)
            System.out.print(arr[i]+" ");
        for(int j=0;j<m;j++)
            System.out.print(arr[j]+" ");
		
	}
}
