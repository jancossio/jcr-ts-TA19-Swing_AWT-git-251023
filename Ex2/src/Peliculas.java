import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Peliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public Peliculas() {
		setTitle("Lista de Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Agregar");		
		btnNewButton.setBounds(297, 82, 88, 23);
		btnNewButton.addActionListener(addNewMovie);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Introduce las peliculas que quieras:");
		lblNewLabel.setBounds(116, 34, 211, 23);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(129, 143, 158, 23);
		comboBox.setEditable(true);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(129, 82, 158, 23);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	ActionListener addNewMovie = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(!textField.getText().equals("")) {
				comboBox.addItem(textField.getText());
				textField.setText("");
			}
		}
	};
}
