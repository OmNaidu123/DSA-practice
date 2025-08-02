import java.util.*;
/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test {
 static class cell{
     int i;
    int j;
    cell(int i, int j){
        this.i = i;
        this.j = j;
    }
 }
 public static void main(String[] Args){
     Queue<cell> q = new LinkedList<cell>();
     q.add(new cell(2,3));
     System.out.println(q.peek().j);
 }
}
