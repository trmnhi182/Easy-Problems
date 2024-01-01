package Array;
//Write a method call , that read comma delimited list of number entered by the  adn then return an array
//Next, write method findMin return minimum value of the array
//In main method
//  - Call readIntegers method to get the elements for the array and then print it out
//  - Call findMin method, passing the array from readInteger method
//  - Print the minimum value
import java.util.Scanner;
import java.util.Arrays;
public class findMinValue1 {
    public static void main(String[] args){
        int[] usersArray = readInteger();
        System.out.println(Arrays.toString(usersArray));

        int min = findMin(usersArray);
        System.out.println("Min Value = "+ min);
    }

    private  static int[] readInteger(){
        //Get value form user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number separate by commas");
        String number = input.nextLine();

        //split commas
        String splits[] = number.split(",");

        // Declare new array of number after splitting commas
        int[] value = new int[splits.length];
        //For each value in the array, pass it to the Integer.parseInt method
        for(int i = 0; i<splits.length; i++){
            //trim the space when user input space after comma
            value[i]= Integer.parseInt(splits[i].trim());
        }
        return value;
    }

    public static int findMin(int[] array){
        //Set min value to the highest number that an integer can hold
        int minValue= Integer.MAX_VALUE;
        for(int element : array){
            if(element<minValue){
                minValue = element;
            }
        }

        return minValue;
    }
}
