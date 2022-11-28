package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controle.HistoricoVendaBD;
import modelo.ItemVendido;
import modelo.Venda;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaListagemItensVenda extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private static Venda venda_selecionada;
	HistoricoVendaBD hvbd = new HistoricoVendaBD();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemItensVenda window = new TelaListagemItensVenda(venda_selecionada);
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaListagemItensVenda(Venda vendaSelecionada) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaListagemItensVenda.class.getResource("/img/1.png")));
		setTitle("Listagem de Itens de Venda");
		venda_selecionada = vendaSelecionada;
		initialize();
	}

	public DefaultTableModel listagemItemVenda(Venda v) {
		ArrayList<ItemVendido> lp = hvbd.listaItensVenda(v);
		DefaultTableModel modelo_tabela = new DefaultTableModel(new Object[][][][] {

		}, new String[] { "ID", "Nome", "Quantidade", "Preço" });
		for (int i = 0; i < lp.size(); i++) {
			ItemVendido iv = lp.get(i);
			modelo_tabela.addRow(new Object[] { iv.getCodigoItem(), iv.getNomIetem(), iv.getQuantidadeItem(),
					iv.getPrecoTotalItem() });
		}
		return modelo_tabela;
	}

	private void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 55, 479, 83, 0 };
		gbl_contentPane.rowHeights = new int[] { 54, 7, 28, 310, 0, 0, 0, 27, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblItensDaVenda = new JLabel("Itens da Venda");
		lblItensDaVenda.setHorizontalAlignment(SwingConstants.LEFT);
		lblItensDaVenda.setForeground(new Color(31, 65, 45));
		lblItensDaVenda.setFont(new Font("Yu Gothic UI", Font.PLAIN, 35));
		lblItensDaVenda.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_lblItensDaVenda = new GridBagConstraints();
		gbc_lblItensDaVenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblItensDaVenda.gridx = 1;
		gbc_lblItensDaVenda.gridy = 0;
		contentPane.add(lblItensDaVenda, gbc_lblItensDaVenda);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_panel_1_1 = new GridBagConstraints();
		gbc_panel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1.gridx = 1;
		gbc_panel_1_1.gridy = 1;
		contentPane.add(panel_1_1, gbc_panel_1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(150, 191, 120), 3, true));
		scrollPane.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		scrollPane.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Quantidade", "Pre\u00E7o"
			}
		));

		DefaultTableModel obj = listagemItemVenda(venda_selecionada);
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(25);
		table.setGridColor(new Color(31, 65, 45));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		table.setBackground(new Color(234, 242, 237));
		table.getColumnModel().getColumn(1).setPreferredWidth(5);
		table.setModel(obj);
		
		JButton btnNewButton = new JButton("  Fechar  ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnNewButton.setForeground(new Color(234, 242, 237));
		btnNewButton.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 6;
		contentPane.add(panel_1, gbc_panel_1);
		
		
		JTableHeader tHeader = table.getTableHeader();
		tHeader.setBackground(new Color(150, 191, 120));
		tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tHeader.setForeground(Color.WHITE);

	}

}
