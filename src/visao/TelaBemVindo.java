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
		btnCadastro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnCadastro.setForeground(new Color(150, 191, 120));
		btnCadastro.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 65));
		btnCadastro.setBounds(226, 517, 391, 126);
		panel.add(btnCadastro);
		
		JButton btnVenda = new JButton("Venda");
		btnVenda.setBackground(new Color(150, 191, 120));
		btnVenda.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnVenda.setForeground(new Color(150, 191, 120));
		btnVenda.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 65));
		btnVenda.setBounds(746, 517, 391, 126);
		panel.add(btnVenda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 47, 738);
		panel.add(panel_1);
		panel_1.setBackground(new Color(150, 191, 120));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1360, 40);
		panel.add(panel_2);
		panel_2.setBackground(new Color(150, 191, 120));
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(150, 191, 120));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\solucao.png"));
		btnNewButton.setBounds(1251, 0, 60, 40);
		panel_2.add(btnNewButton);
	}
}
