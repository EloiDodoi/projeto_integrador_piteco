package visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import controle.AlterarProdutoBD;
import controle.EstoqueBD;
import modelo.Produto;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisaNoEstoque;
	Produto produto_selecionado;
	EstoqueBD etb = new EstoqueBD();
	AlterarProdutoBD at = new AlterarProdutoBD();
	JTable table;
	JComboBox comboBox;
	static TelaEstoque frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaEstoque();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void abrir() {
		TelaEstoque frame = new TelaEstoque();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public TelaEstoque() {
		setTitle("Estoque");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaEstoque.class.getResource("/img/1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));

		setContentPane(contentPane);

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
				TelaBemVindo tbv = new TelaBemVindo();
				tbv.abrir();
				setVisible(false);
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
				JOptionPane.showMessageDialog(null, "Voc� j� est� na Tela de Estoque.");
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

		JMenuItem btnMenuVendas = new JMenuItem("Vendas");
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
		btnCadastrarVendedor.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCadastrarVendedor.setBorder(null);
		btnCadastrarVendedor.setBackground(new Color(150, 191, 120));
		mnNewMenu.add(btnCadastrarVendedor);
		
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
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAlterarAdm taa = new TelaAlterarAdm();
				taa.abrir();
			}
		});
		btnUser.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 72, 854, 232, 36, 256, 65 };
		gbl_contentPane.rowHeights = new int[] { 30, 5, 123, 43, 61, 459, 30 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		table = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setSelectionForeground(new Color(234, 242, 237));
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setBounds(130, 330, 1119, 391);
		table.setRowHeight(40);
		table.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));

		table.setModel(new DefaultTableModel(new Object[][][][][][] {

		}, new String[] { "C\u00F3digo", "Nome", "Esp\u00E9cie", "Pre\u00E7o", "Quantidade" }));
		table.setModel(etb.listagemProduto());
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);

		JTableHeader tHeader = table.getTableHeader();
		tHeader.setBackground(new Color(150, 191, 120));
		tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tHeader.setForeground(Color.WHITE);

		JPanel Linha = new JPanel();
		Linha.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_Linha = new GridBagConstraints();
		gbc_Linha.fill = GridBagConstraints.BOTH;
		gbc_Linha.insets = new Insets(0, 0, 5, 0);
		gbc_Linha.gridwidth = 4;
		gbc_Linha.gridx = 1;
		gbc_Linha.gridy = 1;
		contentPane.add(Linha, gbc_Linha);

		JLabel lblTitulo = new JLabel("Estoque");
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.fill = GridBagConstraints.VERTICAL;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 2;
		contentPane.add(lblTitulo, gbc_lblTitulo);
		
				JButton btnAlterar = new JButton("  Alterar  ");
				btnAlterar.setForeground(new Color(234, 242, 237));
				btnAlterar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
				btnAlterar.setBackground(new Color(31, 65, 45));
				btnAlterar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (produto_selecionado != null) {
							TelaSalvarProduto sp = new TelaSalvarProduto();
							sp.abrir(produto_selecionado);
							frame.setVisible(false);
						}
					}
				});
				
				
				GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
				gbc_btnAlterar.anchor = GridBagConstraints.SOUTH;
				gbc_btnAlterar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAlterar.insets = new Insets(0, 0, 5, 0);
				gbc_btnAlterar.gridx = 4;
				gbc_btnAlterar.gridy = 2;
				contentPane.add(btnAlterar, gbc_btnAlterar);

		JPanel panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 1;
		gbc_panelPesquisa.gridy = 3;
		contentPane.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] { 80, 800 };
		gbl_panelPesquisa.rowHeights = new int[] { 32 };
		gbl_panelPesquisa.columnWeights = new double[] { 1.0, 1.0 };
		gbl_panelPesquisa.rowWeights = new double[] { 0.0 };
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
				String pesquisa = textFieldPesquisaNoEstoque.getText();
				EstoqueBD ebd = new EstoqueBD();
				
				ebd.atualizarPesquisa(table, pesquisa, filtro());;
			}
		});
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));

		textFieldPesquisaNoEstoque = new JTextField();
		GridBagConstraints gbc_textFieldPesquisaNoEstoque = new GridBagConstraints();
		gbc_textFieldPesquisaNoEstoque.insets = new Insets(0, 0, 0, 5);
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

		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		comboBox.setForeground(new Color(234, 242, 237));
		comboBox.setBackground(new Color(31, 65, 45));
		comboBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { " Filtrar", " Nome", " Código",
				" Preço - Maior para menor", " Preço - Menor para maior" }));
		
				JButton btnRemover = new JButton("Remover");
				btnRemover.setForeground(new Color(234, 242, 237));
				btnRemover.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
				btnRemover.setBackground(new Color(31, 65, 45));
				btnRemover.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						etb.deletar(produto_selecionado, table);
						table.setModel(etb.listagemProduto());
					}
				});
				
						GridBagConstraints gbc_btnRemover = new GridBagConstraints();
						gbc_btnRemover.fill = GridBagConstraints.BOTH;
						gbc_btnRemover.anchor = GridBagConstraints.EAST;
						gbc_btnRemover.insets = new Insets(0, 0, 5, 0);
						gbc_btnRemover.gridx = 4;
						gbc_btnRemover.gridy = 3;
						contentPane.add(btnRemover, gbc_btnRemover);

		JScrollPane scrollPane = new JScrollPane(table);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		contentPane.add(scrollPane, gbc_scrollPane);

		JTableHeader tH = table.getTableHeader();

		// -------------------------------------------------------- métodos
		// -------------------------------------
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Produto> lista = etb.listaProdutos();
				int posicao_produto = table.getSelectedRow();
				produto_selecionado = lista.get(posicao_produto);
				System.out.println(produto_selecionado.getProduto_nomeveg());
			}
		});
		tH.setBackground(new Color(150, 191, 120));
		tH.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tH.setForeground(Color.WHITE);

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
		}
		else if(comboBox.getSelectedIndex() == 4) {
			filtro = 4;
		}else {
			JOptionPane.showMessageDialog(null, "Escolha uma das opções para filtro!");
		}
		
		return filtro;
	}
}
