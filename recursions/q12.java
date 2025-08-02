//print keypad combinations
import java.util.*;
/**
 * Write a description of q12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q12 {
 public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter combination: ");
     String comb = sc.nextLine();
     printComb(comb,0,"");
 }
 public static void printComb(String comb, int idx, String newStr){
     if(idx==comb.length()){
         System.out.println(newStr);
         return;
     }
     char currChar = comb.charAt(idx);
     String mapping = keypad[currChar-'0'];
     for(int i = 0; i<mapping.length(); i++){
         printComb(comb,idx+1,newStr+mapping.charAt(i));
     }
 }
}
