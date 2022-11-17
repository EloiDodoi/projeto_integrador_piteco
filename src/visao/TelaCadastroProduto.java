 package visao;

import java.awt.EventQueue;
import modelo.Produto;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controle.CadastroProdutoBD;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenuBar;
public class TelaCadastroProduto {

	private JFrame frame;
	private JTextField txt_nome;
	private JTextField txt_especie;
	private JTextField txt_preco;
	private JTextField txt_quantidade;
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
		frame.setMaximumSize(new Dimension(1600, 850));
		frame.setMinimumSize(new Dimension(1600, 850));
		frame.getContentPane().setBackground(new Color(234, 242, 237));
		frame.setBounds(100, 100, 1600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {65, 1468, 65};
		gbl_panel.rowHeights = new int[] {30, 10, 110, 544, 30};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 1;
		panel.add(separator, gbc_separator);
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 4));
		
		JLabel lblVendedor = new JLabel("Cadastro do Produto");
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.anchor = GridBagConstraints.WEST;
		gbc_lblVendedor.fill = GridBagConstraints.VERTICAL;
		gbc_lblVendedor.insets = new Insets(0, 0, 5, 0);
		gbc_lblVendedor.gridx = 1;
		gbc_lblVendedor.gridy = 2;
		panel.add(lblVendedor, gbc_lblVendedor);
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 3;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setBackground(new Color(123, 166, 111));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {30, 199, 89, 30, 293, 30, 204, 293, 30};
		gbl_panel_2.rowHeights = new int[] {50, 36, 39, 35, 43, 47, 45, 37, 30, 94, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNomeDoVegetal = new JLabel("Nome do Vegetal:");
		lblNomeDoVegetal.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal = new GridBagConstraints();
		gbc_lblNomeDoVegetal.anchor = GridBagConstraints.WEST;
		gbc_lblNomeDoVegetal.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal.gridwidth = 3;
		gbc_lblNomeDoVegetal.gridx = 1;
		gbc_lblNomeDoVegetal.gridy = 1;
		panel_2.add(lblNomeDoVegetal, gbc_lblNomeDoVegetal);
		
		txt_nome = new JTextField();
		txt_nome.setBackground(new Color(234, 242, 237));
		txt_nome.setForeground(Color.DARK_GRAY);
		txt_nome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_nome.setColumns(10);
		txt_nome.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_txt_nome = new GridBagConstraints();
		gbc_txt_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_nome.insets = new Insets(0, 0, 5, 5);
		gbc_txt_nome.gridwidth = 4;
		gbc_txt_nome.gridx = 4;
		gbc_txt_nome.gridy = 1;
		panel_2.add(txt_nome, gbc_txt_nome);
		
		JLabel lblEspcieDoVegetal = new JLabel("Esp\u00E9cie do Vegetal:");
		lblEspcieDoVegetal.setForeground(new Color(31, 65, 45));
		lblEspcieDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblEspcieDoVegetal = new GridBagConstraints();
		gbc_lblEspcieDoVegetal.fill = GridBagConstraints.BOTH;
		gbc_lblEspcieDoVegetal.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspcieDoVegetal.gridwidth = 3;
		gbc_lblEspcieDoVegetal.gridx = 1;
		gbc_lblEspcieDoVegetal.gridy = 3;
		panel_2.add(lblEspcieDoVegetal, gbc_lblEspcieDoVegetal);
		
		txt_especie = new JTextField();
		txt_especie.setForeground(Color.DARK_GRAY);
		txt_especie.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_especie.setColumns(10);
		txt_especie.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_especie.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_especie = new GridBagConstraints();
		gbc_txt_especie.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_especie.insets = new Insets(0, 0, 5, 5);
		gbc_txt_especie.gridwidth = 4;
		gbc_txt_especie.gridx = 4;
		gbc_txt_especie.gridy = 3;
		panel_2.add(txt_especie, gbc_txt_especie);
		
		JLabel lblNomeDoVegetal_1_1 = new JLabel("Produto Vendido Por:");
		lblNomeDoVegetal_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNomeDoVegetal_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1.gridwidth = 3;
		gbc_lblNomeDoVegetal_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1.gridy = 5;
		panel_2.add(lblNomeDoVegetal_1_1, gbc_lblNomeDoVegetal_1_1);
		
		JRadioButton rbKg = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rbKg);
		rbKg.setBorder(new LineBorder(new Color(0, 0, 0)));
		rbKg.setForeground(new Color(31, 65, 45));
		rbKg.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbKg.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rbKg);
		GridBagConstraints gbc_rbKg = new GridBagConstraints();
		gbc_rbKg.gridwidth = 2;
		gbc_rbKg.anchor = GridBagConstraints.NORTH;
		gbc_rbKg.insets = new Insets(0, 0, 5, 5);
		gbc_rbKg.gridx = 5;
		gbc_rbKg.gridy = 5;
		panel_2.add(rbKg, gbc_rbKg);
		
		JRadioButton rbUnidade = new JRadioButton("Unidade");
		buttonGroup.add(rbUnidade);
		rbUnidade.setForeground(new Color(31, 65, 45));
		rbUnidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbUnidade.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rbUnidade);
		GridBagConstraints gbc_rbUnidade = new GridBagConstraints();
		gbc_rbUnidade.anchor = GridBagConstraints.EAST;
		gbc_rbUnidade.fill = GridBagConstraints.VERTICAL;
		gbc_rbUnidade.insets = new Insets(0, 0, 5, 5);
		gbc_rbUnidade.gridx = 7;
		gbc_rbUnidade.gridy = 5;
		panel_2.add(rbUnidade, gbc_rbUnidade);
		
		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Pre\u00E7o:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNomeDoVegetal_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1, gbc_lblNomeDoVegetal_1_1_1);
		
		JButton btn_cadastrar_produto = new JButton("Cadastrar");
		btn_cadastrar_produto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txt_nome.getText();
				String especie = txt_especie.getText();
				int unidade;
				if (rbKg.isSelected() == true) {
					unidade = 1;
				}
				else {
					unidade = 2;
				}
				float preco = Float.parseFloat(txt_preco.getText());
				float quantidade = Float.parseFloat(txt_quantidade.getText());
				CadastroProdutoBD cp = new CadastroProdutoBD();
				Produto pd = new Produto(0, nome, especie, preco, quantidade, unidade);
				cp.cadastrar(pd);
				
				//limpar campos
				txt_nome.setText("");
				txt_especie.setText("");
				rbKg.setSelected(true);
				txt_preco.setText("");
				txt_quantidade.setText("");
			}
		});
		
		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridwidth = 2;
		gbc_lblNomeDoVegetal_1_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridx = 2;
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1_1);
		
		txt_preco = new JTextField();
		txt_preco.setForeground(Color.DARK_GRAY);
		txt_preco.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_preco.setColumns(10);
		txt_preco.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_preco.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_preco = new GridBagConstraints();
		gbc_txt_preco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_preco.insets = new Insets(0, 0, 5, 5);
		gbc_txt_preco.gridx = 4;
		gbc_txt_preco.gridy = 7;
		panel_2.add(txt_preco, gbc_txt_preco);
		
		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoVegetal_1_1_1_1.gridwidth = 2;
		gbc_lblNomeDoVegetal_1_1_1_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNomeDoVegetal_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1.gridx = 5;
		gbc_lblNomeDoVegetal_1_1_1_1.gridy = 7;
		panel_2.add(lblNomeDoVegetal_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1);
		
		txt_quantidade = new JTextField();
		txt_quantidade.setForeground(Color.DARK_GRAY);
		txt_quantidade.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_quantidade.setColumns(10);
		txt_quantidade.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		txt_quantidade.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_txt_quantidade = new GridBagConstraints();
		gbc_txt_quantidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_quantidade.insets = new Insets(0, 0, 5, 5);
		gbc_txt_quantidade.gridx = 7;
		gbc_txt_quantidade.gridy = 7;
		panel_2.add(txt_quantidade, gbc_txt_quantidade);
		btn_cadastrar_produto.setBackground(new Color(123, 166, 111));
		btn_cadastrar_produto.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btn_cadastrar_produto.setForeground(new Color(31, 65, 45));
		btn_cadastrar_produto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		GridBagConstraints gbc_btn_cadastrar_produto = new GridBagConstraints();
		gbc_btn_cadastrar_produto.insets = new Insets(0, 0, 10, 0);
		gbc_btn_cadastrar_produto.fill = GridBagConstraints.VERTICAL;
		gbc_btn_cadastrar_produto.gridwidth = 9;
		gbc_btn_cadastrar_produto.gridx = 0;
		gbc_btn_cadastrar_produto.gridy = 9;
		panel_2.add(btn_cadastrar_produto, gbc_btn_cadastrar_produto);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
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
