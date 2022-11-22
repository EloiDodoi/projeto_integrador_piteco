package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import controle.VendaBD;
import modelo.ItemVenda;
import modelo.Venda;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_5;
	private JPanel itensVenda;
	
	static TelaVenda frame = new TelaVenda();
	JLabel lblNewLabel;
	JLabel lblValorDoProduto;
	
	Venda v = new Venda();
	VendasPagamento vp = new VendasPagamento(v);
	
	private JTextField cur_textField = null;
	private JTextField cur_textField_1 = null;
	int numItens = 0;
	
	ArrayList<JButton> lista_botoes_excluir = new ArrayList<JButton>();
	

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
	public void abrir() {
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	public TelaVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 517);
		
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
				setVisible(false);
				TelaEstoque te = new TelaEstoque();
				te.abrir();
				
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
				JOptionPane.showMessageDialog(null, "Voc� j� est� na Tela de Vendas.");
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
		
		JMenuItem btnMenuSair = new JMenuItem("Sair");
		btnMenuSair.setOpaque(true);
		btnMenuSair.setForeground(new Color(85, 121, 74));
		btnMenuSair.setBorder(null);
		btnMenuSair.setBackground(new Color(150, 191, 120));
		btnMenuSair.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuSair);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(150, 191, 120));
	//	BarraSuperior.add(panel_8, BorderLayout.EAST);
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
		btnNotificacao.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 3;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 0, 10);
		gbc_btnUser.gridx = 5;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(234, 242, 237));
		panel.add(panel_3, BorderLayout.NORTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 1101, 0 };
		gbl_panel_3.rowHeights = new int[] { 30, 100 };
		gbl_panel_3.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0 };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblVendedor = new JLabel("Venda\r\n");
		lblVendedor.setMinimumSize(new Dimension(500, 200));
		lblVendedor.setMaximumSize(new Dimension(500, 10));
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.anchor = GridBagConstraints.WEST;
		gbc_lblVendedor.insets = new Insets(0, 30, 0, 5);
		gbc_lblVendedor.gridx = 0;
		gbc_lblVendedor.gridy = 1;
		panel_3.add(lblVendedor, gbc_lblVendedor);
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));

		JSeparator separator1 = new JSeparator();
		GridBagConstraints gbc_separator1 = new GridBagConstraints();
		gbc_separator1.gridwidth = 2;
		gbc_separator1.fill = GridBagConstraints.BOTH;
		gbc_separator1.insets = new Insets(20, 30, 5, 10);
		gbc_separator1.gridx = 0;
		gbc_separator1.gridy = 0;
		panel_3.add(separator1, gbc_separator1);
		separator1.setBorder(new LineBorder(new Color(31, 65, 45), 50));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(234, 242, 237));
		panel.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnNewButton = new JButton(" Pagamento ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(v.getArrayItensVenda().isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Adicione pelo menos um item à venda para realizar o pagamento.");
				}
				else {
					VendasPagamento telavp = new VendasPagamento(v);
					telavp.listagemItensVenda(v);
					telavp.setVisible(true);
					setVisible(false);
				}
			}
		});
		
		JButton btnCancelar = new JButton(" Cancelar ");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBemVindo tbv = new TelaBemVindo();
				tbv.abrir();
				setVisible(false);
			}
		});
		btnCancelar.setForeground(new Color(217, 173, 181));
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 45));
		btnCancelar.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
		btnCancelar.setBackground(new Color(234, 242, 237));
		panel_4.add(btnCancelar);
		
		JPanel separador = new JPanel();
		panel_4.add(separador);
		btnNewButton.setBackground(new Color(234, 242, 237));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 45));
		btnNewButton.setForeground(new Color(217, 173, 181));
		btnNewButton.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
		panel_4.add(btnNewButton);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(234, 242, 237));
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(31, 65, 45));
		panel_5.add(scrollPane, BorderLayout.CENTER);

		itensVenda = new JPanel();
		itensVenda.setBackground(new Color(234, 242, 237));
		scrollPane.setViewportView(itensVenda);
		itensVenda.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(234, 242, 237));
		panel.add(panel_6, BorderLayout.EAST);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] { 141, 0 };
		gbl_panel_6.rowHeights = new int[] { 31, 0, 0, 0, 0, 0 };
		gbl_panel_6.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_6.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_6.setLayout(gbl_panel_6);

		JButton btnAdicionarItem = new JButton("Adicionar Item");
		btnAdicionarItem.setForeground(new Color(234, 242, 237));
		GridBagConstraints gbc_btnAdicionarItem = new GridBagConstraints();
		gbc_btnAdicionarItem.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdicionarItem.anchor = GridBagConstraints.NORTH;
		gbc_btnAdicionarItem.gridx = 0;
		gbc_btnAdicionarItem.gridy = 2;
		panel_6.add(btnAdicionarItem, gbc_btnAdicionarItem);
		btnAdicionarItem.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		btnAdicionarItem.setBackground(new Color(31, 65, 45));
		btnAdicionarItem.setFont(new Font("Dialog", Font.PLAIN, 22));

		btnAdicionarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItemVenda novoItem = new ItemVenda();
				
				v.adicionarItem(novoItem);
				
				JPanel itemVenda = new JPanel();
				itemVenda.setBackground(new Color(150, 191, 120));
				GridBagLayout gbl_panel_Itens = new GridBagLayout();
				gbl_panel_Itens.columnWidths = new int[] { 30, 0, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel_Itens.rowHeights = new int[] { 0, 30, 30, 30, 0 };
				gbl_panel_Itens.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, Double.MIN_VALUE };
				gbl_panel_Itens.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				itemVenda.setLayout(gbl_panel_Itens);

				JPanel panel_6 = new JPanel();
				panel_6.setBackground(new Color(234, 242, 237));
				GridBagConstraints gbc_panel_6 = new GridBagConstraints();
				gbc_panel_6.gridwidth = 13;
				gbc_panel_6.insets = new Insets(0, 0, 5, 0);
				gbc_panel_6.fill = GridBagConstraints.BOTH;
				gbc_panel_6.gridx = 0;
				gbc_panel_6.gridy = 0;
				itemVenda.add(panel_6, gbc_panel_6);

				GridBagLayout gbl_panel_6 = new GridBagLayout();
				gbl_panel_6.columnWidths = new int[] { 53, 1, 0 };
				gbl_panel_6.rowHeights = new int[] { 39, 0 };
				gbl_panel_6.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
				gbl_panel_6.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
				panel_6.setLayout(gbl_panel_6);

				lblNewLabel = new JLabel("Item");
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
				lblNewLabel.setForeground(new Color(217, 173, 181));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				panel_6.add(lblNewLabel, gbc_lblNewLabel);

				JSeparator separator_1 = new JSeparator();
				separator_1.setBackground(new Color(217, 173, 181));
				separator_1.setForeground(new Color(217, 173, 181));
				GridBagConstraints gbc_separator_1 = new GridBagConstraints();
				gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_separator_1.gridx = 1;
				gbc_separator_1.gridy = 0;
				panel_6.add(separator_1, gbc_separator_1);

				JLabel lblProduto = new JLabel("Código do Produto");
				lblProduto.setHorizontalAlignment(SwingConstants.RIGHT);
				lblProduto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				lblProduto.setForeground(new Color(31, 65, 45));
				GridBagConstraints gbc_lblProduto = new GridBagConstraints();
				gbc_lblProduto.anchor = GridBagConstraints.WEST;
				gbc_lblProduto.insets = new Insets(5, 0, 5, 5);
				gbc_lblProduto.gridx = 1;
				gbc_lblProduto.gridy = 1;
				itemVenda.add(lblProduto, gbc_lblProduto);

				textField = new JTextField();
				textField.setBorder(new LineBorder(new Color(31, 65, 45), 2));
				textField.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 9;
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.gridx = 3;
				gbc_textField.gridy = 1;
				itemVenda.add(textField, gbc_textField);
				textField.setColumns(10);
				textField.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						atualizarValorUnitario();
							
					}

				
				});

				JLabel lblQuantidade = new JLabel("Quantidade");
				lblQuantidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				lblQuantidade.setForeground(new Color(31, 65, 45));
				GridBagConstraints gbc_lblQuantidade = new GridBagConstraints();
				gbc_lblQuantidade.anchor = GridBagConstraints.WEST;
				gbc_lblQuantidade.insets = new Insets(0, 0, 5, 5);
				gbc_lblQuantidade.gridx = 1;
				gbc_lblQuantidade.gridy = 2;
				itemVenda.add(lblQuantidade, gbc_lblQuantidade);

				textField_1 = new JTextField();
				textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2));
				textField_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.gridwidth = 9;
				gbc_textField_1.insets = new Insets(0, 0, 5, 5);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 3;
				gbc_textField_1.gridy = 2;
				itemVenda.add(textField_1, gbc_textField_1);
				textField_1.setColumns(10);
				textField_1.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						
						atualizarValorUnitario();
						
					}
				});
				
				if(cur_textField != null) {
					cur_textField.setEditable(false);
					cur_textField_1.setEditable(false);
				}
				cur_textField = textField;
				cur_textField_1 = textField_1;
				numItens +=1;

				JButton btnDeletarItem = new JButton(" X ");
				btnDeletarItem.setForeground(new Color(234, 242, 237));
				btnDeletarItem.setBorder(new LineBorder(new Color(217, 173, 181), 2));
				btnDeletarItem.setBackground(new Color(217, 173, 181));
				btnDeletarItem.setFont(new Font("Dialog", Font.PLAIN, 27));
				itemVenda.add(btnDeletarItem);
				btnDeletarItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JButton btn = (JButton) e.getSource();
						int pos = lista_botoes_excluir.indexOf(btn);
						lista_botoes_excluir.remove(pos);
						v.getArrayItensVenda().remove(pos);
						
						itensVenda.remove(itemVenda);
						itensVenda.revalidate();
						itensVenda.repaint();
					}
				});

				JLabel lblValor = new JLabel("Valor");
				lblValor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				lblValor.setForeground(new Color(31, 65, 45));
				GridBagConstraints gbc_lblValor = new GridBagConstraints();
				gbc_lblValor.insets = new Insets(0, 0, 0, 5);
				gbc_lblValor.anchor = GridBagConstraints.WEST;
				gbc_lblValor.gridx = 1;
				gbc_lblValor.gridy = 3;
				itemVenda.add(lblValor, gbc_lblValor);

				JLabel lblNewLabel_1 = new JLabel("R$");
				lblNewLabel_1.setForeground(new Color(31, 65, 45));
				lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 31));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel_1.gridx = 2;
				gbc_lblNewLabel_1.gridy = 3;
				itemVenda.add(lblNewLabel_1, gbc_lblNewLabel_1);

				lblValorDoProduto = new JLabel("0,0");
				lblValorDoProduto.setForeground(new Color(255, 255, 255));
				lblValorDoProduto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				GridBagConstraints gbc_lblValorDoProduto = new GridBagConstraints();
				gbc_lblValorDoProduto.anchor = GridBagConstraints.WEST;
				gbc_lblValorDoProduto.insets = new Insets(0, 0, 0, 5);
				gbc_lblValorDoProduto.gridx = 3;
				gbc_lblValorDoProduto.gridy = 3;
				itemVenda.add(lblValorDoProduto, gbc_lblValorDoProduto);
				itensVenda.add(itemVenda);
				itensVenda.revalidate();
				itensVenda.repaint();

			}
		});
		
		

/*		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		    protected void configureScrollBarColors() {
		        this.thumbColor = Color.decode("#7BA66F");
		    }
		    
		    @Override
		    protected JButton createDecreaseButton(int orientation) {
		        JButton button = super.createDecreaseButton(orientation);
		        button.setBackground(new Color(234, 242, 237));
		        button.setForeground(null);
		        button.setSelectedIcon(null);
		        button.setBorder(BorderFactory.createLineBorder(new Color(234, 242, 237), 2));
		        return button;
		    }

		    @Override
		    protected JButton createIncreaseButton(int orientation) {
		        JButton button = super.createIncreaseButton(orientation);
		        button.setBackground(new Color(234, 242, 237));
		        button.setForeground(null);
		        button.setSelectedIcon(null);
		        button.setBorder(BorderFactory.createLineBorder(new Color(234, 242, 237), 2));
		        return button;
		    }
		});
*/
	}
	
	protected void atualizarValorUnitario() {
		
		if(textField.getText().isEmpty() == false) {
			
			VendaBD vbd = new VendaBD();
			int codProduto = Integer.parseInt(textField.getText());
			
			lblNewLabel.setText("Item - " + vbd.nomeProduto(codProduto));
			
			if(textField_1.getText().isEmpty() == false) {
				float quantidade = Float.parseFloat(textField_1.getText());
			
				float total = vbd.precoUnitario(codProduto, quantidade);
				lblValorDoProduto.setText(String.valueOf(total));
			}
		
		}
	
	}

}
