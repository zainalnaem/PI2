package Versuch4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TaschenrechnerGUI extends JFrame implements ActionListener {
    private JTextField operand1TextField;
    private JTextField operand2TextField;
    private JTextField resultTextField;

    
  //Konstruktor
    public TaschenrechnerGUI() {
        // Fenstereinstellungen
        setTitle("Taschenrechner");
        setSize(400, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Operanden-Textfelder
        operand1TextField = new JTextField();
        operand2TextField = new JTextField();

        // Buttons
        JButton plusButton = new JButton("plus");
        JButton minusButton = new JButton("minus");
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);

        // Ergebnis-Textfeld
        resultTextField = new JTextField();
        resultTextField.setEditable(false);

        // Komponenten zum Fenster hinzufügen
        add(new JLabel("Operand 1:"));
        add(operand1TextField);
        add(new JLabel("Operand 2:"));
        add(operand2TextField);
        add(plusButton);
        add(minusButton);
        add(new JLabel("Ergebnis:"));
        add(resultTextField);
    }

    public static void main(String[] args) {
        TaschenrechnerGUI taschenrechner = new TaschenrechnerGUI();
        taschenrechner.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int operand1 = Integer.parseInt(operand1TextField.getText());
        int operand2 = Integer.parseInt(operand2TextField.getText());

        if (e.getActionCommand().equals("plus")) {
            int sum = operand1 + operand2;
            resultTextField.setText(Integer.toString(sum));
        } else if (e.getActionCommand().equals("minus")) {
            int difference = operand1 - operand2;
            resultTextField.setText(Integer.toString(difference));
        }
    }
}
