package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(TelaCadastroAdm.class.getResource("/img/farmer-128px.png")));
		lblNewLabel_12.setBounds(1032, 0, 175, 141);
		panel_1.add(lblNewLabel_12);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(234, 242, 237));
		panel_2.setBounds(206, 230, 640, 543);
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{37, 73, 81, 159, 93, 159, 0};
		gbl_panel_2.rowHeights = new int[]{31, 28, 35, 28, 35, 28, 62, 61, 60, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 5;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		panel_2.add(textField, gbc_textField);
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setForeground(new Color(31, 65, 45));
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(245, 250, 248));
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridwidth = 5;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		panel_2.add(textField_2, gbc_textField_2);
		
		lblNewLabel_3 = new JLabel("Data de Nascimento");
		lblNewLabel_3.setForeground(new Color(31, 65, 45));
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 5;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setForeground(new Color(31, 65, 45));
		lblNewLabel_4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(31, 65, 45));
		comboBox.setBackground(new Color(245, 250, 248));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.SOUTHWEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 6;
		panel_2.add(comboBox, gbc_comboBox);
		
		lblNewLabel_5 = new JLabel("Mês");
		lblNewLabel_5.setForeground(new Color(31, 65, 45));
		lblNewLabel_5.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 6;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(31, 65, 45));
		comboBox_1.setBackground(new Color(245, 250, 248));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		comboBox_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 6;
		panel_2.add(comboBox_1, gbc_comboBox_1);
		
		lblNewLabel_6 = new JLabel("Ano");
		lblNewLabel_6.setForeground(new Color(31, 65, 45));
		lblNewLabel_6.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6.gridx = 5;
		gbc_lblNewLabel_6.gridy = 6;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(new Color(31, 65, 45));
		comboBox_1_1.setBackground(new Color(245, 250, 248));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_comboBox_1_1 = new GridBagConstraints();
		gbc_comboBox_1_1.anchor = GridBagConstraints.SOUTH;
		gbc_comboBox_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1_1.gridx = 5;
		gbc_comboBox_1_1.gridy = 6;
		panel_2.add(comboBox_1_1, gbc_comboBox_1_1);
		
		lblNewLabel_7 = new JLabel("Senha");
		lblNewLabel_7.setForeground(new Color(31, 65, 45));
		lblNewLabel_7.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridwidth = 3;
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.SOUTH;
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridwidth = 5;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 7;
		panel_2.add(passwordField, gbc_passwordField);
		passwordField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(234, 242, 237));
		passwordField_1.setForeground(Color.DARK_GRAY);
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.anchor = GridBagConstraints.SOUTH;
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridwidth = 5;
		gbc_passwordField_1.gridx = 1;
		gbc_passwordField_1.gridy = 8;
		panel_2.add(passwordField_1, gbc_passwordField_1);
		
		lblNewLabel_10 = new JLabel("Confirme sua Senha");
		lblNewLabel_10.setForeground(new Color(31, 65, 45));
		lblNewLabel_10.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_10.gridwidth = 3;
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 8;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(844, 230, 533, 543);
		frame.getContentPane().add(panel_3);
		panel_3.setBackground(new Color(234, 242, 237));
		panel_3.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(234, 242, 237));
		textField_5.setBounds(31, 58, 470, 35);
		panel_3.add(textField_5);
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(234, 242, 237));
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_6.setBounds(31, 140, 470, 35);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(234, 242, 237));
		textField_7.setForeground(Color.DARK_GRAY);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_7.setBounds(31, 224, 470, 35);
		panel_3.add(textField_7);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(31, 65, 45));
		panel_4.setBorder(new LineBorder(new Color(31, 65, 45), 50, true));
		panel_4.setBounds(31, 26, 301, 35);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel_11 = new JLabel("Nome do seu Negócio");
		lblNewLabel_11.setBounds(4, 3, 293, 28);
		panel_4.add(lblNewLabel_11);
		lblNewLabel_11.setForeground(new Color(234, 242, 237));
		lblNewLabel_11.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		lblNewLabel_8 = new JLabel("Telefone");
		lblNewLabel_8.setForeground(new Color(31, 65, 45));
		lblNewLabel_8.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_8.setBounds(31, 113, 293, 28);
		panel_3.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("CNPJ");
		lblNewLabel_9.setForeground(new Color(31, 65, 45));
		lblNewLabel_9.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_9.setBounds(31, 280, 293, 28);
		panel_3.add(lblNewLabel_9);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
		btnNewButton.setForeground(new Color(217, 173, 181));
		btnNewButton.setBackground(new Color(234, 242, 237));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 45));
		btnNewButton.setBounds(83, 399, 367, 76);
		panel_3.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(234, 242, 237));
		textField_1.setBounds(29, 308, 472, 35);
		panel_3.add(textField_1);
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(31, 197, 293, 28);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		panel.setBounds(206, 202, 1171, 543);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
