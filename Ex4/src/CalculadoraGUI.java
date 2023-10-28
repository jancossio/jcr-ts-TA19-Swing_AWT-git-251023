import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class CalculadoraGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	
	public CalculadoraGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		textField = new JTextField();
		textField.setBounds(307, 23, 135, 26);
		textField.setColumns(10);
		contentPane.add(textField);
		
		btnNewButton = new JButton("+");
		btnNewButton.setBounds(6, 78, 90, 23);
		btnNewButton.addActionListener(doOperation);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(119, 78, 90, 23);
		btnNewButton_1.addActionListener(doOperation);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("x");
		btnNewButton_2.addActionListener(doOperation);
		btnNewButton_2.setBounds(237, 78, 90, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(doOperation);
		btnNewButton_3.setBounds(352, 78, 90, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.setBounds(369, 227, 89, 23);
		btnNewButton_4.addActionListener(CloseWindow);
		contentPane.add(btnNewButton_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 170, 141, 26);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 23, 135, 26);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		lblNewLabel = new JLabel("Operando 1");
		lblNewLabel.setBounds(10, 23, 66, 26);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Operando 2");
		lblNewLabel_1.setBounds(237, 23, 66, 26);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Respuesta:");
		lblNewLabel_2.setBounds(100, 170, 66, 26);
		contentPane.add(lblNewLabel_2);
	}
	
	ActionListener CloseWindow = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
		}
	};
	
	ActionListener doOperation = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String op1 = textField_2.getText();
			String op2 = textField.getText();
			
			if(!op1.equals("") && !op2.equals("")) {
				calculate(e.getActionCommand(), op1, op2);
			}
		}
	};
	
	private void calculate(String operation, String num1, String num2) {
		
		double result = 0.0;
		
		try {			
			double op1 = Double.parseDouble(num1);
			double op2 = Double.parseDouble(num2);
			
			switch (operation) {
			case "+":
				result = op1 + op2;
				break;
				
			case "-":
				result = op1 - op2;
				break;
				
			case "x":
				result = op1 * op2;
				break;
				
			case "/":
					
				if (op2 == 0.0) {
					throw new NumberFormatException();
				}
				result = op1 / op2;
				
				break;
			default:
				System.out.println("Error");
			}
			textField_1.setText(Double.toString(result)); 
			
		} catch (NumberFormatException  nfe) {
			textField_1.setText("Error");
		}
	}
}
