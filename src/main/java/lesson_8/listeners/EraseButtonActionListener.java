package lesson_8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EraseButtonActionListener implements ActionListener {

    private JTextField inputField;

    public EraseButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inputField.getText().length() == 0) {
            inputField.setText("");
        } else {
            inputField.setText(inputField.getText().substring(0,inputField.getText().length() - 1));
        }
    }
}
