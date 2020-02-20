package pl.sda.rafal.zientara.vector.paint;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaintJavaFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass()
                .getResource("/paint.fxml"));
        primaryStage.setTitle("Vector Paint");
        Scene scene = new Scene(root, primaryStage.getWidth(),
                primaryStage.getHeight());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}