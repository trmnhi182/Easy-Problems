package Part2;

//Find the greatest common divisor of two numbers
public class Problem13 {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(18,64));
        System.out.println(getGreatestCommonDivisor(18,18));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second <10){return -1;}

        int min = first <second ? first:second;
        int gcd = 1;
        for(int j = 1; j<=min; j++){
            if(first%j==0 && second %j==0){
                gcd=j;
            }
        }
        return gcd;
    }
}
