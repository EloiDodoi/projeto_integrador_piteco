package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLoginAdm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginAdm window = new TelaLoginAdm();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setExtendedState(window.frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLoginAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(153, 204, 153));
		frame.getContentPane().setLayout(null);

		JLabel lblAdm = new JLabel("Administrador");
		lblAdm.setForeground(Color.WHITE);
		lblAdm.setBounds(423, 51, 719, 149);
		lblAdm.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 99));
		frame.getContentPane().add(lblAdm);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(445, 312, 655, 445);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setForeground(new Color(0, 51, 0));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel.setBounds(37, 38, 146, 31);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(37, 80, 578, 39);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_1.setForeground(new Color(0, 51, 0));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(37, 150, 120, 31);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setBounds(37, 192, 578, 39);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*para logar insira seu e-mail ou CNPJ e a sua senha");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(37, 257, 507, 25);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 51, 0));
		btnNewButton.setFont(new Font("Alef", Font.PLAIN, 25));
		btnNewButton.setBounds(124, 307, 375, 46);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setForeground(new Color(0, 51, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Alef", Font.PLAIN, 25));
		btnNewButton_1.setBounds(124, 364, 375, 45);
		panel_1.add(btnNewButton_1);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
