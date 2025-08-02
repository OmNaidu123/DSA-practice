import java.util.*;
/**
 * Write a description of fibanoci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fibanoci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter which fibannoci number you want: ");
        int n = sc.nextInt();
        HashMap<Integer, Integer> memo = new HashMap<>();
        int sol = fib(n,memo);
        System.out.println("the fibannoci number at the specified index is: "+sol);
    }
    static int fib(int n, HashMap<Integer, Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n==1) return 1;
        if(n==0) return 0;
        int sol = fib(n-1,memo)+fib(n-2,memo);
        memo.put(n,sol);
        return sol;
    }
}
