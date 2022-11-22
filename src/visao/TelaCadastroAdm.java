package visao;

import java.awt.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaCadastroAdm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPanel panel_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAdm window = new TelaCadastroAdm();
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
	public TelaCadastroAdm() {
		initialize();
	}

	public void abrir() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(150, 191, 120));
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(1171, 174));
		panel_1.setMaximumSize(new Dimension(1171, 174));
		panel_1.setBounds(206, 93, 1171, 110);
		frame.getContentPane().add(panel_1);
		panel_1.setBackground(new Color(31, 65, 45));
		panel_1.setLayout(null);
		
		JLabel lblVendedor = new JLabel("Cadastro do Negócio");
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(234, 242, 237));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblVendedor.setBounds(25, 0, 871, 110);
		panel_1.add(lblVendedor);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(TelaCadastroAdm.class.getResource("/img/farmer-128px.png")));
		lblNewLabel_12.setBounds(1032, 0, 175, 141);
		panel_1.add(lblNewLabel_12);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(844, 230, 533, 543);
		frame.getContentPane().add(panel_3);
		panel_3.setBackground(new Color(234, 242, 237));
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Nome do seu Negócio");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 0;
		panel_3.add(lblNewLabel_11, gbc_lblNewLabel_11);
		lblNewLabel_11.setForeground(new Color(31, 65, 45));
		lblNewLabel_11.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		JTextField textField_1 = new JTextField();
		textField_1.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 1;
		panel_3.add(textField_1, gbc_textField_1);
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		JLabel lblNewLabel_8 = new JLabel("Telefone");
		lblNewLabel_8.setForeground(new Color(31, 65, 45));
		lblNewLabel_8.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(10, 6, 5, 0);
		gbc_lblNewLabel_8.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 2;
		panel_3.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBackground(new Color(234, 242, 237));
		textField_5.setBounds(31, 58, 470, 35);
		panel_3.add(textField_5);
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		JTextField textField_6 = new JTextField();
		textField_6.setBackground(new Color(234, 242, 237));
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_6.setBounds(31, 140, 470, 35);
		panel_3.add(textField_6);
		
		JLabel lblNewLabel_9 = new JLabel("CNPJ");
		lblNewLabel_9.setForeground(new Color(31, 65, 45));
		lblNewLabel_9.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 6;
		panel_3.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JTextField textField_7 = new JTextField();
		textField_7.setBackground(new Color(234, 242, 237));
		textField_7.setForeground(Color.DARK_GRAY);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_7.setBounds(31, 224, 470, 35);
		panel_3.add(textField_7);
		
		JButton btnNewButton = new JButton("Cadastrar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		panel_3.add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
		btnNewButton.setForeground(new Color(217, 173, 181));
		btnNewButton.setBackground(new Color(234, 242, 237));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 45));
		btnNewButton.setBounds(83, 399, 367, 76);
		panel_3.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(234, 242, 237));
		panel_2.setBounds(206, 230, 640, 543);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("Nome Completo");
		lblNewLabel_13.setBounds(53, 72, 248, 60);
		lblNewLabel_13.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_13.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_13.setForeground(new Color(31, 65, 45));
		lblNewLabel_13.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		panel_2.add(lblNewLabel_13);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 1;
		panel_2.add(textField_3, gbc_textField_3);
		textField_3.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("CPF");
//		lblNewLabel_13.setBounds(53, 72, 248, 60);  --- Setar a posição aqui
		lblNewLabel_2_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_2_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_2_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_2_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
//		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
//		gbc_lblNewLabel_2_1.fill = GridBagConstraints.BOTH;
//		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 0);
//		gbc_lblNewLabel_2_1.gridx = 0;
//		gbc_lblNewLabel_2_1.gridy = 2;
//		panel_2.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);  --- apagar a segunda variavel
		
		JTextField textField_2_1 = new JTextField();
		textField_2_1.setBackground(new Color(234, 242, 237));
		textField_2_1.setForeground(Color.DARK_GRAY);
		textField_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2_1.setColumns(10);
		textField_2_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_2_1.setBounds(37, 143, 565, 35);
		panel_2.add(textField_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Data de Nascimento");
		lblNewLabel_3_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_3_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3_1.gridx = 0;
		gbc_lblNewLabel_3_1.gridy = 4;
		panel_2.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_3_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.anchor = GridBagConstraints.NORTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 5;
		panel_2.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 3, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("Dia");
		lblNewLabel_4_1.setBackground(new Color(234, 242, 237));
		panel_5.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_4_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JLabel lblNewLabel_5_1 = new JLabel("Mês");
		lblNewLabel_5_1.setBackground(new Color(234, 242, 237));
		panel_5.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_5_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JLabel lblNewLabel_6_1 = new JLabel("Ano");
		lblNewLabel_6_1.setBackground(new Color(234, 242, 237));
		panel_5.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_6_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(31, 65, 45));
		comboBox.setBackground(new Color(245, 250, 248));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		comboBox.setBounds(37, 272, 73, 35);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(31, 65, 45));
		comboBox_1.setBackground(new Color(245, 250, 248));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		comboBox_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		comboBox_1.setBounds(191, 272, 159, 35);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(new Color(31, 65, 45));
		comboBox_1_1.setBackground(new Color(245, 250, 248));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		comboBox_1_1.setBounds(443, 272, 159, 35);
		panel_2.add(comboBox_1_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Senha");
		lblNewLabel_7_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_7_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_7_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_7_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_7_1.setBounds(37, 329, 293, 28);
		panel_2.add(lblNewLabel_7_1);
		
		JPasswordField passwordField_2 = new JPasswordField();
		passwordField_2.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_passwordField_2 = new GridBagConstraints();
		gbc_passwordField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_2.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_2.gridx = 0;
		gbc_passwordField_2.gridy = 7;
		panel_2.add(passwordField_2, gbc_passwordField_2);
		passwordField_2.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		passwordField_2.setForeground(Color.DARK_GRAY);
		passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_10_1 = new JLabel("Confirme sua Senha");
		lblNewLabel_10_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_10_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_10_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_10_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_10_1 = new GridBagConstraints();
		gbc_lblNewLabel_10_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_10_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_10_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10_1.gridx = 0;
		gbc_lblNewLabel_10_1.gridy = 8;
		panel_2.add(lblNewLabel_10_1, gbc_lblNewLabel_10_1);
		
		JPasswordField passwordField_1_1 = new JPasswordField();
		passwordField_1_1.setBackground(new Color(234, 242, 237));
		passwordField_1_1.setForeground(Color.DARK_GRAY);
		passwordField_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField_1_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		passwordField_1_1.setBounds(37, 438, 565, 35);
		panel_2.add(passwordField_1_1);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
