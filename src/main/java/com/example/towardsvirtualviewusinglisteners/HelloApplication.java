package com.example.towardsvirtualviewusinglisteners;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("TowardsVirtualViewUsingListeners");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // rendering:
        root.getChildren().add(canvas);
        //addButtonTo(root);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch();
    }
}