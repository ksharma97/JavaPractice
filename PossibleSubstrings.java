import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static void printSubstrings(String input) {
        for(int k=0;k<input.length();k++)
            for(int i=k;i<input.length();i++){
                for(int j=k;j<=i;j++)
                    System.out.print(input.charAt(j));
                System.out.println();
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
