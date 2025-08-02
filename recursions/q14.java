//count total paths in a maze from (0,0) to (n,m)
import java.util.*;
/**
 * Write a description of q14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q14 {
 public static int count = 0;
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter n value: ");
     int n = sc.nextInt();
     System.out.print("enter m value: ");
     int m = sc.nextInt();
     maze(n,m,1,1);
     System.out.println("total paths: " + count);
 }
 public static void maze(int n, int m, int i, int j){
     if(i==n && j==m){
         count++;
         return;
     }
     if(i<=n && j<=m){
         maze(n,m,i+1,j);
         maze(n,m,i,j+1);
     }
 }
}
