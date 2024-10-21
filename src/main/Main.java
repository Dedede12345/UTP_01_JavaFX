package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    static {
        System.loadLibrary("CPP_BackEnd");
    }

    @Override
    public void start(Stage primaryStage) {
        String labelText = hello();
        Label label = new Label(labelText);

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 250, 50);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    native static String hello();

}