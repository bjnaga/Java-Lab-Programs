// write a program to Demonstrate Keyboard event
package application;	
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;


public class Main extends Application {
	static VBox root;
	@Override
	public void start(Stage primaryStage) {
		try {
			load();
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void load() throws FileNotFoundException {
	     root = new VBox();
	     TextField txtMobile = new TextField();
			txtMobile.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					Label lbl = new Label("");
					String character = event.getCharacter();
					root.getChildren().add(lbl);
					lbl.setText("key pressed :"+character);
				}
			});
			root.getChildren().add(txtMobile);
			
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
