//polymorphism
import java.util.*;
/**
 * Write a description of ex3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Pen{
    String type;
    String colour;
    public void write(){
    System.out.println("DETAILS OF PEN :");
    }
    public void details(){
    System.out.println(this.colour);
    System.out.println(this.type);
    }
    public void printInfo(String type){ //--->(1)
     System.out.println(type);
    }
    public void printInfo(String type, String colour){ //----->(2)
     System.out.println(type);
     System.out.println(colour);
    }
    // (1) and (2) are examples of function with same nam
}
public class ex3 {
 public static void main(String[] Args){
     Pen pen1 = new Pen();
     pen1.type = "ball-point";
     pen1.colour = "black";
     pen1.printInfo(pen1.type);
     pen1.printInfo(pen1.type, pen1.colour);
 }
}
