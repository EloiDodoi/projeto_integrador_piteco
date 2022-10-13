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

public class TelaSalvarProduto {

	private JFrame frame;
	private JTextField txt_nome;
	private JTextField txt_especie;
	private JTextField txt_preco;
	private JTextField txt_quantidade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	TelaEstoque telaEstoque;
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
		EventQueue.invokeLater(new UUC() {
			public void run() {
				try {
					TelaSalvarProduto window = new TelaSalvarProduto();
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
	public TelaSalvarProduto() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMaximumSize(new Dimension(1600, 850));
		frame.setMinimumSize(new Dimension(1600, 850));
		frame.getContentPane().setBackground(new Color(234, 242, 237));
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblVendedor = new JLabel("Alterar Produto");
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblVendedor.setBounds(124, 137, 797, 110);
		frame.getContentPane().add(lblVendedor);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 166, 111));
		panel_2.setBounds(124, 256, 1430, 544);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNomeDoVegetal = new JLabel("Nome do Vegetal:");
		lblNomeDoVegetal.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal.setBounds(50, 50, 293, 35);
		panel_2.add(lblNomeDoVegetal);

		JLabel lblEspcieDoVegetal = new JLabel("Esp\u00E9cie do Vegetal:");
		lblEspcieDoVegetal.setForeground(new Color(31, 65, 45));
		lblEspcieDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblEspcieDoVegetal.setBounds(50, 125, 321, 35);
		panel_2.add(lblEspcieDoVegetal);

		JLabel lblNomeDoVegetal_1_1 = new JLabel("Produto Vendido Por:");
		lblNomeDoVegetal_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1.setBounds(50, 210, 332, 28);
		panel_2.add(lblNomeDoVegetal_1_1);

		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Pre\u00E7o:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1.setBounds(50, 295, 107, 37);
		panel_2.add(lblNomeDoVegetal_1_1_1);

		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1_1.setBounds(837, 299, 204, 28);
		panel_2.add(lblNomeDoVegetal_1_1_1_1);

		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1_1_1.setBounds(174, 299, 84, 28);
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1);

		txt_nome = new JTextField();
		txt_nome.setBackground(new Color(234, 242, 237));
		txt_nome.setForeground(Color.DARK_GRAY);
		txt_nome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_nome.setColumns(10);
		txt_nome.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_nome.setBounds(410, 51, 943, 35);
		panel_2.add(txt_nome);

		rb_Kg = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rb_Kg);
		rb_Kg.setBorder(new LineBorder(new Color(0, 0, 0)));
		rb_Kg.setForeground(new Color(31, 65, 45));
		rb_Kg.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rb_Kg.setBackground(new Color(123, 166, 111));
		rb_Kg.setBounds(460, 203, 255, 47);
		scaleRadioButtonIcon(rb_Kg);
		panel_2.add(rb_Kg);
		


		txt_especie = new JTextField();
		txt_especie.setForeground(Color.DARK_GRAY);
		txt_especie.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_especie.setColumns(10);
		txt_especie.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_especie.setBackground(new Color(234, 242, 237));
		txt_especie.setBounds(410, 125, 943, 35);
		panel_2.add(txt_especie);

		txt_preco = new JTextField();
		txt_preco.setForeground(Color.DARK_GRAY);
		txt_preco.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_preco.setColumns(10);
		txt_preco.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_preco.setBackground(new Color(234, 242, 237));
		txt_preco.setBounds(225, 297, 293, 35);
		panel_2.add(txt_preco);

		txt_quantidade = new JTextField();
		txt_quantidade.setForeground(Color.DARK_GRAY);
		txt_quantidade.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_quantidade.setColumns(10);
		txt_quantidade.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_quantidade.setBackground(new Color(234, 242, 237));
		txt_quantidade.setBounds(1060, 297, 293, 35);
		panel_2.add(txt_quantidade);

		rb_Unidade = new JRadioButton("Unidade");
		buttonGroup.add(rb_Unidade);
		rb_Unidade.setForeground(new Color(31, 65, 45));
		rb_Unidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rb_Unidade.setBackground(new Color(123, 166, 111));
		rb_Unidade.setBounds(797, 208, 204, 37);
		scaleRadioButtonIcon(rb_Unidade);
		panel_2.add(rb_Unidade);

		JButton btnSalvar = new JButton("Alterar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto produto = produtoSelecionado;
				produto.setIdProduto(Integer.parseInt(lbl_codigo.getText()));
				produto.setProduto_nomeveg(txt_nome.getText());
				produto.setProduto_especieveg(txt_especie.getText());
				produto.setProduto_preco(Float.parseFloat(txt_preco.getText()));
				produto.setProduto_quantidade(Float.parseFloat(txt_quantidade.getText()));
				if(rb_Kg.isSelected()== true) {
					produto.setUnidade_quantidade_idUnidade_quantidade(1);
				}else {
					produto.setUnidade_quantidade_idUnidade_quantidade(2);
				}
				alt.alterarProduto(produto);
				telaEstoque.table.setModel(etb.listagemProduto());
				frame.setVisible(false);
				
			}
		});
		btnSalvar.setBackground(new Color(123, 166, 111));
		btnSalvar.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btnSalvar.setForeground(new Color(31, 65, 45));
		btnSalvar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		btnSalvar.setBounds(174, 400, 396, 94);
		panel_2.add(btnSalvar);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(103, 146, 90));
		panel_3.setBounds(184, 410, 396, 94);
		panel_2.add(panel_3);

		JButton btnExcluir = new JButton("Cancelar");
		btnExcluir.setForeground(new Color(31, 65, 45));
		btnExcluir.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		btnExcluir.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btnExcluir.setBackground(new Color(123, 166, 111));
		btnExcluir.setBounds(820, 400, 396, 94);
		panel_2.add(btnExcluir);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(103, 146, 90));
		panel_3_1.setBounds(830, 410, 396, 94);
		panel_2.add(panel_3_1);

		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 4));
		separator.setBounds(124, 118, 1430, 8);
		frame.getContentPane().add(separator);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(123, 166, 111));
		panel_1_1.setBounds(0, 0, 50, 811);
		frame.getContentPane().add(panel_1_1);

		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(TelaSalvarProduto.class.getResource("/img/menu-aberto.png")));
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBorder(null);
		btnMenu.setBackground(new Color(123, 166, 111));
		btnMenu.setBounds(0, 754, 50, 46);
		panel_1_1.add(btnMenu);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(123, 166, 111));
		panel_2_1.setBounds(0, 0, 1584, 40);
		frame.getContentPane().add(panel_2_1);

		JButton btnConfiguracao = new JButton("");
		btnConfiguracao.setIcon(new ImageIcon(TelaSalvarProduto.class.getResource("/img/solucao.png")));
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(123, 166, 111));
		btnConfiguracao.setBounds(1464, 0, 60, 40);
		panel_2_1.add(btnConfiguracao);

		JButton btnNotificacao = new JButton("");
		btnNotificacao.setIcon(new ImageIcon(TelaSalvarProduto.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(123, 166, 111));
		btnNotificacao.setBounds(1401, 0, 60, 40);
		panel_2_1.add(btnNotificacao);

		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(TelaSalvarProduto.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(123, 166, 111));
		btnUser.setBounds(1524, 0, 60, 40);
		panel_2_1.add(btnUser);
		
		lbl_codigo = new JLabel("0");
		lbl_codigo.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_codigo.setFont(new Font("Tahoma", Font.PLAIN, 92));
		lbl_codigo.setBounds(1100, 124, 454, 126);
		frame.getContentPane().add(lbl_codigo);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEstoque te = new TelaEstoque();
				te.abrir();
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(31, 65, 45));
		btnNewButton.setBounds(60, 51, 60, 56);
		frame.getContentPane().add(btnNewButton);
	

	}
	
	public void abrir(Produto produtoSelecionado) {
		
		this.produtoSelecionado = produtoSelecionado;
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		txt_nome.setText(produtoSelecionado.getProduto_nomeveg());
		txt_especie.setText(produtoSelecionado.getProduto_especieveg());
		txt_preco.setText(Float.toString( produtoSelecionado.getProduto_preco()));
		txt_quantidade.setText(Float.toString(produtoSelecionado.getProduto_quantidade()));
		lbl_codigo.setText(Integer.toString(produtoSelecionado.getIdProduto()));
		
		
		if (produtoSelecionado.getUnidade_quantidade_idUnidade_quantidade() ==1 ) {
			rb_Kg.setSelected(true);
		}else {
			rb_Unidade.setSelected(true);
		}
	}


	public static void scaleRadioButtonIcon(JRadioButton rb) {
		boolean previousState = rb.isSelected();
		rb.setSelected(false);
		Icon radioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (não selecionado)
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
