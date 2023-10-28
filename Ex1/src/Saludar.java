import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	
	public Saludar() {
		
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Escribe un nombre para saludar:");
		lblNewLabel.setBounds(128, 58, 196, 26);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Saludar");
		btnNewButton.setBounds(171, 159, 90, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(showMessadeSaludo);

		
		textField = new JTextField();
		textField.setBounds(137, 113, 160, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		
	}
	
	ActionListener showMessadeSaludo = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(!textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "¡Hola "+textField.getText()+"!");
			}
		}
	};
}
