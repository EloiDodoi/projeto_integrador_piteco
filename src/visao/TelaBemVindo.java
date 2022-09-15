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

public class TelaBemVindo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBemVindo frame = new TelaBemVindo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaBemVindo() 
	{
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
		
		JLabel lblTitulo = new JLabel("Bem Vindo!");
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		lblTitulo.setBounds(471, 468, 440, 164);
		panel.add(lblTitulo);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setBorder(new LineBorder(new Color(150, 191, 120), 3, true));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastro.setBackground(new Color(234, 242, 237));
		btnCadastro.setForeground(new Color(150, 191, 120));
		btnCadastro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		btnCadastro.setBounds(229, 602, 391, 126);
		panel.add(btnCadastro);
		
		JButton btnVenda = new JButton("Venda");
		btnVenda.setBorder(new LineBorder(new Color(150, 191, 120), 3, true));
		btnVenda.setBackground(new Color(234, 242, 237));
		btnVenda.setForeground(new Color(150, 191, 120));
		btnVenda.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		btnVenda.setBounds(740, 602, 391, 126);
		panel.add(btnVenda);
		
		JPanel BarraLateral = new JPanel();
		BarraLateral.setBounds(0, 0, 40, 750);
		panel.add(BarraLateral);
		BarraLateral.setBackground(new Color(150, 191, 120));
		BarraLateral.setLayout(null);
		
		JButton btnMenu = new JButton("");
		btnMenu.setBounds(-6, 685, 52, 48);
		BarraLateral.add(btnMenu);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		btnMenu.setBorder(null);
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBackground(new Color(150, 191, 120));
		
		JPanel BarraSuperior = new JPanel();
		BarraSuperior.setBounds(0, 0, 1370, 40);
		panel.add(BarraSuperior);
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
		btnUser.setBounds(1294, 0, 60, 40);
		BarraSuperior.add(btnUser);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(234, 242, 237));
		separator.setForeground(new Color(234, 242, 237));
		separator.setBounds(1294, 0, 2, 40);
		BarraSuperior.add(separator);
		
		JLabel Logo = new JLabel("");
		Logo.setLabelFor(Logo);
		Logo.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		Logo.setBounds(461, 51, 469, 402);
		panel.add(Logo);
	}
}
