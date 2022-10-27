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
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(123, 166, 111));
		frame.setBounds(100, 100, 1600, 851);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel painelMenu = new JPanel();
		painelMenu.setBounds(54, 0, 180, 812);
		frame.getContentPane().add(painelMenu);
		painelMenu.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		panel.setBounds(183, 200, 1171, 580);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
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
		
		txt_nome_vendedor = new JTextField();
		txt_nome_vendedor.setForeground(Color.DARK_GRAY);
		txt_nome_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_nome_vendedor.setColumns(10);
		txt_nome_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_nome_vendedor.setBackground(new Color(245, 250, 248));
		txt_nome_vendedor.setBounds(50, 81, 1068, 35);
		panel.add(txt_nome_vendedor);
		
		txt_cpf_vendedor = new JTextField();
		txt_cpf_vendedor.setForeground(Color.DARK_GRAY);
		txt_cpf_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_cpf_vendedor.setColumns(10);
		txt_cpf_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_cpf_vendedor.setBackground(new Color(245, 250, 248));
		txt_cpf_vendedor.setBounds(50, 178, 483, 35);
		panel.add(txt_cpf_vendedor);
		
		txt_telefone_vendedor = new JTextField();
		txt_telefone_vendedor.setForeground(Color.DARK_GRAY);
		txt_telefone_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_telefone_vendedor.setColumns(10);
		txt_telefone_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_telefone_vendedor.setBackground(new Color(245, 250, 248));
		txt_telefone_vendedor.setBounds(635, 178, 483, 35);
		panel.add(txt_telefone_vendedor);
		
		txt_email_vendedor = new JTextField();
		txt_email_vendedor.setForeground(Color.DARK_GRAY);
		txt_email_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_email_vendedor.setColumns(10);
		txt_email_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_email_vendedor.setBackground(new Color(245, 250, 248));
		txt_email_vendedor.setBounds(50, 279, 483, 35);
		panel.add(txt_email_vendedor);
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setForeground(new Color(31, 65, 45));
		lblNewLabel_4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(50, 403, 73, 28);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mês");
		lblNewLabel_5.setForeground(new Color(31, 65, 45));
		lblNewLabel_5.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_5.setBounds(209, 403, 73, 28);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ano");
		lblNewLabel_6.setForeground(new Color(31, 65, 45));
		lblNewLabel_6.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		lblNewLabel_6.setBounds(374, 403, 73, 28);
		panel.add(lblNewLabel_6);
		
		JComboBox cb_dia = new JComboBox();
		cb_dia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cb_dia.setForeground(new Color(31, 65, 45));
		cb_dia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cb_dia.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cb_dia.setBackground(new Color(245, 250, 248));
		cb_dia.setBounds(50, 429, 73, 35);
		panel.add(cb_dia);
		
		JComboBox cb_mes = new JComboBox();
		cb_mes.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		cb_mes.setForeground(new Color(31, 65, 45));
		cb_mes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cb_mes.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cb_mes.setBackground(new Color(245, 250, 248));
		cb_mes.setBounds(209, 429, 85, 35);
		panel.add(cb_mes);
		
		JComboBox cb_ano = new JComboBox();
		cb_ano.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		cb_ano.setForeground(new Color(31, 65, 45));
		cb_ano.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cb_ano.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		cb_ano.setBackground(new Color(245, 250, 248));
		cb_ano.setBounds(374, 429, 159, 35);
		panel.add(cb_ano);
		
		JButton btnNewButton = new JButton("Cadastrar");
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
					Usuario usuario =  new Usuario(0,nome_vendedor,cpf_vendedor,null,Date.valueOf(data),telefone_vendedor,Md5.cifrar(senha_vendedor),email_vendedor,0);
					bv.cadastrarVendedor(usuario);
				}
				
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
		
		pf_senha_vendedor = new JPasswordField();
		pf_senha_vendedor.setForeground(Color.DARK_GRAY);
		pf_senha_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pf_senha_vendedor.setBackground(new Color(245, 250, 248));
		pf_senha_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		pf_senha_vendedor.setBounds(635, 279, 483, 35);
		panel.add(pf_senha_vendedor);
		
		pf_senha_confirmada_vendedor = new JPasswordField();
		pf_senha_confirmada_vendedor.setForeground(Color.DARK_GRAY);
		pf_senha_confirmada_vendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pf_senha_confirmada_vendedor.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		pf_senha_confirmada_vendedor.setBackground(new Color(245, 250, 248));
		pf_senha_confirmada_vendedor.setBounds(635, 381, 483, 35);
		panel.add(pf_senha_confirmada_vendedor);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(150, 191, 120));
		panel_3.setBounds(0, 0, 55, 812);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton botaoMenu = new JButton("");
		botaoMenu.setBorder(null);
		botaoMenu.setBounds(0, 755, 55, 55);
		panel_3.add(botaoMenu);
		botaoMenu.setForeground(new Color(150, 191, 120));
		botaoMenu.setBackground(new Color(150, 191, 120));
		botaoMenu.setIcon(new ImageIcon(TelaCadastroVendedor.class.getResource("/img/menu-aberto.png")));
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(-17, -12, 84, 83);
		panel_3.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBemVindo tbv = new TelaBemVindo();
				tbv.abrir();
				frame.setVisible(false);
			}
		});
		painelMenu.setVisible(false);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBackground(new Color(150, 191, 120));
		botaoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (statusMenu == 0) {
					
					//			if (se for perfil adm) {
					MenuAdm menuAdm = new MenuAdm();
					painelMenu.setVisible(true);
					painelMenu.add(menuAdm,  BorderLayout.CENTER);
					painelMenu.revalidate();
					painelMenu.repaint();
//				} else 
//				if (se for perfil vendedor) {
//					MenuVendedor menuVenda = new MenuVendedor();
//					menuVenda.abrir();
//				}
					statusMenu++;
				} else if (statusMenu == 1) {
					painelMenu.removeAll();
					painelMenu.revalidate();
					painelMenu.repaint();
					statusMenu--;
					painelMenu.setVisible(false);
				}				
			}
		});
	}
}
