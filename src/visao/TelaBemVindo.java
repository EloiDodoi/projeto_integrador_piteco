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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;

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
		setBounds(100, 100, 1034, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(234, 242, 237));
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(234, 242, 237));
		panel.add(panel_3, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {40, 381, 68, 386, 40};
		gbl_panel_3.rowHeights = new int[] {0, 97, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnCadastro = new JButton("Cadastro");
		GridBagConstraints gbc_btnCadastro = new GridBagConstraints();
		gbc_btnCadastro.fill = GridBagConstraints.BOTH;
		gbc_btnCadastro.insets = new Insets(0, 0, 10, 5);
		gbc_btnCadastro.gridx = 1;
		gbc_btnCadastro.gridy = 1;
		panel_3.add(btnCadastro, gbc_btnCadastro);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastro.setBackground(new Color(150, 191, 120));
		btnCadastro.setForeground(new Color(150, 191, 120));
		btnCadastro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		
		JButton btnVenda = new JButton("Venda");
		GridBagConstraints gbc_btnVenda = new GridBagConstraints();
		gbc_btnVenda.insets = new Insets(0, 0, 10, 0);
		gbc_btnVenda.fill = GridBagConstraints.BOTH;
		gbc_btnVenda.gridx = 3;
		gbc_btnVenda.gridy = 1;
		panel_3.add(btnVenda, gbc_btnVenda);
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVenda.setBackground(new Color(150, 191, 120));
		btnVenda.setForeground(new Color(150, 191, 120));
		btnVenda.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(234, 242, 237));
		panel.add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {600};
		gbl_panel_4.rowHeights = new int[] {400, 0, 200};
		gbl_panel_4.columnWeights = new double[]{0.0};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_4.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo!");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_4.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setBackground(new Color(150, 191, 120));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		btnMenu.setBorder(null);
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBackground(new Color(150, 191, 120));
		panel_1.add(btnMenu, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		panel_2.setBackground(new Color(150, 191, 120));
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(150, 191, 120));
		panel_2.add(panel_8, BorderLayout.EAST);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[] {30, 30, 20, 30, 20};
		gbl_panel_8.rowHeights = new int[]{33, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_8.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel_8.add(separator, gbc_separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(234, 242, 237));
		separator.setForeground(new Color(234, 242, 237));
		
		JButton btnConfiguracao = new JButton("");
		GridBagConstraints gbc_btnConfiguracao = new GridBagConstraints();
		gbc_btnConfiguracao.insets = new Insets(0, 0, 0, 5);
		gbc_btnConfiguracao.gridx = 1;
		gbc_btnConfiguracao.gridy = 0;
		panel_8.add(btnConfiguracao, gbc_btnConfiguracao);
		btnConfiguracao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/solucao.png")));
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));
		
		JButton btnNotificacao = new JButton("");
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 2;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		
		JButton btnUser = new JButton("");
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 5, 10);
		gbc_btnUser.gridx = 4;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
	}
}
