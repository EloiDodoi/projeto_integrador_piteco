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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

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
		frame.setBounds(100, 100, 1136, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 166, 111));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(123, 166, 111));
		panel.add(panel_8, BorderLayout.EAST);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[] {30, 30, 20, 30, 20};
		gbl_panel_8.rowHeights = new int[]{33, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_8.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JButton btnConfiguracao = new JButton("");
		GridBagConstraints gbc_btnConfiguracao = new GridBagConstraints();
		gbc_btnConfiguracao.insets = new Insets(0, 0, 0, 5);
		gbc_btnConfiguracao.gridx = 1;
		gbc_btnConfiguracao.gridy = 0;
		panel_8.add(btnConfiguracao, gbc_btnConfiguracao);
		btnConfiguracao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/solucao.png")));
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(123, 166, 111));
		
		JButton btnNotificacao = new JButton("");
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 2;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(123, 166, 111));
		
		JButton btnUser = new JButton("");
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 5, 10);
		gbc_btnUser.gridx = 4;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(123, 166, 111));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_1.setBackground(new Color(123, 166, 111));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		btnMenu.setBorder(null);
		btnMenu.setForeground(new Color(123, 166, 111));
		btnMenu.setBackground(new Color(123, 166, 111));
		btnMenu.setBounds(0, 681, 64, 46);
		panel_1.add(btnMenu, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_4.add(panel_3, BorderLayout.NORTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{1101, 0};
		gbl_panel_3.rowHeights = new int[]{30, 100};
		gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0};
		panel_3.setLayout(gbl_panel_3);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 2;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.insets = new Insets(20, 30, 5, 10);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel_3.add(separator, gbc_separator);
		separator.setBorder(new LineBorder(new Color(31, 65, 45), 50));
		
		JLabel lblVendedor = new JLabel("Cadastro do Produto");
		GridBagConstraints gbc_lblVendedor = new GridBagConstraints();
		gbc_lblVendedor.anchor = GridBagConstraints.WEST;
		gbc_lblVendedor.insets = new Insets(0, 30, 0, 5);
		gbc_lblVendedor.gridx = 0;
		gbc_lblVendedor.gridy = 1;
		panel_3.add(lblVendedor, gbc_lblVendedor);
		lblVendedor.setBackground(new Color(234, 242, 237));
		lblVendedor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendedor.setForeground(new Color(31, 65, 45));
		lblVendedor.setFont(new Font("Dialog", Font.PLAIN, 85));
		
		JPanel panel_2 = new JPanel();
		panel_4.add(panel_2, BorderLayout.CENTER);
		panel_2.setBackground(new Color(123, 166, 111));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {0, 0, 0, 30, 107, 208, 0};
		gbl_panel_2.rowHeights = new int[] {0, 0, 50, 40, 40, 70, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNomeDoVegetal = new JLabel("Nome do Vegetal:");
		lblNomeDoVegetal.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal = new GridBagConstraints();
		gbc_lblNomeDoVegetal.anchor = GridBagConstraints.WEST;
		gbc_lblNomeDoVegetal.insets = new Insets(0, 20, 5, 5);
		gbc_lblNomeDoVegetal.gridwidth = 2;
		gbc_lblNomeDoVegetal.gridx = 0;
		gbc_lblNomeDoVegetal.gridy = 0;
		panel_2.add(lblNomeDoVegetal, gbc_lblNomeDoVegetal);
		
		textField = new JTextField();
		textField.setBackground(new Color(234, 242, 237));
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 3;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		panel_2.add(textField, gbc_textField);
		
		JLabel lblEspcieDoVegetal = new JLabel("Esp\u00E9cie do Vegetal:");
		lblEspcieDoVegetal.setForeground(new Color(31, 65, 45));
		lblEspcieDoVegetal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblEspcieDoVegetal = new GridBagConstraints();
		gbc_lblEspcieDoVegetal.anchor = GridBagConstraints.WEST;
		gbc_lblEspcieDoVegetal.insets = new Insets(0, 20, 5, 5);
		gbc_lblEspcieDoVegetal.gridwidth = 2;
		gbc_lblEspcieDoVegetal.gridx = 0;
		gbc_lblEspcieDoVegetal.gridy = 1;
		panel_2.add(lblEspcieDoVegetal, gbc_lblEspcieDoVegetal);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_1.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		panel_2.add(textField_1, gbc_textField_1);
		
		JLabel lblNomeDoVegetal_1_1 = new JLabel("Produto Vendido Por:");
		lblNomeDoVegetal_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNomeDoVegetal_1_1.insets = new Insets(0, 20, 5, 5);
		gbc_lblNomeDoVegetal_1_1.gridwidth = 2;
		gbc_lblNomeDoVegetal_1_1.gridx = 0;
		gbc_lblNomeDoVegetal_1_1.gridy = 2;
		panel_2.add(lblNomeDoVegetal_1_1, gbc_lblNomeDoVegetal_1_1);
		
		JRadioButton rbKg = new JRadioButton("Quilograma (Kg)");
		buttonGroup.add(rbKg);
		rbKg.setBorder(new LineBorder(new Color(0, 0, 0)));
		rbKg.setForeground(new Color(31, 65, 45));
		rbKg.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbKg.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rbKg);
		GridBagConstraints gbc_rbKg = new GridBagConstraints();
		gbc_rbKg.fill = GridBagConstraints.HORIZONTAL;
		gbc_rbKg.insets = new Insets(0, 0, 5, 5);
		gbc_rbKg.gridx = 3;
		gbc_rbKg.gridy = 2;
		panel_2.add(rbKg, gbc_rbKg);
		
		JRadioButton rbUnidade = new JRadioButton("Unidade");
		buttonGroup.add(rbUnidade);
		rbUnidade.setForeground(new Color(31, 65, 45));
		rbUnidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 28));
		rbUnidade.setBackground(new Color(123, 166, 111));
		scaleRadioButtonIcon(rbUnidade);
		GridBagConstraints gbc_rbUnidade = new GridBagConstraints();
		gbc_rbUnidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_rbUnidade.insets = new Insets(0, 0, 5, 5);
		gbc_rbUnidade.gridx = 5;
		gbc_rbUnidade.gridy = 2;
		panel_2.add(rbUnidade, gbc_rbUnidade);
		
		JLabel lblNomeDoVegetal_1_1_1 = new JLabel("Pre\u00E7o:");
		lblNomeDoVegetal_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNomeDoVegetal_1_1_1.insets = new Insets(0, 20, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1.gridx = 0;
		gbc_lblNomeDoVegetal_1_1_1.gridy = 3;
		panel_2.add(lblNomeDoVegetal_1_1_1, gbc_lblNomeDoVegetal_1_1_1);
		
		JLabel lblNomeDoVegetal_1_1_1_1_1 = new JLabel("R$");
		lblNomeDoVegetal_1_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoVegetal_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridx = 1;
		gbc_lblNomeDoVegetal_1_1_1_1_1.gridy = 3;
		panel_2.add(lblNomeDoVegetal_1_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_2.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		panel_2.add(textField_2, gbc_textField_2);
		
		JLabel lblNomeDoVegetal_1_1_1_1 = new JLabel("Quantidade:");
		lblNomeDoVegetal_1_1_1_1.setForeground(new Color(31, 65, 45));
		lblNomeDoVegetal_1_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 32));
		GridBagConstraints gbc_lblNomeDoVegetal_1_1_1_1 = new GridBagConstraints();
		gbc_lblNomeDoVegetal_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNomeDoVegetal_1_1_1_1.insets = new Insets(0, 20, 5, 5);
		gbc_lblNomeDoVegetal_1_1_1_1.gridx = 0;
		gbc_lblNomeDoVegetal_1_1_1_1.gridy = 4;
		panel_2.add(lblNomeDoVegetal_1_1_1_1, gbc_lblNomeDoVegetal_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(31, 65, 45), 2, true));
		textField_3.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 4;
		panel_2.add(textField_3, gbc_textField_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(123, 166, 111));
		btnNewButton.setBorder(new LineBorder(new Color(31, 65, 45), 3, true));
		btnNewButton.setForeground(new Color(31, 65, 45));
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 50));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.gridwidth = 7;
		gbc_btnNewButton.insets = new Insets(0, 0, 20, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 6;
		panel_2.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(234, 242, 237), 10));
		panel_4.add(panel_5, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(234, 242, 237), 10));
		panel_4.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(234, 242, 237), 10));
		panel_4.add(panel_7, BorderLayout.EAST);
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
