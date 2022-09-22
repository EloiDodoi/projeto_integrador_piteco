package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroVendedor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(123, 166, 111));
		frame.setBounds(100, 100, 1600, 851);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		panel.setBounds(183, 200, 1171, 580);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(234, 242, 237));
		btnNewButton.setBorder(new LineBorder(new Color(217, 173, 181), 2, true));
		btnNewButton.setForeground(new Color(217, 173, 181));
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 40));
		btnNewButton.setBounds(431, 495, 308, 62);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(214, 228, 219));
		panel_2.setBounds(441, 507, 308, 62);
		panel.add(panel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 3));
		separator.setBackground(new Color(31, 65, 45));
		separator.setBounds(583, 148, 2, 305);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblNewLabel.setBounds(50, 50, 244, 31);
		panel.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(new Color(31, 65, 45));
		lblCpf.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblCpf.setBounds(50, 148, 214, 31);
		panel.add(lblCpf);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblNewLabel_1_1.setBounds(50, 250, 214, 31);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblNewLabel_1_1_1.setBounds(635, 148, 214, 31);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblNewLabel_1_1_1_1_1.setBounds(635, 250, 214, 31);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Confirmar senha");
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblNewLabel_1_1_1_1_1_1.setBounds(635, 350, 236, 31);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Data de Nascimento");
		lblNewLabel_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		lblNewLabel_1_1_1_1.setBounds(50, 350, 280, 31);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField.setBackground(new Color(245, 250, 248));
		textField.setBounds(50, 81, 1068, 35);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_1.setBackground(new Color(245, 250, 248));
		textField_1.setBounds(50, 178, 483, 35);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_2.setBackground(new Color(245, 250, 248));
		textField_2.setBounds(635, 178, 483, 35);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_3.setBackground(new Color(245, 250, 248));
		textField_3.setBounds(635, 279, 483, 35);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.DARK_GRAY);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_4.setBackground(new Color(245, 250, 248));
		textField_4.setBounds(635, 381, 483, 35);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_5.setBackground(new Color(245, 250, 248));
		textField_5.setBounds(50, 279, 483, 35);
		panel.add(textField_5);
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setForeground(new Color(31, 65, 45));
		lblNewLabel_4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(50, 403, 73, 28);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mês");
		lblNewLabel_5.setForeground(new Color(31, 65, 45));
		lblNewLabel_5.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_5.setBounds(171, 403, 73, 28);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ano");
		lblNewLabel_6.setForeground(new Color(31, 65, 45));
		lblNewLabel_6.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_6.setBounds(374, 403, 73, 28);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setForeground(new Color(31, 65, 45));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		comboBox.setBackground(new Color(245, 250, 248));
		comboBox.setBounds(50, 429, 73, 35);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		comboBox_1.setForeground(new Color(31, 65, 45));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		comboBox_1.setBackground(new Color(245, 250, 248));
		comboBox_1.setBounds(171, 429, 159, 35);
		panel.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_1_1.setForeground(new Color(31, 65, 45));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		comboBox_1_1.setBackground(new Color(245, 250, 248));
		comboBox_1_1.setBounds(374, 429, 159, 35);
		panel.add(comboBox_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(31, 65, 45));
		panel_1.setBounds(206, 94, 1171, 110);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCadastroDoVendedor = new JLabel("Cadastro do Vendedor");
		lblCadastroDoVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblCadastroDoVendedor.setForeground(new Color(234, 242, 237));
		lblCadastroDoVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblCadastroDoVendedor.setBounds(23, 0, 871, 110);
		panel_1.add(lblCadastroDoVendedor);
	}
}
