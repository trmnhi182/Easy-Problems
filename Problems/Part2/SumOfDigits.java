package Part2;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println("Sum of digit 18022001 = " + sumDigit(18022001));
        System.out.println("Sum of digit 6042000 = " + sumDigit(6042000));
    }

    public static int sumDigit(int number){
        if(number<0){return -1;}
        int sum=0;
        while(number>9){
            sum+=(number %10);
            number = number /10;
        }
        sum+=number;
        return sum;
    }
}
