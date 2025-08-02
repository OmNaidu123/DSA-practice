import java.util.HashSet;
import java.util.Iterator;
/**
 * Write a description of basics here.
 * BASIC OPERATIONS OF HASH
 * @author (your name) 
 * @version (a version number or a date)
 */
public class basics {
    public static void main(String[] Args){
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); //won't add one again since one already exists in the set
        if(set.contains(1)){ // checking if a set contains any value
            System.out.println("it contains 1"); 
        }
        set.remove(4); //removing a value from set
        System.out.println("size of set is: " + set.size()); // printing the number of elements in a set
        System.out.print("the elements are: "); 
        System.out.println(set); // printing elements of a set
        //using iterator
        System.out.println("printing hashset using iterator: ");
        Iterator it = set.iterator();
        while(it.hasNext()){ //returns true if next value is present and false otherwise
            System.out.println(it.next()); //points to the next value in the set
        }
    }
}
