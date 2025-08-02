import java.util.*;
//reverse a stack
/**
 * Write a description of ex1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex2 {
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
 public static void bottom(int n){
     if(Stack.isEmpty()==true){
         Stack.push(n);
         return;
     }
     int a = Stack.pop();
     bottom(n);
     Stack.push(a);
 }
 public static void reverse(){
     if(Stack.isEmpty()==true){
         return;
     }
     int a = Stack.pop();
     reverse();
     bottom(a);
 }
 public static void main(String[] Args){
     System.out.print("YOOOOOOO BRAVO!!! wanna push this shit??: ");
     Scanner sc = new Scanner(System.in);
     int choice = sc.nextInt();
     while(choice==1){
         System.out.print("enter data: ");
         int data = sc.nextInt();
         Stack.push(data);
         System.out.print("countinue: ");
         choice = sc.nextInt();
     }
     System.out.print("YOOOOOOO BRAVO!!! wanna reverse this shit???: ");
     choice = sc.nextInt();
     if(choice==1){
         reverse();
     }
     System.out.print("YOOOOOOO BRAVO!!! display shit???: ");
     choice = sc.nextInt();
     if(choice==1){ // this is not a proper stack function, u should not be able a access the stack other than head(top) , just for understanding purpose i wrote this code
         Stack.display();
     }
 }
}
