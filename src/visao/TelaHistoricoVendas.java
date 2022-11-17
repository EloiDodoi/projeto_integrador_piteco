package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class TelaHistoricoVendas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisa;
	private JTable table;
	private TelaHistoricoVendas frame = new TelaHistoricoVendas();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHistoricoVendas frame = new TelaHistoricoVendas();
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
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	public TelaHistoricoVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(150, 191, 120));
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{855, 293, 113, 0};
		gbl_panel.rowHeights = new int[]{108, 44, 40, 458, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblHistricoDeVendas = new JLabel("Hist\u00F3rico de Vendas\r\n");
		GridBagConstraints gbc_lblHistricoDeVendas = new GridBagConstraints();
		gbc_lblHistricoDeVendas.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblHistricoDeVendas.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistricoDeVendas.gridx = 0;
		gbc_lblHistricoDeVendas.gridy = 0;
		panel.add(lblHistricoDeVendas, gbc_lblHistricoDeVendas);
		lblHistricoDeVendas.setHorizontalAlignment(SwingConstants.LEFT);
		lblHistricoDeVendas.setForeground(new Color(31, 65, 45));
		lblHistricoDeVendas.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblHistricoDeVendas.setBackground(new Color(234, 242, 237));
		
		JPanel panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.fill = GridBagConstraints.BOTH;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 0;
		gbc_panelPesquisa.gridy = 2;
		panel.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] {30, 800};
		gbl_panelPesquisa.rowHeights = new int[] {32};
		gbl_panelPesquisa.columnWeights = new double[]{1.0, 1.0, 0.0};
		gbl_panelPesquisa.rowWeights = new double[]{0.0};
		panelPesquisa.setLayout(gbl_panelPesquisa);
		
		JButton btnPesquisa = new JButton("");
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_btnPesquisa = new GridBagConstraints();
		gbc_btnPesquisa.fill = GridBagConstraints.BOTH;
		gbc_btnPesquisa.gridx = 0;
		gbc_btnPesquisa.gridy = 0;
		panelPesquisa.add(btnPesquisa, gbc_btnPesquisa);
		
		textFieldPesquisa = new JTextField();
		textFieldPesquisa.setSelectionColor(new Color(217, 173, 181));
		textFieldPesquisa.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPesquisa.setColumns(10);
		textFieldPesquisa.setCaretColor(new Color(31, 65, 45));
		textFieldPesquisa.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		GridBagConstraints gbc_textFieldPesquisa = new GridBagConstraints();
		gbc_textFieldPesquisa.gridwidth = 2;
		gbc_textFieldPesquisa.fill = GridBagConstraints.BOTH;
		gbc_textFieldPesquisa.gridx = 1;
		gbc_textFieldPesquisa.gridy = 0;
		panelPesquisa.add(textFieldPesquisa, gbc_textFieldPesquisa);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		btnFiltrar.setBorder(null);
		btnFiltrar.setBackground(new Color(31, 65, 45));
		btnFiltrar.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnFiltrar = new GridBagConstraints();
		gbc_btnFiltrar.anchor = GridBagConstraints.SOUTH;
		gbc_btnFiltrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFiltrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltrar.gridx = 2;
		gbc_btnFiltrar.gridy = 2;
		panel.add(btnFiltrar, gbc_btnFiltrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		scrollPane.setForeground(new Color(150, 191, 120));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		panel.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(40);
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 26));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"N\u00B0", "Data", "Tipo de Pagamento", "Valor", "Produtos"
			}
		));
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		
	}
}
