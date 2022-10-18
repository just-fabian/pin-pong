import utils.Colors;

import java.util.Scanner;

/**
 * This class is the menu for the player to choose what to play.
 * <p>
 * Contains all the options for the player to choose from.
 * @author TheCodeBears
 */

public class Menu {

    /**
     * this method would be responsible for showing the player the options.
     * <p>
     * In this method we are using the switch and the Scanner to select the option.
     */

    public void optionChoose(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colors.RED+"PING PONG GAME !!!!!");
        System.out.println("Select one of the game modes \n " +
                "1. Multiplayer \n" +
                "2. VS Computer \n " +
                "3. Exit the game");
        int choose = scanner.nextInt();

        switch (choose){

            case 1:
                System.out.println("Run Multiplayer");
                break;
            case 2:
                System.out.println("Run vs Computer");
                break;
            case 3:
                System.out.println("exit the game");
                break;
            default:
                System.out.println("Option not available");


        }

    }




}
