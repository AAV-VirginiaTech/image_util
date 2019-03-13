
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public void start(Stage primaryStage) throws Exception{

        String fxml = "/main/resources/interface.fxml";

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Parent root = loader.load();
        primaryStage.setTitle("AAV Photo UI");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
