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

import controle.AlterarProdutoBD;
import controle.EstoqueBD;
import modelo.Produto;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisaNoEstoque;
	Produto produto_selecionado;
	EstoqueBD etb = new EstoqueBD();
	AlterarProdutoBD at = new AlterarProdutoBD();
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

	public void abrir() {
		TelaEstoque frame = new TelaEstoque();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public TelaEstoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JMenuItem btnMenuSair = new JMenuItem("Sair");
		btnMenuSair.setOpaque(true);
		btnMenuSair.setForeground(new Color(85, 121, 74));
		btnMenuSair.setBorder(null);
		btnMenuSair.setBackground(new Color(150, 191, 120));
		btnMenuSair.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenuSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenuSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		mnNewMenu.add(btnMenuSair);
		
		JLabel lblTitulo = new JLabel("Estoque");
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		lblTitulo.setBounds(113, 79, 326, 115);
		contentPane.add(lblTitulo);
		
		JPanel Linha = new JPanel();
		Linha.setBackground(new Color(31, 65, 45));
		Linha.setBounds(63, 63, 1279, 5);
		contentPane.add(Linha);
		
		JPanel panelPesquisa = new JPanel();
		panelPesquisa.setBounds(120, 222, 799, 40);
		contentPane.add(panelPesquisa);
		panelPesquisa.setLayout(null);
		
		table = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setBounds(130, 330, 1119, 391);
		table.setRowHeight(40);
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));
		
		
		table.setModel(new DefaultTableModel(
				new Object[][][][][][] {
				
				},
				new String[] {
					"C\u00F3digo", "Nome", "Esp\u00E9cie", "Pre\u00E7o", "Quantidade"
				}
			));
			table.setModel(etb.listagemProduto());
			table.getColumnModel().getColumn(1).setPreferredWidth(150);
			table.getColumnModel().getColumn(2).setPreferredWidth(150);
			table.getColumnModel().getColumn(4).setPreferredWidth(100);
			
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(130, 330, 1119, 391);
		contentPane.add(scrollPane);
		

		
		textFieldPesquisaNoEstoque = new JTextField();
		textFieldPesquisaNoEstoque.setBounds(43, 5, 749, 32);
		panelPesquisa.add(textFieldPesquisaNoEstoque);
		textFieldPesquisaNoEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPesquisaNoEstoque.setSelectionColor(new Color(217, 173, 181));
		textFieldPesquisaNoEstoque.setCaretColor(new Color(31, 65, 45));
		textFieldPesquisaNoEstoque.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		textFieldPesquisaNoEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPesquisaNoEstoque.setColumns(10);
		
		JButton btnPesquisa = new JButton("");
		btnPesquisa.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/inspecao (1).png")));
		btnPesquisa.setBounds(10, 5, 35, 32);
		
		panelPesquisa.add(btnPesquisa);
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		
		JButton btnFiltro = new JButton("Filtrar");
		btnFiltro.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/filtro (1).png")));
		btnFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textFieldPesquisaNoEstoque.getText();
				EstoqueBD ebd = new EstoqueBD();
				
				ebd.produtoFiltradoTabela(nome);
			}
		});
		btnFiltro.setForeground(new Color(234, 242, 237));
		btnFiltro.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnFiltro.setBorder(null);
		btnFiltro.setBackground(new Color(31, 65, 45));
		btnFiltro.setBounds(929, 231, 134, 31);
		contentPane.add(btnFiltro);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		panel.setBackground(new Color(123, 166, 111));
		panel.setBounds(130, 280, 1119, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setFont(new Font("Yu Gothic Light", Font.BOLD, 28));
		lblCodigo.setBounds(0, 0, 190, 51);
		lblCodigo.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		panel.add(lblCodigo);
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setBackground(new Color(123, 166, 111));
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Yu Gothic Light", Font.BOLD, 28));
		lblNome.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		lblNome.setBackground(new Color(123, 166, 111));
		lblNome.setBounds(188, 0, 266, 51);
		panel.add(lblNome);
		
		JLabel lblEspcie = new JLabel("Esp\u00E9cie");
		lblEspcie.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspcie.setFont(new Font("Yu Gothic Light", Font.BOLD, 28));
		lblEspcie.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		lblEspcie.setBackground(new Color(123, 166, 111));
		lblEspcie.setBounds(452, 0, 266, 51);
		panel.add(lblEspcie);
		
		JLabel lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreco.setFont(new Font("Yu Gothic Light", Font.BOLD, 28));
		lblPreco.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		lblPreco.setBackground(new Color(123, 166, 111));
		lblPreco.setBounds(716, 0, 190, 51);
		panel.add(lblPreco);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade.setFont(new Font("Yu Gothic Light", Font.BOLD, 28));
		lblQuantidade.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		lblQuantidade.setBackground(new Color(123, 166, 111));
		lblQuantidade.setBounds(904, 0, 215, 51);
		panel.add(lblQuantidade);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setForeground(new Color(234, 242, 237));
		btnRemover.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnRemover.setBackground(new Color(31, 65, 45));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etb.deletar(produto_selecionado,table);
				table.setModel(etb.listagemProduto());
			}
		});
		btnRemover.setBounds(1086, 231, 152, 31);
		contentPane.add(btnRemover);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(new Color(234, 242, 237));
		btnAlterar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnAlterar.setBackground(new Color(31, 65, 45));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(produto_selecionado != null) {
					TelaSalvarProduto sp = new TelaSalvarProduto();
					sp.abrir(produto_selecionado);
					
				}
			}
		});
		btnAlterar.setBounds(1086, 194, 152, 31);
		contentPane.add(btnAlterar);
		
		
		//-------------------------------------------------------- métodos -------------------------------------
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Produto> lista = etb.listaProdutos();
				int posicao_produto = table.getSelectedRow();
				produto_selecionado = lista.get(posicao_produto);
				System.out.println(produto_selecionado.getProduto_nomeveg());
			}
			}	
		);


	}
}
