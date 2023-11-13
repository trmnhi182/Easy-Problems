public class Problem2 {
    public static void main(String[] args){
        int highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Nhi", highScorePosition);

        highScorePosition = calculateHighScorePosition(460);
        displayHighScorePosition("Khoi", highScorePosition);

        highScorePosition = calculateHighScorePosition(1820);
        displayHighScorePosition("Man Nhi", highScorePosition);

        highScorePosition = calculateHighScorePosition(64);
        displayHighScorePosition("Bao Khoi", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " +playerPosition + " on the  score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >=500){
            return 2;
        } else if (playerScore >=100){
            return 3;
        }
        return position;
    }
}
