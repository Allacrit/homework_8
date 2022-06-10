package lesson_8;

import lesson_8.components.OperatorJButton;
import lesson_8.listeners.ButtonListener;
import lesson_8.listeners.ClearButtonActionListener;
import lesson_8.listeners.ExitButtonListener;
import lesson_8.listeners.TestButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {
    private JPanel top;
    private JTextField inputField;

    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(1000,300,300,370);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());


        add(createTopPanel(), BorderLayout.NORTH);
        add(createCenterPanel(), BorderLayout.CENTER);





        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ExitButtonListener());
        menuBar.add(exitItem);
        return menuBar;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("Times Roman",Font.BOLD,25));
        inputField.setMargin(new Insets(8,0,8,0));
        inputField.setBackground(new Color(229, 224, 199));
        inputField.setText("");
        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);



        centerPanel.add(createDigitsPanel(buttonListener),BorderLayout.WEST);
        centerPanel.add(createOperatorsPanel(buttonListener),BorderLayout.CENTER);


        return centerPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));

        JButton erase = new OperatorJButton("<");
        panel.add(erase);
        erase.addActionListener(buttonListener);

        JButton clear = new OperatorJButton("C");
        panel.add(clear);
        clear.addActionListener(new ClearButtonActionListener(inputField));

        JButton plus = new OperatorJButton("+");
        panel.add(plus);
        plus.addActionListener(buttonListener);

        JButton minus = new OperatorJButton("-");
        panel.add(minus);
        minus.addActionListener(buttonListener);

        JButton multiply = new OperatorJButton("x");
        panel.add(multiply);
        multiply.addActionListener(buttonListener);

        JButton divide = new OperatorJButton("/");
        panel.add(divide);
        divide.addActionListener(buttonListener);

        JButton nul = new OperatorJButton("");
        nul.setEnabled(false);
        panel.add(nul);
        JButton contitenation = new OperatorJButton("=");
        panel.add(contitenation);



        return panel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4,3));

        JButton seven = new OperatorJButton("7");
        digitsPanel.add(seven);
        seven.addActionListener(buttonListener);

        JButton eight = new OperatorJButton("8");
        digitsPanel.add(eight);
        eight.addActionListener(buttonListener);

        JButton nine = new OperatorJButton("9");
        digitsPanel.add(nine);
        nine.addActionListener(buttonListener);

        JButton four = new OperatorJButton("4");
        digitsPanel.add(four);
        four.addActionListener(buttonListener);

        JButton five = new OperatorJButton("5");
        digitsPanel.add(five);
        five.addActionListener(buttonListener);

        JButton six = new OperatorJButton("6");
        digitsPanel.add(six);
        six.addActionListener(buttonListener);

        JButton one = new OperatorJButton("1");
        digitsPanel.add(one);
        one.addActionListener(buttonListener);

        JButton two = new OperatorJButton("2");
        digitsPanel.add(two);
        two.addActionListener(buttonListener);

        JButton three = new OperatorJButton("3");
        digitsPanel.add(three);
        three.addActionListener(buttonListener);

        JButton comma = new OperatorJButton(".");
        digitsPanel.add(comma);
        comma.addActionListener(buttonListener);

        JButton zero = new OperatorJButton("0");
        digitsPanel.add(zero);
        zero.addActionListener(buttonListener);

        JButton nul = new OperatorJButton("");
        nul.setEnabled(false);
        digitsPanel.add(nul);


        return digitsPanel;
    }

    private void testListener() {
        Button button = new Button("Кнопка");
        button.addActionListener(new TestButtonListener());





        super.add(button);
    }
}
