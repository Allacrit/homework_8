package lesson_8.listeners;

import lesson_8.calc.MathParse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private JTextField inputField;

    public CalcButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inputField.getText().length() != 0) {
            inputField.setText(String.valueOf(MathParse.eval(inputField.getText())));
        }
    }
}
