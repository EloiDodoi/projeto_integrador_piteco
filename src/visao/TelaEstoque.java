package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisaNoEstoque;
	JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque frame = new TelaEstoque();
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
	public TelaEstoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("  ");
		mnNewMenu.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/menu-aberto.png")));
		mnNewMenu.setVerticalTextPosition(SwingConstants.CENTER);
		mnNewMenu.setVerticalAlignment(SwingConstants.CENTER);
		mnNewMenu.setPreferredSize(new Dimension(60, 40));
		mnNewMenu.setOpaque(true);
		mnNewMenu.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.setForeground(new Color(150, 191, 120));
		mnNewMenu.setBorder(null);
		mnNewMenu.setBackground(new Color(150, 191, 120));
		menuBar.add(mnNewMenu);
		
		JLabel lblNewLabel_2 = new JLabel("PITECO");
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setMaximumSize(new Dimension(1000, 14));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(85, 121, 74));
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setBackground(new Color(150, 191, 120));
		lblNewLabel_2.setAlignmentX(0.5f);
		mnNewMenu.add(lblNewLabel_2);
		
		JMenuItem btnMenuInicio = new JMenuItem("In\u00EDcio");
		btnMenuInicio.setOpaque(true);
		btnMenuInicio.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuInicio.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuInicio.setForeground(new Color(85, 121, 74));
		btnMenuInicio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuInicio.setBorder(null);
		btnMenuInicio.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuInicio);
		
		JPanel linha = new JPanel();
		linha.setPreferredSize(new Dimension(1, 2));
		linha.setMinimumSize(new Dimension(5, 1));
		linha.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha);
		
		JMenuItem btnMenuEstoque = new JMenuItem("Estoque");
		btnMenuEstoque.setOpaque(true);
		btnMenuEstoque.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuEstoque.setForeground(new Color(85, 121, 74));
		btnMenuEstoque.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuEstoque.setBorder(null);
		btnMenuEstoque.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuEstoque);
		
		JMenuItem btnMenuVendas = new JMenuItem("Vendas");
		btnMenuVendas.setOpaque(true);
		btnMenuVendas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuVendas.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuVendas.setForeground(new Color(85, 121, 74));
		btnMenuVendas.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuVendas.setBorder(null);
		btnMenuVendas.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuVendas);
		
		JPanel linha_1 = new JPanel();
		linha_1.setPreferredSize(new Dimension(1, 2));
		linha_1.setMinimumSize(new Dimension(5, 1));
		linha_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1);
		
		JMenuItem btnMenuRelatorios = new JMenuItem("Hist\u00F3rico de Vendas");
		btnMenuRelatorios.setOpaque(true);
		btnMenuRelatorios.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuRelatorios.setForeground(new Color(85, 121, 74));
		btnMenuRelatorios.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuRelatorios.setBorder(null);
		btnMenuRelatorios.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuRelatorios);
		
		JMenuItem btnMenuControle = new JMenuItem("Controle");
		btnMenuControle.setOpaque(true);
		btnMenuControle.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuControle.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuControle.setForeground(new Color(85, 121, 74));
		btnMenuControle.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuControle.setBorder(null);
		btnMenuControle.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuControle);
		
		JPanel linha_1_1 = new JPanel();
		linha_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1);
		
		JMenuItem btnMenuSair = new JMenuItem("Sair");
		btnMenuSair.setOpaque(true);
		btnMenuSair.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuSair.setForeground(new Color(85, 121, 74));
		btnMenuSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuSair.setBorder(null);
		btnMenuSair.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuSair);
		
		JPanel linha_1_1_1 = new JPanel();
		linha_1_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1_1.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(linha_1_1_1);
		
		JPanel BarraSuperior = new JPanel();
		BarraSuperior.setBackground(new Color(150, 191, 120));
		menuBar.add(BarraSuperior);
		BarraSuperior.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(150, 191, 120));
		BarraSuperior.add(panel_8, BorderLayout.EAST);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{30, 30, 20, 0, 30, 20, 0};
		gbl_panel_8.rowHeights = new int[]{33, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(234, 242, 237));
		separator.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel_8.add(separator, gbc_separator);
		
		JButton btnNotificacao = new JButton("");
		btnNotificacao.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 3;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {65, 862, 128, 100, 65};
		gbl_panel_1.rowHeights = new int[] {30, 4, 115, 40, 326};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel Linha = new JPanel();
		GridBagConstraints gbc_Linha = new GridBagConstraints();
		gbc_Linha.anchor = GridBagConstraints.NORTH;
		gbc_Linha.fill = GridBagConstraints.HORIZONTAL;
		gbc_Linha.insets = new Insets(0, 0, 5, 0);
		gbc_Linha.gridwidth = 3;
		gbc_Linha.gridx = 1;
		gbc_Linha.gridy = 1;
		panel_1.add(Linha, gbc_Linha);
		Linha.setBackground(new Color(31, 65, 45));
		
		JLabel lblTitulo = new JLabel("Estoque");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.fill = GridBagConstraints.VERTICAL;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 2;
		panel_1.add(lblTitulo, gbc_lblTitulo);
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		
		JPanel panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.fill = GridBagConstraints.BOTH;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 1;
		gbc_panelPesquisa.gridy = 3;
		panel_1.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] {30, 800};
		gbl_panelPesquisa.rowHeights = new int[] {32};
		gbl_panelPesquisa.columnWeights = new double[]{1.0, 1.0};
		gbl_panelPesquisa.rowWeights = new double[]{0.0};
		panelPesquisa.setLayout(gbl_panelPesquisa);
		
		JButton btnPesquisa = new JButton("");
		btnPesquisa.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/inspecao (1).png")));
		GridBagConstraints gbc_btnPesquisa = new GridBagConstraints();
		gbc_btnPesquisa.fill = GridBagConstraints.BOTH;
		gbc_btnPesquisa.gridx = 0;
		gbc_btnPesquisa.gridy = 0;
		panelPesquisa.add(btnPesquisa, gbc_btnPesquisa);
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		
		textFieldPesquisaNoEstoque = new JTextField();
		GridBagConstraints gbc_textFieldPesquisaNoEstoque = new GridBagConstraints();
		gbc_textFieldPesquisaNoEstoque.fill = GridBagConstraints.BOTH;
		gbc_textFieldPesquisaNoEstoque.gridx = 1;
		gbc_textFieldPesquisaNoEstoque.gridy = 0;
		panelPesquisa.add(textFieldPesquisaNoEstoque, gbc_textFieldPesquisaNoEstoque);
		textFieldPesquisaNoEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPesquisaNoEstoque.setSelectionColor(new Color(217, 173, 181));
		textFieldPesquisaNoEstoque.setCaretColor(new Color(31, 65, 45));
		textFieldPesquisaNoEstoque.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		textFieldPesquisaNoEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPesquisaNoEstoque.setColumns(10);
		
		JButton btnFiltro = new JButton("Filtrar");
		GridBagConstraints gbc_btnFiltro = new GridBagConstraints();
		gbc_btnFiltro.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFiltro.anchor = GridBagConstraints.NORTH;
		gbc_btnFiltro.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltro.gridx = 3;
		gbc_btnFiltro.gridy = 3;
		panel_1.add(btnFiltro, gbc_btnFiltro);
		btnFiltro.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/filtro (1).png")));
		btnFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFiltro.setForeground(new Color(234, 242, 237));
		btnFiltro.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnFiltro.setBorder(null);
		btnFiltro.setBackground(new Color(31, 65, 45));
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		//ArrayList<> tableArray = new ArrayList<>
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(40);
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Código", "", "", "", ""},
			},
			new String[] {
				"Código", "Nome", "Espécie", "Preço", "Quantidade"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		JTableHeader tHeader = table.getTableHeader();
		tHeader.setBackground(new Color(150, 191, 120));
		tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tHeader.setForeground(Color.WHITE);
		
	}

	public void abrir() {
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// TODO Auto-generated method stub
		
	}
}
