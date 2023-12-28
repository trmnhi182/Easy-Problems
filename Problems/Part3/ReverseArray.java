package Part3;

import java.util.Scanner;
import java.util.Arrays;

//Write method called reverse, that method take an int[] as parameter
public class ReverseArray {
    public static void main(String[] args){
        int[] newArray = readInteger();
        System.out.println("Array: "+ Arrays.toString(newArray));

        int[] reversedArray = reverse(newArray);
        System.out.println("After reversing: "+ Arrays.toString(reversedArray));

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
    private static int[] reverse(int[] array){
        int[] newArray = new int[array.length];

        int lastIndex = array.length-1;
        for(int firstIndex:array){
            newArray[lastIndex--]=firstIndex;
        }
        return newArray;
    }
}
