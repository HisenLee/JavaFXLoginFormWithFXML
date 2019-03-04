package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 基于FXML来写界面，将界面设计与业务逻辑分离
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // 加载fxml
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Login in");
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
