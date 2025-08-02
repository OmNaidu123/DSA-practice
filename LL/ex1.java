/** Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index. */
import java.util.*;
/**
 * Write a description of ex1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex1 {
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
     int count = 0;
     while(currnode!=null){
         if(currnode.data.equals("7")){
             System.out.println("7 found at index:" + count);
         }
         currnode=currnode.next;
         count++;
     }
 }
 public static void main(String[] Args){
     ex1 list = new ex1();
     Scanner sc = new Scanner(System.in);
     System.out.print("create linked list?: ");
     int choice = sc.nextInt();
     if(choice==1){
         list.creater();
     }
     System.out.print("find 7?: ");
     choice = sc.nextInt();
     if(choice==1){
         list.displayer();
     }
 }
}
