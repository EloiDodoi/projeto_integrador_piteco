package visao;

import java.awt.*;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import net.miginfocom.swing.MigLayout;


public class TelaCadastroAdm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
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
	private JButton btnNewButton_1;

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

	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(150, 191, 120));
		frame.getContentPane().setLayout(new MigLayout("", "[1px][205px][1378px]", "[1px][201px][609px]"));
		
		
		JPanel panel_7 = new JPanel();
		frame.getContentPane().add(panel_7, "cell 0 0,grow");
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel borda_1 = new JPanel();
		borda_1.setBorder(new EmptyBorder(10, 10, 10, 10));
		borda_1.setBackground(new Color(150, 191,120));
		panel_7.add(borda_1, BorderLayout.NORTH);
		
		JPanel borda_2 = new JPanel();
		borda_2.setBorder(new EmptyBorder(10, 10, 10, 10));
		borda_2.setBackground(new Color(150, 191,120));
		panel_7.add(borda_2, BorderLayout.SOUTH);
		
		JPanel borda_3 = new JPanel();
		borda_3.setBorder(new EmptyBorder(50, 50, 50, 50));
		borda_3.setBackground(new Color(150, 191,120));
		panel_7.add(borda_3, BorderLayout.WEST);
		
		JPanel borda_4 = new JPanel();
		borda_4.setBorder(new EmptyBorder(50, 50, 50, 50));
		borda_4.setBackground(new Color(150, 191,120));
		panel_7.add(borda_4, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_7.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		
		panel_1.setMinimumSize(new Dimension(1171, 174));
		panel_1.setMaximumSize(new Dimension(1171, 174));
		panel_1.setBounds(212, 34, 1171, 110);
	
		panel_6.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(new Color(31, 65, 45));
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {700, 50};
		gbl_panel_1.rowHeights = new int[] {128};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblVendedor = new JLabel("Cadastro do Administrador");
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(234, 242, 237));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 65));
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.fill = GridBagConstraints.VERTICAL;
		gbc_lblVendedor.anchor = GridBagConstraints.WEST;
		gbc_lblVendedor.insets = new Insets(0, 50, 5, 5);
		gbc_lblVendedor.gridx = 0;
		gbc_lblVendedor.gridy = 0;
		panel_1.add(lblVendedor, gbc_lblVendedor);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(TelaCadastroAdm.class.getResource("/img/farmer-128px.png")));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.insets = new Insets(15, 0, 5, 20);
		gbc_lblNewLabel_12.gridx = 1;
		gbc_lblNewLabel_12.gridy = 0;
		panel_1.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		
		JPanel panel = new JPanel();
		panel_6.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(234, 242, 237));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {445, 445};
		gbl_panel.rowHeights = new int[] {442};
		gbl_panel.columnWeights = new double[]{1.0, 1.0};
		gbl_panel.rowWeights = new double[]{1.0};
		panel.setLayout(gbl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.VERTICAL;
		gbc_panel_2.insets = new Insets(0, 10, 0, 10);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setBackground(new Color(234, 242, 237));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {435};
		gbl_panel_2.rowHeights = new int[]{30, 40, 30, 40, 20, 60, 30, 40, 30, 40};
		gbl_panel_2.columnWeights = new double[]{0.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panel_2.add(textField, gbc_textField);
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_2.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_2.setForeground(new Color(31, 65, 45));
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(234, 242, 237));
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 3;
		panel_2.add(textField_2, gbc_textField_2);
		
		lblNewLabel_3 = new JLabel("Data de Nascimento");
		lblNewLabel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(31, 65, 45));
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.anchor = GridBagConstraints.NORTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 5;
		panel_2.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 3, 0));
		
		lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setBackground(new Color(234, 242, 237));
		panel_5.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(31, 65, 45));
		lblNewLabel_4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		lblNewLabel_5 = new JLabel("M�s");
		lblNewLabel_5.setBackground(new Color(234, 242, 237));
		panel_5.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(31, 65, 45));
		lblNewLabel_5.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		lblNewLabel_6 = new JLabel("Ano");
		lblNewLabel_6.setBackground(new Color(234, 242, 237));
		panel_5.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(new Color(31, 65, 45));
		lblNewLabel_6.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JComboBox comboBox = new JComboBox();
		panel_5.add(comboBox);
		comboBox.setForeground(new Color(31, 65, 45));
		comboBox.setBackground(new Color(234, 242, 237));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		JComboBox comboBox_1 = new JComboBox();
		panel_5.add(comboBox_1);
		comboBox_1.setForeground(new Color(31, 65, 45));
		comboBox_1.setBackground(new Color(245, 250, 248));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		comboBox_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		JComboBox comboBox_1_1 = new JComboBox();
		panel_5.add(comboBox_1_1);
		comboBox_1_1.setForeground(new Color(31, 65, 45));
		comboBox_1_1.setBackground(new Color(245, 250, 248));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		lblNewLabel_7 = new JLabel("Senha");
		lblNewLabel_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_7.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_7.setForeground(new Color(31, 65, 45));
		lblNewLabel_7.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 6;
		panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 7;
		panel_2.add(passwordField, gbc_passwordField);
		passwordField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		lblNewLabel_10 = new JLabel("Confirme sua Senha");
		lblNewLabel_10.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_10.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_10.setForeground(new Color(31, 65, 45));
		lblNewLabel_10.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_10.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 8;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(234, 242, 237));
		passwordField_1.setForeground(Color.DARK_GRAY);
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 0;
		gbc_passwordField_1.gridy = 9;
		panel_2.add(passwordField_1, gbc_passwordField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 10, 0, 10);
		gbc_panel_3.fill = GridBagConstraints.VERTICAL;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		panel_3.setBackground(new Color(234, 242, 237));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{445, 0};
		gbl_panel_3.rowHeights = new int[]{40, 40, 40, 40, 40, 40, 40, 40, 70};
		gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_3.setLayout(gbl_panel_3);
		
		lblNewLabel_11 = new JLabel("Nome do seu Neg\u00F3cio\r\n");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 0;
		panel_3.add(lblNewLabel_11, gbc_lblNewLabel_11);
		lblNewLabel_11.setForeground(new Color(31, 65, 45));
		lblNewLabel_11.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		textField_1 = new JTextField();
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
		
		lblNewLabel_8 = new JLabel("Telefone");
		lblNewLabel_8.setForeground(new Color(31, 65, 45));
		lblNewLabel_8.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(10, 6, 5, 0);
		gbc_lblNewLabel_8.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 2;
		panel_3.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.NORTH;
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.gridx = 0;
		gbc_textField_5.gridy = 3;
		panel_3.add(textField_5, gbc_textField_5);
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		
		lblNewLabel_1 = new JLabel("E-mail");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(234, 242, 237));
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.NORTH;
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.gridx = 0;
		gbc_textField_6.gridy = 5;
		panel_3.add(textField_6, gbc_textField_6);
		
		lblNewLabel_9 = new JLabel("CNPJ");
		lblNewLabel_9.setForeground(new Color(31, 65, 45));
		lblNewLabel_9.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 6;
		panel_3.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(234, 242, 237));
		textField_7.setForeground(Color.DARK_GRAY);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.anchor = GridBagConstraints.NORTH;
		gbc_textField_7.fill = GridBagConstraints.BOTH;
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.gridx = 0;
		gbc_textField_7.gridy = 7;
		panel_3.add(textField_7, gbc_textField_7);
		
		btnNewButton = new JButton("Cadastrar");
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
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(234, 242, 237));
		panel1.setBounds(206, 202, 1171, 543);
		frame.getContentPane().add(panel1, "cell 2 2,grow");
		panel1.setLayout(null);
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLoginAdm tla = new TelaLoginAdm();
				tla.abrir();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBackground(new Color(31, 65, 45));
		btnNewButton_1.setBounds(28, 26, 60, 56);
		frame.getContentPane().add(btnNewButton_1, "cell 0 0 3 3,grow");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
