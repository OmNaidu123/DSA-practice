import java.util.*;
/**
 * Write a description of sum_possible here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sum_possible {
    public static void main(String[] args){
        int amount = 5;
        int[] numbers = {1,2,3};
        HashMap<Integer, Boolean> memo1 = new HashMap<>();
        boolean found = checker(amount,numbers,0,memo1);
        System.out.println(found);
        int amount2 = 15;
        int[] numbers2 = {6,4,10};
        HashMap<Integer, Boolean> memo2 = new HashMap<>();
        boolean found2 = checker(amount2,numbers2,0,memo2);
        System.out.println(found2);
    }
    static boolean checker(int amount, int[] numbers, int val, HashMap<Integer, Boolean> memo){
        if(memo.containsKey(val)) return memo.get(val);
        if(val>amount) return false;
        if(val==amount) return true;
        for(int i = 0; i < numbers.length; i++){
            int temp_val = val+numbers[i];
            boolean found = checker(amount,numbers,temp_val,memo);
            memo.put(temp_val, found);
            if(found) return true;
        }
        return false;
    }
}
