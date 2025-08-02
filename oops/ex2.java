//parameterized, non-parameterized and copy constructors
import java.util.*;
/**
 * Write a description of ex2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    Kid(){ // non-parameterized constructor function
        System.out.println("Constructor accessed");
    }
}
class Pen{
    String type; //-->(1)
    String colour;
    public void write(){
    System.out.println("DETAILS OF PEN :");
    }
    public void details(){
    System.out.println(this.colour);
    System.out.println(this.type);
    }
    Pen(String type , String colour){ //-->(2) // parameterized constructor function
        this.type = type; //this.type indicates (1), while the 'type' after '=' indicates (2)
        this.colour = colour;
    }
    Pen(Pen p){ // copy constructor function
     this.type = p.type;
     this.colour = p.colour;
    }
}
public class ex2 {
 public static void main(String[] Args){
     System.out.println("non-parameterized constructor:");
     Kid k1 = new Kid();//non-parameterized constructor
     System.out.println("parameterized constructor:");
     Pen p1 = new Pen("ball-point","black");//parameterized constructor
     p1.details();
     System.out.println("copy constructor:");
     Pen p2 = new Pen(p1);//copy constructor
     p2.details();
 }
}
