import java.util.*;
//create a queue using 2 stacks
/**
 * Write a description of Q1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q1 {

 class stack1{
     int data;
     stack1 next;
     stack1(int data){
         this.data=data;
         this.next=null;
     }
 }
 stack1 head=null;
 public boolean isEmpty(){
     return head==null;
 }
 public void add(int data){
     stack1 newnode = new stack1(data);
     if(isEmpty()){
         head = newnode;
         return;
     }
     newnode.next=head;
     head=newnode;
 }
 public int pop(){
     if(isEmpty()){
         System.out.println("nothing to remove");
         return -1;
     }
     int val = head.data;
     head = head.next;
     return val;
 }
 public int peak(){
     if(isEmpty()){
         System.out.println("nothing to see");
         return -1;
     }
     int val = head.data;
     return val;
 }
 class stack2{
     int data;
     stack2 next;
     stack2(int data){
         this.data=data;
         this.next=null;
     }
 }
 stack2 head2=null;
 public boolean isEmpty2(){
     return head2==null;
 }
 public void add2(int data){
     stack2 newnode = new stack2(data);
     if(isEmpty2()){
         head2 = newnode;
         return;
     }
     newnode.next=head2;
     head2=newnode;
 }
 public int pop2(){
     if(isEmpty2()){
         System.out.println("nothing to remove");
         return -1;
     }
     int val = head2.data;
     head2 = head2.next;
     return val;
 }
 public int peak2(){
     if(isEmpty2()){
         System.out.println("nothing to see");
         return -1;
     }
     int val = head2.data;
     return val;
 }
 public void qadder(int data){ // in this function the 2 stacks are used to create a queue
 if(isEmpty()){ //when the base case is reached the given value is pushed in the first stack
     add(data);
     return;
 }
 int val = pop(); //values from the first stack are added to the second stack
 add2(val);
 qadder(data);
 int pal = pop2(); //after the given value is pushed in the first stack, the stored values from the second stack is inserted back into the original stack
 add(pal); 
 }
 public void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.print("wanna add?:");
     int choice = sc.nextInt();
     while(choice==1){
         System.out.print("enter data: ");
         int data = sc.nextInt();
         qadder(data);
         System.out.print("countinue?: ");
         choice = sc.nextInt();
     }
     while(isEmpty()!=true){
         System.out.print(peak() + " -> ");
         pop();
     }
     System.out.println();
 }
}
