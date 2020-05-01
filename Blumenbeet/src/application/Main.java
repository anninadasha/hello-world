package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Blumenbeet.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//launch(args);
		System.out.println(fakultaet(7));
	}
	
	public static int fibonacci(int x) {	
		int saver1 = 0;
		int saver2 = 1;
		for (int i=x; i>=0; i--) {
			x = saver1;               
			saver1 = saver2;               
			saver2 = saver1 + x;   
		}
		return x;
	}

	public static int fc(int x) {
			if (x > 2) {
		x--;
		x = fc(x) + fc(x-1); 
		return x;
		} else {
			return 1;
		}	
		}
	
	public static int fakultaet(int x) {
		if (x > 1) {
			x--;
			x = (x+1) * fakultaet(x);
			return x;
		} else {
			return 1;
		}
	}
}
