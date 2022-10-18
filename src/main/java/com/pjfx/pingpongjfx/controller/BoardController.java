package com.pjfx.pingpongjfx.controller;

import javafx.animation.AnimationTimer;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class BoardController extends Thread implements Initializable {

    @Override
    public void run() {
        while(true){
            moveBall2();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private static final int WIDTH = 1067;
    private static final int HEIGHT = 588;
    private static final double BALL_R = 15;

    private double ballYSpeed = 10;
    private double ballXSpeed = 10 ;
    private double ballXPos = WIDTH / 2;
    private double ballYPos = HEIGHT / 2;
    private boolean gameStarted = true;
    private int score1 = 0, score2 = 0;
    Thread thread = new Thread(this);

    @FXML
    private Circle ball;

    @FXML
    private TextField counterPlayTwo, counterPlayerOne;

    @FXML
    private Rectangle paletteOne, paletteTwo;

    @FXML
    private AnchorPane anchorPane;

    private final BooleanProperty wPressed = new SimpleBooleanProperty();
    private final BooleanProperty upPressed = new SimpleBooleanProperty();
    private final BooleanProperty sPressed = new SimpleBooleanProperty();
    private final BooleanProperty downPressed = new SimpleBooleanProperty();
    private final BooleanBinding keyPressed = wPressed.or(upPressed).or(sPressed).or(downPressed);

    AnimationTimer timer = new AnimationTimer() {

        @Override
        public void handle(long now) {

            int movementVariable = 2;
            if (wPressed.get() && paletteOne.getLayoutY() > 5)
                paletteOne.setLayoutY(paletteOne.getLayoutY() - movementVariable);

            if (sPressed.get() && paletteOne.getLayoutY() < 445)
                paletteOne.setLayoutY(paletteOne.getLayoutY() + movementVariable);

            if (upPressed.get() && paletteTwo.getLayoutY() > 5)
                paletteTwo.setLayoutY(paletteTwo.getLayoutY() - movementVariable);

            if (downPressed.get() && paletteTwo.getLayoutY() < 445)
                paletteTwo.setLayoutY(paletteTwo.getLayoutY() + movementVariable);
        }
    };

    /**
     *
     */
    @FXML
    public void start() {
        setInitialPosPalettes();
        setInitialPosBall();
        counterPlayerOne.setText("0");
        counterPlayTwo.setText("0");
    }

    /**
     *
     */
    private void setInitialPosPalettes() {
        paletteOne.setLayoutY(200);
        paletteOne.setLayoutX(41);
        paletteTwo.setLayoutY(200);
        paletteTwo.setLayoutX(971);

    }
    /**
     * This class manage the controller view.
     * <p>
     * Instantiate all the elements of the board to be able to control them.
     * </p>
     * @author TheCodeBears
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        movementSetup();

        //Thread a = new Thread(this);
        //a.start();
        startBallMovement();
        keyPressed.addListener(((ObservableValue, aBoolean, t1) -> {
            if (!aBoolean) {

                timer.start();
            }
            else {
                timer.stop();
            }
        }));

    }


    private void movementSetup() {
        anchorPane.setOnKeyPressed(e -> {

            if (e.getCode() == KeyCode.W)
                wPressed.set(true);


            if (e.getCode() == KeyCode.S)
                sPressed.set(true);


            if (e.getCode() == KeyCode.P)
                upPressed.set(true);


            if (e.getCode() == KeyCode.L)
                downPressed.set(true);

        });

        anchorPane.setOnKeyReleased(e ->{
            if (e.getCode() == KeyCode.W) {
                wPressed.set(false);
            }
            if (e.getCode() == KeyCode.S) {
                sPressed.set(false);
            }

            if (e.getCode() == KeyCode.P) {
                upPressed.set(false);
            }
            if (e.getCode() == KeyCode.L) {
                downPressed.set(false);
            }
        });
    }

    /**
     * The method moveBall2 performs the movement of the ball, with the help of its positions.
     */
    @FXML
    private void moveBall2() {

        if (gameStarted) {
            ballXPos += ballXSpeed;
            ballYPos += ballYSpeed;

            ball.setLayoutY(ballYPos);
            ball.setLayoutX(ballXPos);
        } else {
            setInitialPosBall();

            ballXSpeed = new Random().nextInt(2) == 0 ? 1 : -1;
            ballYSpeed = new Random().nextInt(2) == 0 ? 1 : -1;
        }

        if (ballYPos > 542 || ballYPos < 25) ballYSpeed *= -1;

        if (ballXPos < paletteOne.getLayoutX() - paletteOne.getWidth()) {
            score2 += 1;

            setInitialPosPalettes();
            setInitialPosBall();
            updateScores();

        }

        else if (ballXPos > paletteTwo.getLayoutX() + paletteTwo.getWidth()) {
            score1 += 1;

            setInitialPosPalettes();
            setInitialPosBall();
            updateScores();

        } else if (((ballXPos + BALL_R > paletteTwo.getLayoutX() - 5) && ballYPos >= paletteTwo.getLayoutY() && ballYPos <= paletteTwo.getLayoutY() + paletteTwo.getHeight()) ||
                ((ballXPos < (paletteOne.getLayoutX() + paletteOne.getWidth() + 25)) && ballYPos >= paletteOne.getLayoutY() && ballYPos <= paletteOne.getLayoutY() + paletteOne.getHeight())) {
            ballYSpeed += 1 * Math.signum(ballYSpeed);
            ballXSpeed += 1 * Math.signum(ballXSpeed);
            ballXSpeed *= -1;
            ballYSpeed *= -1;

        }
    }

    /**
     *
     */

    private void startBallMovement(){
        setInitialPosBall();
//        Thread a = new Thread(this);
        thread.start();
    }

    /**
     *
     */
    private void updateScores(){
        try {
            counterPlayerOne.setText(String.valueOf(score1));
            counterPlayTwo.setText(String.valueOf(score2));
        }catch (Exception e){
            thread.stop();
            thread.start();
        }
    }

    /**
     *
     */

    private void setInitialPosBall() {

        ballXPos = WIDTH / 2;
        ballYPos = HEIGHT / 2;
        ball.setLayoutX(ballXPos);
        ball.setLayoutY(ballYPos);
    }
}