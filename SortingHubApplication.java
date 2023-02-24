package se2203.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SortingHubApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SortingHubApplication.class.getResource("SortingHub-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //setting the title of the application
        stage.setTitle("Sorting Hub");
        //importing Western Logo Icon on the Application Title
        stage.getIcons().add(new Image("file:src/main/resources/se2203/assignment1/WesternLogo.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}