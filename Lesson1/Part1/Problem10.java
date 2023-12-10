package Part1;

public class Problem10 {
    public static void main(String[] args){
        System.out.println(getDurationString(-1802));
        System.out.println(getDurationString(1802));
        System.out.println(getDurationString(1802,604));
    }

    public static String getDurationString(int seconds){
        if(seconds<0) return "Invalid Data";
        int minutes = seconds/60;

        return getDurationString(minutes, seconds);
    }
    public static String getDurationString(int minutes, int seconds){
        int hours = minutes/60;
        int days = hours/60;
        int remainingHours = hours%24;
        int remainingMinutes = minutes%60;
        int remainingSeconds = seconds%60;

        return days + "d "+remainingHours +"h "+ remainingMinutes +"m " +remainingSeconds + "s";

    }
}
