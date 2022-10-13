package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

public class TelaListagemVendedores extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel BarraLateral;
	private JButton btnMen;
	private JLabel lblTitulo;
	private JPanel Linha;
	private JPanel BarraSuperior;
	private JButton btnConfiguracao;
	private JButton btnNotificacao;
	private JButton btnUser;
	private JPanel panelPesquisa;
	private JTextField textField;
	private JButton btnPesquisa;
	Usuario vendedor_selecionado;
	ControleVendedorBD cvbd = new ControleVendedorBD();

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(123, 166, 111));
		scrollPane.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		scrollPane.setViewportBorder(new LineBorder(new Color(31, 65, 45), 0));
		scrollPane.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		scrollPane.setBounds(136, 280, 1230, 483);
		contentPane.add(scrollPane);
		
		table = new JTable() {
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
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
		
		BarraLateral = new JPanel();
		BarraLateral.setLayout(null);
		BarraLateral.setBackground(new Color(150, 191, 120));
		BarraLateral.setBounds(0, 0, 40, 811);
		contentPane.add(BarraLateral);
		
		btnMen = new JButton("");
		btnMen.setForeground(new Color(123, 166, 111));
		btnMen.setBorder(null);
		btnMen.setBackground(new Color(150, 191, 120));
		btnMen.setBounds(-6, 700, 52, 48);
		BarraLateral.add(btnMen);
		
		lblTitulo = new JLabel("Vendedores");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(new Color(31, 65, 45));
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 82));
		lblTitulo.setBounds(113, 90, 463, 115);
		contentPane.add(lblTitulo);
		
		Linha = new JPanel();
		Linha.setBackground(new Color(31, 65, 45));
		Linha.setBounds(63, 74, 1426, 5);
		contentPane.add(Linha);
		
		BarraSuperior = new JPanel();
		BarraSuperior.setLayout(null);
		BarraSuperior.setBackground(new Color(150, 191, 120));
		BarraSuperior.setBounds(0, 0, 1584, 40);
		contentPane.add(BarraSuperior);
		
		btnConfiguracao = new JButton("");
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));
		btnConfiguracao.setBounds(1236, 0, 60, 40);
		BarraSuperior.add(btnConfiguracao);
		
		btnNotificacao = new JButton("");
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		btnNotificacao.setBounds(1178, 0, 60, 40);
		BarraSuperior.add(btnNotificacao);
		
		btnUser = new JButton("");
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		btnUser.setBounds(1294, 0, 60, 40);
		BarraSuperior.add(btnUser);
		
		panelPesquisa = new JPanel();
		panelPesquisa.setLayout(null);
		panelPesquisa.setBounds(123, 209, 850, 40);
		contentPane.add(panelPesquisa);
		
		textField = new JTextField();
		textField.setSelectionColor(new Color(217, 173, 181));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setCaretColor(new Color(31, 65, 45));
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		textField.setBounds(43, 5, 797, 32);
		panelPesquisa.add(textField);
		
		btnPesquisa = new JButton("");
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		btnPesquisa.setBounds(10, 5, 35, 32);
		panelPesquisa.add(btnPesquisa);
		
		JButton btnExcluir = new JButton(" Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cvbd.deletarVendedor(vendedor_selecionado, table);
			}
		});
		btnExcluir.setHorizontalAlignment(SwingConstants.LEADING);
		btnExcluir.setForeground(new Color(234, 242, 237));
		btnExcluir.setFont(new Font("Yu Gothic UI", Font.PLAIN, 28));
		btnExcluir.setBorder(null);
		btnExcluir.setBackground(new Color(31, 65, 45));
		btnExcluir.setBounds(1365, 315, 134, 45);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton(" Alterar");
		btnAlterar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAlterar.setForeground(new Color(234, 242, 237));
		btnAlterar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 28));
		btnAlterar.setBorder(null);
		btnAlterar.setBackground(new Color(31, 65, 45));
		btnAlterar.setBounds(1365, 371, 134, 40);
		contentPane.add(btnAlterar);
		
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
