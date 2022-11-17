import java.util.* ;
import java.io.*; 

class GrandFather{
    String grandFatherName;
    GrandFather(String grandFatherName){
        this.grandFatherName = grandFatherName;
    }
}

class Father extends GrandFather{
   String fatherName;
    Father(String fatherName, String grandFatherName){
        super(grandFatherName);
        this.fatherName = fatherName;
    }
}

class Son extends Father{
    String sonName;
    Son(String sN, String fN, String gFN){
        super(fN,gFN);
        sonName = sN;
    }
    
    public void printName(){
        System.out.println("sonname:  "+sonName+"\nfathername:  "+fatherName+"\ngrandfather:  "+grandFatherName);
    }
}

class Solution {
	
	public static void main(String args[]) {
		Son s = new Son("Saurabh","Ramesh","Suresh");
        s.printName();
	}
}
