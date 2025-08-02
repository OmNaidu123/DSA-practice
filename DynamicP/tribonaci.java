import java.util.*;
/**
 * Write a description of tribonaci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tribonaci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the index: ");
        int n = sc.nextInt();
        HashMap<Integer, Integer> memo = new HashMap<>();
        int sol = trib(n,memo);
        System.out.println("value of the given tribanoci index: "+sol);
    }
    static int trib(int n, HashMap<Integer, Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n==0 ||  n==1) return 0;
        if(n==2) return 1;
        int sol = trib(n-1,memo) + trib(n-2, memo) + trib(n-3, memo);
        memo.put(n,sol);
        return sol;
    }
}
