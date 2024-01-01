package Array;
//Similar with problem5 package 3
import java.util.Scanner;
import java.util.Arrays;
public class findMinValue2 {
    public static void main(String[] args){
        int readCount = readInteger();
        System.out.println("Length of array: "+ readCount);

        int[] newArray = readElements(readCount);
        System.out.println("New Array: "+ Arrays.toString(newArray));

        int min = findMin(newArray);
        System.out.println("Min Value of Array: "+ min);


    }
    private static int readInteger(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = input.nextInt();
        return count;
    }

    private static int[] readElements(int count){
        Scanner input1 = new Scanner(System.in);
        int[] newArray = new int[count];
        for(int i =0 ; i<newArray.length; i++){
            System.out.print("Enter number: ");
            int number = input1.nextInt();
            System.out.println();
            newArray[i]= number;
        }
        return newArray;
    }

    private static int findMin(int[] array){
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]<minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
