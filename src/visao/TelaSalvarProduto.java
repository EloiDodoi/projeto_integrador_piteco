package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.nio.channels.NotYetBoundException;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controle.AlterarProdutoBD;
import controle.EstoqueBD;
import modelo.Produto;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import modelo.Produto;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenuBar;
import java.awt.Toolkit;

public class TelaSalvarProduto {

	private JFrame frmSalvarProduto;
	private JTextField txt_nome;
	private JTextField txt_especie;
	private JTextField txt_preco;
	private JTextField txt_quantidade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	TelaEstoque telaEstoque = new TelaEstoque();
	AlterarProdutoBD alt = new AlterarProdutoBD();
	EstoqueBD etb = new EstoqueBD();
	private Produto produtoSelecionado;
	private JRadioButton rb_Kg;
	private JRadioButton rb_Unidade;
	private JLabel lbl_codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSalvarProduto window = new TelaSalvarProduto();
					window.frmSalvarProduto.setVisible(true);
					window.frmSalvarProduto.setLocationRelativeTo(null);
					window.frmSalvarProduto.setExtendedState(window.frmSalvarProduto.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaSalvarProduto() {
		initialize();
	}


	private void initialize() {
		frmSalvarProduto = new JFrame();
		frmSalvarProduto.setTitle("Salvar Produto");
		frmSalvarProduto.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaSalvarProduto.class.getResource("/img/1.png")));
		frmSalvarProduto.setMaximumSize(new Dimension(1600, 850));
		frmSalvarProduto.setMinimumSize(new Dimension(1600, 850));
		frmSalvarProduto.getContentPane().setBackground(new Color(234, 242, 237));
		frmSalvarProduto.setBounds(100, 100, 1600, 850);
		frmSalvarProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSalvarProduto.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frmSalvarProduto.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 65, 797, 179, 454, 65 };
		gbl_panel.rowHeights = new int[] { 30, 10, 110, 544, 30 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridwidth = 3;
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 1;
		panel.add(separator, gbc_separator);
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 4));

		JLabel lblVendedor = new JLabel("Alterar Produto");
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblVendedor.insets = new Insets(0, 0, 5, 5);
		gbc_lblVendedor.gridx = 1;
		gbc_lblVendedor.gridy = 2;
		panel.add(lblVendedor, gbc_lblVendedor);
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));

		lbl_codigo = new JLabel("0");
		lbl_codigo.setForeground(new Color(31, 65, 45));
		GridBagConstraints gbc_lbl_codigo_1 = new GridBagConstraints();
		gbc_lbl_codigo_1.anchor = GridBagConstraints.NORTH;
		gbc_lbl_codigo_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl_codigo_1.gridx = 3;
		gbc_lbl_codigo_1.gridy = 2;
		panel.add(lbl_codigo, gbc_lbl_codigo_1);
		lbl_codigo.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_codigo.setFont(new Font("Tahoma", Font.PLAIN, 92));

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridwidth = 3;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 3;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setBackground(new Color(123, 166, 111));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 65, 107, 222, 305, 82, 244, 293, 65 };
		gbl_panel_2.rowHeights = new int[] { 50, 36, 39, 35, 43, 47, 45, 37, 68, 94, 20 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblNomeDoVegetal = new JLabel("Nome do Vegetal:");
		lblNomeDoVegetal.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal = new GridBagConstraints();
		gbc_lblNomeDoVegetal.anchor = GridBagConstraints.WEST;
		gbc_lblNomeDoVegetal.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal.gridwidth = 2;
		gbc_lblNomeDoVegetal.gridx = 1;
		gbc_lblNomeDoVegetal.gridy = 1;
		panel_2.add(lblNomeDoVegetal, gbc_lblNomeDoVegetal);

		txt_nome = new JTextField();
		txt_nome.setBackground(new Color(234, 242, 237));
		txt_nome.setForeground(Color.DARK_GRAY);
		txt_nome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_nome.setColumns(10);
		txt_nome.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_txt_nome_1 = new GridBagConstraints();
		gbc_txt_nome_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_nome_1.insets = new Insets(0, 0, 5, 0);
		gbc_txt_nome_1.gridwidth = 4;
		gbc_txt_nome_1.gridx = 3;
		gbc_txt_nome_1.gridy = 1;
		panel_2.add(txt_nome, gbc_txt_nome_1);

		JLabel lblEspcieDoVegetal = new JLabel("Esp\u00E9cie do Vegetal:");
		lblEspcieDoVegetal.setForeground(new Color(31, 65, 45));
		lblEspcieDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblEspcieDoVegetal = new GridBagConstraints();
		gbc_lblEspcieDoVegetal.anchor = GridBagConstraints.WEST;
		gbc_lblEspcieDoVegetal.fill = GridBagConstraints.VERTICAL;
		gbc_lblEspcieDoVegetal.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspcieDoVegetal.gridwidth = 2;
		gbc_lblEspcieDoVegetal.gridx = 1;
		gbc_lblEspcieDoVegetal.gridy = 3;
		panel_2.add(lblEspcieDoVegetal, gbc_lblEspcieDoVegetal);

		txt_especie = new JTextField();
		txt_especie.setForeground(Color.DARK_GRAY);
		txt_especie.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_especie.setColumns(10);
		txt_especie.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_especie.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_especie_1 = new GridBagConstraints();
		gbc_txt_especie_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_especie_1.insets = new Insets(0, 0, 5, 0);
		gbc_txt_especie_1.gridwidth = 4;
		gbc_txt_especie_1.gridx = 3;
		gbc_txt_especie_1.gridy = 3;
		panel_2.add(txt_especie, gbc_txt_especie_1);

		JLabel lblNomeDoVegetal_1_1 = new JLabel("Produto Vendido Por:");
		lblNomeDoVegetal_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNomeDoVegetal_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1.gridwidth = 2;
		gbc_lblNomeDoVegetal_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1.gridy = 5;
		panel_2.add(lblNomeDoVegetal_1_1, gbc_lblNomeDoVegetal_1_1);

		rb_Kg = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rb_Kg);
		rb_Kg.setBorder(new LineBorder(new Color(0, 0, 0)));
		rb_Kg.setForeground(new Color(31, 65, 45));
		rb_Kg.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rb_Kg.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rb_Kg);
		GridBagConstraints gbc_rb_Kg_1 = new GridBagConstraints();
		gbc_rb_Kg_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_rb_Kg_1.insets = new Insets(0, 0, 5, 5);
		gbc_rb_Kg_1.gridx = 3;
		gbc_rb_Kg_1.gridy = 5;
		panel_2.add(rb_Kg, gbc_rb_Kg_1);

		rb_Unidade = new JRadioButton("Unidade");
		buttonGroup.add(rb_Unidade);
		rb_Unidade.setForeground(new Color(31, 65, 45));
		rb_Unidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rb_Unidade.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rb_Unidade);
		GridBagConstraints gbc_rb_Unidade_1 = new GridBagConstraints();
		gbc_rb_Unidade_1.fill = GridBagConstraints.BOTH;
		gbc_rb_Unidade_1.insets = new Insets(0, 0, 5, 5);
		gbc_rb_Unidade_1.gridx = 5;
		gbc_rb_Unidade_1.gridy = 5;
		panel_2.add(rb_Unidade, gbc_rb_Unidade_1);

		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Pre\u00E7o:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNomeDoVegetal_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1, gbc_lblNomeDoVegetal_1_1_1);

		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoVegetal_1_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridx = 2;
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1_1);

		JButton btnSalvar = new JButton("Alterar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Produto produto = produtoSelecionado;
				produto.setIdProduto(Integer.parseInt(lbl_codigo.getText()));
				produto.setProduto_nomeveg(txt_nome.getText());
				produto.setProduto_especieveg(txt_especie.getText());
				produto.setProduto_preco(Float.parseFloat(txt_preco.getText()));
				produto.setProduto_quantidade(Float.parseFloat(txt_quantidade.getText()));
				if (rb_Kg.isSelected() == true) {
					produto.setUnidade_quantidade_idUnidade_quantidade(1);
				} else {
					produto.setUnidade_quantidade_idUnidade_quantidade(2);
				}
				alt.alterarProduto(produto);
				telaEstoque.table.setModel(etb.listagemProduto());
				frmSalvarProduto.setVisible(false);
				TelaEstoque te = new TelaEstoque();
				te.setVisible(true);

			}
		});

		txt_preco = new JTextField();
		txt_preco.setForeground(Color.DARK_GRAY);
		txt_preco.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_preco.setColumns(10);
		txt_preco.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_preco.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_preco_1 = new GridBagConstraints();
		gbc_txt_preco_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_preco_1.insets = new Insets(0, 0, 5, 5);
		gbc_txt_preco_1.gridx = 3;
		gbc_txt_preco_1.gridy = 7;
		panel_2.add(txt_preco, gbc_txt_preco_1);

		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1.anchor = GridBagConstraints.EAST;
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
		GridBagConstraints gbc_txt_quantidade_1 = new GridBagConstraints();
		gbc_txt_quantidade_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_quantidade_1.insets = new Insets(0, 0, 5, 0);
		gbc_txt_quantidade_1.gridx = 6;
		gbc_txt_quantidade_1.gridy = 7;
		panel_2.add(txt_quantidade, gbc_txt_quantidade_1);
		btnSalvar.setBackground(new Color(255, 255, 255));
		btnSalvar.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btnSalvar.setForeground(new Color(31, 65, 45));
		btnSalvar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.fill = GridBagConstraints.BOTH;
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridwidth = 2;
		gbc_btnSalvar.gridx = 2;
		gbc_btnSalvar.gridy = 9;
		panel_2.add(btnSalvar, gbc_btnSalvar);

		JButton btnExcluir = new JButton("Cancelar");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaEstoque te = new TelaEstoque();
				te.abrir();
				frmSalvarProduto.setVisible(false);
			}
		});
		btnExcluir.setForeground(new Color(31, 65, 45));
		btnExcluir.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		btnExcluir.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btnExcluir.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.fill = GridBagConstraints.BOTH;
		gbc_btnExcluir.gridwidth = 2;
		gbc_btnExcluir.gridx = 5;
		gbc_btnExcluir.gridy = 9;
		panel_2.add(btnExcluir, gbc_btnExcluir);

		
		
	}

	public void abrir(Produto produtoSelecionado) {

		this.produtoSelecionado = produtoSelecionado;
		frmSalvarProduto.setVisible(true);
		frmSalvarProduto.setLocationRelativeTo(null);
		frmSalvarProduto.setExtendedState(frmSalvarProduto.getExtendedState() | JFrame.MAXIMIZED_BOTH);

		txt_nome.setText(produtoSelecionado.getProduto_nomeveg());
		txt_especie.setText(produtoSelecionado.getProduto_especieveg());
		txt_preco.setText(Float.toString(produtoSelecionado.getProduto_preco()));
		txt_quantidade.setText(Float.toString(produtoSelecionado.getProduto_quantidade()));
		lbl_codigo.setText(Integer.toString(produtoSelecionado.getIdProduto()));

		if (produtoSelecionado.getUnidade_quantidade_idUnidade_quantidade() == 1) {
			rb_Kg.setSelected(true);
		} else {
			rb_Unidade.setSelected(true);
		}
	}

	public static void scaleRadioButtonIcon(JRadioButton rb) {
		boolean previousState = rb.isSelected();
		rb.setSelected(false);
		Icon radioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (n??o selecionado)
		BufferedImage radioImage = new BufferedImage(radioIcon.getIconWidth(), radioIcon.getIconHeight(),
				BufferedImage.TYPE_INT_ARGB);
		Graphics graphics = radioImage.createGraphics();
		try {
			radioIcon.paintIcon(rb, graphics, 0, 0);
		} finally {
			graphics.dispose();
		}
		ImageIcon newRadioImage = new ImageIcon(radioImage);
		Image finalRadioImage = newRadioImage.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

		rb.setSelected(true);
		Icon selectedRadioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (selecionado)S
		BufferedImage selectedRadioImage = new BufferedImage(selectedRadioIcon.getIconWidth(),
				selectedRadioIcon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics selectedGraphics = selectedRadioImage.createGraphics();
		try {
			selectedRadioIcon.paintIcon(rb, selectedGraphics, 0, 0);
		} finally {
			selectedGraphics.dispose();
		}
		ImageIcon newSelectedRadioImage = new ImageIcon(selectedRadioImage);
		Image selectedFinalRadioImage = newSelectedRadioImage.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		rb.setSelected(previousState);
		rb.setIcon(new ImageIcon(finalRadioImage));
		rb.setSelectedIcon(new ImageIcon(selectedFinalRadioImage));
	}
}
