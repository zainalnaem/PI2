package Versuch4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Taschenrechner implements ActionListener{
	
	JFrame frame;
	
	private JTextField operand1TextField;
	 private JTextField operand2TextField;
	 private JTextField resultTextField;
	 JButton addButton, subButton;
	
	 JPanel panel;
	 private JLabel operand1;
	 private JLabel operand2;
	 private JLabel Ergebnis;
	 Font myFont = new Font ("Ink Free",Font.BOLD,30);
	 int num1 = 0 , num2 = 0 , result;
	 char operator;
	 
	 
	 //konstruktor
	Taschenrechner(){
		
		frame = new JFrame("Taschenrechner");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,550);
		frame.setLayout(null);
		
		
		
	
		 // Operanden-Textfelder
		
		operand1TextField = new JTextField();
		operand1TextField.setBounds(50, 25, 300, 50);
		operand1TextField.setFont(myFont);
		
		operand2TextField= new JTextField();
		operand2TextField.setBounds(50, 90, 300, 50);
		operand2TextField.setFont(myFont);
		
		  // Buttons
		   addButton = new JButton("+");
		   subButton = new JButton("-");
		   addButton.addActionListener(this);
	       subButton.addActionListener(this);
	       
	    // Ergebnis-Textfeld
	       resultTextField = new JTextField();
	       resultTextField.setBounds(50, 150, 300, 50);
	       resultTextField.setFont(myFont);
			
	        resultTextField.setEditable(false);
	       
	        operand1 = new JLabel("Operand 1: ");
	        operand2 = new JLabel("Operand 2: ");
	        Ergebnis = new JLabel("Ergebnis: ");
	      
		
		
		addButton.setBounds(50, 430, 145, 50);
		subButton.setBounds(205, 430, 145, 50);
		
		//panel.add(operand1);
		frame.add(addButton);
		frame.add(subButton);
		frame.add(operand1TextField);
		frame.add(operand2TextField);
		frame.add(resultTextField);
		
		
		
		
		
		
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {

		Taschenrechner tachenrechner = new Taschenrechner();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			 num1 = Integer.parseInt(operand1TextField.getText());
			 num2 = Integer.parseInt(operand2TextField.getText());
			 operator ='+';
		  operand1TextField.setText("");
		  operand2TextField.setText("");
			 
		}
		if (e.getSource() == subButton) {
			num2 = Integer.parseInt(operand2TextField.getText());
			 num1 = Integer.parseInt(operand1TextField.getText());
			operator ='-';
			operand1TextField.setText("");
		 operand2TextField.setText("");
		}
	
		 switch(operator) {
		 case '+':
			 result = num1 + num2;
	           break;
		 case '-':
			 result = num1 - num2;
	            break;
	       
		 }
		 resultTextField.setText(String.valueOf(result));
	         
	        
	     
	}

}
