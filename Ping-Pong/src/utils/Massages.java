package utils;

/**
 * This principal class makes returns the messages fot the game
 * like: score, game over and welcome
 *
 * @author TheCodeBears
 */
public class Massages {

    /**
     * This method returns the gameOver message.
     *
     * @return gameOver;
     */
    public String getGameOver() {
        return gameOver;
    }

    /**
     * This method returns the welcome massage.
     *
     * @return welcome;
     */
    public String getWelcome() {
        return welcome;
    }

    /**
     * This method returns the score massage.
     *
     * @return score
     */
    public String getScore() {
        return score;
    }

    /**
     * This method returns the one number massage.
     *
     * @return OneNumber
     */
    public String getOneNumber() {
        return OneNumber;
    }

    /**
     * This method returns the twoNumber massage.
     *
     * @return twoNumber
     */
    public String getTwoNumber() {
        return twoNumber;
    }

    /**
     * This method returns the threeNumber massage.
     *
     * @return threeNumber
     */
    public String getThreeNumber() {
        return threeNumber;
    }

    /**
     * This method returns the getFourthNumber massage.
     *
     * @return getFourthNumber
     */
    public String getFourthNumber() {
        return fourthNumber;
    }

    /**
     * This method returns the fiveNumber massage.
     *
     * @return fiveNumber
     */
    public String getFiveNumber() {
        return fiveNumber;
    }

    /**
     * This method returns the sixNumber massage.
     *
     * @return sixNumber
     */
    public String getSixNumber() {
        return sixNumber;
    }

    /**
     * This method returns the sevenNumber massage.
     *
     * @return sevenNumber
     */
    public String getSevenNumber() {
        return sevenNumber;
    }

    /**
     * This method returns the eightNumber massage.
     *
     * @return eightNumber
     */
    public String getEightNumber() {
        return eightNumber;
    }

    /**
     * This method returns the nineNumber massage.
     *
     * @return nineNumber
     */
    public String getNineNumber() {
        return nineNumber;
    }

    /**
     * This method returns the zeroNumber massage.
     *
     * @return zeroNumber
     */
    public String getZeroNumber() {
        return zeroNumber;
    }

    String gameOver = "" +
            "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\n" +
            "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" +
            "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" +
            "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" +
            "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" +
            "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" +
            "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
            "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" +
            "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
            "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" +
            "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" +
            "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼";

    String welcome = "" +
            "█───█─▄▀▀─█───▄▀▀─▄▀▀▄─█▄─▄█─▄▀▀\n" +
            "█───█─█───█───█───█──█─█▀▄▀█─█──\n" +
            "█───█─█▀▀─█───█───█──█─█─▀─█─█▀▀\n" +
            "█▄█▄█─█───█───█───█──█─█───█─█──\n" +
            "─▀─▀───▀▀──▀▀──▀▀──▀▀──▀───▀──▀▀";

    String score = " " +
            "___     ___ ___   _____  ____ \n" +
            "/ __| / __ / _ \\| '__/ | _  /  :\\\n" +
            "\\__ \\ (_| (_)  | ||   | _/    :\n " +
            "|___/\\___\\___/ |_|  \\| ___|";

    String OneNumber =""+
            "░▒░\n" +
            "▒▒░\n" +
            "░▒░\n" +
            "░▒░\n" +
            "▒▒▒\n";

    String twoNumber = ""+
            "▒▒▒\n" +
            "░▒▒\n" +
            "▒▒▒\n" +
            "▒▒░\n" +
            "▒▒▒\n";

    String threeNumber = ""+
            "▒▒▒\n" +
            "░░▒\n" +
            "░▒▒\n" +
            "░░▒\n" +
            "▒▒▒\n";

    String fourthNumber = ""+
            "▒░▒\n" +
            "▒░▒\n" +
            "▒▒▒\n" +
            "░░▒\n" +
            "░░▒\n";

    String fiveNumber = ""+
            "▒▒▒\n" +
            "▒░░\n" +
            "▒▒▒\n" +
            "░░▒\n" +
            "▒▒▒\n";

    String sixNumber = ""+
            "▒▒▒\n" +
            "▒░░\n" +
            "▒▒▒\n" +
            "▒░▒\n" +
            "▒▒▒\n";

    String sevenNumber = ""+
            "▒▒▒\n" +
            "░░▒\n" +
            "░▒▒\n" +
            "░░▒\n" +
            "░░▒\n";

    String eightNumber = ""+
            "▒▒▒\n" +
            "▒░▒\n" +
            "▒▒▒\n" +
            "▒░▒\n" +
            "▒▒▒\n";

    String nineNumber = ""+
            "▒▒▒\n" +
            "▒░▒\n" +
            "▒▒▒\n" +
            "░░▒\n" +
            "░▒▒\n";

    String zeroNumber = ""+
            "▒▒▒\n" +
            "▒░▒\n" +
            "▒░▒\n" +
            "▒░▒\n" +
            "▒▒▒\n";

}
