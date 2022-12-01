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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class TelaControleVendedores extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JPanel Linha;
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
	private JMenuItem btnMenuSair;
	private JPanel linha_1_1_1;
	private JPanel BarraSuperior;
	private JPanel panel_1;
	private JSeparator separator;
	private JButton btnNotificacao;
	private JButton btnUser;
	private JMenuItem btnCadastrarVendedor;
	private JMenuItem btnListagemDeVendedores;
	private JPanel linha_1_1_2;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnVendedores;
	private JButton btnPermissoes;
	private JLabel lblVendedores;
	private JLabel lblPermisses;
	private JRadioButton rbNovoVendedor;
	private JRadioButton rbHistoricoVendedores;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private final ButtonGroup permissoes = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaControleVendedores frame = new TelaControleVendedores();
					frame.setVisible(true);

					frame.setLocationRelativeTo(null);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
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
	
	public TelaControleVendedores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaControleVendedores.class.getResource("/img/1.png")));
		setTitle("Controle de Vendedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("  ");
		mnNewMenu.setIcon(new ImageIcon(TelaControleVendedores.class.getResource("/img/menu-aberto.png")));
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
		
		btnMenuInicio = new JMenuItem("In\u00EDcio");
		btnMenuInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaBemVindo tbc = new TelaBemVindo();
				tbc.abrir();
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
		
		btnMenuVendas = new JMenuItem("Venda");
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
		
		linha_1 = new JPanel();
		linha_1.setPreferredSize(new Dimension(1, 2));
		linha_1.setMinimumSize(new Dimension(5, 1));
		linha_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1);
		
		btnMenuRelatorios = new JMenuItem("Hist\u00F3rico de Vendas");
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
		
		btnMenuControle = new JMenuItem("Controle");
		btnMenuControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Voc� j� est� na Tela de Controle de Vendedores.");
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
		
		linha_1_1 = new JPanel();
		linha_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1);
		
		btnCadastrarVendedor = new JMenuItem("Cadastrar Vendedor");
		btnCadastrarVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você já está na tela de Cadastro de Vendedor!");
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
		
		btnListagemDeVendedores = new JMenuItem("Listagem de Vendedores");
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
		
		linha_1_1_2 = new JPanel();
		linha_1_1_2.setPreferredSize(new Dimension(1, 2));
		linha_1_1_2.setMinimumSize(new Dimension(5, 1));
		linha_1_1_2.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1_2);
		
		btnMenuSair = new JMenuItem("Sair");
		btnMenuSair.setOpaque(true);
		btnMenuSair.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuSair.setForeground(new Color(85, 121, 74));
		btnMenuSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuSair.setBorder(null);
		btnMenuSair.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnMenuSair);
		
		linha_1_1_1 = new JPanel();
		linha_1_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1_1.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(linha_1_1_1);
		
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
		btnNotificacao.setIcon(new ImageIcon(TelaControleVendedores.class.getResource("/img/notificacao.png")));
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
		btnUser.setIcon(new ImageIcon(TelaControleVendedores.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_1.add(btnUser, gbc_btnUser);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {54, 1221, 265, 60};
		gbl_panel.rowHeights = new int[]{10, 11, 130, 66, 149, 47, 60, 104, 544, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Linha = new JPanel();
		GridBagConstraints gbc_Linha = new GridBagConstraints();
		gbc_Linha.anchor = GridBagConstraints.NORTH;
		gbc_Linha.fill = GridBagConstraints.HORIZONTAL;
		gbc_Linha.insets = new Insets(0, 0, 5, 0);
		gbc_Linha.gridwidth = 2;
		gbc_Linha.gridx = 1;
		gbc_Linha.gridy = 1;
		panel.add(Linha, gbc_Linha);
		Linha.setBackground(new Color(31, 65, 45));
		
		lblTitulo = new JLabel("Controle de Vendedores");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 2;
		panel.add(lblTitulo, gbc_lblTitulo);
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		
		lblVendedores = new JLabel("Vendedores");
		lblVendedores.setVerticalAlignment(SwingConstants.TOP);
		lblVendedores.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedores.setForeground(new Color(31, 65, 45));
		lblVendedores.setFont(new Font("Yu Gothic UI", Font.PLAIN, 45));
		GridBagConstraints gbc_lblVendedores = new GridBagConstraints();
		gbc_lblVendedores.anchor = GridBagConstraints.WEST;
		gbc_lblVendedores.insets = new Insets(0, 0, 5, 5);
		gbc_lblVendedores.gridx = 1;
		gbc_lblVendedores.gridy = 3;
		panel.add(lblVendedores, gbc_lblVendedores);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 4;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{381, 475, 0};
		gbl_panel_2.rowHeights = new int[]{138, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		rbNovoVendedor = new JRadioButton("Novo Vendedor");
		buttonGroup.add(rbNovoVendedor);
		rbNovoVendedor.setForeground(new Color(31, 65, 45));
		rbNovoVendedor.setBackground(new Color(123, 166, 111));
		rbNovoVendedor.setFont(new Font("Yu Gothic UI", Font.PLAIN, 35));
		GridBagConstraints gbc_rbNovoVendedor = new GridBagConstraints();
		gbc_rbNovoVendedor.insets = new Insets(0, 0, 0, 5);
		gbc_rbNovoVendedor.gridx = 0;
		gbc_rbNovoVendedor.gridy = 0;
		panel_2.add(rbNovoVendedor, gbc_rbNovoVendedor);
		
		rbHistoricoVendedores = new JRadioButton("Listagem de Vendedores");
		buttonGroup.add(rbHistoricoVendedores);
		rbHistoricoVendedores.setForeground(new Color(31, 65, 45));
		rbHistoricoVendedores.setFont(new Font("Yu Gothic UI", Font.PLAIN, 35));
		rbHistoricoVendedores.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_rbHistoricoVendedores = new GridBagConstraints();
		gbc_rbHistoricoVendedores.gridx = 1;
		gbc_rbHistoricoVendedores.gridy = 0;
		panel_2.add(rbHistoricoVendedores, gbc_rbHistoricoVendedores);
		
		btnVendedores = new JButton(">");
		btnVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbNovoVendedor.isSelected() == true) {
					TelaCadastroVendedor tcv = new TelaCadastroVendedor();
					tcv.abrir();
					setVisible(false);
				}
				else  if(rbHistoricoVendedores.isSelected() == true){
					TelaListagemVendedores tlv = new TelaListagemVendedores();
					tlv.abrir();
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Selecione uma ação!");
				}
			}
		});
		btnVendedores.setForeground(new Color(234, 242, 237));
		btnVendedores.setBackground(new Color(123, 166, 111));
		btnVendedores.setFont(new Font("Yu Gothic UI", Font.PLAIN, 99));
		GridBagConstraints gbc_btnVendedores = new GridBagConstraints();
		gbc_btnVendedores.fill = GridBagConstraints.BOTH;
		gbc_btnVendedores.insets = new Insets(0, 0, 5, 0);
		gbc_btnVendedores.gridx = 2;
		gbc_btnVendedores.gridy = 4;
		panel.add(btnVendedores, gbc_btnVendedores);
		
		lblPermisses = new JLabel("Permissões de Acesso");
		lblPermisses.setVerticalAlignment(SwingConstants.TOP);
		lblPermisses.setHorizontalAlignment(SwingConstants.LEFT);
		lblPermisses.setForeground(new Color(31, 65, 45));
		lblPermisses.setFont(new Font("Yu Gothic UI", Font.PLAIN, 45));
		GridBagConstraints gbc_lblPermisses = new GridBagConstraints();
		gbc_lblPermisses.anchor = GridBagConstraints.WEST;
		gbc_lblPermisses.insets = new Insets(0, 0, 5, 5);
		gbc_lblPermisses.gridx = 1;
		gbc_lblPermisses.gridy = 6;
		panel.add(lblPermisses, gbc_lblPermisses);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 7;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{314, 326, 362, 270, 0};
		gbl_panel_3.rowHeights = new int[]{119, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Estoque");
		permissoes.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setForeground(new Color(31, 65, 45));
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		rdbtnNewRadioButton_1.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 0;
		panel_3.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Histórico de Vendas  ");
		permissoes.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setForeground(new Color(31, 65, 45));
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		rdbtnNewRadioButton_2.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 1;
		gbc_rdbtnNewRadioButton_2.gridy = 0;
		panel_3.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Lista de Vendedores");
		permissoes.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setForeground(new Color(31, 65, 45));
		rdbtnNewRadioButton_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		rdbtnNewRadioButton_3.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNewRadioButton_3.gridx = 2;
		gbc_rdbtnNewRadioButton_3.gridy = 0;
		panel_3.add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);
		
		btnPermissoes = new JButton(">");
		btnPermissoes.setForeground(new Color(234, 242, 237));
		btnPermissoes.setFont(new Font("Yu Gothic UI", Font.PLAIN, 80));
		btnPermissoes.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_btnPermissoes = new GridBagConstraints();
		gbc_btnPermissoes.fill = GridBagConstraints.BOTH;
		gbc_btnPermissoes.insets = new Insets(0, 0, 5, 0);
		gbc_btnPermissoes.gridx = 2;
		gbc_btnPermissoes.gridy = 7;
		panel.add(btnPermissoes, gbc_btnPermissoes);

	}
}
