/* You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number using matrix exponentiation.
 * Since the answer can be very large, return the answer modulo 10^9 +7.
 */
 



import java.util.* ;
import java.io.*; 
import java.math.BigInteger;

public class NthFibonacciNumber{
    public static int fibonacciNumber(int n){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        BigInteger r = BigInteger.valueOf(1000000007);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }
        BigInteger res = b.mod(r);
        return res.intValue();
        
  
      
    }
}
