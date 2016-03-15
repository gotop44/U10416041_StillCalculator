/** U10416041 */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StillCalculator extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Still Calculator");
	initRootLayout();
    }

    public void initRootLayout() {
        try {
        	FXMLLoader loader = new FXMLLoader();
            	loader.setLocation(StillCalculator.class.getResource("calculate.fxml"));
            	rootLayout = (AnchorPane) loader.load();
            	Scene scene = new Scene(rootLayout);
            	primaryStage.setScene(scene);
            	primaryStage.show();
        }
	catch (IOException e) {
            	e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
