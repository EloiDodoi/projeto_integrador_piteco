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
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class TelaLoginAdm {

	private JFrame frmLoginDoAdministrador;
	private JTextField txtUsuarioAdm;
	private JTextField txtSenhaAdm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginAdm window = new TelaLoginAdm();
					window.frmLoginDoAdministrador.setVisible(true);
					window.frmLoginDoAdministrador.setLocationRelativeTo(null);
					window.frmLoginDoAdministrador.setExtendedState(window.frmLoginDoAdministrador.getExtendedState() | JFrame.MAXIMIZED_BOTH);

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
		frmLoginDoAdministrador = new JFrame();
		frmLoginDoAdministrador.setResizable(false);
		frmLoginDoAdministrador.setTitle("Login do Administrador");
		frmLoginDoAdministrador.getContentPane().setBackground(new Color(150, 191, 120));
		frmLoginDoAdministrador.getContentPane().setLayout(null);

		JLabel lblAdm = new JLabel("Administrador");
		lblAdm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdm.setForeground(new Color(234, 242, 237));
		lblAdm.setBounds(432, 50, 719, 149);
		lblAdm.setFont(new Font("Dialog", Font.PLAIN, 100));
		frmLoginDoAdministrador.getContentPane().add(lblAdm);

		JPanel panel_1 =  new JPanel();
		panel_1.setBackground(new Color(234, 242, 237));
		panel_1.setBounds(466, 315, 651, 450);
		frmLoginDoAdministrador.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel.setBounds(37, 38, 146, 31);
		panel_1.add(lblNewLabel);
		
		txtUsuarioAdm = new JTextField();
		txtUsuarioAdm.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtUsuarioAdm.setBackground(Color.WHITE);
		txtUsuarioAdm.setForeground(Color.DARK_GRAY);
		txtUsuarioAdm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtUsuarioAdm.setBounds(36, 80, 578, 39);
		panel_1.add(txtUsuarioAdm);
		txtUsuarioAdm.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(37, 150, 120, 31);
		panel_1.add(lblNewLabel_1);
		
		txtSenhaAdm = new JTextField();
		txtSenhaAdm.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtSenhaAdm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSenhaAdm.setBounds(36, 192, 578, 39);
		panel_1.add(txtSenhaAdm);
		txtSenhaAdm.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*para logar insira seu e-mail ou CNPJ e a sua senha");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(37, 242, 507, 25);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(new Color(234, 242, 237));
		btnNewButton.setBackground(new Color(31, 65, 45));
		btnNewButton.setFont(new Font("Alef", Font.PLAIN, 25));
		btnNewButton.setBounds(138, 307, 375, 46);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(new Color(31, 65, 45));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Alef", Font.PLAIN, 25));
		btnNewButton_1.setBounds(138, 364, 375, 45);
		panel_1.add(btnNewButton_1);
		frmLoginDoAdministrador.setBounds(100, 100, 1600, 850);
		frmLoginDoAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
