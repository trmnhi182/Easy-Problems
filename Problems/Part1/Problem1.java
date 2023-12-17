package Part1;

public class Problem1 {
    public static void main(String[] args){
        calculateScore(true, 1800,6,400);
        boolean gameOver= true;
        int score =18200;
        int levelCompleted=64;
        int bonus = 186;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore=score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
