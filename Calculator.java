package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("calculator.fxml"));
        Parent root = loader.load();
        stage.setTitle("Calculator");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnCloseRequest(e ->

        {
            e.consume();
            Calculator_Controller control = new Calculator_Controller();
            control.close_Request();

        });
        stage.show();

    }

    public static void run(String[] args) {
        launch(args);

    }

}