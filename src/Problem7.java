//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the
// same up to three decimal places. Otherwise, return false.
public class Problem7 {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(18.2, 6.4));
        System.out.println(areEqualByThreeDecimalPlaces(18.2, 18.2));

    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

        long rounded1 = (long)(number1*1000);
        long rounded2 = (long)(number2*1000);
        return rounded1==rounded2;
    }

}
