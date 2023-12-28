package Part2;

public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome(18022081));
    }

    public static boolean isPalindrome(int number){
        int reverse =0;
        int original = number;
        while(original!=0){
            reverse = reverse*10 + original%10;
            original /=10;

            System.out.println("Reverse: "+ reverse);
            System.out.println("Original "+ original);
            System.out.println();
        }
        return reverse == number;
    }
}
