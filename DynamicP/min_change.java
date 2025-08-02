import java.util.*;
/**
 * Write a description of min_change here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class min_change {
    public static void main(String[] args){
        int amount = 6;
        int[] coins ={1,2,3};
        HashMap<Integer, Integer> memo = new HashMap<>();
        int minimum = dfs(amount,coins,0,memo);
        System.out.println(minimum);
    }
    static int dfs(int amount, int[] coins, int sum, HashMap<Integer, Integer> memo){
        if(memo.containsKey(sum)) return memo.get(sum);
        if(sum==amount){
            memo.put(sum,0);
            return 0;
        }
        if(sum>amount) return -1;
        int x = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++){
            int sol = dfs(amount,coins,sum+coins[i],memo);
            if(sol!=-1){
                x = Math.min(x,sol);
            }
        }
        if(x==Integer.MAX_VALUE){
            memo.put(sum,-1);
            return -1;
        } 
        memo.put(sum,x+1);
        return x+1;
    }
}
