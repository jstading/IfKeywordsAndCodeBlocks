public class MethodChallenge {
    public static void main(String[] args){
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Kim", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lim", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Stim", highScorePosition);
        }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playersScore){
        if (playersScore >= 1000){
            return 1;
        } else if (playersScore >= 500 && playersScore <1000){
            return 2;
        } else if (playersScore >= 100 && playersScore < 500){
            return 3;
        }else{
            return 4;
        }
    }

}
