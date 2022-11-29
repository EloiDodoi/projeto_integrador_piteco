package visao;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TelaAlterarAdm {

	private JFrame frmTelaAlterarAdministrador;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterarAdm window = new TelaAlterarAdm();
					window.frmTelaAlterarAdministrador.setVisible(true);
					window.frmTelaAlterarAdministrador.setLocationRelativeTo(null);
					window.frmTelaAlterarAdministrador.setExtendedState(
							window.frmTelaAlterarAdministrador.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAlterarAdm() {
		initialize();
	}

	public void abrir() {
		frmTelaAlterarAdministrador.setVisible(true);
		frmTelaAlterarAdministrador.setLocationRelativeTo(null);
		frmTelaAlterarAdministrador
				.setExtendedState(frmTelaAlterarAdministrador.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	private void initialize() {
		frmTelaAlterarAdministrador = new JFrame();
		frmTelaAlterarAdministrador
				.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAlterarAdm.class.getResource("/img/1.png")));
		frmTelaAlterarAdministrador.setTitle("Alterar Administrador");
		frmTelaAlterarAdministrador.getContentPane().setBackground(new Color(150, 191, 120));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 120, 1182, 120 };
		gridBagLayout.rowHeights = new int[] { 50, 127, 536, 50 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 1.0, Double.MIN_VALUE };
		frmTelaAlterarAdministrador.getContentPane().setLayout(gridBagLayout);

		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(1171, 174));
		panel_1.setMaximumSize(new Dimension(1171, 174));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		frmTelaAlterarAdministrador.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setBackground(new Color(31, 65, 45));
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 871, 136, 175, 0 };
		gbl_panel_1.rowHeights = new int[] { 141, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblVendedor = new JLabel("Alterar o Perfil");
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(234, 242, 237));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblVendedor.insets = new Insets(0, 10, 0, 5);
		gbc_lblVendedor.gridx = 0;
		gbc_lblVendedor.gridy = 0;
		panel_1.add(lblVendedor, gbc_lblVendedor);
		
				JLabel lblNewLabel_12_1 = new JLabel("");
				lblNewLabel_12_1.setIcon(new ImageIcon(TelaCadastroAdm.class.getResource("/img/farmer-128px.png")));
				GridBagConstraints gbc_lblNewLabel_12_1 = new GridBagConstraints();
				gbc_lblNewLabel_12_1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel_12_1.fill = GridBagConstraints.VERTICAL;
				gbc_lblNewLabel_12_1.gridx = 1;
				gbc_lblNewLabel_12_1.gridy = 0;
				panel_1.add(lblNewLabel_12_1, gbc_lblNewLabel_12_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 2;
		frmTelaAlterarAdministrador.getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 1, 30, 73, 55, 116, 55, 138, 80, 0, 174, 211, 30 };
		gbl_panel_2.rowHeights = new int[] { 20, 30, 30, 30, 30, 30, 30, 30, 30, 0, 30, 30, 0, 30 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel_2.setLayout(gbl_panel_2);

		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.anchor = GridBagConstraints.NORTH;
		gbc_panel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 0;
		panel_2.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 3, 0));

		JLabel lblNewLabel_13 = new JLabel("Nome Completo");
		lblNewLabel_13.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_13.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_13.setForeground(new Color(31, 65, 45));
		lblNewLabel_13.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridwidth = 3;
		gbc_lblNewLabel_13.gridx = 2;
		gbc_lblNewLabel_13.gridy = 1;
		panel_2.add(lblNewLabel_13, gbc_lblNewLabel_13);

		JLabel lblNewLabel_11_1 = new JLabel("Nome do seu Negócio");
		GridBagConstraints gbc_lblNewLabel_11_1 = new GridBagConstraints();
		gbc_lblNewLabel_11_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_11_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11_1.gridwidth = 2;
		gbc_lblNewLabel_11_1.gridx = 9;
		gbc_lblNewLabel_11_1.gridy = 1;
		panel_2.add(lblNewLabel_11_1, gbc_lblNewLabel_11_1);
		lblNewLabel_11_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_11_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));

		JTextField txtNome = new JTextField();
		txtNome.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.anchor = GridBagConstraints.NORTH;
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.gridwidth = 5;
		gbc_txtNome.gridx = 2;
		gbc_txtNome.gridy = 2;
		panel_2.add(txtNome, gbc_txtNome);
		txtNome.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtNome.setForeground(Color.DARK_GRAY);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNome.setColumns(10);

		JTextField txtNomeNegocio = new JTextField();
		GridBagConstraints gbc_txtNomeNegocio = new GridBagConstraints();
		gbc_txtNomeNegocio.anchor = GridBagConstraints.NORTH;
		gbc_txtNomeNegocio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeNegocio.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomeNegocio.gridwidth = 2;
		gbc_txtNomeNegocio.gridx = 9;
		gbc_txtNomeNegocio.gridy = 2;
		panel_2.add(txtNomeNegocio, gbc_txtNomeNegocio);
		txtNomeNegocio.setBackground(new Color(234, 242, 237));
		txtNomeNegocio.setForeground(Color.DARK_GRAY);
		txtNomeNegocio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNomeNegocio.setColumns(10);
		txtNomeNegocio.setBorder(new LineBorder(new Color(31, 65, 45), 2));

		JLabel lblNewLabel_2_1 = new JLabel("CPF");
		lblNewLabel_2_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_2_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_2_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_2_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1.gridwidth = 5;
		gbc_lblNewLabel_2_1.gridx = 2;
		gbc_lblNewLabel_2_1.gridy = 3;
		panel_2.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);

		JLabel lblNewLabel_9_2 = new JLabel("CNPJ");
		GridBagConstraints gbc_lblNewLabel_9_2 = new GridBagConstraints();
		gbc_lblNewLabel_9_2.gridwidth = 2;
		gbc_lblNewLabel_9_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_9_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_2.gridx = 9;
		gbc_lblNewLabel_9_2.gridy = 3;
		panel_2.add(lblNewLabel_9_2, gbc_lblNewLabel_9_2);
		lblNewLabel_9_2.setForeground(new Color(31, 65, 45));
		lblNewLabel_9_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));

		JTextField txtCPF = new JTextField();
		txtCPF.setBackground(new Color(234, 242, 237));
		txtCPF.setForeground(Color.DARK_GRAY);
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtCPF.setColumns(10);
		txtCPF.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_txtCPF = new GridBagConstraints();
		gbc_txtCPF.anchor = GridBagConstraints.NORTH;
		gbc_txtCPF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCPF.insets = new Insets(0, 0, 5, 5);
		gbc_txtCPF.gridwidth = 5;
		gbc_txtCPF.gridx = 2;
		gbc_txtCPF.gridy = 4;
		panel_2.add(txtCPF, gbc_txtCPF);

		JTextField txtCNPJ = new JTextField();
		GridBagConstraints gbc_txtCNPJ = new GridBagConstraints();
		gbc_txtCNPJ.anchor = GridBagConstraints.NORTH;
		gbc_txtCNPJ.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCNPJ.insets = new Insets(0, 0, 5, 5);
		gbc_txtCNPJ.gridwidth = 2;
		gbc_txtCNPJ.gridx = 9;
		gbc_txtCNPJ.gridy = 4;
		panel_2.add(txtCNPJ, gbc_txtCNPJ);
		txtCNPJ.setBackground(new Color(234, 242, 237));
		txtCNPJ.setForeground(Color.DARK_GRAY);
		txtCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtCNPJ.setColumns(10);
		txtCNPJ.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));

		JLabel lblNewLabel_3_1 = new JLabel("Data de Nascimento");
		lblNewLabel_3_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_3_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1.gridwidth = 5;
		gbc_lblNewLabel_3_1.gridx = 2;
		gbc_lblNewLabel_3_1.gridy = 5;
		panel_2.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_3_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));

		JLabel lblNewLabel_8_1 = new JLabel("Telefone");
		GridBagConstraints gbc_lblNewLabel_8_1 = new GridBagConstraints();
		gbc_lblNewLabel_8_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_8_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8_1.gridwidth = 2;
		gbc_lblNewLabel_8_1.gridx = 9;
		gbc_lblNewLabel_8_1.gridy = 5;
		panel_2.add(lblNewLabel_8_1, gbc_lblNewLabel_8_1);
		lblNewLabel_8_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_8_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));

		JLabel lblNewLabel_4_1 = new JLabel("Dia");
		lblNewLabel_4_1.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
		gbc_lblNewLabel_4_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_4_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_1.gridx = 2;
		gbc_lblNewLabel_4_1.gridy = 6;
		panel_2.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
		lblNewLabel_4_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_4_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));

		JLabel lblNewLabel_5_1 = new JLabel("M\u00EAs");
		lblNewLabel_5_1.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_5_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_1.gridx = 4;
		gbc_lblNewLabel_5_1.gridy = 6;
		panel_2.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
		lblNewLabel_5_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_5_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));

		JLabel lblNewLabel_6_1 = new JLabel("Ano");
		lblNewLabel_6_1.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1.gridx = 6;
		gbc_lblNewLabel_6_1.gridy = 6;
		panel_2.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);
		lblNewLabel_6_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_6_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));

		JComboBox cbDia = new JComboBox();
		cbDia.setForeground(new Color(31, 65, 45));
		cbDia.setBackground(new Color(245, 250, 248));
		cbDia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbDia.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		cbDia.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_cbDia = new GridBagConstraints();
		gbc_cbDia.anchor = GridBagConstraints.NORTHWEST;
		gbc_cbDia.insets = new Insets(0, 0, 5, 5);
		gbc_cbDia.gridx = 2;
		gbc_cbDia.gridy = 7;
		panel_2.add(cbDia, gbc_cbDia);

		JComboBox cbMes = new JComboBox();
		cbMes.setForeground(new Color(31, 65, 45));
		cbMes.setBackground(new Color(245, 250, 248));
		cbMes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbMes.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		cbMes.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_cbMes = new GridBagConstraints();
		gbc_cbMes.anchor = GridBagConstraints.NORTH;
		gbc_cbMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbMes.insets = new Insets(0, 0, 5, 5);
		gbc_cbMes.gridx = 4;
		gbc_cbMes.gridy = 7;
		panel_2.add(cbMes, gbc_cbMes);

		JTextField txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.anchor = GridBagConstraints.SOUTH;
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefone.gridwidth = 2;
		gbc_txtTelefone.gridx = 9;
		gbc_txtTelefone.gridy = 6;
		panel_2.add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setBackground(new Color(234, 242, 237));
		txtTelefone.setForeground(Color.DARK_GRAY);
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTelefone.setColumns(10);
		txtTelefone.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));

		JComboBox cbAno = new JComboBox();
		cbAno.setForeground(new Color(31, 65, 45));
		cbAno.setBackground(new Color(245, 250, 248));
		cbAno.setModel(new DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906",
				"1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919",
				"1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932",
				"1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945",
				"1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958",
				"1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971",
				"1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984",
				"1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997",
				"1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
				"2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023",
				"2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036",
				"2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049",
				"2050" }));
		cbAno.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbAno.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_cbAno = new GridBagConstraints();
		gbc_cbAno.anchor = GridBagConstraints.NORTHWEST;
		gbc_cbAno.insets = new Insets(0, 0, 5, 5);
		gbc_cbAno.gridx = 6;
		gbc_cbAno.gridy = 7;
		panel_2.add(cbAno, gbc_cbAno);

		JLabel lblNewLabel_9_1 = new JLabel("E-mail");
		GridBagConstraints gbc_lblNewLabel_9_1 = new GridBagConstraints();
		gbc_lblNewLabel_9_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_9_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_1.gridwidth = 2;
		gbc_lblNewLabel_9_1.gridx = 9;
		gbc_lblNewLabel_9_1.gridy = 7;
		panel_2.add(lblNewLabel_9_1, gbc_lblNewLabel_9_1);
		lblNewLabel_9_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_9_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));

		JLabel lblNewLabel_7_1 = new JLabel("Senha");
		lblNewLabel_7_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_7_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_7_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_7_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_7_1 = new GridBagConstraints();
		gbc_lblNewLabel_7_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_7_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_7_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_1.gridwidth = 5;
		gbc_lblNewLabel_7_1.gridx = 2;
		gbc_lblNewLabel_7_1.gridy = 8;
		panel_2.add(lblNewLabel_7_1, gbc_lblNewLabel_7_1);

		txtEmail = new JTextField();
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.anchor = GridBagConstraints.SOUTH;
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.gridx = 9;
		gbc_txtEmail.gridy = 8;
		panel_2.add(txtEmail, gbc_txtEmail);
		txtEmail.setForeground(Color.DARK_GRAY);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtEmail.setBackground(new Color(234, 242, 237));

		JPasswordField pfSenha = new JPasswordField();
		pfSenha.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_pfSenha = new GridBagConstraints();
		gbc_pfSenha.anchor = GridBagConstraints.SOUTH;
		gbc_pfSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_pfSenha.insets = new Insets(0, 0, 5, 5);
		gbc_pfSenha.gridwidth = 5;
		gbc_pfSenha.gridx = 2;
		gbc_pfSenha.gridy = 10;
		panel_2.add(pfSenha, gbc_pfSenha);
		pfSenha.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		pfSenha.setForeground(Color.DARK_GRAY);
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblNewLabel_10_1 = new JLabel("Confirme sua Senha");
		lblNewLabel_10_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_10_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_10_1.setForeground(new Color(31, 65, 45));
		lblNewLabel_10_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel_10_1 = new GridBagConstraints();
		gbc_lblNewLabel_10_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_10_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_10_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10_1.gridwidth = 5;
		gbc_lblNewLabel_10_1.gridx = 2;
		gbc_lblNewLabel_10_1.gridy = 11;
		panel_2.add(lblNewLabel_10_1, gbc_lblNewLabel_10_1);
		
				JButton btnCancelar = new JButton("    Alterar    ");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frmTelaAlterarAdministrador.setVisible(false);
						TelaBemVindo tbv = new TelaBemVindo();
						tbv.abrir();
					}
				});
				
						JButton btnAlterar = new JButton("  Cancelar  ");
						GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
						gbc_btnAlterar.anchor = GridBagConstraints.NORTHWEST;
						gbc_btnAlterar.insets = new Insets(0, 0, 20, 5);
						gbc_btnAlterar.gridwidth = 2;
						gbc_btnAlterar.gridheight = 2;
						gbc_btnAlterar.gridx = 9;
						gbc_btnAlterar.gridy = 11;
						panel_2.add(btnAlterar, gbc_btnAlterar);
						btnAlterar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								frmTelaAlterarAdministrador.setVisible(false);
								TelaBemVindo tbv = new TelaBemVindo();
								tbv.abrir();
								
							}
						});
						btnAlterar.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
						btnAlterar.setForeground(new Color(217, 173, 181));
						btnAlterar.setBackground(new Color(234, 242, 237));
						btnAlterar.setFont(new Font("Dialog", Font.PLAIN, 35));
				btnCancelar.setForeground(new Color(217, 173, 181));
				btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 35));
				btnCancelar.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
				btnCancelar.setBackground(new Color(234, 242, 237));
				
				GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
				gbc_btnCancelar.insets = new Insets(0, 0, 5, 0);
				gbc_btnCancelar.gridwidth = 2;
				gbc_btnCancelar.gridx = 10;
				gbc_btnCancelar.gridy = 11;
				panel_2.add(btnCancelar, gbc_btnCancelar);

		JPasswordField pfSenhaConfirmada = new JPasswordField();
		pfSenhaConfirmada.setBackground(new Color(234, 242, 237));
		pfSenhaConfirmada.setForeground(Color.DARK_GRAY);
		pfSenhaConfirmada.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pfSenhaConfirmada.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_pfSenhaConfirmada = new GridBagConstraints();
		gbc_pfSenhaConfirmada.anchor = GridBagConstraints.NORTH;
		gbc_pfSenhaConfirmada.fill = GridBagConstraints.HORIZONTAL;
		gbc_pfSenhaConfirmada.insets = new Insets(0, 0, 20, 5);
		gbc_pfSenhaConfirmada.gridwidth = 5;
		gbc_pfSenhaConfirmada.gridx = 2;
		gbc_pfSenhaConfirmada.gridy = 12;
		panel_2.add(pfSenhaConfirmada, gbc_pfSenhaConfirmada);
		frmTelaAlterarAdministrador.setResizable(false);
		frmTelaAlterarAdministrador.setBounds(100, 100, 1600, 850);
		frmTelaAlterarAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaAlterarAdministrador.setResizable(false);
		frmTelaAlterarAdministrador.setBounds(100, 100, 1600, 850);
		frmTelaAlterarAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
