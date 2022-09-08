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
		lblNewLabel.setBounds(455, 320, 440, 164);
		panel.add(lblNewLabel);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastro.setBackground(new Color(150, 191, 120));
		btnCadastro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(150, 191, 120), null));
		btnCadastro.setForeground(new Color(150, 191, 120));
		btnCadastro.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 65));
		btnCadastro.setBounds(226, 517, 391, 126);
		panel.add(btnCadastro);
		
		JButton btnVenda = new JButton("Venda");
		btnVenda.setBackground(new Color(150, 191, 120));
		btnVenda.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(150, 191, 120), null));
		btnVenda.setForeground(new Color(150, 191, 120));
		btnVenda.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 65));
		btnVenda.setBounds(746, 517, 391, 126);
		panel.add(btnVenda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 64, 738);
		panel.add(panel_1);
		panel_1.setBackground(new Color(150, 191, 120));
		panel_1.setLayout(null);
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon("C:\\Users\\Lenovo\\projeto_integrador_piteco\\img\\menu-aberto.png"));
		btnMenu.setBorder(null);
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBackground(new Color(150, 191, 120));
		btnMenu.setBounds(0, 681, 64, 46);
		panel_1.add(btnMenu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1360, 40);
		panel.add(panel_2);
		panel_2.setBackground(new Color(150, 191, 120));
		panel_2.setLayout(null);
		
		JButton btnConfiguracao = new JButton("");
		btnConfiguracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));
		btnConfiguracao.setIcon(new ImageIcon("C:\\Users\\Lenovo\\projeto_integrador_piteco\\img\\solucao.png"));
		btnConfiguracao.setBounds(1224, 0, 60, 40);
		panel_2.add(btnConfiguracao);
		
		JButton btnConfiguracao_1 = new JButton("");
		btnConfiguracao_1.setBorder(null);
		btnConfiguracao_1.setBackground(new Color(150, 191, 120));
		btnConfiguracao_1.setBounds(1171, 0, 60, 40);
		panel_2.add(btnConfiguracao_1);
	}
}
