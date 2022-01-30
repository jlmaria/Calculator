package calculator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class Calculator_Controller {

    double num, ans;
    int calculate;

    @FXML
    private Button btn_add, btn_backspace, btn_cancel, btn_divide, btn_eight, btn_equals, btn_five, btn_four;

    @FXML
    private Button btn_multiply, btn_nine, btn_one, btn_point, btn_posNeg, btn_seven, btn_six, btn_subtract, btn_three;

    @FXML
    private Button btn_two, btn_zero;

    @FXML
    private Label lbl_calculate;

    @FXML
    private RadioButton rb_off, rb_on;

    @FXML
    private TextField txt_value;

    @FXML
    public ToggleGroup on_off;

    @FXML
    void press_backspace() {

        int length = txt_value.getText().length();
        int number = txt_value.getText().length() - 1;
        String store;

        if (length > 0) {

            StringBuilder back = new StringBuilder(txt_value.getText());
            back.deleteCharAt(number);
            store = back.toString();
            txt_value.setText(store);

        }

    }

    @FXML
    void press_cancel() {

        txt_value.setText("");
        lbl_calculate.setText("");
        txt_value.requestFocus();

    }

    @FXML
    void press_divide() {

        num = Double.parseDouble(txt_value.getText());
        calculate = 4;
        txt_value.setText("");
        lbl_calculate.setText(num + "/");
        txt_value.requestFocus();

    }

    @FXML
    void press_eight() {

        txt_value.setText(txt_value.getText() + "8");

    }

    @FXML
    void press_equals() {

        switch (calculate) {
            case 1 -> {
                ans = num + Double.parseDouble(txt_value.getText());
                txt_value.setText(Double.toString(ans));
                lbl_calculate.setText("");
            }
            case 2 -> {
                ans = num - Double.parseDouble(txt_value.getText());
                txt_value.setText(Double.toString(ans));
                lbl_calculate.setText("");
            }
            case 3 -> {
                ans = num * Double.parseDouble(txt_value.getText());
                txt_value.setText(Double.toString(ans));
                lbl_calculate.setText("");
            }
            case 4 -> {
                ans = num / Double.parseDouble(txt_value.getText());
                txt_value.setText(Double.toString(ans));
                lbl_calculate.setText("");
            }
        }

    }

    @FXML
    void press_five() {

        txt_value.setText(txt_value.getText() + "5");

    }

    @FXML
    void press_multiply() {

        num = Double.parseDouble(txt_value.getText());
        calculate = 3;
        txt_value.setText("");
        lbl_calculate.setText(num + "*");
        txt_value.requestFocus();

    }

    @FXML
    void press_four() {

        txt_value.setText(txt_value.getText() + "4");

    }

    @FXML
    void press_subtract() {

        num = Double.parseDouble(txt_value.getText());
        calculate = 2;
        txt_value.setText("");
        lbl_calculate.setText(num + "-");
        txt_value.requestFocus();

    }

    @FXML
    void press_nine() {

        txt_value.setText(txt_value.getText() + "9");

    }

    @FXML
    void press_off() {

        txt_value.setDisable(true);
        txt_value.setEditable(false);
        btn_backspace.setDisable(true);
        btn_cancel.setDisable(true);
        btn_divide.setDisable(true);
        btn_eight.setDisable(true);
        btn_equals.setDisable(true);
        btn_five.setDisable(true);
        btn_multiply.setDisable(true);
        btn_four.setDisable(true);
        btn_subtract.setDisable(true);
        btn_nine.setDisable(true);
        btn_one.setDisable(true);
        btn_point.setDisable(true);
        btn_posNeg.setDisable(true);
        btn_add.setDisable(true);
        btn_seven.setDisable(true);
        btn_six.setDisable(true);
        btn_three.setDisable(true);
        btn_two.setDisable(true);
        btn_zero.setDisable(true);
        rb_off.setDisable(true);
        rb_on.setDisable(false);

    }

    @FXML
    void press_on() {

        txt_value.setDisable(false);
        txt_value.setEditable(true);
        txt_value.requestFocus();
        btn_backspace.setDisable(false);
        btn_cancel.setDisable(false);
        btn_divide.setDisable(false);
        btn_eight.setDisable(false);
        btn_equals.setDisable(false);
        btn_five.setDisable(false);
        btn_multiply.setDisable(false);
        btn_four.setDisable(false);
        btn_subtract.setDisable(false);
        btn_nine.setDisable(false);
        btn_one.setDisable(false);
        btn_point.setDisable(false);
        btn_posNeg.setDisable(false);
        btn_add.setDisable(false);
        btn_seven.setDisable(false);
        btn_six.setDisable(false);
        btn_three.setDisable(false);
        btn_two.setDisable(false);
        btn_zero.setDisable(false);
        rb_off.setDisable(false);
        rb_on.setDisable(true);

    }

    @FXML
    void press_one() {

        txt_value.setText(txt_value.getText() + "1");

    }

    @FXML
    void press_add() {

        num = Double.parseDouble(txt_value.getText());
        calculate = 1;
        txt_value.setText("");
        lbl_calculate.setText(num + "+");
        txt_value.requestFocus();

    }

    @FXML
    void press_point() {

        txt_value.setText(txt_value.getText() + ".");

    }

    @FXML
    void press_posNeg() {

        num = Double.parseDouble(txt_value.getText());

        double negative_result = num * -1;
        txt_value.setText(negative_result + "");

    }

    @FXML
    void press_seven() {

        txt_value.setText(txt_value.getText() + "7");

    }

    @FXML
    void press_six() {

        txt_value.setText(txt_value.getText() + "6");

    }

    @FXML
    void press_three() {

        txt_value.setText(txt_value.getText() + "3");

    }

    @FXML
    void press_two() {

        txt_value.setText(txt_value.getText() + "2");

    }

    @FXML
    void press_zero() {

        txt_value.setText(txt_value.getText() + "0");

    }

    @FXML
    void keyboard(KeyEvent event) {

        switch (event.getCode()) {

            case ADD -> press_add();
            case SUBTRACT -> press_subtract();
            case MULTIPLY -> press_multiply();
            case DIVIDE -> press_divide();
            case ENTER -> press_equals();

        }

        DecimalFormat format = new DecimalFormat("#.0");

        txt_value.setTextFormatter(new TextFormatter<>(e ->
        {
            if (e.getControlNewText().isEmpty()) {
                return e;
            }

            ParsePosition parsePosition = new ParsePosition(0);
            Object object = format.parse(e.getControlNewText(), parsePosition);

            if (object == null || parsePosition.getIndex() < e.getControlNewText().length()) {
                return null;
            } else {
                return e;
            }
        }));

    }

    @FXML
    void close_Request() {

        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Closing",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.OK_OPTION) {

            JOptionPane.showMessageDialog(null, "Thanks for use the Calculator App",
                    "Closing", JOptionPane.INFORMATION_MESSAGE);

            Platform.exit();

        }
    }

}