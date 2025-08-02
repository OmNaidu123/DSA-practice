//print sub sequences of a charecter
import java.util.*;
/**
 * Write a description of q10imp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q10imp {
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter string: ");
     String s = sc.nextLine();
     seq(s,0,"");
 }
 public static void seq(String s, int i, String newStr){
     if(i==s.length()){
         System.out.println(newStr);
         return;
     }
     char a = s.charAt(i);
     //to be
     seq(s,i+1,newStr+a);
     //not to be
     seq(s,i+1,newStr);
 }
}
