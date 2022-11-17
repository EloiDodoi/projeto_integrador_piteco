package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisaNoEstoque;
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

	/**
	 * Create the frame.
	 */
	public TelaEstoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {65, 862, 128, 100, 65};
		gbl_panel_1.rowHeights = new int[] {30, 4, 115, 40, 326};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel Linha = new JPanel();
		GridBagConstraints gbc_Linha = new GridBagConstraints();
		gbc_Linha.anchor = GridBagConstraints.NORTH;
		gbc_Linha.fill = GridBagConstraints.HORIZONTAL;
		gbc_Linha.insets = new Insets(0, 0, 5, 0);
		gbc_Linha.gridwidth = 3;
		gbc_Linha.gridx = 1;
		gbc_Linha.gridy = 1;
		panel_1.add(Linha, gbc_Linha);
		Linha.setBackground(new Color(31, 65, 45));
		
		JLabel lblTitulo = new JLabel("Estoque");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.fill = GridBagConstraints.VERTICAL;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 2;
		panel_1.add(lblTitulo, gbc_lblTitulo);
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		
		JPanel panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.fill = GridBagConstraints.BOTH;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 1;
		gbc_panelPesquisa.gridy = 3;
		panel_1.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] {30, 800};
		gbl_panelPesquisa.rowHeights = new int[] {32};
		gbl_panelPesquisa.columnWeights = new double[]{1.0, 1.0};
		gbl_panelPesquisa.rowWeights = new double[]{0.0};
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
			}
		});
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		
		textFieldPesquisaNoEstoque = new JTextField();
		GridBagConstraints gbc_textFieldPesquisaNoEstoque = new GridBagConstraints();
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
		
		JButton btnFiltro = new JButton("Filtrar");
		GridBagConstraints gbc_btnFiltro = new GridBagConstraints();
		gbc_btnFiltro.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFiltro.anchor = GridBagConstraints.NORTH;
		gbc_btnFiltro.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltro.gridx = 3;
		gbc_btnFiltro.gridy = 3;
		panel_1.add(btnFiltro, gbc_btnFiltro);
		btnFiltro.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/filtro (1).png")));
		btnFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFiltro.setForeground(new Color(234, 242, 237));
		btnFiltro.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnFiltro.setBorder(null);
		btnFiltro.setBackground(new Color(31, 65, 45));
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		//ArrayList<> tableArray = new ArrayList<>
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(40);
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Código", "", "", "", ""},
			},
			new String[] {
				"Código", "Nome", "Espécie", "Preço", "Quantidade"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		
	}

	public void abrir() {
		TelaEstoque frame = new TelaEstoque();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// TODO Auto-generated method stub
		
	}
}
