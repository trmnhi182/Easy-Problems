package Part2;
//Find perfect number
public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(18));
        System.out.println(isPerfectNumber(0));
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number){
        if(number<1) {return false;}
        int sum=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }
}
