package Part2;

public class Problem8 {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(18020604));
        System.out.println(getEvenDigitSum(64182));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){return -1;}
        int sum =0;
        for(int i = number; i >0; i/=10){
            int lastDigit = i%10;
            if(lastDigit%2==0){sum+=lastDigit;}
        }
        return sum;
    }
}

