import java.util.*;
//check if a linked list is a palindrome
/**
 * Write a description of ex3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex3 {
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
 public void displayer(){
     node currnode = head;
     while(currnode!=null){
         System.out.print(currnode.data + " -> ");
         currnode=currnode.next;
     }
     System.out.print("\n");
 }
 public void checker(){
     int count = 0;
     int track = 1;
     int n = 0;
     node temp = head;
     while(temp!=null){
         temp=temp.next;
         count++;
     }
     temp = head;
     node tail = head;
     while(temp!=null){
         int d1 = temp.data;
         for(int i = 1; i<count-track+1; i++){
             tail=tail.next;
         }
         int d2 = tail.data;
         if(d1!=d2)
          n++;
         temp=temp.next;
         tail=head;
         track++;
     }
     if(n==0)
      System.out.println("it is a palindrome");
     else
      System.out.println("it is not a palindrome");
 }
 public static void main(String[] Args){
     ex3 list = new ex3();
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
     System.out.print("check for palindrome?: ");
     choice = sc.nextInt();
     if(choice==1){
         list.checker();
     }
 }
}
