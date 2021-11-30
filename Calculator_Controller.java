package calculator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Calculator_Controller {

    @FXML
    private RadioButton rb_difference, rb_divide, rb_multiply, rb_sum;

    @FXML
    private TextField txt_num1, txt_num2, txt_num3;

    @FXML
    void Sum_Clicked() {

        if (txt_num1.getText().isEmpty() || txt_num2.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "You must insert a value", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            int n1 = Integer.parseInt(txt_num1.getText());
            int n2 = Integer.parseInt(txt_num2.getText());
            int total;

            if (rb_sum.isSelected()) {

                total = n1 + n2;

                txt_num3.setText(String.valueOf(total));

            } else if (rb_difference.isSelected()) {

                total = n1 - n2;

                txt_num3.setText(String.valueOf(total));

            } else if (rb_multiply.isSelected()) {

                total = n1 * n2;

                txt_num3.setText(String.valueOf(total));

            } else if (rb_divide.isSelected()) {

                total = n1 / n2;

                txt_num3.setText(String.valueOf((total)));

            }

        }
    }

        @FXML
        void Clean_Clicked () {

            txt_num1.setText("");
            txt_num2.setText("");
            txt_num3.setText("");
            txt_num1.requestFocus();

        }

        @FXML
        public static void Close_Request () {

            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Closing", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirm == JOptionPane.OK_OPTION) {

                JOptionPane.showMessageDialog(null, "Thanks for use the Calculator app", "Exit", JOptionPane.INFORMATION_MESSAGE);
                Platform.exit();

            }

        }

    }