import java.util.*;
//stacks using linked list
/**
 * Write a description of SLL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SLL {
 public static node head;
 static class node{
     int data;
     node next;
     node(int data){
         this.data=data;
         this.next=null;
     }
 }
 static class Stack{
     public static boolean isEmpty(){
         return head==null;
     }
     public static void push(int data){
         node newnode = new node(data);
         if(isEmpty()==true){
             head = newnode;
         }
         else{
             newnode.next = head;
             head = newnode;
            }
     }
     public static void display(){ // this is not a proper stack function, u should not be able a access the stack other than head(top) , just for understanding purpose i wrote this code
         node temp = head;
         while(temp!=null){
             System.out.print(temp.data + "->");
             temp=temp.next;
         }
     }
     public static int pop(){
         if(isEmpty())
          return -1;
         int val = head.data;
         head=head.next;
         return val;
     }
     public static int peek(){
         if(isEmpty())
          return -1;
         int val = head.data;
         return val;
     }
 }
 public static void main(String[] Args){
     System.out.println("Bravo, wanna push shit into this stack??: ");
     Scanner sc = new Scanner(System.in);
     int choice = sc.nextInt();
     while(choice==1){
          System.out.print("enter data: ");
          int data = sc.nextInt();
          Stack.push(data);
          System.out.print("Countinue?: ");
          choice = sc.nextInt();
     }
     System.out.println("Yooo nuckle head!! wanna display the stack??: ");
     choice = sc.nextInt();
     if(choice==1){ // this is not a proper stack function, u should not be able a access the stack other than head(top) , just for understanding purpose i wrote this code
          Stack.display();
     }
     System.out.println("Yooo nuckle head!! wanna pop??: ");
     choice = sc.nextInt();
     if(choice==1){
          int val = Stack.pop();
          System.out.println("popped value: " + val);
     }
     System.out.println("Yooo nuckle head!! wanna peek??: ");
     choice = sc.nextInt();
     if(choice==1){
          int val = Stack.peek();
          System.out.println("top value: " + val);
     }
 }
}
