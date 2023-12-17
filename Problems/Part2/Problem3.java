package Part2;

public class Problem3 {
    public static void main(String[] args){
        int count =0;
        for(int i=10; i<=50; i++){
            if(isPrime(i)){
                System.out.println(i +" is PRIME number");
                count++;
            }else {
                System.out.println(i + " is NOT PRIME number");
            }
        }
        System.out.println("Total PRIME number is: "+count);
    }

    public static boolean isPrime(int number){
        if(number<2) {return false;}
        for(int divisor =2; divisor<=number/2; divisor++){
            if(number%divisor==0) return false;
        }
        return true;
    }
}
