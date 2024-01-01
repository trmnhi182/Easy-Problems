package Array;
import java.util.Arrays;
public class TwoDimensionalArray {
    public static void main(String[] args){
        int[][] array1 = new int [4][4];
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);

        for(int[] outer: array1){
            System.out.print(outer+" ");
            System.out.println(Arrays.toString(outer));
        }

        for(int i =0; i<array1.length; i++){
            var inner = array1[i];
            for(int j = 0; j<inner.length; j++){
//                System.out.print(array1[i][j]);
                array1[i][j] = (i*10)+(j+1);
            }
            System.out.println();
        }

//        for(var outer: array1){
//            for(var element: outer){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array1));
    }
}
