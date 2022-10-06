package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TelaBemVindo extends JFrame {

	private JPanel contentPane;
	private JPanel painelMenu;
	static TelaBemVindo frame = new TelaBemVindo();
	private int statusMenu = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public void abrir() {
		TelaBemVindo frame = new TelaBemVindo();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public TelaBemVindo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(234, 242, 237));
		panel.setLayout(null);
		
		painelMenu = new JPanel();
		painelMenu.setBounds(51, 0, 181, 699);
		painelMenu.setLayout(new BorderLayout());
		panel.add(painelMenu);
	
		JLabel lblTitulo = new JLabel("Bem Vindo!");
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		lblTitulo.setBounds(471, 468, 440, 164);
		panel.add(lblTitulo);

		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setBorder(new LineBorder(new Color(150, 191, 120), 3, true));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroProduto cadastro_produto = new TelaCadastroProduto();
				cadastro_produto.abrir();
				frame.setVisible(false);
			}
		});
		btnCadastro.setBackground(new Color(234, 242, 237));
		btnCadastro.setForeground(new Color(150, 191, 120));
		btnCadastro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		btnCadastro.setBounds(229, 602, 391, 126);
		panel.add(btnCadastro);

		JButton btnVenda = new JButton("Venda");
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVenda tela_venda = new TelaVenda();
				tela_venda.abrir();
				frame.setVisible(false);
			}
		});
		btnVenda.setBorder(new LineBorder(new Color(150, 191, 120), 3, true));
		btnVenda.setBackground(new Color(234, 242, 237));
		btnVenda.setForeground(new Color(150, 191, 120));
		btnVenda.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		btnVenda.setBounds(740, 602, 391, 126);
		panel.add(btnVenda);
		
		JLabel Logo = new JLabel("");
		Logo.setLabelFor(Logo);
		Logo.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		Logo.setBounds(461, 51, 469, 402);
		panel.add(Logo);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 55, 699);
		panel.add(panel_1);
		panel_1.setBackground(new Color(150, 191, 120));

		JButton btnMenu1 = new JButton("");
		btnMenu1.setBounds(0, 648, 50, 50);
//		BarraLateral.add(btnMenu);
		btnMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (statusMenu == 0) {
				
				//			if (se for perfil adm) {
				MenuAdm menuAdm = new MenuAdm();
				painelMenu.add(menuAdm,  BorderLayout.CENTER);
				painelMenu.revalidate();
				painelMenu.repaint();
//			} else 
//			if (se for perfil vendedor) {
//				MenuVendedor menuVenda = new MenuVendedor();
//				menuVenda.abrir();
//			}
				statusMenu++;
			} else if (statusMenu == 1) {
				painelMenu.removeAll();
				painelMenu.revalidate();
				painelMenu.repaint();
				statusMenu--;
			}
			}
		});
		panel_1.setLayout(null);
		btnMenu1.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		btnMenu1.setBorder(null);
		btnMenu1.setForeground(new Color(234, 242, 237));
		btnMenu1.setBackground(new Color(150, 191, 120));
		panel_1.add(btnMenu1);

		JPanel BarraSuperior = new JPanel();
		contentPane.add(BarraSuperior, BorderLayout.NORTH);
		BarraSuperior.setBackground(new Color(150, 191, 120));

		BarraSuperior.setLayout(null);

		JButton btnConfiguracao = new JButton("");
		btnConfiguracao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/solucao.png")));
		btnConfiguracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));

		btnConfiguracao.setBounds(1236, 0, 60, 40);
		BarraSuperior.add(btnConfiguracao);

		JButton btnNotificacao = new JButton("");
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));

		btnNotificacao.setBounds(1178, 0, 60, 40);
		BarraSuperior.add(btnNotificacao);

		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));

		GroupLayout gl_BarraSuperior = new GroupLayout(BarraSuperior);
		gl_BarraSuperior.setHorizontalGroup(
			gl_BarraSuperior.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BarraSuperior.createSequentialGroup()
					.addGap(1294)
					.addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_BarraSuperior.createSequentialGroup()
					.addGap(1236)
					.addComponent(btnConfiguracao, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_BarraSuperior.createSequentialGroup()
					.addGap(1178)
					.addComponent(btnNotificacao, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
		);
		gl_BarraSuperior.setVerticalGroup(
			gl_BarraSuperior.createParallelGroup(Alignment.LEADING)
				.addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnConfiguracao, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNotificacao, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
		);
		BarraSuperior.setLayout(gl_BarraSuperior);

		btnUser.setBounds(1294, 0, 60, 40);
		BarraSuperior.add(btnUser);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(234, 242, 237));
		separator.setForeground(new Color(234, 242, 237));
		separator.setBounds(1294, 0, 2, 40);
		BarraSuperior.add(separator);

		JLabel Logo1 = new JLabel("");
		Logo1.setLabelFor(Logo1);
		Logo1.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		Logo1.setBounds(461, 51, 469, 402);
		panel.add(Logo1);
	}
}
