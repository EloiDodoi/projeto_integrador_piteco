package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controle.ControleVendedorBD;
import controle.EstoqueBD;
import controle.HistoricoVendaBD;
import controle.PermissoesBD;
import modelo.Produto;
import modelo.Usuario;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaListagemVendedores extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblTitulo;
	private JPanel Linha;
	private JPanel panelPesquisa;
	private JTextField tfPesquisa;
	private JButton btnPesquisa;
	Usuario vendedor_selecionado;
	ControleVendedorBD cvbd = new ControleVendedorBD();
	private JPanel panel;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JLabel lblNewLabel;
	private JMenuItem btnMenuInicio;
	private JPanel linha;
	private JMenuItem btnMenuEstoque;
	private JMenuItem btnMenuVendas;
	private JPanel linha_1;
	private JMenuItem btnMenuRelatorios;
	private JMenuItem btnMenuControle;
	private JPanel linha_1_1;
	private JMenuItem btnCadastrarVendedor;
	private JMenuItem btnListagemDeVendedores;
	private JPanel linha_1_1_1;
	private JMenuItem btnMenuSair;
	private JPanel linha_1_1_2;
	private JPanel BarraSuperior;
	private JPanel panel_1;
	private JSeparator separator;
	private JButton btnNotificacao;
	private JButton btnUser;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemVendedores frame = new TelaListagemVendedores();
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
	
	public void abrir() {
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	public TelaListagemVendedores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaListagemVendedores.class.getResource("/img/1.png")));
		setTitle("Listagem de Vendedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("  ");
		mnNewMenu.setIcon(new ImageIcon(TelaListagemVendedores.class.getResource("/img/menu-aberto.png")));
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
		
		lblNewLabel = new JLabel("PITECO");
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setMaximumSize(new Dimension(1000, 14));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(85, 121, 74));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNewLabel.setBorder(null);
		lblNewLabel.setBackground(new Color(150, 191, 120));
		lblNewLabel.setAlignmentX(0.5f);
		mnNewMenu.add(lblNewLabel);
		
		btnMenuInicio = new JMenuItem("In??cio");
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
		
		linha = new JPanel();
		linha.setPreferredSize(new Dimension(1, 2));
		linha.setMinimumSize(new Dimension(5, 1));
		linha.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha);
		
		btnMenuEstoque = new JMenuItem("Estoque");
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
		
		btnMenuVendas = new JMenuItem("Venda");
		btnMenuVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaVenda tv = new TelaVenda();
				tv.abrir();		
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
		
		linha_1 = new JPanel();
		linha_1.setPreferredSize(new Dimension(1, 2));
		linha_1.setMinimumSize(new Dimension(5, 1));
		linha_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1);
		
		btnMenuRelatorios = new JMenuItem("Hist??rico de Vendas");
		btnMenuRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaHistoricoVendas thv = new TelaHistoricoVendas();
				thv.abrir();		
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
		
		btnMenuControle = new JMenuItem("Controle");
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
		
		linha_1_1 = new JPanel();
		linha_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1);
		
		btnCadastrarVendedor = new JMenuItem("Cadastrar Vendedor");
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
		btnCadastrarVendedor.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnCadastrarVendedor.setBorder(null);
		btnCadastrarVendedor.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnCadastrarVendedor);
		if (TelaLoginAdm.user == null ){
			btnCadastrarVendedor.setEnabled(false);
		}
		
		btnListagemDeVendedores = new JMenuItem("Listagem de Vendedores");
		btnListagemDeVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Voc?? j?? est?? na Listagem de Vendedores!");
			}
		});
		btnListagemDeVendedores.setOpaque(true);
		btnListagemDeVendedores.setHorizontalTextPosition(SwingConstants.CENTER);
		btnListagemDeVendedores.setHorizontalAlignment(SwingConstants.CENTER);
		btnListagemDeVendedores.setForeground(new Color(85, 121, 74));
		btnListagemDeVendedores.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
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
		
		linha_1_1_1 = new JPanel();
		linha_1_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1_1);
		
		btnMenuSair = new JMenuItem("Sair");
		btnMenuSair.setOpaque(true);
		btnMenuSair.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuSair.setForeground(new Color(85, 121, 74));
		btnMenuSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuSair.setBorder(null);
		btnMenuSair.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuSair);
		
		linha_1_1_2 = new JPanel();
		linha_1_1_2.setPreferredSize(new Dimension(1, 2));
		linha_1_1_2.setMinimumSize(new Dimension(5, 1));
		linha_1_1_2.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(linha_1_1_2);
		
		BarraSuperior = new JPanel();
		BarraSuperior.setBackground(new Color(150, 191, 120));
		menuBar.add(BarraSuperior);
		BarraSuperior.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(150, 191, 120));
		BarraSuperior.add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{30, 30, 20, 0, 30, 20, 0};
		gbl_panel_1.rowHeights = new int[]{33, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(234, 242, 237));
		separator.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel_1.add(separator, gbc_separator);
		
		btnNotificacao = new JButton("");
		btnNotificacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstoqueBD ebd = new EstoqueBD();
                ebd.notificacaoEstoque();
			}
		});
		btnNotificacao.setIcon(new ImageIcon(TelaListagemVendedores.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 3;
		gbc_btnNotificacao.gridy = 0;
		panel_1.add(btnNotificacao, gbc_btnNotificacao);
		
		btnUser = new JButton("");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAlterarAdm taa = new TelaAlterarAdm();
				taa.abrir();
			}
		});
		btnUser.setIcon(new ImageIcon(TelaListagemVendedores.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_1.add(btnUser, gbc_btnUser);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		if (TelaLoginAdm.user == null ){
			btnUser.setVisible(false);
		}

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {65, 899, 328, 336, 65};
		gbl_panel.rowHeights = new int[] {30, 0, 31, 93, 39, 41, 544, 30};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Linha = new JPanel();
		GridBagConstraints gbc_Linha = new GridBagConstraints();
		gbc_Linha.anchor = GridBagConstraints.NORTH;
		gbc_Linha.fill = GridBagConstraints.HORIZONTAL;
		gbc_Linha.insets = new Insets(0, 0, 5, 0);
		gbc_Linha.gridwidth = 3;
		gbc_Linha.gridx = 1;
		gbc_Linha.gridy = 1;
		panel.add(Linha, gbc_Linha);
		Linha.setBackground(new Color(31, 65, 45));
		
		lblTitulo = new JLabel("Vendedores");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 3;
		panel.add(lblTitulo, gbc_lblTitulo);
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		
		JButton btnExcluir = new JButton("    Excluir    ");
		btnExcluir.setToolTipText("Excluir Vendedor selecionado");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.anchor = GridBagConstraints.EAST;
		gbc_btnExcluir.fill = GridBagConstraints.VERTICAL;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 0);
		gbc_btnExcluir.gridx = 3;
		gbc_btnExcluir.gridy = 4;
		panel.add(btnExcluir, gbc_btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cvbd.deletarVendedor(vendedor_selecionado, table);
			}
		});
		btnExcluir.setForeground(new Color(234, 242, 237));
		btnExcluir.setFont(new Font("Yu Gothic UI", Font.PLAIN, 28));
		btnExcluir.setBorder(null);
		btnExcluir.setBackground(new Color(31, 65, 45));
		
		panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 1;
		gbc_panelPesquisa.gridy = 5;
		panel.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] {77, 767};
		gbl_panelPesquisa.rowHeights = new int[] {32};
		gbl_panelPesquisa.columnWeights = new double[]{1.0, 1.0};
		gbl_panelPesquisa.rowWeights = new double[]{0.0};
		panelPesquisa.setLayout(gbl_panelPesquisa);
		
		btnPesquisa = new JButton("");
		btnPesquisa.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			  String pesquisa  = tfPesquisa.getText();
				HistoricoVendaBD hvbd = new HistoricoVendaBD();
				ControleVendedorBD cvbd = new ControleVendedorBD();
				if(filtro() == 3 && hvbd.validarData(pesquisa) == true) {
				cvbd.atualizarListaFiltrada(table, pesquisa, filtro());
				}else if(filtro() != 2) {
					cvbd.atualizarListaFiltrada(table, pesquisa, filtro());
				}
			}
		});
		btnPesquisa.setIcon(new ImageIcon(TelaListagemVendedores.class.getResource("/img/inspecao (1).png")));
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_btnPesquisa = new GridBagConstraints();
		gbc_btnPesquisa.fill = GridBagConstraints.BOTH;
		gbc_btnPesquisa.gridx = 0;
		gbc_btnPesquisa.gridy = 0;
		panelPesquisa.add(btnPesquisa, gbc_btnPesquisa);
		
		tfPesquisa = new JTextField();
		tfPesquisa.setSelectionColor(new Color(217, 173, 181));
		tfPesquisa.setHorizontalAlignment(SwingConstants.LEFT);
		tfPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPesquisa.setColumns(10);
		tfPesquisa.setCaretColor(new Color(31, 65, 45));
		tfPesquisa.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		GridBagConstraints gbc_tfPesquisa = new GridBagConstraints();
		gbc_tfPesquisa.fill = GridBagConstraints.BOTH;
		gbc_tfPesquisa.gridx = 1;
		gbc_tfPesquisa.gridy = 0;
		panelPesquisa.add(tfPesquisa, gbc_tfPesquisa);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Filtro", "Nome", "CPF", "Data de Nascimento", "Telefone", "E-mail"}));
		comboBox.setForeground(new Color(234, 242, 237));
		comboBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		comboBox.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 5;
		panel.add(comboBox, gbc_comboBox);
		
		JButton btnAlterar = new JButton("    Alterar    ");
		btnAlterar.setToolTipText("Alterar Vendedor selecionado");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.anchor = GridBagConstraints.EAST;
		gbc_btnAlterar.fill = GridBagConstraints.VERTICAL;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAlterar.gridx = 3;
		gbc_btnAlterar.gridy = 5;
		panel.add(btnAlterar, gbc_btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vendedor_selecionado != null) {
					TelaAlterarVendedor tav = new TelaAlterarVendedor();
					tav.abrir(vendedor_selecionado);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Selecione algum vendedor para alter??-lo.");
				}
			}
		});
		btnAlterar.setForeground(new Color(234, 242, 237));
		btnAlterar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 28));
		btnAlterar.setBorder(null);
		btnAlterar.setBackground(new Color(31, 65, 45));
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 6;
		panel.add(scrollPane, gbc_scrollPane);
		scrollPane.setForeground(new Color(123, 166, 111));
		scrollPane.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		scrollPane.setViewportBorder(new LineBorder(new Color(31, 65, 45), 0));
		scrollPane.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		table = new JTable() {
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(40);
		table.setGridColor(new Color(150, 191, 120));
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 26));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Mike Ianni", "79167095305", null, "69748948553", "mianni0@example.com"},
				{"Gaylor Buzza", "24038418891", null, "38222072735", "gbuzza1@illinois.edu"},
				{"Liv Bernon", "19222185011", null, "75806156444", "lbernon2@apache.org"},
			},
			new String[] {
				"Nome", "CPF", "Data de nascimento", "Telefone", "E-mail"
			}
		));
		scrollPane.setViewportView(table);
		
		table.setModel(cvbd.listagemVendedor());
		
		JTableHeader tHeader = table.getTableHeader();
		tHeader.setBackground(new Color(150, 191, 120));
		tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tHeader.setForeground(Color.WHITE);
		
		
		
		//-------------------------------------------------------- m??todos -------------------------------------
	
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Usuario> lista = cvbd.listaVendedor();
				int posicao_vend = table.getSelectedRow();
				vendedor_selecionado = lista.get(posicao_vend);
			}
			}	
		);

	}
	
	public int filtro() {
		int filtro = 0;
		System.out.println(comboBox.getSelectedIndex());
		if (comboBox.getSelectedIndex() == 1) {
			filtro = 1;
		} else if (comboBox.getSelectedIndex() == 2) {
			filtro = 2;
		} else if (comboBox.getSelectedIndex() == 3) {
			filtro = 3;
		} else if (comboBox.getSelectedIndex() == 4) {
			filtro = 4;
		} else if (comboBox.getSelectedIndex() == 5) {
			filtro = 5;
		}else {
			JOptionPane.showMessageDialog(null, "Escolha uma das op????es para filtro!");
		}

		return filtro;
	}
}
