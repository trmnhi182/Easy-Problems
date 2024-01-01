package List;
import java.util.ArrayList;
import java.util.Arrays;

record groceryItem(String name, String type, int amount){
    //Constructor: groceryItem
    // This constructor take only field "name" as
    // For a record, we have to call the generated default constructor with all 3 fields
    public groceryItem(String name){
        this(name, "DAIRY", 1);
    }
}
public class GroceryList {
    public static void main(String[] args){
        // Array
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new groceryItem("Milk");
        groceryArray[1] = new groceryItem("Apple", "PRODUCE",6);
        groceryArray[1] = new groceryItem("Orange", "PRODUCE",18);
        System.out.println(Arrays.toString(groceryArray));

        //ArrayList
        //If we don't specify a type, with an ArrayList, it's going to use the Object class by
        //This is call "The raw use of this type"
        ArrayList objectList = new ArrayList();
        //Add new groceryItem object
        objectList.add(new groceryItem("Butter"));
        objectList.add("Yogurt");

        //Specified the type of ArrayList(in this case is the record groceryItem) in angle
        //This is the type we want all elements in the ArrayList to be
        //With this declaration, the compiler can do compile-time type  because we only want groceryItems in our grocery list
        ArrayList<groceryItem> groceryList = new ArrayList<>();
        groceryList.add(new groceryItem("Butter"));
        groceryList.add(new groceryItem("Bread"));
        System.out.println(groceryList);
    }
}
