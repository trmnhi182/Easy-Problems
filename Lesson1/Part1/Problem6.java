package Part1;

public class Problem6 {
    public static void main(String[] args){
        System.out.println(isLeapYear(1802));
        System.out.println(isLeapYear(604));
        System.out.println(isLeapYear(18020604));
    }
    public static boolean isLeapYear(int year){
        if(year<1 || year > 9999) {return false;}

        if(year%4==0){
            if(year%100 != 0) {return true;}
            else{
                if(year%400 == 0) {return true;}
                else{ return false;}
            }
        } else return false;
    }
}
