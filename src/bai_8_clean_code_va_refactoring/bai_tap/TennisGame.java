package bai_8_clean_code_va_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int firstPlayer, int secondPlayer) {
        String score = "";
        if (firstPlayer==secondPlayer) {
            score = getScore1(firstPlayer);
        } else if (firstPlayer>=4 || secondPlayer>=4) {
            score = getMinResult(firstPlayer, secondPlayer);
        } else {
            score = getCheckTempScore(firstPlayer, secondPlayer, score);
        }
        return score;
    }

    private static String getMinResult(int firstPlayer, int secondPlayer) {
        String score;
        int minusResult = firstPlayer-secondPlayer;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getCheckTempScore(int firstPlayer, int secondPlayer, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = firstPlayer;
            else { score+="-"; tempScore = secondPlayer;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScore1(int firstPlayer) {
        String score;
        switch (firstPlayer)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}

//public class TennisGame {
//
//    public static String getScore(int scoreFirstPlayer, int scoreSecondPlayer) {
//        String resultScore = "";
//
//        if (scoreFirstPlayer == 4 && scoreSecondPlayer == 4) {
//            resultScore = "Deuce";
//        }
//        if (scoreFirstPlayer < 4 && scoreSecondPlayer < 4) {
//            resultScore = scoreFirstPlayer == scoreSecondPlayer ? getNameScore(scoreFirstPlayer) + "-All" : getNameScore(scoreFirstPlayer) + "-" + getNameScore(scoreSecondPlayer);
//        }
//        else {
//            int scoreDifference = scoreFirstPlayer > scoreSecondPlayer   ? scoreFirstPlayer - scoreSecondPlayer : scoreSecondPlayer - scoreFirstPlayer;
//            String winner = scoreFirstPlayer > scoreSecondPlayer    ? "player1" : "player2";
//
//            resultScore = scoreDifference >= 2 ?  "Win to " + winner : "Advantage " + winner;
//        }
//
//        return resultScore;
//    }
//
//    public static String getNameScore(int score) {
//        String nameScore;
//        switch (score) {
//            case 0:
//                nameScore = "Love";
//                break;
//            case 1:
//                nameScore = "Fifteen";
//                break;
//            case 2:
//                nameScore = "Thirty";
//                break;
//            case 3:
//                nameScore = "Forty";
//                break;
//            default:
//                nameScore = "";
//                break;
//        }
//
//        return nameScore;
//    }
//
//}