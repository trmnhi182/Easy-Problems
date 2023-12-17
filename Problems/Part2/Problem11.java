package Part2;

public class Problem11 {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(182,06,04));
        System.out.println(hasSameLastDigit(18,18,18));
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c)){ return false;}

        int lastA = a%10;
        int lastB = b%10;
        int lastC = c%10;

        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }

    public static boolean isValid(int number){
        return   number >= 10 && number<=1000;
    }
}
