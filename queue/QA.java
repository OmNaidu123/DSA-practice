import java.util.*;
//queue using array
/**
 * Write a description of QA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QA {
 class queue{
     int arr[];
     int size;
     int rear = -1;
     queue(int n){
         this.size = n;
         arr = new int[size];
     }
     public boolean isEmpty(){
         return rear==-1;
     }
     public void add(int a){//enqueue
         if(rear==size-1){
             System.out.println("full bruh");
             return;
         }
         rear++;
         arr[rear]=a;
     }
     public int remove(){//dequeue
         if(isEmpty()){
             System.out.println("nothing to remove");
             return -1;
         }
         int a = arr[0];
         for(int i = 0; i<rear; i++){
             arr[i]=arr[i+1];
         }
         rear--;
         return a;
     }
     public int peek(){
        if(isEmpty()){
             System.out.println("nothing to remove");
             return -1;
         }
         int a = arr[0];
         return a; 
     }
 }
 public void main(String[] Args){
     queue s = new queue(5);
     s.add(1);
     s.add(2);
     s.add(3);
     while(s.isEmpty()!=true){
         System.out.print(s.peek() + "->");
         s.remove();
     }
 }
}
