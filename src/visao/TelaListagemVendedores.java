package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controle.ControleVendedorBD;
import controle.EstoqueBD;
import modelo.Produto;
import modelo.Usuario;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;

public class TelaListagemVendedores extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblTitulo;
	private JPanel Linha;
	private JPanel panelPesquisa;
	private JTextField textField;
	private JButton btnPesquisa;
	Usuario vendedor_selecionado;
	ControleVendedorBD cvbd = new ControleVendedorBD();
	private JPanel panel;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemVendedores frame = new TelaListagemVendedores();
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
		TelaEstoque frame = new TelaEstoque();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	public TelaListagemVendedores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {61, 865, 125, 119, 119, 60};
		gbl_panel.rowHeights = new int[]{10, 0, 158, 544, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Linha = new JPanel();
		GridBagConstraints gbc_Linha = new GridBagConstraints();
		gbc_Linha.anchor = GridBagConstraints.NORTH;
		gbc_Linha.fill = GridBagConstraints.HORIZONTAL;
		gbc_Linha.insets = new Insets(0, 0, 5, 0);
		gbc_Linha.gridwidth = 4;
		gbc_Linha.gridx = 1;
		gbc_Linha.gridy = 1;
		panel.add(Linha, gbc_Linha);
		Linha.setBackground(new Color(31, 65, 45));
		
		lblTitulo = new JLabel("Vendedores");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 2;
		panel.add(lblTitulo, gbc_lblTitulo);
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		
		panelPesquisa = new JPanel();
		GridBagConstraints gbc_panelPesquisa = new GridBagConstraints();
		gbc_panelPesquisa.anchor = GridBagConstraints.SOUTH;
		gbc_panelPesquisa.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_panelPesquisa.gridx = 1;
		gbc_panelPesquisa.gridy = 2;
		panel.add(panelPesquisa, gbc_panelPesquisa);
		GridBagLayout gbl_panelPesquisa = new GridBagLayout();
		gbl_panelPesquisa.columnWidths = new int[] {30, 800};
		gbl_panelPesquisa.rowHeights = new int[] {32};
		gbl_panelPesquisa.columnWeights = new double[]{1.0, 1.0, 0.0};
		gbl_panelPesquisa.rowWeights = new double[]{0.0};
		panelPesquisa.setLayout(gbl_panelPesquisa);
		
		btnPesquisa = new JButton("");
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		GridBagConstraints gbc_btnPesquisa = new GridBagConstraints();
		gbc_btnPesquisa.fill = GridBagConstraints.BOTH;
		gbc_btnPesquisa.gridx = 0;
		gbc_btnPesquisa.gridy = 0;
		panelPesquisa.add(btnPesquisa, gbc_btnPesquisa);
		
		textField = new JTextField();
		textField.setSelectionColor(new Color(217, 173, 181));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setCaretColor(new Color(31, 65, 45));
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelPesquisa.add(textField, gbc_textField);
		
		JButton btnExcluir = new JButton(" Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.anchor = GridBagConstraints.SOUTH;
		gbc_btnExcluir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 3;
		gbc_btnExcluir.gridy = 2;
		panel.add(btnExcluir, gbc_btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cvbd.deletarVendedor(vendedor_selecionado, table);
			}
		});
		btnExcluir.setForeground(new Color(234, 242, 237));
		btnExcluir.setFont(new Font("Yu Gothic UI", Font.PLAIN, 28));
		btnExcluir.setBorder(null);
		btnExcluir.setBackground(new Color(31, 65, 45));
		
		JButton btnAlterar = new JButton("Alterar");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.anchor = GridBagConstraints.SOUTH;
		gbc_btnAlterar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAlterar.gridx = 4;
		gbc_btnAlterar.gridy = 2;
		panel.add(btnAlterar, gbc_btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vendedor_selecionado != null) {
					TelaAlterarVendedor tav = new TelaAlterarVendedor();
					tav.abrir(vendedor_selecionado);
				}
			}
		});
		btnAlterar.setForeground(new Color(234, 242, 237));
		btnAlterar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 28));
		btnAlterar.setBorder(null);
		btnAlterar.setBackground(new Color(31, 65, 45));
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		panel.add(scrollPane, gbc_scrollPane);
		scrollPane.setForeground(new Color(123, 166, 111));
		scrollPane.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		scrollPane.setViewportBorder(new LineBorder(new Color(31, 65, 45), 0));
		scrollPane.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		
		table = new JTable() {
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setRowHeight(40);
		table.setGridColor(new Color(150, 191, 120));
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 26));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Mike Ianni", "79167095305", null, "69748948553", "mianni0@example.com"},
				{"Gaylor Buzza", "24038418891", null, "38222072735", "gbuzza1@illinois.edu"},
				{"Liv Bernon", "19222185011", null, "75806156444", "lbernon2@apache.org"},
			},
			new String[] {
				"Nome", "CPF", "Data de nascimento", "Telefone", "E-mail"
			}
		));
		scrollPane.setViewportView(table);
		
		table.setModel(cvbd.listagemVendedor());
		
		JTableHeader tHeader = table.getTableHeader();
		tHeader.setBackground(new Color(150, 191, 120));
		tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		tHeader.setForeground(Color.WHITE);
		
		
		
		//-------------------------------------------------------- métodos -------------------------------------
	
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Usuario> lista = cvbd.listaVendedor();
				int posicao_vend = table.getSelectedRow();
				vendedor_selecionado = lista.get(posicao_vend);
			}
			}	
		);

	}
}
