package Part3;
import java.util.Random;
import java.util.Arrays;

//Get random array
public class BasicArray {
    public static void main(String[] args){
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        if(Arrays.equals(thirdArray, fourthArray)){
            System.out.println("Third and Fourth array are equal");
        }else{
            System.out.println("Third and Fourth array are not equal");
        }

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        if(Arrays.binarySearch(fourthArray, 18)>=0){
            System.out.println("Number 18 is found in the list");
        }else{
            System.out.println("Number 18 is not found in the list");
        }


    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0; i<len; i++ ){
            newInt[i]=random.nextInt(100);
        }
        return newInt;
    }
}
