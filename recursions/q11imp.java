//print unique occurences of sub-sequences of a string
import java.util.*;
/**
 * Write a description of q11imp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q11imp {
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter string: ");
     String s = sc.nextLine();
     HashSet<String> set = new HashSet<>();
     seq(s,0,"",set);
 }
 public static void seq(String s, int i, String newStr,HashSet<String> set){
     if(i==s.length()){
         if(set.contains(newStr)){
             return;
        }
         else{
         System.out.println(newStr);
         set.add(newStr);
         return;
        }
     }
     char a = s.charAt(i);
     //to be
     seq(s,i+1,newStr+a,set);
     //not to be
     seq(s,i+1,newStr,set);
 }
}
