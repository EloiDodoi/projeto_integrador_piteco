package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controle.CadastroVendedorBD;
import controle.Md5;
import modelo.Usuario;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;

public class TelaCadastroVendedor {

	private JFrame frame;
	private JTextField txt_nome_vendedor;
	private JTextField txt_cpf_vendedor;
	private JTextField txt_telefone_vendedor;
	private JTextField txt_email_vendedor;
	private JPasswordField pf_senha_vendedor;
	private JPasswordField pf_senha_confirmada_vendedor;
	
	private int statusMenu = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVendedor window = new TelaCadastroVendedor();
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
	public TelaCadastroVendedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void abrir() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(123, 166, 111));
		frame.setBounds(100, 100, 1600, 851);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Principal = new JPanel();
		panel_Principal.setBackground(new Color(123, 166, 111));
		frame.getContentPane().add(panel_Principal);
		GridBagLayout gbl_panel_Principal = new GridBagLayout();
		gbl_panel_Principal.columnWidths = new int[] {65, 1171, 65};
		gbl_panel_Principal.rowHeights = new int[] {0, 118, 500, 30};
		gbl_panel_Principal.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Principal.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_Principal.setLayout(gbl_panel_Principal);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(30, 0, 0, 0);
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		panel_Principal.add(panel_1, gbc_panel_1);
		panel_1.setBackground(new Color(31, 65, 45));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCadastroDoVendedor = new JLabel("Cadastro do Vendedor");
		lblCadastroDoVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblCadastroDoVendedor.setForeground(new Color(234, 242, 237));
		lblCadastroDoVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		panel_1.add(lblCadastroDoVendedor);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 30, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		panel_Principal.add(panel, gbc_panel);
		panel.setBackground(new Color(234, 242, 237));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {30, 73, 86, 121, 44, 159, 50, 8, 50, 483, 30};
		gbl_panel.rowHeights = new int[] {50, 31, 35, 32, 65, 37, 64, 36, 31, 35, 35, 50};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(20, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		txt_nome_vendedor = new JTextField();
		txt_nome_vendedor.setForeground(Color.DARK_GRAY);
		txt_nome_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_nome_vendedor.setColumns(10);
		txt_nome_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_nome_vendedor.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_txt_nome_vendedor = new GridBagConstraints();
		gbc_txt_nome_vendedor.anchor = GridBagConstraints.NORTH;
		gbc_txt_nome_vendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_nome_vendedor.insets = new Insets(0, 0, 5, 0);
		gbc_txt_nome_vendedor.gridwidth = 9;
		gbc_txt_nome_vendedor.gridx = 1;
		gbc_txt_nome_vendedor.gridy = 2;
		panel.add(txt_nome_vendedor, gbc_txt_nome_vendedor);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(new Color(31, 65, 45));
		lblCpf.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.anchor = GridBagConstraints.NORTH;
		gbc_lblCpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridwidth = 3;
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 3;
		panel.add(lblCpf, gbc_lblCpf);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblNewLabel_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1_1.gridx = 9;
		gbc_lblNewLabel_1_1_1.gridy = 3;
		panel.add(lblNewLabel_1_1_1, gbc_lblNewLabel_1_1_1);
		
		txt_cpf_vendedor = new JTextField();
		txt_cpf_vendedor.setForeground(Color.DARK_GRAY);
		txt_cpf_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_cpf_vendedor.setColumns(10);
		txt_cpf_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_cpf_vendedor.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_txt_cpf_vendedor = new GridBagConstraints();
		gbc_txt_cpf_vendedor.anchor = GridBagConstraints.NORTH;
		gbc_txt_cpf_vendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_cpf_vendedor.insets = new Insets(0, 0, 5, 5);
		gbc_txt_cpf_vendedor.gridwidth = 5;
		gbc_txt_cpf_vendedor.gridx = 1;
		gbc_txt_cpf_vendedor.gridy = 4;
		panel.add(txt_cpf_vendedor, gbc_txt_cpf_vendedor);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 3));
		separator.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridheight = 6;
		gbc_separator.gridx = 7;
		gbc_separator.gridy = 4;
		panel.add(separator, gbc_separator);
		
		txt_telefone_vendedor = new JTextField();
		txt_telefone_vendedor.setForeground(Color.DARK_GRAY);
		txt_telefone_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_telefone_vendedor.setColumns(10);
		txt_telefone_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_telefone_vendedor.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_txt_telefone_vendedor = new GridBagConstraints();
		gbc_txt_telefone_vendedor.anchor = GridBagConstraints.NORTH;
		gbc_txt_telefone_vendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_telefone_vendedor.insets = new Insets(0, 0, 5, 0);
		gbc_txt_telefone_vendedor.gridx = 9;
		gbc_txt_telefone_vendedor.gridy = 4;
		panel.add(txt_telefone_vendedor, gbc_txt_telefone_vendedor);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridwidth = 3;
		gbc_lblNewLabel_1_1.gridx = 1;
		gbc_lblNewLabel_1_1.gridy = 5;
		panel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblNewLabel_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1_1_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1_1_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1_1_1_1.gridx = 9;
		gbc_lblNewLabel_1_1_1_1_1.gridy = 5;
		panel.add(lblNewLabel_1_1_1_1_1, gbc_lblNewLabel_1_1_1_1_1);
		
		txt_email_vendedor = new JTextField();
		txt_email_vendedor.setForeground(Color.DARK_GRAY);
		txt_email_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_email_vendedor.setColumns(10);
		txt_email_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_email_vendedor.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_txt_email_vendedor = new GridBagConstraints();
		gbc_txt_email_vendedor.anchor = GridBagConstraints.NORTH;
		gbc_txt_email_vendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_email_vendedor.insets = new Insets(0, 0, 5, 5);
		gbc_txt_email_vendedor.gridwidth = 5;
		gbc_txt_email_vendedor.gridx = 1;
		gbc_txt_email_vendedor.gridy = 6;
		panel.add(txt_email_vendedor, gbc_txt_email_vendedor);
		
		pf_senha_vendedor = new JPasswordField();
		pf_senha_vendedor.setForeground(Color.DARK_GRAY);
		pf_senha_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pf_senha_vendedor.setBackground(new Color(245, 250, 248));
		pf_senha_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_pf_senha_vendedor = new GridBagConstraints();
		gbc_pf_senha_vendedor.anchor = GridBagConstraints.NORTH;
		gbc_pf_senha_vendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_pf_senha_vendedor.insets = new Insets(0, 0, 5, 0);
		gbc_pf_senha_vendedor.gridx = 9;
		gbc_pf_senha_vendedor.gridy = 6;
		panel.add(pf_senha_vendedor, gbc_pf_senha_vendedor);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Data de Nascimento");
		lblNewLabel_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblNewLabel_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1_1.gridwidth = 3;
		gbc_lblNewLabel_1_1_1_1.gridx = 1;
		gbc_lblNewLabel_1_1_1_1.gridy = 7;
		panel.add(lblNewLabel_1_1_1_1, gbc_lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Confirmar senha");
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		GridBagConstraints gbc_lblNewLabel_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1_1_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1_1_1_1_1.gridx = 9;
		gbc_lblNewLabel_1_1_1_1_1_1.gridy = 7;
		panel.add(lblNewLabel_1_1_1_1_1_1, gbc_lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setForeground(new Color(31, 65, 45));
		lblNewLabel_4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 8;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("M\u00EAs");
		lblNewLabel_5.setForeground(new Color(31, 65, 45));
		lblNewLabel_5.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 8;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ano");
		lblNewLabel_6.setForeground(new Color(31, 65, 45));
		lblNewLabel_6.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 5;
		gbc_lblNewLabel_6.gridy = 8;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		pf_senha_confirmada_vendedor = new JPasswordField();
		pf_senha_confirmada_vendedor.setForeground(Color.DARK_GRAY);
		pf_senha_confirmada_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pf_senha_confirmada_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		pf_senha_confirmada_vendedor.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_pf_senha_confirmada_vendedor = new GridBagConstraints();
		gbc_pf_senha_confirmada_vendedor.anchor = GridBagConstraints.NORTH;
		gbc_pf_senha_confirmada_vendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_pf_senha_confirmada_vendedor.insets = new Insets(0, 0, 5, 0);
		gbc_pf_senha_confirmada_vendedor.gridx = 9;
		gbc_pf_senha_confirmada_vendedor.gridy = 8;
		panel.add(pf_senha_confirmada_vendedor, gbc_pf_senha_confirmada_vendedor);
		
		JComboBox cb_dia = new JComboBox();
		cb_dia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cb_dia.setForeground(new Color(31, 65, 45));
		cb_dia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cb_dia.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cb_dia.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_cb_dia = new GridBagConstraints();
		gbc_cb_dia.anchor = GridBagConstraints.WEST;
		gbc_cb_dia.fill = GridBagConstraints.VERTICAL;
		gbc_cb_dia.insets = new Insets(0, 0, 5, 5);
		gbc_cb_dia.gridx = 1;
		gbc_cb_dia.gridy = 9;
		panel.add(cb_dia, gbc_cb_dia);
		
		JComboBox cb_mes = new JComboBox();
		cb_mes.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		cb_mes.setForeground(new Color(31, 65, 45));
		cb_mes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cb_mes.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cb_mes.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_cb_mes = new GridBagConstraints();
		gbc_cb_mes.anchor = GridBagConstraints.WEST;
		gbc_cb_mes.fill = GridBagConstraints.VERTICAL;
		gbc_cb_mes.insets = new Insets(0, 0, 5, 5);
		gbc_cb_mes.gridx = 3;
		gbc_cb_mes.gridy = 9;
		panel.add(cb_mes, gbc_cb_mes);
		
		JComboBox cb_ano = new JComboBox();
		cb_ano.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		cb_ano.setForeground(new Color(31, 65, 45));
		cb_ano.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cb_ano.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cb_ano.setBackground(new Color(245, 250, 248));
		GridBagConstraints gbc_cb_ano = new GridBagConstraints();
		gbc_cb_ano.fill = GridBagConstraints.BOTH;
		gbc_cb_ano.insets = new Insets(0, 0, 5, 5);
		gbc_cb_ano.gridx = 5;
		gbc_cb_ano.gridy = 9;
		panel.add(cb_ano, gbc_cb_ano);
		
		JButton btnNewButton = new JButton("  Cadastrar  ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome_vendedor = txt_nome_vendedor.getText();
				String cpf_vendedor = txt_cpf_vendedor.getText();
				String email_vendedor = txt_email_vendedor.getText();
				
				int dia_vendedor = Integer.parseInt((String) cb_dia.getSelectedItem());
				int mes_vendedor = Integer.parseInt((String) cb_mes.getSelectedItem());
				int ano_vendedor = Integer.parseInt((String) cb_ano.getSelectedItem());
				
				LocalDate data = LocalDate.of(ano_vendedor, mes_vendedor, dia_vendedor);
				
				
				String telefone_vendedor = txt_telefone_vendedor.getText();
				String senha_vendedor = pf_senha_vendedor.getText();
				String senha_confirmada_vendedor = pf_senha_confirmada_vendedor.getText();
				
				System.out.println(data);
				
				if (!senha_vendedor.equals(senha_confirmada_vendedor)) {
					JOptionPane.showMessageDialog(null, "A confirmação da senha está incorreta. Digite novamente.");
					pf_senha_confirmada_vendedor.setText("");
				}
				else {
					CadastroVendedorBD bv = new CadastroVendedorBD();
					Usuario usuario =  new Usuario(0,nome_vendedor,cpf_vendedor,null,Date.valueOf(data),telefone_vendedor,Md5.cifrar(senha_vendedor),email_vendedor,null,0);
					bv.cadastrarVendedor(usuario);
				}
				
			}
		});
		
		JButton btnCancelar = new JButton("  Cancelar  ");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaBemVindo tbv = new TelaBemVindo();
				tbv.abrir();
			}
		});
		btnCancelar.setForeground(new Color(217, 173, 181));
		btnCancelar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 40));
		btnCancelar.setBorder(new LineBorder(new Color(217, 173, 181), 2, true));
		btnCancelar.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.gridwidth = 5;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 10;
		panel.add(btnCancelar, gbc_btnCancelar);
		
		btnNewButton.setBackground(new Color(234, 242, 237));
		btnNewButton.setBorder(new LineBorder(new Color(217, 173, 181), 2, true));
		btnNewButton.setForeground(new Color(217, 173, 181));
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 40));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(10, 0, 20, 0);
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.gridx = 9;
		gbc_btnNewButton.gridy = 10;
		panel.add(btnNewButton, gbc_btnNewButton);
	}
}
