//print numbers from 5 to 1
/**
 * Write a description of q1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q1 {
    public static void main(String[] Args){
     int n = 5;
     printnum(n);
    }
    public static void printnum(int n){
     System.out.println(n);
     if(n==0)
     return;
     printnum(n-1);
    }
}
