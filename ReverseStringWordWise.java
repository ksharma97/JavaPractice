import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
          String rev ="";
          String arr[] = input.split(" ");
          for(int i= arr.length-1;i>=0;i--)
              rev+=arr[i]+" ";
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
