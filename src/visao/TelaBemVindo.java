package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controle.EstoqueBD;

import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import java.awt.*;
import java.awt.Rectangle;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Point;

public class TelaBemVindo extends JFrame {

	static TelaBemVindo frame = new TelaBemVindo();
	private int statusMenu = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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

	public TelaBemVindo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaBemVindo.class.getResource("/img/1.png")));
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 641);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(150, 191, 120));
		menuBar.setForeground(new Color(150, 191, 120));
		menuBar.setPreferredSize(new Dimension(0, 40));
		menuBar.setMinimumSize(new Dimension(0, 5));
		menuBar.setMaximumSize(new Dimension(0, 5));
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("  ");
		mnNewMenu.setOpaque(true);
		mnNewMenu.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.setPreferredSize(new Dimension(60, 40));
		mnNewMenu.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		mnNewMenu.setVerticalAlignment(SwingConstants.CENTER);
		mnNewMenu.setVerticalTextPosition(SwingConstants.CENTER);
		mnNewMenu.setForeground(new Color(150, 191, 120));
		mnNewMenu.setBorder(null);
		mnNewMenu.setBackground(new Color(150, 191, 120));
		menuBar.add(mnNewMenu);

		JLabel lblNewLabel_2 = new JLabel("PITECO");
		lblNewLabel_2.setMaximumSize(new Dimension(1000, 14));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(85, 121, 74));
		lblNewLabel_2.setBackground(new Color(150, 191, 120));
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		mnNewMenu.add(lblNewLabel_2);

		JMenuItem btnMenuInicio = new JMenuItem("In\u00EDcio");
		btnMenuInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você já está na Tela Inicial.");
			}
		});
		btnMenuInicio.setOpaque(true);
		btnMenuInicio.setForeground(new Color(85, 121, 74));
		btnMenuInicio.setBorder(null);
		btnMenuInicio.setBackground(new Color(150, 191, 120));
		btnMenuInicio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnMenuInicio.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuInicio.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(btnMenuInicio);

		JPanel linha = new JPanel();
		linha.setPreferredSize(new Dimension(1, 2));
		linha.setMinimumSize(new Dimension(5, 1));
		linha.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha);

		JMenuItem btnMenuEstoque = new JMenuItem("Estoque");
		btnMenuEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEstoque te = new TelaEstoque();
				te.abrir();
				setVisible(false);
			}
		});
		btnMenuEstoque.setOpaque(true);
		btnMenuEstoque.setForeground(new Color(85, 121, 74));
		btnMenuEstoque.setBorder(null);
		btnMenuEstoque.setBackground(new Color(150, 191, 120));
		btnMenuEstoque.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuEstoque.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuEstoque);

		JMenuItem btnMenuVendas = new JMenuItem("Venda");
		btnMenuVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				TelaVenda venda = new TelaVenda();
				venda.abrir();
			}
		});
		btnMenuVendas.setOpaque(true);
		btnMenuVendas.setForeground(new Color(85, 121, 74));
		btnMenuVendas.setBorder(null);
		btnMenuVendas.setBackground(new Color(150, 191, 120));
		btnMenuVendas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuVendas.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuVendas.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuVendas);

		JPanel linha_1 = new JPanel();
		linha_1.setPreferredSize(new Dimension(1, 2));
		linha_1.setMinimumSize(new Dimension(5, 1));
		linha_1.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1);

		JMenuItem btnMenuRelatorios = new JMenuItem("Hist\u00F3rico de Vendas");
		btnMenuRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaHistoricoVendas thv = new TelaHistoricoVendas();
				thv.abrir();
				setVisible(false);
			}
		});
		btnMenuRelatorios.setOpaque(true);
		btnMenuRelatorios.setForeground(new Color(85, 121, 74));
		btnMenuRelatorios.setBorder(null);
		btnMenuRelatorios.setBackground(new Color(150, 191, 120));
		btnMenuRelatorios.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuRelatorios.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuRelatorios);

		JMenuItem btnMenuControle = new JMenuItem("Controle");
		btnMenuControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaControleVendedores tcv = new TelaControleVendedores();
				tcv.abrir();
			}
			});
		btnMenuControle.setOpaque(true);
		btnMenuControle.setForeground(new Color(85, 121, 74));
		btnMenuControle.setBorder(null);
		btnMenuControle.setBackground(new Color(150, 191, 120));
		btnMenuControle.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuControle.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuControle.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuControle);

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
		btnCadastrarVendedor.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnCadastrarVendedor.setBorder(null);
		btnCadastrarVendedor.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnCadastrarVendedor);
		
		JMenuItem btnListagemDeVendedores = new JMenuItem("Listagem de Vendedores");
		btnListagemDeVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
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
		
		JPanel linha_1_1_2 = new JPanel();
		linha_1_1_2.setPreferredSize(new Dimension(1, 2));
		linha_1_1_2.setMinimumSize(new Dimension(5, 1));
		linha_1_1_2.setBackground(new Color(85, 121, 74));
		mnNewMenu.add(linha_1_1_2);

		JMenuItem btnMenuSair = new JMenuItem("Sair");
		btnMenuSair.setOpaque(true);
		btnMenuSair.setForeground(new Color(85, 121, 74));
		btnMenuSair.setBorder(null);
		btnMenuSair.setBackground(new Color(150, 191, 120));
		btnMenuSair.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuSair);

		JPanel linha_1_1_1 = new JPanel();
		linha_1_1_1.setPreferredSize(new Dimension(1, 2));
		linha_1_1_1.setMinimumSize(new Dimension(5, 1));
		linha_1_1_1.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(linha_1_1_1);
		// panel_1.add(btnMenu);

		JPanel BarraSuperior = new JPanel();
		menuBar.add(BarraSuperior);
		BarraSuperior.setBackground(new Color(150, 191, 120));

		BarraSuperior.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(150, 191, 120));
		BarraSuperior.add(panel_8, BorderLayout.EAST);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[] { 30, 30, 20, 0, 30, 20 };
		gbl_panel_8.rowHeights = new int[] { 33, 0 };
		gbl_panel_8.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_8.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_8.setLayout(gbl_panel_8);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel_8.add(separator, gbc_separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(234, 242, 237));
		separator.setForeground(new Color(234, 242, 237));

		JButton btnNotificacao = new JButton("");
		btnNotificacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstoqueBD ebd = new EstoqueBD();
				ebd.notificacaoEstoque();
			}
		});
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 3;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));

		JButton btnUser = new JButton("");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAlterarAdm taa = new TelaAlterarAdm();
				taa.abrir();
			}
		});
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(234, 242, 237));
		panel.setLayout(new BorderLayout(0, 0));

//		JLabel lblTitulo = new JLabel("Bem Vindo!");
//		lblTitulo.setForeground(new Color(31, 65, 45));
//		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
//		lblTitulo.setBounds(471, 468, 440, 164);
//		panel.add(lblTitulo);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(234, 242, 237));
		panel.add(panel_3, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 40, 381, 68, 386, 40 };
		gbl_panel_3.rowHeights = new int[] { 0, 97, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JButton btnCadastro = new JButton("Cadastro Produto");
		btnCadastro.setToolTipText("Efetuar o cadastro de um novo produto");
		btnCadastro.setBorder(new LineBorder(new Color(85, 121, 74), 2, true));
		GridBagConstraints gbc_btnCadastro = new GridBagConstraints();
		gbc_btnCadastro.fill = GridBagConstraints.BOTH;
		gbc_btnCadastro.insets = new Insets(0, 0, 10, 5);
		gbc_btnCadastro.gridx = 1;
		gbc_btnCadastro.gridy = 1;
		panel_3.add(btnCadastro, gbc_btnCadastro);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroProduto cadastro_produto = new TelaCadastroProduto();
				cadastro_produto.abrir();
				setVisible(false);
			}
		});
		btnCadastro.setBackground(new Color(234, 242, 237));
		btnCadastro.setForeground(new Color(85, 121, 74));
		btnCadastro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 50));

		JButton btnVenda = new JButton("Venda");
		btnVenda.setToolTipText("Efetuar uma nova venda");
		btnVenda.setBorder(new LineBorder(new Color(85, 121, 74), 2, true));
		GridBagConstraints gbc_btnVenda = new GridBagConstraints();
		gbc_btnVenda.insets = new Insets(0, 0, 10, 0);
		gbc_btnVenda.fill = GridBagConstraints.BOTH;
		gbc_btnVenda.gridx = 3;
		gbc_btnVenda.gridy = 1;
		panel_3.add(btnVenda, gbc_btnVenda);
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVenda venda = new TelaVenda();
				venda.abrir();
				setVisible(false);
			}
		});
		btnVenda.setBackground(new Color(234, 242, 237));
		btnVenda.setForeground(new Color(85, 121, 74));
		btnVenda.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 65));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(234, 242, 237));
		panel.add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 600 };
		gbl_panel_4.rowHeights = new int[] { 400, 0, 200 };
		gbl_panel_4.columnWeights = new double[] { 0.0 };
		gbl_panel_4.rowWeights = new double[] { 0.0, 0.0, 0.0 };
		panel_4.setLayout(gbl_panel_4);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_4.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Bem Vindo!");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_4.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setForeground(new Color(31, 65, 45));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));

		/*
		 * GroupLayout gl_BarraSuperior = new GroupLayout(BarraSuperior);
		 * gl_BarraSuperior.setHorizontalGroup(
		 * gl_BarraSuperior.createParallelGroup(Alignment.LEADING)
		 * .addGroup(gl_BarraSuperior.createSequentialGroup() .addGap(1294)
		 * .addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 60,
		 * GroupLayout.PREFERRED_SIZE))
		 * .addGroup(gl_BarraSuperior.createSequentialGroup() .addGap(1236)
		 * .addComponent(btnConfiguracao, GroupLayout.PREFERRED_SIZE, 60,
		 * GroupLayout.PREFERRED_SIZE))
		 * .addGroup(gl_BarraSuperior.createSequentialGroup() .addGap(1178)
		 * .addComponent(btnNotificacao, GroupLayout.PREFERRED_SIZE, 60,
		 * GroupLayout.PREFERRED_SIZE)) ); gl_BarraSuperior.setVerticalGroup(
		 * gl_BarraSuperior.createParallelGroup(Alignment.LEADING)
		 * .addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 40,
		 * GroupLayout.PREFERRED_SIZE) .addComponent(btnConfiguracao,
		 * GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
		 * .addComponent(btnNotificacao, GroupLayout.PREFERRED_SIZE, 40,
		 * GroupLayout.PREFERRED_SIZE) ); BarraSuperior.setLayout(gl_BarraSuperior);
		 * 
		 * btnUser.setBounds(1294, 0, 60, 40); BarraSuperior.add(btnUser);
		 * 
		 * }
		 * 
		 * JSeparator separator = new JSeparator();
		 * separator.setOrientation(SwingConstants.VERTICAL);
		 * separator.setBackground(new Color(234, 242, 237));
		 * separator.setForeground(new Color(234, 242, 237)); separator.setBounds(1294,
		 * 0, 2, 40); BarraSuperior.add(separator);
		 */
		JLabel Logo = new JLabel("");
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setLabelFor(Logo);
		Logo.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/3.png")));
		Logo.setBounds(461, 51, 469, 402);
		panel.add(Logo);

	}

	public void abrir() {
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

}
