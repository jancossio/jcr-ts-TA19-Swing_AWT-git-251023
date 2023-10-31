import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_6_1;
	private JButton btnNewButton_6_2;
	private JButton btnNewButton_6_3;
	private JButton btnNewButton_6_4;
	private JButton btnNewButton_6_5;
	private JButton btnNewButton_6_6;
	private JButton btnNewButton_6_7;
	private JButton btnNewButton_6_8;
	private JButton btnNewButton_6_9;
	private JButton btnNewButton_7;
	private JButton btnNewButton_7_1;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_9_1;
	
	private Calculadora calculator = new Calculadora();
	private String operation = "";
	private String op1 = "";
	private String op2 = "";
	
	public CalculadoraGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 32, 436, 46);
		textField.setColumns(10);
		contentPane.add(textField);
		
		btnNewButton = new JButton("+");
		btnNewButton.setBounds(182, 101, 90, 23);
		btnNewButton.addActionListener(setOperation);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(182, 135, 90, 23);
		btnNewButton_1.addActionListener(setOperation);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("x");
		btnNewButton_2.addActionListener(setOperation);
		btnNewButton_2.setBounds(182, 169, 90, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(setOperation);
		btnNewButton_3.setBounds(182, 203, 90, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.setBounds(369, 243, 89, 23);
		btnNewButton_4.addActionListener(CloseWindow);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("About");
		btnNewButton_5.setBounds(379, 0, 89, 23);
		btnNewButton_5.addActionListener(aboutCalculator);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBounds(20, 101, 44, 35);
		btnNewButton_6.addActionListener(addNumber);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_6_1 = new JButton("2");
		btnNewButton_6_1.setBounds(74, 101, 44, 35);
		btnNewButton_6_1.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_1);
		
		btnNewButton_6_2 = new JButton("3");
		btnNewButton_6_2.setBounds(128, 101, 44, 35);
		btnNewButton_6_2.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_2);
		
		btnNewButton_6_3 = new JButton("4");
		btnNewButton_6_3.setBounds(20, 152, 44, 35);
		btnNewButton_6_3.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_3);
		
		btnNewButton_6_4 = new JButton("5");
		btnNewButton_6_4.setBounds(74, 152, 44, 35);
		btnNewButton_6_4.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_4);
		
		btnNewButton_6_5 = new JButton("6");
		btnNewButton_6_5.setBounds(128, 151, 44, 35);
		btnNewButton_6_5.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_5);
		
		btnNewButton_6_6 = new JButton("7");
		btnNewButton_6_6.setBounds(20, 197, 44, 35);
		btnNewButton_6_6.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_6);
		
		btnNewButton_6_7 = new JButton("8");
		btnNewButton_6_7.setBounds(74, 197, 44, 35);
		btnNewButton_6_7.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_7);
		
		btnNewButton_6_8 = new JButton("9");
		btnNewButton_6_8.setBounds(128, 197, 44, 35);
		btnNewButton_6_8.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_8);
		
		btnNewButton_6_9 = new JButton("0");
		btnNewButton_6_9.setBounds(74, 237, 44, 35);
		btnNewButton_6_9.addActionListener(addNumber);
		contentPane.add(btnNewButton_6_9);
		
		btnNewButton_7 = new JButton("CE");
		btnNewButton_7.setBounds(282, 101, 72, 35);
		btnNewButton_7.addActionListener(delete);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Borrar");
		btnNewButton_8.setBounds(359, 101, 72, 35);
		btnNewButton_8.addActionListener(erease);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_7_1 = new JButton("=");
		btnNewButton_7_1.setBounds(182, 237, 90, 23);
		btnNewButton_7_1.addActionListener(getResult);
		contentPane.add(btnNewButton_7_1);
		
		btnNewButton_9 = new JButton("\"   -   \"");
		btnNewButton_9.setBounds(282, 152, 72, 35);
		btnNewButton_9.addActionListener(addMinusSign);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_9_1 = new JButton("\"   .   \"");
		btnNewButton_9_1.setBounds(282, 197, 72, 35);
		btnNewButton_9_1.addActionListener(addPoint);
		contentPane.add(btnNewButton_9_1);
	}
	
	ActionListener CloseWindow = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
		}
	};
	
	ActionListener aboutCalculator = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null, "Calculadora como ejercicio creada por Jan."
											+"\n"
											+"\n Esta calculadora tiene como propósito ser utilizda como un pequeño instrumento"
											+"\n para realizar pequeñas operaciones. Aun asi es bastante completa, al calcular"
											+"\n con numeros decimales (empleando el punto), y numeros positivos y negativos.");
		}
	};
	
	ActionListener setOperation = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			operation = e.getActionCommand();

			if(!textField.getText().equals("")) {
				System.out.println("olo!");
				op1 = textField.getText();
				textField.setText("");
			}
		}
	};
	
	ActionListener getResult = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(!textField.getText().equals("")) {
				op2 = textField.getText();
				//System.out.println("olo!");
				String tmp = calculator.calculate(operation, op1, op2);
				textField.setText(tmp);
			}
		}
	};
	
	ActionListener addNumber = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String tmp = textField.getText();
			tmp += e.getActionCommand();
			textField.setText(tmp);
		}
	};
	
	ActionListener addMinusSign = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(textField.getText().equals("")) {
				String tmp = textField.getText();
				tmp += "-";
				textField.setText(tmp);
			}
		}
	};
	
	ActionListener addPoint = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(!textField.getText().contains(".")) {
				String tmp = textField.getText();
				tmp += ".";
				textField.setText(tmp);
			}
		}
	};
	
	ActionListener erease = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("hjewijebfbi");
			textField.setText("");
			operation = "";
			op1 = "";
			op2 = "";
		}
	};
	
	ActionListener delete = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String tmp = textField.getText();
			System.out.println("hjewijebfbi");
			if(!tmp.equals("")) {
				tmp = tmp.replace(tmp.substring(tmp.length()-1), "");
				textField.setText(tmp);
			}
		}
	};
}
