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

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesquisaNoEstoque;
	private JTable table;

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
		
		JPanel BarraSuperior = new JPanel();
		BarraSuperior.setBackground(new Color(150, 191, 120));
		BarraSuperior.setBounds(0, 0, 1370, 40);
		contentPane.add(BarraSuperior);
		
		JPanel BarraLateral = new JPanel();
		BarraLateral.setBackground(new Color(150, 191, 120));
		BarraLateral.setBounds(0, 0, 40, 750);
		contentPane.add(BarraLateral);
		
		JLabel lblTitulo = new JLabel("Estoque");
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		lblTitulo.setBounds(113, 79, 326, 97);
		contentPane.add(lblTitulo);
		
		JPanel Linha = new JPanel();
		Linha.setBackground(new Color(31, 65, 45));
		Linha.setBounds(63, 63, 1279, 5);
		contentPane.add(Linha);
		
		JPanel panelPesquisa = new JPanel();
		panelPesquisa.setBounds(120, 222, 589, 40);
		contentPane.add(panelPesquisa);
		panelPesquisa.setLayout(null);
		
		textFieldPesquisaNoEstoque = new JTextField();
		textFieldPesquisaNoEstoque.setBounds(60, 5, 519, 32);
		panelPesquisa.add(textFieldPesquisaNoEstoque);
		textFieldPesquisaNoEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPesquisaNoEstoque.setSelectionColor(new Color(217, 173, 181));
		textFieldPesquisaNoEstoque.setCaretColor(new Color(31, 65, 45));
		textFieldPesquisaNoEstoque.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textFieldPesquisaNoEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPesquisaNoEstoque.setColumns(10);
		
		JButton btnPesquisa = new JButton("");
		btnPesquisa.setBounds(10, 5, 55, 32);
		panelPesquisa.add(btnPesquisa);
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		
		JButton btnFiltro = new JButton("Filtrar");
		btnFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFiltro.setForeground(new Color(234, 242, 237));
		btnFiltro.setFont(new Font("Yu Gothic UI", Font.PLAIN, 26));
		btnFiltro.setBorder(null);
		btnFiltro.setBackground(new Color(31, 65, 45));
		btnFiltro.setBounds(1082, 226, 157, 31);
		contentPane.add(btnFiltro);
		
		table = new JTable();
		table.setBounds(120, 288, 1119, 391);
		contentPane.add(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBorder(new LineBorder(new Color(150, 191, 120)));
		table.setGridColor(new Color(150, 191, 120));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nome", "Esp\u00E9cie", "Pre\u00E7o", "Quantidade"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
	}
}
