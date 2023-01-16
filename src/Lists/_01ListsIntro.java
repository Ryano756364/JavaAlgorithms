package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _01ListsIntro {
    // ArrayList
        // Go to class when it comes to storing a collection of objects you want to iterate over sequentially
        // Good for random access, if you have the index
        // Not good for inserting unless its at the ends, deleting, or removals
    // LinkedList
    // Vector

    // Abstract data type
        // Doesn't dictate how data is organized (unlike arrays)
        // Lists dictate the operations you can perform
        // Abstract data type is usually an interface


    public static void main(String[] args) {

        List<String> groceryList = new ArrayList<>();

        groceryList.add("Milk");
        groceryList.add("Peanut Butter");
        groceryList.add("Chocolate");
        groceryList.add("Bleach");

        // print all
        groceryList.forEach(groceryItem -> System.out.println(groceryItem));

        // grab #2 is list
        System.out.println(groceryList.get(1));  // Peanut Butter

        // see if list is empty
        groceryList.isEmpty();  // false

        // replace an object
        groceryList.set(3, "Ammonia");
        groceryList.get(3); // Ammonia

        // size of list
        groceryList.size();  // NOT capacity, but answer is 4

        // create an Array of this List
        Object[] stringArrayOfGroceries = groceryList.toArray();
        for(Object object : stringArrayOfGroceries){
            System.out.println(object);  // Prints out Milk, Peanut Butter, Chocolate, Ammonia
        }

        // see if list contains a certain object
        groceryList.contains("Milk");  // true

        // look up index of an item
        groceryList.indexOf("Ammonia");  // 3

        // remove items from a list
        // this can be expensive since ArrayList is backed by an Array
        groceryList.remove("Ammonia");
        groceryList.forEach(groceryItem -> System.out.println(groceryItem));  // Milk, Peanut Butter, Chocolate
    }
}
