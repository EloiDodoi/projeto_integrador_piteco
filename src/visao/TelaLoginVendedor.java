package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class TelaLoginVendedor {

	private JFrame frame;
	private JTextField txtUsuarioVendedor;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginVendedor window = new TelaLoginVendedor();
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
	public TelaLoginVendedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(150, 191, 120));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		panel.setBounds(466, 315, 650, 380);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setForeground(new Color(31, 65, 45));
		lblUsuario.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblUsuario.setBounds(37, 37, 146, 31);
		panel.add(lblUsuario);
		
		txtUsuarioVendedor = new JTextField();
		txtUsuarioVendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtUsuarioVendedor.setForeground(Color.DARK_GRAY);
		txtUsuarioVendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtUsuarioVendedor.setColumns(10);
		txtUsuarioVendedor.setBackground(Color.WHITE);
		txtUsuarioVendedor.setBounds(36, 79, 578, 39);
		panel.add(txtUsuarioVendedor);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(37, 150, 120, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*para logar insira seu e-mail ou CNPJ e a sua senha");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(37, 242, 507, 25);
		panel.add(lblNewLabel_2);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntrar.setForeground(new Color(234, 242, 237));
		btnEntrar.setFont(new Font("Alef", Font.PLAIN, 25));
		btnEntrar.setBackground(new Color(31, 65, 45));
		btnEntrar.setBounds(137, 307, 375, 46);
		panel.add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(37, 192, 577, 39);
		panel.add(passwordField);
		
		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendedor.setForeground(new Color(234, 242, 237));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 99));
		lblVendedor.setBounds(432, 50, 719, 149);
		frame.getContentPane().add(lblVendedor);
		Image img1 = new ImageIcon(this.getClass().getResource("/adm_login.png")).getImage();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
