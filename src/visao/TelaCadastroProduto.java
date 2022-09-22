 package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Dimension;

public class TelaCadastroProduto {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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

	public void abrir() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(234, 242, 237));
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVendedor = new JLabel("Cadastro do Produto");
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
		lblNomeDoVegetal_1_1.setBounds(50, 210, 332, 28);
		panel_2.add(lblNomeDoVegetal_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Preço:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1.setBounds(50, 295, 107, 37);
		panel_2.add(lblNomeDoVegetal_1_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1_1.setBounds(837, 299, 204, 28);
		panel_2.add(lblNomeDoVegetal_1_1_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		lblNomeDoVegetal_1_1_1_1_1.setBounds(174, 299, 84, 28);
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(234, 242, 237));
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField.setBounds(410, 51, 943, 35);
		panel_2.add(textField);
		
		JRadioButton rbKg = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rbKg);
		rbKg.setBorder(new LineBorder(new Color(0, 0, 0)));
		rbKg.setForeground(new Color(31, 65, 45));
		rbKg.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbKg.setBackground(new Color(123, 166, 111));
		rbKg.setBounds(460, 203, 255, 47);
		scaleRadioButtonIcon(rbKg);
		panel_2.add(rbKg);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_1.setBackground(new Color(234, 242, 237));
		textField_1.setBounds(410, 125, 943, 35);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_2.setBackground(new Color(234, 242, 237));
		textField_2.setBounds(225, 297, 293, 35);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_3.setBackground(new Color(234, 242, 237));
		textField_3.setBounds(1060, 297, 293, 35);
		panel_2.add(textField_3);
		
		JRadioButton rbUnidade = new JRadioButton("Unidade");
		buttonGroup.add(rbUnidade);
		rbUnidade.setForeground(new Color(31, 65, 45));
		rbUnidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbUnidade.setBackground(new Color(123, 166, 111));
		rbUnidade.setBounds(797, 208, 204, 37);
		scaleRadioButtonIcon(rbUnidade);
		panel_2.add(rbUnidade);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBackground(new Color(123, 166, 111));
		btnNewButton.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btnNewButton.setForeground(new Color(31, 65, 45));
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		btnNewButton.setBounds(517, 400, 396, 94);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(103, 146, 90));
		panel_3.setBounds(527, 410, 396, 94);
		panel_2.add(panel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 4));
		separator.setBounds(124, 118, 1430, 8);
		frame.getContentPane().add(separator);
	}
	
	public static void scaleRadioButtonIcon(JRadioButton rb){
	    boolean previousState = rb.isSelected();
	    rb.setSelected(false);
	    Icon radioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (não selecionado)
	    BufferedImage radioImage = new BufferedImage(
	        radioIcon.getIconWidth(), radioIcon.getIconHeight(),BufferedImage.TYPE_INT_ARGB
	    );
	    Graphics graphics = radioImage.createGraphics();
	    try{
	        radioIcon.paintIcon(rb, graphics, 0, 0);
	    }finally{
	        graphics.dispose();
	    }
	    ImageIcon newRadioImage = new ImageIcon(radioImage);
	    Image finalRadioImage = newRadioImage.getImage().getScaledInstance(
	        30, 30, Image.SCALE_SMOOTH
	    );

	    rb.setSelected(true);
	    Icon selectedRadioIcon = UIManager.getIcon("RadioButton.icon"); // Mudar imagem do radioButton (selecionado)S
	    BufferedImage selectedRadioImage = new BufferedImage(
	            selectedRadioIcon.getIconWidth(), selectedRadioIcon.getIconHeight(),BufferedImage.TYPE_INT_ARGB
	    );
	    Graphics selectedGraphics = selectedRadioImage.createGraphics();
	    try{
	        selectedRadioIcon.paintIcon(rb, selectedGraphics, 0, 0);
	    }finally{
	        selectedGraphics.dispose();
	    }
	    ImageIcon newSelectedRadioImage = new ImageIcon(selectedRadioImage);
	    Image selectedFinalRadioImage = newSelectedRadioImage.getImage().getScaledInstance(
	        30, 30, Image.SCALE_SMOOTH
	    );
	    rb.setSelected(previousState);
	    rb.setIcon(new ImageIcon(finalRadioImage));
	    rb.setSelectedIcon(new ImageIcon(selectedFinalRadioImage));
	}
}
