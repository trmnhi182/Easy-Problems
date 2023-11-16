// Convert speed from kilometers to miles
public class Problem3 {
    public static void main(String[] args){
        printConversion(-10);
        printConversion(64);
        printConversion(0);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour/1.609);
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0) {System.out.println("Invalid value");}
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
