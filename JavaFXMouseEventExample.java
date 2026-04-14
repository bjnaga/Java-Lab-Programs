package application;	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;

public class MouseEventApp extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(50, Color.CORAL);

        circle.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                System.out.println("Left Clicked at: " + event.getX() + ", " + event.getY());
            } else if (event.getButton() == MouseButton.SECONDARY) {
                System.out.println("Right Clicked!");
            }
            
            if (event.getClickCount() == 2) {
                System.out.println("Double Clicked!");
            }
        });

        StackPane root = new StackPane(circle);
        stage.setScene(new Scene(root, 400, 400));
        stage.setTitle("JavaFX Mouse Event");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
