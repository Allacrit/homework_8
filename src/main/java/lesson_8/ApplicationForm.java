package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {
    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(1000,300,250,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);


        Button button = new Button("Кнопка");
        button.addActionListener(new ButtonListener());
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("СЩБЫТИЕ!!!");
            }
        });*/
/*
        button.addActionListener(e -> System.out.println("СОбытие лямбда"));
*/
        super.add(button);








        setVisible(true);
    }
}
