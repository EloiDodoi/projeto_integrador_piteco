package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import controle.EstoqueBD;
import controle.HistoricoVendaBD;
import controle.PermissoesBD;
import modelo.Venda;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaHistoricoVendas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisa;
	private JTable table;
	private HistoricoVendaBD hvbd;
	private Venda vendaSelecionada;
	JComboBox comboBox;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHistoricoVendas frame = new TelaHistoricoVendas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	 	}
		});
	}

	public void abrir() {
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public TelaHistoricoVendas() {
		setTitle("Histórico de Vendas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaHistoricoVendas.class.getResource("/img/1.png")));
		hvbd = new HistoricoVendaBD();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(150, 191, 120));
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("  ");
		mnNewMenu.setIcon(new ImageIcon(TelaHistoricoVendas.class.getResource("/img/menu-aberto.png")));
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
		btnMenuInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaBemVindo tbv = new TelaBemVindo();
				tbv.abrir();
			}
		});
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
		btnMenuEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaEstoque te = new TelaEstoque();
				te.abrir();
			}
		});
		btnMenuEstoque.setOpaque(true);
		btnMenuEstoque.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuEstoque.setForeground(new Color(85, 121, 74));
		btnMenuEstoque.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuEstoque.setBorder(null);
		btnMenuEstoque.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuEstoque);
		PermissoesBD pbd = new PermissoesBD();
		if (TelaLoginAdm.user == null ){
			btnMenuEstoque.setEnabled(false);
			System.out.println(pbd.verificarPermissao(TelaLoginVendedor.user, 1));
			if(pbd.verificarPermissao(TelaLoginVendedor.user,1) == true) {
				btnMenuEstoque.setEnabled(true);
			}
		}

		JMenuItem btnMenuVendas = new JMenuItem("Vendas");
		btnMenuVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaVenda venda = new TelaVenda();
				venda.abrir();
			}
		});
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
		btnMenuRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Voc� já está na Tela de Histórico de Vendas!");
			}
		});
		btnMenuRelatorios.setOpaque(true);
		btnMenuRelatorios.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuRelatorios.setForeground(new Color(85, 121, 74));
		btnMenuRelatorios.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuRelatorios.setBorder(null);
		btnMenuRelatorios.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuRelatorios);
		if (TelaLoginAdm.user == null ){
			btnMenuRelatorios.setEnabled(false);
			System.out.println(pbd.verificarPermissao(TelaLoginVendedor.user, 1));
			if(pbd.verificarPermissao(TelaLoginVendedor.user,1) == true) {
				btnMenuRelatorios.setEnabled(true);
			}
		}

		JMenuItem btnMenuControle = new JMenuItem("Controle");
		btnMenuControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaControleVendedores tcv = new TelaControleVendedores();
				tcv.abrir();
			}
		});
		btnMenuControle.setOpaque(true);
		btnMenuControle.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuControle.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuControle.setForeground(new Color(85, 121, 74));
		btnMenuControle.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuControle.setBorder(null);
		btnMenuControle.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuControle);
		if (TelaLoginAdm.user == null ){
			btnMenuControle.setEnabled(false);
		}

		JPanel linha_1_1 = new JPanel();
		linha_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1);

		JMenuItem btnCadastrarVendedor = new JMenuItem("Cadastrar Vendedor");
		btnCadastrarVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaCadastroVendedor tcv = new TelaCadastroVendedor();
				tcv.abrir();
			}
		});
		btnCadastrarVendedor.setOpaque(true);
		btnCadastrarVendedor.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCadastrarVendedor.setHorizontalAlignment(SwingConstants.CENTER);
		btnCadastrarVendedor.setForeground(new Color(85, 121, 74));
		btnCadastrarVendedor.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCadastrarVendedor.setBorder(null);
		btnCadastrarVendedor.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnCadastrarVendedor);
		if (TelaLoginAdm.user == null ){
			btnCadastrarVendedor.setEnabled(false);
		}

		JMenuItem btnListagemDeVendedores = new JMenuItem("Listagem de Vendedores");
		btnListagemDeVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaListagemVendedores tlv = new TelaListagemVendedores();
				tlv.abrir();
			}
		});
		btnListagemDeVendedores.setOpaque(true);
		btnListagemDeVendedores.setHorizontalTextPosition(SwingConstants.CENTER);
		btnListagemDeVendedores.setHorizontalAlignment(SwingConstants.CENTER);
		btnListagemDeVendedores.setForeground(new Color(85, 121, 74));
		btnListagemDeVendedores.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnListagemDeVendedores.setBorder(null);
		btnListagemDeVendedores.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnListagemDeVendedores);
		if (TelaLoginAdm.user == null ){
			btnListagemDeVendedores.setEnabled(false);
			System.out.println(pbd.verificarPermissao(TelaLoginVendedor.user, 1));
			if(pbd.verificarPermissao(TelaLoginVendedor.user,1) == true) {
				btnListagemDeVendedores.setEnabled(true);
			}
		}

		JPanel linha_1_1_2 = new JPanel();
		linha_1_1_2.setPreferredSize(new Dimension(1, 2));
		linha_1_1_2.setMinimumSize(new Dimension(5, 1));
		linha_1_1_2.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1_2);

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
		gbl_panel_8.columnWidths = new int[] { 30, 30, 20, 0, 30, 20, 0 };
		gbl_panel_8.rowHeights = new int[] { 33, 0 };
		gbl_panel_8.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_8.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_8.setLayout(gbl_panel_8);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(new Color(234, 242, 237));
		separator_1.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 0, 5);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 0;
		panel_8.add(separator_1, gbc_separator_1);

		JButton btnNotificacao_1 = new JButton("");
		btnNotificacao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstoqueBD ebd = new EstoqueBD();
                ebd.notificacaoEstoque();
			}
		});
		btnNotificacao_1.setIcon(new ImageIcon(TelaHistoricoVendas.class.getResource("/img/notificacao.png")));
		btnNotificacao_1.setBorder(null);
		btnNotificacao_1.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnNotificacao_1 = new GridBagConstraints();
		gbc_btnNotificacao_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao_1.gridx = 3;
		gbc_btnNotificacao_1.gridy = 0;
		panel_8.add(btnNotificacao_1, gbc_btnNotificacao_1);

		JButton btnUser_1 = new JButton("");
		btnUser_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAlterarAdm taa = new TelaAlterarAdm();
				taa.abrir();
			}
		});
		btnUser_1.setIcon(new ImageIcon(TelaHistoricoVendas.class.getResource("/img/farmer.png")));
		btnUser_1.setBorder(null);
		btnUser_1.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser_1 = new GridBagConstraints();
		gbc_btnUser_1.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser_1.gridx = 5;
		gbc_btnUser_1.gridy = 0;
		panel_8.add(btnUser_1, gbc_btnUser_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		if (TelaLoginAdm.user == null ){
			btnUser_1.setVisible(false);
		}

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 44, 907, 241, 302, 62, 18, 0 };
		gbl_panel.rowHeights = new int[] { 108, 44, 40, 486, 57 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblHistricoDeVendas = new JLabel("Hist\u00F3rico de Vendas\r\n");
		GridBagConstraints gbc_lblHistricoDeVendas = new GridBagConstraints();
		gbc_lblHistricoDeVendas.gridwidth = 3;
		gbc_lblHistricoDeVendas.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblHistricoDeVendas.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistricoDeVendas.gridx = 1;
		gbc_lblHistricoDeVendas.gridy = 0;
		panel.add(lblHistricoDeVendas, gbc_lblHistricoDeVendas);
		lblHistricoDeVendas.setHorizontalAlignment(SwingConstants.LEFT);
		lblHistricoDeVendas.setForeground(new Color(31, 65, 45));
		lblHistricoDeVendas.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblHistricoDeVendas.setBackground(new Color(234, 242, 237));

		JSeparator linha_2 = new JSeparator();
		linha_2.setBackground(new Color(31, 65, 45));
		linha_2.setBorder(new LineBorder(new Color(31, 65, 45), 50));
		GridBagConstraints gbc_linha_2 = new GridBagConstraints();
		gbc_linha_2.insets = new Insets(0, 0, 5, 5);
		gbc_linha_2.gridx = 1;
		gbc_linha_2.gridy = 1;
		panel.add(linha_2, gbc_linha_2);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 1;
		panel.add(panel_3, gbc_panel_3);

		JPanel panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.fill = GridBagConstraints.BOTH;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 1;
		gbc_panelPesquisa.gridy = 2;
		panel.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] { 66, 888 };
		gbl_panelPesquisa.rowHeights = new int[] { 32 };
		gbl_panelPesquisa.columnWeights = new double[] { 1.0, 1.0 };
		gbl_panelPesquisa.rowWeights = new double[] { 0.0 };
		panelPesquisa.setLayout(gbl_panelPesquisa);

		JButton btnPesquisa = new JButton("");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pesquisa = textFieldPesquisa.getText();
				HistoricoVendaBD hvbd = new HistoricoVendaBD();
				if(filtro() == 4 && hvbd.validarData(pesquisa) == true) {
					hvbd.atualizarHistoricoFiltro(table, pesquisa,filtro());
				}else if(filtro() != 4) {
					hvbd.atualizarHistoricoFiltro(table, pesquisa, filtro());
				}
				System.out.println(hvbd.validarData(pesquisa));
				
			}
		});
		btnPesquisa.setIcon(new ImageIcon(TelaHistoricoVendas.class.getResource("/img/inspecao (1).png")));
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_btnPesquisa = new GridBagConstraints();
		gbc_btnPesquisa.fill = GridBagConstraints.BOTH;
		gbc_btnPesquisa.gridx = 0;
		gbc_btnPesquisa.gridy = 0;
		panelPesquisa.add(btnPesquisa, gbc_btnPesquisa);

		textFieldPesquisa = new JTextField();
		textFieldPesquisa.setSelectionColor(new Color(217, 173, 181));
		textFieldPesquisa.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPesquisa.setColumns(10);
		textFieldPesquisa.setCaretColor(new Color(31, 65, 45));
		textFieldPesquisa.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		GridBagConstraints gbc_textFieldPesquisa = new GridBagConstraints();
		gbc_textFieldPesquisa.fill = GridBagConstraints.BOTH;
		gbc_textFieldPesquisa.anchor = GridBagConstraints.WEST;
		gbc_textFieldPesquisa.gridx = 1;
		gbc_textFieldPesquisa.gridy = 0;
		panelPesquisa.add(textFieldPesquisa, gbc_textFieldPesquisa);

		JButton btnVisualizarProduto = new JButton("Visualizar produtos");
		btnVisualizarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (vendaSelecionada == null) {
					JOptionPane.showMessageDialog(null, "Nenhuma venda selecionada!");
				} else {
					TelaListagemItensVenda tliv = new TelaListagemItensVenda(vendaSelecionada);
					tliv.setVisible(true);
				}

			}
		});
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Filtro", "Código", "Maior valor", "Menor valor", "Data"}));
		comboBox.setForeground(new Color(234, 242, 237));
		comboBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		comboBox.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		panel.add(comboBox, gbc_comboBox);
		btnVisualizarProduto.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnVisualizarProduto.setBackground(new Color(31, 65, 45));
		btnVisualizarProduto.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnVisualizarProduto = new GridBagConstraints();
		gbc_btnVisualizarProduto.anchor = GridBagConstraints.EAST;
		gbc_btnVisualizarProduto.insets = new Insets(0, 0, 5, 5);
		gbc_btnVisualizarProduto.gridx = 3;
		gbc_btnVisualizarProduto.gridy = 2;
		panel.add(btnVisualizarProduto, gbc_btnVisualizarProduto);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		scrollPane.setForeground(new Color(150, 191, 120));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		panel.add(scrollPane, gbc_scrollPane);

		table = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(40);
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 26));
		table.setModel(hvbd.listagemVenda());
		scrollPane.setViewportView(table);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 5;
		gbc_panel_2.gridy = 3;
		panel.add(panel_2, gbc_panel_2);

		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 5;
		panel.add(panel_4, gbc_panel_4);

		JTableHeader tHeader = table.getTableHeader();
		tHeader.setBackground(new Color(150, 191, 120));
		tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tHeader.setForeground(Color.WHITE);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Venda> lista = hvbd.listaVendas();
				int posicao_venda = table.getSelectedRow();
				vendaSelecionada = lista.get(posicao_venda);
				System.out.println(vendaSelecionada.getIdVenda());
			}
		});

	}
	
	public int filtro() {
		int filtro = 0;
		System.out.println(comboBox.getSelectedIndex());
		if (comboBox.getSelectedIndex() == 1) {
			filtro = 1;
		}
		else if(comboBox.getSelectedIndex() == 2) {
			filtro = 2;
		}
		else if(comboBox.getSelectedIndex() == 3) {
			filtro = 3;
		}else if (comboBox.getSelectedIndex() == 4){
			filtro = 4 ;
		}else if (comboBox.getSelectedIndex() == 5){
			filtro = 5;
		}else {
			JOptionPane.showMessageDialog(null, "Escolha uma das op��es claro");
		}
		
		return filtro;
	}

}
