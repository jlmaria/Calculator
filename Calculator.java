package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Calculator extends Application{

    @Override
        public void start(Stage stage) throws Exception {

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculator.fxml")));
            stage.setTitle("Calculator");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setOnCloseRequest(e -> {
                e.consume();
                Calculator_Controller.Close_Request();
            });
            stage.show();

        }


    public static void run(String[] args) {
            launch(args);

        }

    }