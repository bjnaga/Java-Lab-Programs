
//write a javaFX program to demonstrate the creation of ListVew.

package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;



public class Main extends Application {
	static VBox obj;
	@Override
	public void start(Stage primaryStage) {
		try {
			obj=new VBox(10);
			Scene scene = new Scene(obj,400,400);
			primaryStage.setTitle("Rank list");
			primaryStage.setScene(scene);
			primaryStage.show();
			load();
		} catch(Exception e) {
			e.printStackTrace();
		}
}
	public void load()   {
		ObservableList<String> names = FXCollections.observableArrayList("1", "2", "3", "4");
		ListView<String> listView = new ListView<String>(names);
		listView.setMaxSize(100, 100);
		obj.getChildren().addAll(listView);
		obj.getChildren().addAll(new Button("test"));
		}
	public static void main(String[] args) {
		launch(args);
	}
	
}
