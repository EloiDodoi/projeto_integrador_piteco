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

	TelaEstoque frame = new TelaEstoque();
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
		BarraSuperior.setLayout(null);
		
		JButton btnConfiguracao = new JButton("");
		btnConfiguracao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/solucao.png")));
		btnConfiguracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));
		btnConfiguracao.setBounds(1236, 0, 60, 40);
		BarraSuperior.add(btnConfiguracao);
		
		JButton btnNotificacao = new JButton("");
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		btnNotificacao.setBounds(1178, 0, 60, 40);
		BarraSuperior.add(btnNotificacao);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		btnUser.setBounds(1294, 0, 60, 40);
		BarraSuperior.add(btnUser);
		
		JPanel BarraLateral = new JPanel();
		BarraLateral.setBackground(new Color(150, 191, 120));
		BarraLateral.setBounds(0, 0, 40, 750);
		contentPane.add(BarraLateral);
		BarraLateral.setLayout(null);
		
		JButton btnMen = new JButton("");
		btnMen.setBorder(null);
		btnMen.setForeground(new Color(123, 166, 111));
		btnMen.setIcon(new ImageIcon(TelaEstoque.class.getResource("/img/menu-aberto.png")));
		btnMen.setBackground(new Color(150, 191, 120));
		btnMen.setBounds(-6, 700, 52, 48);
		BarraLateral.add(btnMen);
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
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
		
		JTable table = new JTable();
		table.setBounds(130, 330, 1119, 391);
		contentPane.add(table);
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
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// TODO Auto-generated method stub
		
	}
}
