package Part2;

public class Problem4 {
    public static void main(String[] args){
        int number = 18;
        int finishNumber=64;
        int evenCount=0;
        int oddCount=0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number: "+number);
            evenCount++;
        }
        System.out.println("Total odd number: "+oddCount);
        System.out.println("Total even number: "+evenCount);
    }

    public static boolean isEvenNumber(int number){
        return number%2==0;
    }
}
