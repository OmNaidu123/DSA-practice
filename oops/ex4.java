//inheritance and single level inheritance
import java.util.*;
/**
 * Write a description of ex4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Shape{
    String colour;
}
class Triangle extends Shape{//triangle class takes the properties of Shape class too, i.e. the triangle has the colour string colour too
 String area;
 public void info(){
    System.out.println(this.colour);
    System.out.println(this.area);
 }
}
public class ex4 {
 public static void main(String[] Args){
     Triangle t1 = new Triangle();
     t1.colour = "red";
     t1.area = "100 m^2";
     t1.info();
 }
}
//output:
//red
//100 m^2
