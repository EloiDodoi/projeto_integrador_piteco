package visao;

import controle.LoginVendedorBD;
import controle.Md5;
import modelo.Usuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class TelaLoginVendedor {

	private static JFrame frame;
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
					window.frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
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

	public void abrir() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Tela Login Vendedor");
		frame.getContentPane().setBackground(new Color(150, 191, 120));
		frame.getContentPane().setLayout(null);

		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendedor.setForeground(new Color(234, 242, 237));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 99));
		lblVendedor.setBounds(421, 50, 528, 149);
		frame.getContentPane().add(lblVendedor);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLoginVendedor.class.getResource("/img/vendedora-removebg-preview.png")));
		lblNewLabel.setBounds(596, 183, 180, 180);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(234, 242, 237));
		panel1.setBounds(360, 315, 650, 380);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);

		JLabel lblUsuario1 = new JLabel("Usuário");
		lblUsuario1.setForeground(new Color(31, 65, 45));
		lblUsuario1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblUsuario1.setBounds(37, 37, 146, 31);
		panel1.add(lblUsuario1);

		txtUsuarioVendedor = new JTextField();
		txtUsuarioVendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtUsuarioVendedor.setForeground(Color.DARK_GRAY);
		txtUsuarioVendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtUsuarioVendedor.setColumns(10);
		txtUsuarioVendedor.setBackground(Color.WHITE);
		txtUsuarioVendedor.setBounds(36, 79, 578, 39);
		panel1.add(txtUsuarioVendedor);

		JLabel lblNewLabel_11 = new JLabel("Senha");
		lblNewLabel_11.setForeground(new Color(31, 65, 45));
		lblNewLabel_11.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_11.setBackground(SystemColor.menu);
		lblNewLabel_11.setBounds(37, 150, 120, 31);
		panel1.add(lblNewLabel_11);

		JLabel lblNewLabel_21 = new JLabel("*para logar insira seu e-mail e a sua senha");
		lblNewLabel_21.setForeground(Color.DARK_GRAY);
		lblNewLabel_21.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel_21.setBounds(37, 242, 507, 25);
		panel1.add(lblNewLabel_21);

		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(37, 192, 577, 39);
		panel1.add(passwordField);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TelaInicial ti = new TelaInicial();
				ti.setVisible(true);
				ti.setExtendedState(ti.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton.setIcon(new ImageIcon(TelaLoginVendedor.class.getResource("/img/voltar.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(150, 191, 120));
		btnNewButton.setBounds(10, 11, 100, 100);
		frame.getContentPane().add(btnNewButton);

		URL resource = this.getClass().getResource("../img/adm_login.png");
		Image img1 = new ImageIcon(resource).getImage();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnEntrar1 = new JButton("Entrar");
		btnEntrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario login = new Usuario(0, null, null, null, null, null, passwordField.getText(), txtUsuarioVendedor.getText(), 0);
				LoginVendedorBD lg = new LoginVendedorBD();
				if (lg.autenticar(login)== null ) {
					System.out.println("Erro Login");
					JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos, tente novamente!");
				}else {
					System.out.println("Login feito com êxito");
					TelaBemVindo tb = new TelaBemVindo();
					tb.abrir();
				}
			}
		});
		btnEntrar1.setForeground(new Color(234, 242, 237));
		btnEntrar1.setFont(new Font("Alef", Font.PLAIN, 25));
		btnEntrar1.setBackground(new Color(31, 65, 45));
		btnEntrar1.setBounds(137, 307, 375, 46);
		panel1.add(btnEntrar1);
	}
}
