package hosdata;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainHospitalApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage mainMenuStage) throws Exception {

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MainMenuView.fxml"));

		Parent root = loader.load();		
		mainMenuStage.setTitle("Hospital App Alpha");
		Scene scene = new Scene(root, 1064, 768);
		mainMenuStage.setScene(scene);
		mainMenuStage.show();

		MainMenuController controller = loader.getController();
		controller.initializeMainMenu(scene);
	}
}
