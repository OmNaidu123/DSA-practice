import java.util.*;
//stack using arraylist
/**
 * Write a description of SAL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SAL {
 static class Stack{
     static ArrayList<Integer> list = new ArrayList<>();
     public static boolean isEmpty(){
         int a = list.size();
         if(a<=0){
             return true;
         }
         return false;
     }
     public static void push(int data){
         list.add(data);
     }
     public static int pop(){
         if(isEmpty()){
             return -1;
         }
         int top = list.get(list.size()-1);
         list.remove(list.size()-1);
         return top;
     }
     public static int peek(){
         if(isEmpty()){
             return -1;
         }
         int top = list.get(list.size()-1);
         return top;
     }
 }
 public static void main(String[] Args){
     Stack s = new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     while(s.isEmpty()==false){
         System.out.print(s.peek() + " ");
         s.pop();
     }
 }
}
