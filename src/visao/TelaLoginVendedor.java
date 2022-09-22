package visao;
import controle.LoginVendedorBD;
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
	private JTextField txt_login;
	private JPasswordField txt_senha;

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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLoginVendedor.class.getResource("/img/vendedora-removebg-preview.png")));
		lblNewLabel.setBounds(702, 200, 180, 180);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		panel.setBounds(467, 345, 650, 380);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setForeground(new Color(31, 65, 45));
		lblUsuario.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblUsuario.setBounds(37, 37, 146, 31);
		panel.add(lblUsuario);

		txt_login = new JTextField();
		txt_login.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_login.setForeground(Color.DARK_GRAY);
		txt_login.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_login.setColumns(10);
		txt_login.setBackground(Color.WHITE);
		txt_login.setBounds(36, 79, 578, 39);
		panel.add(txt_login);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(37, 150, 120, 31);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("*para logar insira seu e-mail e a sua senha");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(37, 242, 507, 25);
		panel.add(lblNewLabel_2);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario login = new Usuario(0, null, null, null, null, null, txt_senha.getText(), txt_login.getText(), 0);
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
		btnEntrar.setForeground(new Color(234, 242, 237));
		btnEntrar.setFont(new Font("Alef", Font.PLAIN, 25));
		btnEntrar.setBackground(new Color(31, 65, 45));
		btnEntrar.setBounds(137, 307, 375, 46);
		panel.add(btnEntrar);

		txt_senha = new JPasswordField();
		txt_senha.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_senha.setForeground(Color.DARK_GRAY);
		txt_senha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_senha.setBounds(37, 192, 577, 39);
		panel.add(txt_senha);

		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendedor.setForeground(new Color(234, 242, 237));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 99));
		lblVendedor.setBounds(528, 50, 528, 149);
		frame.getContentPane().add(lblVendedor);
																																		
		URL resource = this.getClass().getResource("../img/adm_login.png");
		Image img1 = new ImageIcon(resource).getImage();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
