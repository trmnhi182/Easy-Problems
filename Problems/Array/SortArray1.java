package Array;
import java.util.Random;
import java.util.Arrays;
//Create a program using , that sort a list of integers in descending order.
// Get a random array
// Then print before and after sorting

public class SortArray1 {
    public static void main(String[] args){
        int[] unsortedArray = getRandomArray(5);
        int[] sortedArray = sortInteger(new int[] {18,2,6,4});
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0; i<len; i++ ){
            newInt[i]=random.nextInt(100);
        }
        return newInt;
    }

    //Compare 2 contiguous element in an array
    private static int[] sortInteger(int[] array){
        System.out.println("Before sort: "+ Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag=false;
            //Start comparing at element has index 0
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                    System.out.println("After sort: "+ Arrays.toString(sortedArray));
                }
            }
        }
        return sortedArray;
    }
}
