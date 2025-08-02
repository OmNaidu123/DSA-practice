import java.util.*;
//circular queue using array
/**
 * Write a description of QA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CQA {
  class queue{
     int arr[];
     int size;
     int rear = -1;
     int front = -1;
     queue(int n){
         this.size = n;
         arr = new int[size];
     }
     public boolean isEmpty(){
         return rear==-1 && front==-1;
     }
     public boolean isFull(){
         return (rear+1)%size == front;
     }
     public void add(int a){//enqueue
         if(isFull()){
             System.out.println("full bruh");
             return;
         }
         //adding first element in array
         if(rear==front){
             front=0;
         }
         rear = (rear+1)%size;
         arr[rear]=a;
     }
     public int remove(){//dequeue
         if(isEmpty()){
             System.out.println("nothing to remove");
             return -1;
         }
         int a = arr[front];
         if(rear==front){
             rear=front=-1;
         }
         else{
         front = (front+1)%size;
        }
         return a;
     }
     public int peek(){
         int a = arr[front];
         return a; 
     }
 }
 public void main(String[] Args){
     queue s = new queue(5);
     s.add(1);
     s.add(2);
     s.add(3);
     s.add(4);
     s.add(5);
     while(s.isEmpty()!=true){
         System.out.print(s.peek() + "->");
         s.remove();
     }
 }
}