import java.util.*;

/**
 * Write a description of basicsM here.
 * BASIC SYNTAXS OF HASHMAPS IN JAVA 
 * @author (your name)
 * @version (a version number or a date)
 */
public class basicsM {
 public static void main(String[] Args){
     HashMap<String,Integer> map = new HashMap<>();
     map.put("China",150);
     map.put("India",120);
     map.put("US", 30);
     if(map.containsKey("China")){
         System.out.println("hashmap has china");
     }
     System.out.println("population of china is " + map.get("China"));
     System.out.println("printing hashmap: " + map);
     for(Map.Entry<String, Integer> e : map.entrySet()){
         System.out.print(e.getKey() + " ");
         System.out.println(e.getValue());
     }
     Set<String> s = map.keySet();
     for(String key : s){
         System.out.println(key + " " + map.get(key));
     }
     map.remove("China");
     System.out.println("printing hashmap: " + map);
     
 }
}
