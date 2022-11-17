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
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		panelPesquisa.setBounds(120, 222, 850, 40);
		contentPane.add(panelPesquisa);
		panelPesquisa.setLayout(null);
		
		//ArrayList<> tableArray = new ArrayList<>
		
		table = new JTable();
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setBounds(130, 330, 1119, 391);
		contentPane.add(table);
		table.setRowHeight(40);
		table.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		table.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		table.setGridColor(new Color(150, 191, 120));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"C\u00C3\u00B3digo", "", "", "", ""},
			},
			new String[] {
				"C\u00C3\u00B3digo", "Nome", "Esp\u00C3\u00A9cie", "Pre\u00C3\u00A7o", "Quantidade"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		textFieldPesquisaNoEstoque = new JTextField();
		textFieldPesquisaNoEstoque.setBounds(43, 5, 797, 32);
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
			}
		});
		btnFiltro.setForeground(new Color(234, 242, 237));
		btnFiltro.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnFiltro.setBorder(null);
		btnFiltro.setBackground(new Color(31, 65, 45));
		btnFiltro.setBounds(1096, 226, 134, 31);
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
		
	}

	public void abrir() {
		TelaEstoque frame = new TelaEstoque();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// TODO Auto-generated method stub
		
	}
}
