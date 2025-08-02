import java.util.*;
//creation and methods on tries
/**
 * Write a description of basics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class basics {
    //do tries later
 static class node{
     node[] children = new node[26]; //26 size
     boolean eow;
     node(){
         for(int i = 0; i < 26; i++){
             children[i] = null;
         }
         eow = false;
     }
 }
 static node root = new node();
 public static void creator(String word){
     for(int i = 0; i < word.length(); i++){
         int idx = word.charAt(i) - 'a';
         if(root.children[idx] == null){
             root.children[idx] = new node();
         }
         if(i == word.length()-1){
             root.eow = true;
         }
         root = root.children[idx];
     }
 }
 public static void main(String Args[]){
     String[] arr = {"the","there","their","a","any"};
     for(int i = 0; i < arr.length; i++){
         creator(arr[i]);
     }
 }
}
