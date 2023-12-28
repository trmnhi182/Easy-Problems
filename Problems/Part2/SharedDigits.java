package Part2;

public class SharedDigits {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(18,64));
        System.out.println(hasSharedDigit(1802,0604));
        System.out.println(hasSharedDigit(18,19));
    }
    public static boolean hasSharedDigit(int number1, int number2){
        boolean firstValid = number1 > 9 && number1<100;
        boolean secondValid = number2 > 9 && number2 <100;

        if(!firstValid || ! secondValid){return false;}

        int firstLeftDigit = number1/10;
        int firstRightDigit = number1%10;
        int secondLeftDigit = number2/10;
        int secondRightDigit = number2%10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }
}
