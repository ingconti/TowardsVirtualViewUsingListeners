package com.example.towardsvirtualviewusinglisteners;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class GameView {
    private Scene scene;
    private Label label;

    public GameView() {
        this.label = new Label("My Label");
        this.label.setFont(new Font("Arial", 30));
        this.scene = new Scene(label, 200, 100);

        addClickManagement();

    }


    private void addClickManagement(){
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                double x = e.getX();
                double y = e.getY();
                System.out.println("clicked");
            }
        };
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }
    Scene getScene(){
        return scene;
    }


}