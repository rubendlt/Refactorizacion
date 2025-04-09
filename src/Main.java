public class Main {

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        if (scorePlayer1 == scorePlayer2) {
            return getEqualScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            return getAdvantageOrWin(scorePlayer1, scorePlayer2);
        } else {
            return getStandardScore(scorePlayer1, scorePlayer2);
        }
    }

    private static String getEqualScore(int score) {
        return switch (score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getAdvantageOrWin(int score1, int score2) {
        int scoreDifference = score1 - score2;
        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        if (scoreDifference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getStandardScore(int score1, int score2) {
        return getScoreName(score1) + "-" + getScoreName(score2);
    }

    private static String getScoreName(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Unknown";
        };
    }
}

