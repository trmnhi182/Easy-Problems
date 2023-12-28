package Part2;
//Find the factors of a number
public class FactorsOfNumber {
    public static void main(String[] args){
        printFactor(18);
    }

    public static void printFactor(int number){
        if(number<1){System.out.println("Invalid number");}
        for(int i =1; i<=number; i++){
            if(number%i==0)
                System.out.println(i);
        }
    }
}
