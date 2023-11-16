/*We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
* If the hourOfDay parameter is less than 0 or greater than 23 return false.
* We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.*/
public class Problem5 {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, 12));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(false, 12));
    }
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23) return false;
        return isBarking && (hourOfDay<8 || hourOfDay > 22);
    }
}
