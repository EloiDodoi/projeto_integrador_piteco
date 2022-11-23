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
	private JTextField txtEmail;

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
		lblNewLabel_11.setBounds(31, 23, 470, 35);
		panel_3.add(lblNewLabel_11);
		lblNewLabel_11.setForeground(new Color(31, 65, 45));
		lblNewLabel_11.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		
		JTextField txtCNPJ = new JTextField();
		txtCNPJ.setBounds(31, 140, 470, 35);
		txtCNPJ.setBackground(new Color(234, 242, 237));
		panel_3.add(txtCNPJ);
		txtCNPJ.setForeground(Color.DARK_GRAY);
		txtCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtCNPJ.setColumns(10);
		txtCNPJ.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		JLabel lblNewLabel_8 = new JLabel("Telefone");
		lblNewLabel_8.setBounds(31, 192, 470, 35);
		lblNewLabel_8.setForeground(new Color(31, 65, 45));
		lblNewLabel_8.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		panel_3.add(lblNewLabel_8);
		
		JTextField txtNomeNegocio = new JTextField();
		txtNomeNegocio.setBackground(new Color(234, 242, 237));
		txtNomeNegocio.setBounds(31, 58, 470, 35);
		panel_3.add(txtNomeNegocio);
		txtNomeNegocio.setForeground(Color.DARK_GRAY);
		txtNomeNegocio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNomeNegocio.setColumns(10);
		txtNomeNegocio.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(31, 140, 470, 35);
		panel_3.add(lblNewLabel_1);
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
		lblNewLabel_9.setBounds(31, 104, 470, 35);
		lblNewLabel_9.setForeground(new Color(31, 65, 45));
		lblNewLabel_9.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		panel_3.add(lblNewLabel_9);
		
		JTextField txtTelefone = new JTextField();
		txtTelefone.setBackground(new Color(234, 242, 237));
		txtTelefone.setForeground(Color.DARK_GRAY);
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTelefone.setColumns(10);
		txtTelefone.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtTelefone.setBounds(31, 224, 470, 35);
		panel_3.add(txtTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		panel_3.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
		btnCadastrar.setForeground(new Color(217, 173, 181));
		btnCadastrar.setBackground(new Color(234, 242, 237));
		btnCadastrar.setFont(new Font("Dialog", Font.PLAIN, 45));
		btnCadastrar.setBounds(83, 399, 367, 76);
		panel_3.add(btnCadastrar);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(Color.DARK_GRAY);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtEmail.setBackground(new Color(234, 242, 237));
		txtEmail.setBounds(31, 308, 470, 35);
		panel_3.add(txtEmail);
		
		JLabel lblNewLabel_9_1 = new JLabel("E-mail");
		lblNewLabel_9_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_9_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_9_1.setBounds(31, 270, 470, 35);
		panel_3.add(lblNewLabel_9_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(234, 242, 237));
		panel_2.setBounds(206, 230, 640, 543);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("Nome Completo");
		lblNewLabel_13.setBounds(37, 11, 231, 60);
		lblNewLabel_13.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_13.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_13.setForeground(new Color(31, 65, 45));
		lblNewLabel_13.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		panel_2.add(lblNewLabel_13);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(37, 60, 565, 35);
		txtNome.setBackground(new Color(234, 242, 237));
		panel_2.add(txtNome);
		txtNome.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtNome.setForeground(Color.DARK_GRAY);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("CPF");
		lblNewLabel_2_1.setBounds(37, 95, 248, 60);
		lblNewLabel_2_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_2_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_2_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_2_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		panel_2.add(lblNewLabel_2_1);
		
		JTextField txtCPF = new JTextField();
		txtCPF.setBackground(new Color(234, 242, 237));
		txtCPF.setForeground(Color.DARK_GRAY);
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtCPF.setColumns(10);
		txtCPF.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtCPF.setBounds(37, 143, 565, 35);
		panel_2.add(txtCPF);
		
		JLabel lblNewLabel_3_1 = new JLabel("Data de Nascimento");
		lblNewLabel_3_1.setBounds(37, 184, 248, 60);
		lblNewLabel_3_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_3_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_2.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_3_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 3, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("Dia");
		lblNewLabel_4_1.setBounds(37, 227, 248, 60);
		lblNewLabel_4_1.setBackground(new Color(234, 242, 237));
		panel_2.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_4_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JLabel lblNewLabel_5_1 = new JLabel("Mês");
		lblNewLabel_5_1.setBounds(191, 227, 248, 60);
		lblNewLabel_5_1.setBackground(new Color(234, 242, 237));
		panel_2.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_5_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JLabel lblNewLabel_6_1 = new JLabel("Ano");
		lblNewLabel_6_1.setBounds(443, 227, 248, 60);
		lblNewLabel_6_1.setBackground(new Color(234, 242, 237));
		panel_2.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_6_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JComboBox cbDia = new JComboBox();
		cbDia.setForeground(new Color(31, 65, 45));
		cbDia.setBackground(new Color(245, 250, 248));
		cbDia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbDia.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cbDia.setBounds(37, 272, 73, 35);
		panel_2.add(cbDia);
		
		JComboBox cbMes = new JComboBox();
		cbMes.setForeground(new Color(31, 65, 45));
		cbMes.setBackground(new Color(245, 250, 248));
		cbMes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbMes.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		cbMes.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cbMes.setBounds(191, 272, 159, 35);
		panel_2.add(cbMes);
		
		JComboBox cbAno = new JComboBox();
		cbAno.setForeground(new Color(31, 65, 45));
		cbAno.setBackground(new Color(245, 250, 248));
		cbAno.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		cbAno.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbAno.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cbAno.setBounds(443, 272, 159, 35);
		panel_2.add(cbAno);
		
		JLabel lblNewLabel_7_1 = new JLabel("Senha");
		lblNewLabel_7_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_7_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_7_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_7_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_7_1.setBounds(37, 329, 293, 28);
		panel_2.add(lblNewLabel_7_1);
		
		JPasswordField pfSenha = new JPasswordField();
		pfSenha.setBounds(37, 356, 565, 35);
		pfSenha.setBackground(new Color(234, 242, 237));
		panel_2.add(pfSenha);
		pfSenha.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		pfSenha.setForeground(Color.DARK_GRAY);
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_10_1 = new JLabel("Confirme sua Senha");
		lblNewLabel_10_1.setBounds(37, 402, 565, 35);
		lblNewLabel_10_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_10_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_10_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_10_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		panel_2.add(lblNewLabel_10_1);
		
		JPasswordField pfSenhaConfirmada = new JPasswordField();
		pfSenhaConfirmada.setBackground(new Color(234, 242, 237));
		pfSenhaConfirmada.setForeground(Color.DARK_GRAY);
		pfSenhaConfirmada.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pfSenhaConfirmada.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		pfSenhaConfirmada.setBounds(37, 438, 565, 35);
		panel_2.add(pfSenhaConfirmada);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
