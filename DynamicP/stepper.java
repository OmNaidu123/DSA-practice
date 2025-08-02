import java.util.*;
/**
 * Write a description of stepper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stepper {
    public static void main(String[] args){
        List<Integer> list = List.of(2,4,2,0,0,1);
        System.out.println(dfs(list,0));
    }
    static boolean dfs(List<Integer> nums, int currIdx){
    if(currIdx == nums.size()-1) return true;
    if(currIdx >= nums.size()) return false;
    int steps = 0;
    while(steps<nums.get(currIdx)){
      if(dfs(nums,currIdx+steps+1)) return true;
      steps++;
    }
    return false;
  }
}
