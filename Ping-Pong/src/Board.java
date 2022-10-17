/**
 * This class represent the board.
 *
 * <p>
 *     Contains the board.
 * </p>
 *
 * @author Code Bears
 */
public class Board {
    /**
     * This is the array board.
     */
    public String board[][] = new String[12][51];

    /**
     * This method generates the board
     */
    public void generateBoard() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(i == 0 || i == board.length - 1) {
                    board[i][j] = "▬";
                } else if(j == 0 || j == board[i].length - 1) {
                    board[i][j] = "█";
                } else if(j == board[i].length / 2) {
                    board[i][j] = "#";
                }
                else {
                    board[i][j] = " ";
                }
            }
        }
    }

    /**
     * This method prints the board.
     */
    public void printBoard() {
        System.out.println("\nScore" +
                "\n1 - 0");
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                System.out.print (board[i][j]);
                if(j == board[i].length - 1) {
                    System.out.println();
                }

            }
        }
    }
}