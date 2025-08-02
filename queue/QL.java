import java.util.*;
//queue using java
/**
 * Write a description of QL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class QL {
     class node{
      int data;
      node next;
      node(int data){
        this.data = data;
        this.next = null;
      }
    }
    node head = null;
    node tail = null;
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void add(int data){
     node newnode = new node(data);
     if(isEmpty()){
         head=tail=newnode;
         return;
     }
     tail.next=newnode;
     tail=newnode;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("nothing to remove");
            return -1;
        }
        if(head == tail){
            head = tail = null;
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("nothing to remove");
            return -1;
        }
        int value = head.data;
        return value;
    }
    public static void main(String[] Args){
        QL que = new QL();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.remove();
        while(que.isEmpty()!=true){
            System.out.print(que.peek() + " -> ");
            que.remove();
        }
        System.out.println();
    }
   }
