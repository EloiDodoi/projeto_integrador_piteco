 package visao;

import java.awt.EventQueue;
import modelo.Produto;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controle.CadastroProdutoBD;
import controle.EstoqueBD;
import controle.PermissoesBD;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenuBar;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
public class TelaCadastroProduto {

	private JFrame frmTelaDeCadastro;
	private JTextField txt_nome;
	private JTextField txt_especie;
	private JTextField txt_preco;
	private JTextField txt_quantidade;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto window = new TelaCadastroProduto();
					window.frmTelaDeCadastro.setVisible(true);
					window.frmTelaDeCadastro.setLocationRelativeTo(null);
					window.frmTelaDeCadastro.setExtendedState(window.frmTelaDeCadastro.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroProduto() {
		initialize();
	}

	public void abrir() {
		frmTelaDeCadastro.setVisible(true);
		frmTelaDeCadastro.setLocationRelativeTo(null);
		frmTelaDeCadastro.setExtendedState(frmTelaDeCadastro.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	private void initialize() {
				
		frmTelaDeCadastro = new JFrame();
		frmTelaDeCadastro.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastroProduto.class.getResource("/img/1.png")));
		frmTelaDeCadastro.setTitle("Cadastro de Produto");
		frmTelaDeCadastro.setMaximumSize(new Dimension(1600, 850));
		frmTelaDeCadastro.setMinimumSize(new Dimension(1600, 850));
		frmTelaDeCadastro.getContentPane().setBackground(new Color(234, 242, 237));
		frmTelaDeCadastro.setBounds(100, 100, 1600, 850);
		frmTelaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeCadastro.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTelaDeCadastro.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {65, 1468, 65};
		gbl_panel.rowHeights = new int[] {30, 10, 110, 544, 30};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 1;
		panel.add(separator, gbc_separator);
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 4));
		
		JLabel lblVendedor = new JLabel("Cadastro do Produto");
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.anchor = GridBagConstraints.WEST;
		gbc_lblVendedor.fill = GridBagConstraints.VERTICAL;
		gbc_lblVendedor.insets = new Insets(0, 0, 5, 0);
		gbc_lblVendedor.gridx = 1;
		gbc_lblVendedor.gridy = 2;
		panel.add(lblVendedor, gbc_lblVendedor);
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 3;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setBackground(new Color(123, 166, 111));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {30, 199, 89, 30, 293, 30, 204, 293, 30};
		gbl_panel_2.rowHeights = new int[] {50, 36, 39, 35, 43, 47, 45, 37, 30, 0, 94, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNomeDoVegetal = new JLabel("Nome do Vegetal:");
		lblNomeDoVegetal.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal = new GridBagConstraints();
		gbc_lblNomeDoVegetal.anchor = GridBagConstraints.WEST;
		gbc_lblNomeDoVegetal.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal.gridwidth = 3;
		gbc_lblNomeDoVegetal.gridx = 1;
		gbc_lblNomeDoVegetal.gridy = 1;
		panel_2.add(lblNomeDoVegetal, gbc_lblNomeDoVegetal);
		
		txt_nome = new JTextField();
		txt_nome.setBackground(new Color(234, 242, 237));
		txt_nome.setForeground(Color.DARK_GRAY);
		txt_nome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_nome.setColumns(10);
		txt_nome.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_txt_nome = new GridBagConstraints();
		gbc_txt_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_nome.insets = new Insets(0, 0, 5, 5);
		gbc_txt_nome.gridwidth = 4;
		gbc_txt_nome.gridx = 4;
		gbc_txt_nome.gridy = 1;
		panel_2.add(txt_nome, gbc_txt_nome);
		
		JLabel lblEspcieDoVegetal = new JLabel("Esp\u00E9cie do Vegetal:");
		lblEspcieDoVegetal.setForeground(new Color(31, 65, 45));
		lblEspcieDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblEspcieDoVegetal = new GridBagConstraints();
		gbc_lblEspcieDoVegetal.fill = GridBagConstraints.BOTH;
		gbc_lblEspcieDoVegetal.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspcieDoVegetal.gridwidth = 3;
		gbc_lblEspcieDoVegetal.gridx = 1;
		gbc_lblEspcieDoVegetal.gridy = 3;
		panel_2.add(lblEspcieDoVegetal, gbc_lblEspcieDoVegetal);
		
		txt_especie = new JTextField();
		txt_especie.setForeground(Color.DARK_GRAY);
		txt_especie.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_especie.setColumns(10);
		txt_especie.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_especie.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_especie = new GridBagConstraints();
		gbc_txt_especie.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_especie.insets = new Insets(0, 0, 5, 5);
		gbc_txt_especie.gridwidth = 4;
		gbc_txt_especie.gridx = 4;
		gbc_txt_especie.gridy = 3;
		panel_2.add(txt_especie, gbc_txt_especie);
		
		JLabel lblNomeDoVegetal_1_1 = new JLabel("Produto Vendido Por:");
		lblNomeDoVegetal_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNomeDoVegetal_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1.gridwidth = 3;
		gbc_lblNomeDoVegetal_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1.gridy = 5;
		panel_2.add(lblNomeDoVegetal_1_1, gbc_lblNomeDoVegetal_1_1);
		
		JRadioButton rbKg = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rbKg);
		rbKg.setBorder(new LineBorder(new Color(0, 0, 0)));
		rbKg.setForeground(new Color(31, 65, 45));
		rbKg.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbKg.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rbKg);
		GridBagConstraints gbc_rbKg = new GridBagConstraints();
		gbc_rbKg.gridwidth = 2;
		gbc_rbKg.anchor = GridBagConstraints.NORTH;
		gbc_rbKg.insets = new Insets(0, 0, 5, 5);
		gbc_rbKg.gridx = 4;
		gbc_rbKg.gridy = 5;
		panel_2.add(rbKg, gbc_rbKg);
		
		JRadioButton rbUnidade = new JRadioButton("Unidade");
		buttonGroup.add(rbUnidade);
		rbUnidade.setForeground(new Color(31, 65, 45));
		rbUnidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbUnidade.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rbUnidade);
		GridBagConstraints gbc_rbUnidade = new GridBagConstraints();
		gbc_rbUnidade.anchor = GridBagConstraints.EAST;
		gbc_rbUnidade.fill = GridBagConstraints.VERTICAL;
		gbc_rbUnidade.insets = new Insets(0, 0, 5, 5);
		gbc_rbUnidade.gridx = 6;
		gbc_rbUnidade.gridy = 5;
		panel_2.add(rbUnidade, gbc_rbUnidade);
		
		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Pre\u00E7o:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNomeDoVegetal_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1, gbc_lblNomeDoVegetal_1_1_1);
		
		JButton btn_cadastrar_produto = new JButton("  Cadastrar  ");
		btn_cadastrar_produto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_nome.getText().isEmpty() == true || txt_especie.getText().isEmpty() == true || txt_preco.getText().isEmpty() == true || txt_quantidade.getText().isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de realizar o cadastro!");
				}
				else {
					String nome = txt_nome.getText();
					String especie = txt_especie.getText();
					int unidade;
					if (rbKg.isSelected() == true) {
						unidade = 1;
					}
					else {
						unidade = 2;
					}
					float preco = Float.parseFloat(txt_preco.getText());
					float quantidade = Float.parseFloat(txt_quantidade.getText());
					CadastroProdutoBD cp = new CadastroProdutoBD();
					Produto pd = new Produto(0, nome, especie, preco, quantidade, unidade);
					cp.cadastrar(pd);
					
					frmTelaDeCadastro.setVisible(false);
					TelaBemVindo tbv = new TelaBemVindo();
					tbv.abrir();
					
					//limpar campos
					txt_nome.setText("");
					txt_especie.setText("");
					rbKg.setSelected(true);
					txt_preco.setText("");
					txt_quantidade.setText("");
				}
			}
		});
		
		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridwidth = 2;
		gbc_lblNomeDoVegetal_1_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridx = 2;
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1_1);
		
		txt_preco = new JTextField();
		txt_preco.setForeground(Color.DARK_GRAY);
		txt_preco.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_preco.setColumns(10);
		txt_preco.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_preco.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_preco = new GridBagConstraints();
		gbc_txt_preco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_preco.insets = new Insets(0, 0, 5, 5);
		gbc_txt_preco.gridx = 4;
		gbc_txt_preco.gridy = 7;
		panel_2.add(txt_preco, gbc_txt_preco);
		
		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoVegetal_1_1_1_1.gridwidth = 2;
		gbc_lblNomeDoVegetal_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1.gridx = 5;
		gbc_lblNomeDoVegetal_1_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1);
		
		txt_quantidade = new JTextField();
		txt_quantidade.setForeground(Color.DARK_GRAY);
		txt_quantidade.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_quantidade.setColumns(10);
		txt_quantidade.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_quantidade.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_quantidade = new GridBagConstraints();
		gbc_txt_quantidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_quantidade.insets = new Insets(0, 0, 5, 5);
		gbc_txt_quantidade.gridx = 7;
		gbc_txt_quantidade.gridy = 7;
		panel_2.add(txt_quantidade, gbc_txt_quantidade);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 8;
		panel_2.add(panel_1, gbc_panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 9;
		panel_2.add(panel_3, gbc_panel_3);
		
		JButton btn_cadastrar_produto_1 = new JButton("  Cancelar ");
		btn_cadastrar_produto_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
				TelaBemVindo tbv = new TelaBemVindo();
				tbv.abrir();
			}
		});
		btn_cadastrar_produto_1.setForeground(new Color(31, 65, 45));
		btn_cadastrar_produto_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		btn_cadastrar_produto_1.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btn_cadastrar_produto_1.setBackground(new Color(123, 166, 111));
		GridBagConstraints gbc_btn_cadastrar_produto_1 = new GridBagConstraints();
		gbc_btn_cadastrar_produto_1.gridwidth = 4;
		gbc_btn_cadastrar_produto_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_cadastrar_produto_1.gridx = 1;
		gbc_btn_cadastrar_produto_1.gridy = 10;
		panel_2.add(btn_cadastrar_produto_1, gbc_btn_cadastrar_produto_1);
		btn_cadastrar_produto.setBackground(new Color(123, 166, 111));
		btn_cadastrar_produto.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btn_cadastrar_produto.setForeground(new Color(31, 65, 45));
		btn_cadastrar_produto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		GridBagConstraints gbc_btn_cadastrar_produto = new GridBagConstraints();
		gbc_btn_cadastrar_produto.insets = new Insets(0, 0, 10, 5);
		gbc_btn_cadastrar_produto.gridwidth = 3;
		gbc_btn_cadastrar_produto.gridx = 5;
		gbc_btn_cadastrar_produto.gridy = 10;
		panel_2.add(btn_cadastrar_produto, gbc_btn_cadastrar_produto);
		
		JMenuBar menuBar = new JMenuBar();
		frmTelaDeCadastro.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("  ");
		mnNewMenu.setIcon(new ImageIcon(TelaCadastroProduto.class.getResource("/img/menu-aberto.png")));
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
		
		JMenuItem btnMenuInicio = new JMenuItem("Início");
		btnMenuInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
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
				frmTelaDeCadastro.setVisible(false);
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
		
		JMenuItem btnMenuVendas = new JMenuItem("Venda");
		btnMenuVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
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
		
		JPanel linha_1 = new JPanel();
		linha_1.setPreferredSize(new Dimension(1, 2));
		linha_1.setMinimumSize(new Dimension(5, 1));
		linha_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1);
		
		JMenuItem btnMenuRelatorios = new JMenuItem("Histórico de Vendas");
		btnMenuRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
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
		
		JMenuItem btnMenuControle = new JMenuItem("Controle");
		btnMenuControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
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
				frmTelaDeCadastro.setVisible(false);
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
		
		JMenuItem btnListagemDeVendedores = new JMenuItem("Listagem de Vendedores");
		btnListagemDeVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
				TelaListagemVendedores tlv = new TelaListagemVendedores();
				tlv.abrir();
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
		gbl_panel_8.columnWidths = new int[]{30, 30, 20, 0, 30, 20, 0};
		gbl_panel_8.rowHeights = new int[]{33, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, Double.MIN_VALUE};
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
		
		JButton btnNotificacao = new JButton("");
		btnNotificacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstoqueBD ebd = new EstoqueBD();
                ebd.notificacaoEstoque();
			}
		});
		btnNotificacao.setIcon(new ImageIcon(TelaCadastroProduto.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 3;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		
		JButton btnUser = new JButton("");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTelaDeCadastro.setVisible(false);
				TelaAlterarAdm taa = new TelaAlterarAdm();
				taa.abrir();
			}
		});
		btnUser.setIcon(new ImageIcon(TelaCadastroProduto.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		if (TelaLoginAdm.user == null ){
			btnUser.setVisible(false);
		}
	}
	
	public static void scaleRadioButtonIcon(JRadioButton rb){
	    boolean previousState = rb.isSelected();
	    rb.setSelected(false);
	    Icon radioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (não selecionado)
	    BufferedImage radioImage = new BufferedImage(
	        radioIcon.getIconWidth(), radioIcon.getIconHeight(),BufferedImage.TYPE_INT_ARGB
	    );
	    Graphics graphics = radioImage.createGraphics();
	    try{
	        radioIcon.paintIcon(rb, graphics, 0, 0);
	    }finally{
	        graphics.dispose();
	    }
	    ImageIcon newRadioImage = new ImageIcon(radioImage);
	    Image finalRadioImage = newRadioImage.getImage().getScaledInstance(
	        30, 30, Image.SCALE_SMOOTH
	    );

	    rb.setSelected(true);
	    Icon selectedRadioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (selecionado)S
	    BufferedImage selectedRadioImage = new BufferedImage(
	            selectedRadioIcon.getIconWidth(), selectedRadioIcon.getIconHeight(),BufferedImage.TYPE_INT_ARGB
	    );
	    Graphics selectedGraphics = selectedRadioImage.createGraphics();
	    try{
	        selectedRadioIcon.paintIcon(rb, selectedGraphics, 0, 0);
	    }finally{
	        selectedGraphics.dispose();
	    }
	    ImageIcon newSelectedRadioImage = new ImageIcon(selectedRadioImage);
	    Image selectedFinalRadioImage = newSelectedRadioImage.getImage().getScaledInstance(
	        30, 30, Image.SCALE_SMOOTH
	    );
	    rb.setSelected(previousState);
	    rb.setIcon(new ImageIcon(finalRadioImage));
	    rb.setSelectedIcon(new ImageIcon(selectedFinalRadioImage));
	}
}
