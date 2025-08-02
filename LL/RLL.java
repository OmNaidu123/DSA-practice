import java.util.*;
//reversing a linked list
/**
 * Write a description of RLL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RLL {
node head;
 class node{
     String data;
     node next;
     node(String data){
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
         node newnode = new node(sc.nextLine());
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
         sc.nextLine();
     }
 }
 public void displayer(){
     node currnode = head;
     while(currnode!=null){
         System.out.print(currnode.data + " -> ");
         currnode=currnode.next;
     }
 }
 public void Rdisplayer(){
     node currnode = head;
     while(currnode!=null){
         System.out.print(currnode.data + " -> ");
         currnode=currnode.next;
     }
 }
 public void reverser(){ //using loops
     if( head == null || head.next == null){
         return;
     }
     node prevnode = head;
     node currnode = prevnode.next;
     while(currnode!=null){
         node nextnode = currnode.next;
         currnode.next = prevnode;
         prevnode = currnode;
         currnode = nextnode;
     }
     head.next = null;
     head = prevnode;
 }
 public node Rreverser(node head){ //using recursions (bruh, wtf?)
     if( head == null || head.next == null){
         return head;
     }
     node newhead = Rreverser(head.next);
     head.next.next = head;
     head.next = null;
     return newhead;
 }
 public static void main(String[] Args){
     RLL list = new RLL();
     Scanner sc = new Scanner(System.in);
     System.out.print("create linked list?: ");
     int choice = sc.nextInt();
     if(choice==1){
         list.creater();
     }
     System.out.print("display linked list?: ");
     choice = sc.nextInt();
     if(choice==1){
         list.displayer();
     }
     System.out.print("reverse linked list using loops?: ");
     choice = sc.nextInt();
     if(choice==1){
         list.reverser();
         list.displayer();
     }
     System.out.print("reverse linked list using recursions?: ");
     choice = sc.nextInt();
     if(choice==1){
        list.head = list.Rreverser(list.head);
         list.Rdisplayer();
     }
 }
}
