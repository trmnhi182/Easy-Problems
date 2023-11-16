public class Problem11 {
    public static void main(String[] args){
        System.out.println(isCatPlaying(true,18));
        System.out.println(isCatPlaying(true, 30));
        System.out.println(isCatPlaying(false, 30));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        int max = summer ? 45:35;
        return temperature>=25 && temperature <=max;
    }
}

