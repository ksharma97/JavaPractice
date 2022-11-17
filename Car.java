/* Design a class Car having parameterized constructor that takes two arguments as an input i.e noOfGear and color 
 * and a printCarInfo method that prints the CarInfo i.e noOfGear and color. Design another class RaceCar having 
 * parameterized constructor has an additional attribute maxSpeed and printRaceCarInfo method that prints the RaceCarInfo i.e 
 * noOfGear, color and maxSpeed. Note: You have to create an object of class RaceCar and call the printRaceCarInfo method.
 */
import java.util.* ;
import java.io.*; 
import java.io.*;
import java.util.*;

class Car {
    int noOfGear;
    String color;
    Car(int n, String c){
        noOfGear =n;
        color = c;
    }
    public void printInfo(){
        System.out.println("noOfGear: "+noOfGear+"\ncolor: "+color);
    }
}

class RaceCar extends Car {
    int maxSpeed;
    RaceCar(int n, String c, int s){
        super(n,c);
        maxSpeed = s;
    }
     public void printInfo(){
        System.out.println("noOfGear: "+noOfGear+"\ncolor: "+color+"\nmaxSpeed: "+maxSpeed);
     }
    
}

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int noOfGear = sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printInfo();
    }
}
