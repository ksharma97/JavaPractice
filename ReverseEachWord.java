import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String reverseEachWord(String input)
    {
        String rev="";
        String arr[] = input.split(" ");
        for(int i=0; i<arr.length;i++){
           StringBuffer sbr = new StringBuffer(arr[i]);
           rev+=sbr.reverse()+" ";
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
