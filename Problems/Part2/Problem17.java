//Find the largest prime number is the factors of a number
package Part2;
public class Problem17 {
    public static void main(String[] args){
        System.out.println(getLargestPrime(18));
        System.out.println(getLargestPrime(64));
        System.out.println(getLargestPrime(0));
    }

    public static int getLargestPrime(int number){
        if(number<2){return -1;}
        int factor = -1;
        for(int i =2; i*i<=number; i++){
            if(number%i!=0){continue;}
            factor = i;
            while(number %i ==0){number/=i;}
        }
        //if number == 1 return factor otherwise return number;
        return number == 1 ? factor:number;
    }
}
