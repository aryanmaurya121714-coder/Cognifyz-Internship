
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task_3_Calculator extends JFrame implements ActionListener {
    JTextField num1, num2, result;
    JButton add, sub, mul, div, clear;

    Task_3_Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter First Number:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Enter Second Number:"));
        num2 = new JTextField();
        add(num2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        clear = new JButton("Clear");

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double ans = 0;

            if (e.getSource() == add) {
                ans = a + b;
            } else if (e.getSource() == sub) {
                ans = a - b;
            } else if (e.getSource() == mul) {
                ans = a * b;
            } else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                ans = a / b;
            } else if (e.getSource() == clear) {
                num1.setText("");
                num2.setText("");
                result.setText("");
                return;
            }

            result.setText(String.valueOf(ans));

        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Task_3_Calculator();
    }
}