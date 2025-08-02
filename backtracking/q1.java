//print perutations of a string
import java.util.*;
/**
 * Write a description of q1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q1 {
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter string: ");
     String s = sc.nextLine();
     permut(s,"");
 }
 public static void permut(String s, String newStr){
     if(s.equals("")){
         System.out.println(newStr);
         return;
     }
     for(int i = 0; i < s.length(); i++){
         char a = s.charAt(i);
         String S = s.substring(0,i)+s.substring(i+1);
         String ns =newStr+a;
         permut(S,ns);
     }
 }
}
//O(n*n!)