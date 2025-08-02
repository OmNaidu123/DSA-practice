import java.util.*;
/**
 * Write a description of singlyL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//addFirst
//addLast
//printList
//over
//delfirst
//dellast
public class singlyL {
 node head;
 class node{
    String data;
    node next;
    node(String data){
        this.data = data;
        this.next = null;
    }
 }
 public void addFirst(String data){
     node newnode = new node(data);
     if(head==null){
         head = newnode;
         return;
     }
     newnode.next = head;
     head = newnode;
 }
 public void addLast(String data){
     node newnode = new node(data);
     node currnode = head;
     if(head==null){
         head = newnode;
         return;
     }
     while(currnode.next!=null){
         currnode = currnode.next;
     }
     currnode.next = newnode;
 }
 public void printList(){
     node currnode = head;
     while(currnode!=null){
         System.out.print(currnode.data + " -> ");
         currnode=currnode.next;
     }
 }
 public void delfirst(){
     if(head==null){
         return;
     }
     head = head.next;
 }
 public void dellast(){
     if(head == null){
         return;
     }
     if(head.next == null){
         return;
     }
     node lastnode = head.next;
     node secLast = head;
     while(lastnode.next!=null){
         lastnode = lastnode.next;
         secLast = secLast.next;
     }
     secLast.next = null;
 }
 public void over(){
     head = null;
 }
 public static void main(String[] Args){
     singlyL list = new singlyL();
     list.addFirst("hi");
     list.addFirst("bro");
     list.addLast("hello");
     list.delfirst();
     list.dellast();
     list.printList();
     list.over();
 }
}
