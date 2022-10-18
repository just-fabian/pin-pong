package com.pjfx.pingpongjfx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


/**
 * This class manage the controller view.
 * <p>
 * Instantiate all the elements of the board to be able to control them.
 * </p>
 * @author TheCodeBears
 */
public class BoardController {

    @FXML
    private Circle ball;

    @FXML
    private Label counterPlayTwo;

    @FXML
    private Label counterPlayerOne;

    @FXML
    private Rectangle paletteOne;

    @FXML
    private Rectangle paletteTwo;

    /**
     * This is a getter method to ball.
     *
     * @return Return the current ball.
     */
    public Circle getBall() {
        return ball;
    }

    /**
     * This is a setter method to ball.
     *
     * @param ball Receive a new Circle.
     */
    public void setBall(Circle ball) {
        this.ball = ball;
    }

    /**
     * This is a getter method to player two counter label.
     *
     * @return Return the Label with the counter.
     */
    public Label getCounterPlayTwo() {
        return counterPlayTwo;
    }

    /**
     * This is a setter method to player two counter label.
     *
     * @param counterPlayTwo Receive a new label.
     */
    public void setCounterPlayTwo(Label counterPlayTwo) {
        this.counterPlayTwo = counterPlayTwo;
    }

    /**
     * This method return the counter of the playerOne.
     *
     * for to know the score of the player one.
     * @return
     */
    public Label getCounterPlayerOne() {
        return counterPlayerOne;
    }

    /**
     * This to change the counter of the player One.
     *
     * @param counterPlayerOne
     */
    public void setCounterPlayerOne(Label counterPlayerOne) {
        this.counterPlayerOne = counterPlayerOne;
    }

    /**
     * this method returns the paletterOne Image.
     *
     * @return
     */
    public Rectangle getPaletteOne() {
        return paletteOne;
    }

    /**
     * This method is for to change the position of the palette One image.
     *
     * @param paletteOne
     */
    public void setPaletteOne(Rectangle paletteOne) {
        this.paletteOne = paletteOne;
    }

    /**
     * This is a getter method to palette two.
     *
     * @return Return the rectangle.
     */
    public Rectangle getPaletteTwo() {
        return paletteTwo;
    }

    /**
     * This is a setter method to palette two.
     *
     * @param paletteTwo Receive a new rectangle.
     */
    public void setPaletteTwo(Rectangle paletteTwo) {
        this.paletteTwo = paletteTwo;
    }
}
