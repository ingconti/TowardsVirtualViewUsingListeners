package com.example.towardsvirtualviewusinglisteners;


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class View {
    private Scene scene;
    private Label label;

    public View() {
        this.label = new Label("My Label");
        this.label.setFont(new Font("Arial", 30));
        this.scene = new Scene(label, 200, 100);
    }


    Scene getScene(){
        return scene;
    }
}