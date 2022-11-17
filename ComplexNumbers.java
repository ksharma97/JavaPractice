import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class ComplexNumbers {
	protected int r,i;
	public ComplexNumbers(int r, int i){
        this.r =r;
        this.i =i;
    }
    
    public void plus(ComplexNumbers b){
        r = r+b.r;
        i = i+b.i;
    }
    
    public void multiply(ComplexNumbers b){ 
        int t = r*b.r - i*b.i;
        int s = r*b.i + i*b.r;
        r=t;
        i=s;
    }
    public void print(){
        System.out.println(r+" + i"+i);
    }
}

class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
        int i1 = sc.nextInt();
	    int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        int ch = sc.nextInt();
        ComplexNumbers a = new ComplexNumbers(r1,i1);
        ComplexNumbers b = new ComplexNumbers(r2,i2);
        if(ch==1)
            a.plus(b);
        else if(ch==2)
            a.multiply(b);
        else
            System.exit(0);
        a.print();
	}
}
		
