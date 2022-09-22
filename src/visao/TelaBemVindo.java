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
		
		JLabel lblNewLabel = new JLabel("Bem Vindo!");
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		lblNewLabel.setBounds(471, 468, 440, 164);
		panel.add(lblNewLabel);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastro.setBackground(new Color(150, 191, 120));
		btnCadastro.setForeground(new Color(150, 191, 120));
		btnCadastro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		btnCadastro.setBounds(229, 602, 391, 126);
		panel.add(btnCadastro);
		
		JButton btnVenda = new JButton("Venda");
		btnVenda.setBackground(new Color(150, 191, 120));
		btnVenda.setForeground(new Color(150, 191, 120));
		btnVenda.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		btnVenda.setBounds(740, 602, 391, 126);
		panel.add(btnVenda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 50, 738);
		panel.add(panel_1);
		panel_1.setBackground(new Color(150, 191, 120));
		panel_1.setLayout(null);
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		btnMenu.setBorder(null);
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBackground(new Color(150, 191, 120));
		btnMenu.setBounds(0, 681, 50, 46);
		panel_1.add(btnMenu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1360, 40);
		panel.add(panel_2);
		panel_2.setBackground(new Color(150, 191, 120));
		panel_2.setLayout(null);
		
		JButton btnConfiguracao = new JButton("");
		btnConfiguracao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/solucao.png")));
		btnConfiguracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));
		btnConfiguracao.setBounds(1224, 0, 60, 40);
		panel_2.add(btnConfiguracao);
		
		JButton btnNotificacao = new JButton("");
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		btnNotificacao.setBounds(1171, 0, 60, 40);
		panel_2.add(btnNotificacao);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		btnUser.setBounds(1294, 0, 60, 40);
		panel_2.add(btnUser);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(234, 242, 237));
		separator.setForeground(new Color(234, 242, 237));
		separator.setBounds(1294, 0, 2, 40);
		panel_2.add(separator);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setLabelFor(labelLogo);
		labelLogo.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		labelLogo.setBounds(461, 51, 469, 402);
		panel.add(labelLogo);
	}
}
