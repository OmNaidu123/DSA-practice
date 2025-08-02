/*Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.*/
import java.util.*;
/**
 * Write a description of ex2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex2 {
node head;
 class node{
     int data;
     node next;
     node(int data){
         this.data = data;
         this.next = null;
     }
 }
 public void creater(){
     Scanner sc = new Scanner(System.in);
     int c = 1;
     node temp = null;
     while(c==1){
         System.out.print("enter data: ");
         node newnode = new node(sc.nextInt());
         if(head==null){
             head=temp=newnode;
         }
         else{
             temp.next = newnode;
             temp = newnode;
             newnode = null;
         }
         System.out.print("countinue?: ");
         c = sc.nextInt();
     }
 }
 public void destroyer(){
     if(head == null){
         System.out.println("no list");
         return;
     }
     node snode = head;
     if(snode.next==null){
         if(snode.data > 25){
             head = null;
         }
         return;
     }
     node fnode = snode.next;
     node tnode = fnode.next;
     while(tnode!=null){
         if(fnode.data >25){
             snode.next = fnode.next;          
             fnode = fnode.next;
             tnode = tnode.next;
         }
         else{
             tnode = tnode.next;
             fnode = fnode.next;
             snode = snode.next;
         }
     }
     if(fnode.data > 25){
         snode.next = null;
     }
     if(head.data > 25){
         head = head.next;
     }
 }
 public void displayer(){
     node currnode = head;
     while(currnode!=null){
         System.out.print(currnode.data + " -> ");
         currnode=currnode.next;
     }
 }
 public static void main(String[] Args){
     ex2 list = new ex2();
     Scanner sc = new Scanner(System.in);
     System.out.print("create linked list?: ");
     int choice = sc.nextInt();
     if(choice==1){
         list.creater();
     }
     System.out.print("destroy 25s?: ");
     choice = sc.nextInt();
     if(choice==1){
         list.destroyer();
     }
     System.out.print("display linked list?: ");
     choice = sc.nextInt();
     if(choice==1){
         list.displayer();
     }
 }
}
