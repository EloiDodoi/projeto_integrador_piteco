package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controle.HistoricoVendaBD;
import modelo.Venda;

public class TelaListagemItensVenda extends JFrame {

	private JPanel contentPane;
	private JTable table;
	HistoricoVendaBD hvbd = new HistoricoVendaBD();
	TelaHistoricoVendas thv = new TelaHistoricoVendas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemItensVenda frame = new TelaListagemItensVenda();
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
	public TelaListagemItensVenda() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(31, 65, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{32, 308, 34, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 310, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblItensDaVenda = new JLabel("Itens da Venda");
		lblItensDaVenda.setHorizontalAlignment(SwingConstants.LEFT);
		lblItensDaVenda.setForeground(new Color(234, 242, 237));
		lblItensDaVenda.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblItensDaVenda.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_lblItensDaVenda = new GridBagConstraints();
		gbc_lblItensDaVenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblItensDaVenda.gridx = 1;
		gbc_lblItensDaVenda.gridy = 0;
		contentPane.add(lblItensDaVenda, gbc_lblItensDaVenda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		scrollPane.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "Pre\u00E7o", "Quantidade"
			}
		));
		
		hvbd.listagemItemVenda(thv.retornarVendaSelecionada());
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(25);
		table.setGridColor(new Color(31, 65, 45));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		table.setBackground(new Color(234, 242, 237));
		scrollPane.setViewportView(table);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);
		
		
	}

}
