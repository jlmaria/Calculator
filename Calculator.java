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
        Calculator_Controller keyboard = loader.getController();
        stage.setTitle("Calculator");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        /*
        scene.setOnKeyPressed(event -> {

             switch(event.getCode()) {

                 case DIGIT1 -> keyboard.press_one();

                 case PLUS -> keyboard.press_plus();

                 case MINUS -> keyboard.press_minus();

                 case ENTER -> keyboard.press_equals();

             }

         });
        */
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