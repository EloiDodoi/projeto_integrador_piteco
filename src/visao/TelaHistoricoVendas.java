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

public class TelaHistoricoVendas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 242, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHistricoDeVendas = new JLabel("Histórico de Vendas\r\n");
		lblHistricoDeVendas.setBounds(82, 76, 761, 108);
		lblHistricoDeVendas.setHorizontalAlignment(SwingConstants.LEFT);
		lblHistricoDeVendas.setForeground(new Color(31, 65, 45));
		lblHistricoDeVendas.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblHistricoDeVendas.setBackground(new Color(234, 242, 237));
		contentPane.add(lblHistricoDeVendas);
		
		JPanel panelPesquisa = new JPanel();
		panelPesquisa.setBounds(82, 206, 850, 40);
		panelPesquisa.setLayout(null);
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
		
		JButton btnPesquisa = new JButton("");
		btnPesquisa.setBorder(null);
		btnPesquisa.setBackground(new Color(31, 65, 45));
		btnPesquisa.setBounds(10, 5, 35, 32);
		panelPesquisa.add(btnPesquisa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(82, 292, 1261, 458);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setGridColor(new Color(31, 65, 45));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Tahoma", Font.PLAIN, 25));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Data", "Tipo de Pagamento", "Valor", "Produtos"
			}
		));
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		
	}
}
