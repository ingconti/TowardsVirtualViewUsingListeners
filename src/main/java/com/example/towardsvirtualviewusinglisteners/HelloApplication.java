package com.example.towardsvirtualviewusinglisteners;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    private View view;

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("TowardsVirtualViewUsingListeners");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // rendering:
        root.getChildren().add(canvas);

        //was: primaryStage.setScene(new Scene(root));
        this.view = new View();
        primaryStage.setScene(this.view.getScene());

        primaryStage.show();
    }




    public static void main(String[] args) {
        launch();
    }
}