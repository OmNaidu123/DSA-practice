import java.util.*;
//code for taking input in a loop
/**
 * Write a description of LL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LL {
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
 public static void main(String[] Args){
     LL list = new LL();
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
 }
}
