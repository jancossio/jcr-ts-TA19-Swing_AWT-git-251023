import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Miniencuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JLabel lblNewLabel;
	private JSlider slider;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnLinux;
	private JRadioButton rdbtnMacos;
	private ButtonGroup groupOS;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnProgramacion;
	private JRadioButton rdbtnDisGraf;
	private JRadioButton rdbtnAdminist;
	private JLabel lblNewLabel_2;
	private JLabel lblSlider;
	private JButton btnNewButton;
	
	/**
	 * Create the frame.
	 */
	public Miniencuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Elija su sistema operativo (solo una opcion):");
		lblNewLabel.setBounds(70, 22, 250, 23);
		contentPane.add(lblNewLabel);
		
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(132, 53, 109, 23);
		contentPane.add(rdbtnWindows);
		
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(132, 79, 109, 23);
		contentPane.add(rdbtnLinux);
		
		rdbtnMacos = new JRadioButton("MacOs");
		rdbtnMacos.setBounds(132, 105, 109, 23);
		contentPane.add(rdbtnMacos);	
		
		groupOS = new ButtonGroup();
		groupOS.add(rdbtnWindows);
		groupOS.add(rdbtnLinux);
		groupOS.add(rdbtnMacos);
		
		lblNewLabel_1 = new JLabel("Elija su especialidad:");
		lblNewLabel_1.setBounds(70, 145, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		rdbtnProgramacion = new JRadioButton("Programacion");
		rdbtnProgramacion.setBounds(132, 166, 109, 23);
		contentPane.add(rdbtnProgramacion);
		
		rdbtnDisGraf = new JRadioButton("Diseño grafico");
		rdbtnDisGraf.setBounds(132, 196, 109, 23);
		contentPane.add(rdbtnDisGraf);
		
		rdbtnAdminist = new JRadioButton("Administracion");
		rdbtnAdminist.setBounds(132, 226, 109, 23);
		contentPane.add(rdbtnAdminist);
		
		lblNewLabel_2 = new JLabel("Introduce tus horas dedicadas en el ordenador:");
		lblNewLabel_2.setBounds(69, 269, 270, 23);
		contentPane.add(lblNewLabel_2);
		
		lblSlider = new JLabel("0");
		lblSlider.setBounds(293, 294, 46, 26);
		contentPane.add(lblSlider);
		
		
		slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setValue(0);
		slider.setMinimum(0);
		slider.setMaximum(10);
		slider.setBounds(85, 294, 200, 26);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent  ce) {
				lblSlider.setText(String.valueOf(slider.getValue()));
			}
		});
		contentPane.add(slider);
		
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(152, 337, 89, 23);
		btnNewButton.addActionListener(sendSurvey);
		contentPane.add(btnNewButton);
	}
	
	ActionListener sendSurvey = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(groupOS.getSelection() != null) {
				
				String exitMessage = "Posees el sistema operativo: ";
				
				if(rdbtnWindows.isSelected()) {
					exitMessage += "Windows.";
				}
				else if(rdbtnLinux.isSelected()) {
					exitMessage += "Linux.";
				}else{
					exitMessage += "MacOS.";
				}
				
				exitMessage += "\n";
				exitMessage += "\nTe has especializado en: ";

				if(rdbtnProgramacion.isSelected()) {
					exitMessage += "\n -Programacion";
				}
				
				if(rdbtnProgramacion.isSelected()) {
					exitMessage += "\n -Diseño Grafico";
				}
				
				if(rdbtnProgramacion.isSelected()) {
					exitMessage += "\n -Administracion";
				}
				
				exitMessage += "\n";
				exitMessage += "\nY, gastas un total de "+String.valueOf(slider.getValue())+" horas diarias en el ordenador.";
				
				JOptionPane.showMessageDialog(null, exitMessage);
			}
		}
	};
	
}
