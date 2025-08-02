import java.util.*;
/**
 * Write a description of ex1 here.
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
}
class Kid{
    String name;
    String age;
    String sex;
    public void details(){
        System.out.println("DETAILS OF KID");
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("sex: "+this.sex);
    }
}
public class ex1 {
 public static void main(String[] Args){
     //types of pens
     Pen pen1 = new Pen();
     pen1.type="Ball-point";
     pen1.colour="Blue";
     pen1.write();
     pen1.details();
     Pen pen2 = new Pen();
     pen2.type="Gel";
     pen2.colour="Green";
     pen2.write();
     pen2.details();
     //details of a kid
     Kid kid1 = new Kid();
     kid1.name="Om anna";
     kid1.age="18";
     kid1.sex="male";
     kid1.details();
 }
}
