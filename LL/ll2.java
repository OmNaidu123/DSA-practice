import java.util.*;
//linked list using framework collections
/**
 * Write a description of ll2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ll2 {
 public static void main(String[] Args){
  LinkedList<String> list = new LinkedList<String>();
  list.addFirst("hi");
  list.add("bro");
  list.addFirst("hello");
  list.addLast("how are you?");
  list.add("fuck");
  list.removeLast();
  list.addFirst("aughhhh");
  list.removeFirst();
  System.out.println(list);
  System.out.println("count: " + list.size());
  System.out.println("another way to print ll: ");
  for(int i = 0; i<list.size(); i++){
      System.out.println(list.get(i) + " -> ");
  }
 }
}