import java.util.*;
/**
 * Write a description of binaryS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class binaryS {
 public static void main(String[] Args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of elements");
     int num = sc.nextInt();
     int list[] = new int[num];
     for(int i = 0; i<num; i++){
      list[i] = sc.nextInt();
     }
     System.out.println("Enter key");
     int key = sc.nextInt();
     int start = 0;
     int end = num;
     bin(list,start,end,key);
 }
 public static void bin(int list[],int start,int end,int key){
     int mid = (start+end)/2;
     while(start<=end){
         if(list[mid] > key){
             end = mid - 1;
            }
         else if(list[mid] == key){
             System.out.println("found key at index: "+mid);
             break;
         }
         else if(list[mid] < key){
             start = mid + 1;
         }
         mid = (start+end)/2;
     }
     if(start>end){
         System.out.println("element not found");
     }
 }
}
