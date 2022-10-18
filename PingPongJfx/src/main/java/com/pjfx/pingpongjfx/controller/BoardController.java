package com.pjfx.pingpongjfx.controller;

import javafx.animation.AnimationTimer;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class BoardController implements Initializable {

    @FXML
    private Circle ball;

    @FXML
    private Label counterPlayTwo, counterPlayerOne;

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

    @FXML
    public void start() {
        System.out.println("ddd");
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

        keyPressed.addListener(((ObservableValue, aBoolean, t1) -> {
            if (!aBoolean)
                timer.start();

            else
                timer.stop();
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
}
