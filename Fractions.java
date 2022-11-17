import java.util.* ;
import java.io.*; 

class Fraction {

	int Numerator, Denominator;
    
    public Fraction(int n, int d){
        Numerator = n;
        Denominator = d;
    }
    
    public void add(Fraction b){
        int tempn = Numerator * b.Denominator+Denominator * b.Numerator;
        int tempd = Denominator * b.Denominator;
        Numerator = tempn;
        Denominator = tempd;
    }
    
    public void multiply(Fraction b){
        Numerator = Numerator * b.Numerator;
        Denominator = Denominator * b.Denominator;
    }
    public void simplify(){
        int a = Numerator;
        int b = Denominator;
        int R;

        while ((a % b) > 0)  {
            R = a % b;
            a = b;
            b = R;
        }
        Numerator /= b;
        Denominator /= b;
    }
    public void print(){
        System.out.println(Numerator+"/"+Denominator);
    }
    

}

class Solution {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int N = sc.nextInt();
        Fraction a = new Fraction(n,d);
        for(int i=0;i<N;i++){
            int t = sc.nextInt();
            int n2 = sc.nextInt();
            int d2 = sc.nextInt();
            Fraction b = new Fraction(n2,d2);
            if(t == 1){
              a.add(b);
              a.simplify();
              a.print();
            }else{
              a.multiply(b);
              a.simplify();
              a.print(); 
            }
        }     
	}
}
