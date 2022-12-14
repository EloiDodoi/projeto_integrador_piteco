package visao;

import controle.LoginAdmBD;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.security.PublicKey;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import modelo.Usuario;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import visao.TelaBemVindo;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class TelaLoginAdm {

	private JFrame frmLoginDoAdministrador;
	private JTextField txt_login;
	private JPasswordField txt_senha;
	static TelaLoginAdm window = new TelaLoginAdm();

	static Usuario user;

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
					window.frmLoginDoAdministrador.setExtendedState(
							window.frmLoginDoAdministrador.getExtendedState() | JFrame.MAXIMIZED_BOTH);

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

	public void abrir() {
		frmLoginDoAdministrador.setVisible(true);
		frmLoginDoAdministrador.setLocationRelativeTo(null);
		frmLoginDoAdministrador.setExtendedState(frmLoginDoAdministrador.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	private void initialize() {
		frmLoginDoAdministrador = new JFrame();
		frmLoginDoAdministrador.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLoginAdm.class.getResource("/img/1.png")));
		frmLoginDoAdministrador.setResizable(false);
		frmLoginDoAdministrador.setTitle("Login do Administrador");
		frmLoginDoAdministrador.getContentPane().setBackground(new Color(150, 191, 120));
		frmLoginDoAdministrador.getContentPane().setLayout(null);

		JLabel lblAdm = new JLabel("Administrador");
		lblAdm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdm.setForeground(new Color(234, 242, 237));
		lblAdm.setBounds(325, 50, 719, 149);
		lblAdm.setFont(new Font("Dialog", Font.PLAIN, 100));
		frmLoginDoAdministrador.getContentPane().add(lblAdm);

		JLabel image = new JLabel("");
		image.setBackground(new Color(255, 255, 255));
		image.setForeground(new Color(255, 255, 255));
		image.setIcon(new ImageIcon(TelaLoginAdm.class.getResource("/img/agricultor-removebg-preview.png")));
		image.setBounds(595, 189, 180, 180);
		frmLoginDoAdministrador.getContentPane().add(image);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(234, 242, 237));
		panel_1.setBounds(360, 315, 650, 450);
		frmLoginDoAdministrador.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel.setBounds(37, 38, 146, 31);
		panel_1.add(lblNewLabel);

		txt_login = new JTextField();
		txt_login.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_login.setBackground(Color.WHITE);
		txt_login.setForeground(Color.DARK_GRAY);
		txt_login.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_login.setBounds(36, 80, 578, 39);
		panel_1.add(txt_login);
		txt_login.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(37, 150, 120, 31);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("*para logar insira seu e-mail ou CNPJ e a sua senha");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(37, 242, 507, 25);
		panel_1.add(lblNewLabel_2);

		JButton btn_entrar_adm = new JButton("Entrar");
		btn_entrar_adm.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		btn_entrar_adm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario login = new Usuario(0, null, null, null, null, null, txt_senha.getText(), txt_login.getText(), null, 0);
				LoginAdmBD lg;
				lg = new LoginAdmBD();
				if (lg.autenticar(login) == null) {
					System.out.println("Erro Login");
					JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos, tente novamente!");
				} else {
					System.out.println("Login feito com ??xito");
					TelaBemVindo tb = new TelaBemVindo();
					user = lg.autenticar(login);
					System.out.println(user.getUsuario_email());
					tb.abrir();
					frmLoginDoAdministrador.setVisible(false);
				}

			}
		});
		btn_entrar_adm.setForeground(new Color(234, 242, 237));
		btn_entrar_adm.setBackground(new Color(31, 65, 45));
		btn_entrar_adm.setFont(new Font("Alef", Font.PLAIN, 25));
		btn_entrar_adm.setBounds(138, 307, 375, 46);
		panel_1.add(btn_entrar_adm);

		JButton btn_cadastrar_adm = new JButton("Cadastrar");
		btn_cadastrar_adm.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		btn_cadastrar_adm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginDoAdministrador.setVisible(false);
				TelaCadastroAdm tela_cadastro = new TelaCadastroAdm();
				tela_cadastro.abrir();
			}
		});
		btn_cadastrar_adm.setForeground(new Color(31, 65, 45));
		btn_cadastrar_adm.setBackground(new Color(255, 255, 255));
		btn_cadastrar_adm.setFont(new Font("Alef", Font.PLAIN, 25));
		btn_cadastrar_adm.setBounds(138, 364, 375, 45);
		panel_1.add(btn_cadastrar_adm);

		txt_senha = new JPasswordField();
		txt_senha.setForeground(Color.DARK_GRAY);
		txt_senha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_senha.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_senha.setBounds(37, 192, 577, 39);
		panel_1.add(txt_senha);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(TelaLoginAdm.class.getResource("/img/voltar.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial ti = new TelaInicial();
				ti.setVisible(true);
				ti.setExtendedState(ti.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				frmLoginDoAdministrador.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(150, 191, 120));
		btnNewButton.setBounds(10, 11, 100, 100);
		frmLoginDoAdministrador.getContentPane().add(btnNewButton);
		frmLoginDoAdministrador.setBounds(100, 100, 1600, 850);
		frmLoginDoAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	protected void setVisible(boolean b) {
	}
	
	public Usuario retornaUser() {
		this.user = user;
		return user;
	}
}
