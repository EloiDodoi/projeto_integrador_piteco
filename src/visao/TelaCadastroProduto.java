package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class TelaCadastroProduto {

	private JFrame frame;
	private JTextField txtNomeVegetal;
	private JTextField txtEspecie;
	private JTextField txtQuantidade;
	private JTextField txtPreco;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto window = new TelaCadastroProduto();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setExtendedState(window.frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(234, 242, 237));
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVendedor = new JLabel("Cadastro do Negócio");
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblVendedor.setBounds(124, 137, 797, 110);
		frame.getContentPane().add(lblVendedor);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 166, 111));
		panel.setBounds(0, 0, 80, 856);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(123, 166, 111));
		panel_1.setBounds(79, 0, 1555, 80);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 166, 111));
		panel_2.setBounds(124, 256, 1430, 544);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNomeDoVegetal = new JLabel("Nome do Vegetal:");
		lblNomeDoVegetal.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal.setBounds(50, 50, 293, 35);
		panel_2.add(lblNomeDoVegetal);
		
		JLabel lblEspcieDoVegetal = new JLabel("Espécie do Vegetal:");
		lblEspcieDoVegetal.setForeground(new Color(31, 65, 45));
		lblEspcieDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblEspcieDoVegetal.setBounds(50, 125, 321, 35);
		panel_2.add(lblEspcieDoVegetal);
		
		JLabel lblNomeDoVegetal_1_1 = new JLabel("Produto Vendido Por:");
		lblNomeDoVegetal_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1.setBounds(50, 200, 332, 28);
		panel_2.add(lblNomeDoVegetal_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Preço:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1.setBounds(49, 273, 107, 37);
		panel_2.add(lblNomeDoVegetal_1_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1_1.setBounds(765, 277, 293, 28);
		panel_2.add(lblNomeDoVegetal_1_1_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1_1_1.setBounds(177, 277, 293, 28);
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1);
		
		txtNomeVegetal = new JTextField();
		txtNomeVegetal.setBackground(new Color(234, 242, 237));
		txtNomeVegetal.setForeground(Color.DARK_GRAY);
		txtNomeVegetal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNomeVegetal.setColumns(10);
		txtNomeVegetal.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtNomeVegetal.setBounds(424, 51, 956, 35);
		panel_2.add(txtNomeVegetal);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(31, 65, 45));
		rdbtnNewRadioButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rdbtnNewRadioButton.setBackground(new Color(123, 166, 111));
		rdbtnNewRadioButton.setBounds(480, 199, 243, 35);
		panel_2.add(rdbtnNewRadioButton);
		
		txtEspecie = new JTextField();
		txtEspecie.setForeground(Color.DARK_GRAY);
		txtEspecie.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtEspecie.setColumns(10);
		txtEspecie.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtEspecie.setBackground(new Color(234, 242, 237));
		txtEspecie.setBounds(424, 125, 956, 35);
		panel_2.add(txtEspecie);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setForeground(Color.DARK_GRAY);
		txtQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtQuantidade.setColumns(10);
		txtQuantidade.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtQuantidade.setBackground(new Color(234, 242, 237));
		txtQuantidade.setBounds(979, 275, 401, 35);
		panel_2.add(txtQuantidade);
		
		txtPreco = new JTextField();
		txtPreco.setForeground(Color.DARK_GRAY);
		txtPreco.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPreco.setColumns(10);
		txtPreco.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txtPreco.setBackground(new Color(234, 242, 237));
		txtPreco.setBounds(235, 275, 401, 35);
		panel_2.add(txtPreco);
		
		JRadioButton rdbtnUnidade = new JRadioButton("Unidade");
		buttonGroup.add(rdbtnUnidade);
		rdbtnUnidade.setForeground(new Color(31, 65, 45));
		rdbtnUnidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rdbtnUnidade.setBackground(new Color(123, 166, 111));
		rdbtnUnidade.setBounds(815, 199, 243, 35);
		panel_2.add(rdbtnUnidade);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnCadastrar.setBounds(529, 415, 373, 70);
		panel_2.add(btnCadastrar);
	}
}
