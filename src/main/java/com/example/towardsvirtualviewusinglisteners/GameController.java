package com.example.towardsvirtualviewusinglisteners;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class GameController {
    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {

        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                double x = e.getX();
                double y = e.getY();
                System.out.println("clicked");
            }
        };


        this.model = model;
        this.view = view;

        this.view.addClickManagement(eventHandler);
    }
}
