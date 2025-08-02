//print all permutations of a string
import java.util.*;
/**
 * Write a description of q13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q13 {
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter string: ");
     String s = sc.nextLine();
     permu(s,"",s.length());
 }
 public static void permu(String s,String perumation,int n){
     if(perumation.length()==n){
         System.out.println(perumation);
         return;
     }
     for(int i = 0; i < s.length(); i++){ //suppose s="abc',i=0
         char currChar = s.charAt(i); //currChar = a
         String newStr=s.substring(0,i)+s.substring(i+1); //"abc" -> "bc"
         permu(newStr,perumation+currChar,n); //perumation = "" + a = "a"
     }
 }
}
