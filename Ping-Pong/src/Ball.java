import utils.Colors;

/**
 * This class represent the ball.
 * <p>
 * Contains the ball icon and more methods for control ball
 *
 * @author TheCodeBears
 */
public class Ball {
    private String icon;

    public Ball(){
        icon = Colors.RED+"○"+Colors.DEFAULT;
    }

    /**
     * This method return the ball icon.
     *
     * @return String type.
     */
    public String getIcon() {
        return icon;
    }
}
