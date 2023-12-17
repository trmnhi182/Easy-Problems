package Part2;

public class Problem7 {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(1802));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number <0){return -1;}
        int lastDigit = number%10;
        while(number >=10){
            number/=10;
        }
        int firstDigit=number;
        return (lastDigit+firstDigit);
    }
}
