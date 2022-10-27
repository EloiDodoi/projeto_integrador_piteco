package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;

public class VendasPagamento extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendasPagamento frame = new VendasPagamento();
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
		VendasPagamento frame = new VendasPagamento();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	public VendasPagamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1189, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(new Color(234, 242, 237));
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(234, 242, 237));
		panelCentro.add(panelTitulo, BorderLayout.NORTH);
		GridBagLayout gbl_panelTitulo = new GridBagLayout();
		gbl_panelTitulo.columnWidths = new int[]{1101, 0, 0};
		gbl_panelTitulo.rowHeights = new int[]{30, 100, 0};
		gbl_panelTitulo.columnWeights = new double[]{1.0, 4.9E-324, Double.MIN_VALUE};
		gbl_panelTitulo.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panelTitulo.setLayout(gbl_panelTitulo);
		
		JSeparator linha = new JSeparator();
		linha.setBorder(new LineBorder(new Color(31, 65, 45), 50));
		GridBagConstraints gbc_linha = new GridBagConstraints();
		gbc_linha.fill = GridBagConstraints.BOTH;
		gbc_linha.gridwidth = 2;
		gbc_linha.insets = new Insets(20, 30, 5, 10);
		gbc_linha.gridx = 0;
		gbc_linha.gridy = 0;
		panelTitulo.add(linha, gbc_linha);
		
		JLabel lblVenda = new JLabel("Venda\r\n");
		lblVenda.setHorizontalAlignment(SwingConstants.LEFT);
		lblVenda.setForeground(new Color(31, 65, 45));
		lblVenda.setFont(new Font("Dialog", Font.PLAIN, 85));
		lblVenda.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_lblVenda = new GridBagConstraints();
		gbc_lblVenda.anchor = GridBagConstraints.WEST;
		gbc_lblVenda.insets = new Insets(0, 30, 0, 5);
		gbc_lblVenda.gridx = 0;
		gbc_lblVenda.gridy = 1;
		panelTitulo.add(lblVenda, gbc_lblVenda);
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBackground(new Color(234, 242, 237));
		panelCentro.add(panelInfo, BorderLayout.CENTER);
		GridBagLayout gbl_panelInfo = new GridBagLayout();
		gbl_panelInfo.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelInfo.rowHeights = new int[] {30, 0, 0, 130, 0, 30, 0, 30, 0, 30, 0, 0};
		gbl_panelInfo.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0};
		gbl_panelInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelInfo.setLayout(gbl_panelInfo);
		
		JLabel lblItens = new JLabel("Itens");
		lblItens.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		lblItens.setForeground(new Color(217, 173, 181));
		GridBagConstraints gbc_lblItens = new GridBagConstraints();
		gbc_lblItens.gridwidth = 2;
		gbc_lblItens.fill = GridBagConstraints.BOTH;
		gbc_lblItens.insets = new Insets(0, 0, 5, 5);
		gbc_lblItens.gridx = 1;
		gbc_lblItens.gridy = 1;
		panelInfo.add(lblItens, gbc_lblItens);
		
		JLabel lblFormaPag = new JLabel("Forma de pagamento\r\n");
		lblFormaPag.setForeground(new Color(217, 173, 181));
		lblFormaPag.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblFormaPag = new GridBagConstraints();
		gbc_lblFormaPag.anchor = GridBagConstraints.WEST;
		gbc_lblFormaPag.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormaPag.gridx = 6;
		gbc_lblFormaPag.gridy = 1;
		panelInfo.add(lblFormaPag, gbc_lblFormaPag);
		
		JSeparator linha2 = new JSeparator();
		linha2.setForeground(new Color(217, 173, 181));
		linha2.setBackground(new Color(217, 173, 181));
		linha2.setBorder(new LineBorder(new Color(217, 173, 181), 50));
		GridBagConstraints gbc_linha2 = new GridBagConstraints();
		gbc_linha2.fill = GridBagConstraints.BOTH;
		gbc_linha2.gridwidth = 6;
		gbc_linha2.insets = new Insets(0, 0, 5, 5);
		gbc_linha2.gridx = 1;
		gbc_linha2.gridy = 2;
		panelInfo.add(linha2, gbc_linha2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		panelInfo.add(scrollPane, gbc_scrollPane);
		scrollPane.setBackground(new Color(234, 242, 237));
		
/*		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		    protected void configureScrollBarColors() {
		        this.thumbColor = Color.decode("#7BA66F");
		    }
		    
		    @Override
		    protected JButton createDecreaseButton(int orientation) {
		        JButton button = super.createDecreaseButton(orientation);
		        button.setBackground(new Color(234, 242, 237));
		        button.setForeground(null);
		        button.setSelectedIcon(null);
		        button.setBorder(BorderFactory.createLineBorder(new Color(234, 242, 237), 2));
		        return button;
		    }

		    @Override
		    protected JButton createIncreaseButton(int orientation) {
		        JButton button = super.createIncreaseButton(orientation);
		        button.setBackground(new Color(234, 242, 237));
		        button.setForeground(null);
		        button.setSelectedIcon(null);
		        button.setBorder(BorderFactory.createLineBorder(new Color(234, 242, 237), 2));
		        return button;
		    }
		});
*/
		
		table = new JTable();
		table.setRowHeight(25);
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setGridColor(new Color(31, 65, 45));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		table.setBackground(new Color(234, 242, 237));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Pagamento", "Quantidade"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panelRadioB = new JPanel();
		panelRadioB.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_panelRadioB = new GridBagConstraints();
		gbc_panelRadioB.insets = new Insets(0, 0, 5, 5);
		gbc_panelRadioB.fill = GridBagConstraints.BOTH;
		gbc_panelRadioB.gridx = 6;
		gbc_panelRadioB.gridy = 3;
		panelInfo.add(panelRadioB, gbc_panelRadioB);
		GridBagLayout gbl_panelRadioB = new GridBagLayout();
		gbl_panelRadioB.columnWidths = new int[]{110, 109, 0, 0};
		gbl_panelRadioB.rowHeights = new int[]{23, 0, 0, 0};
		gbl_panelRadioB.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelRadioB.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelRadioB.setLayout(gbl_panelRadioB);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Dinheiro\r\n");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(234, 242, 237));
		rdbtnNewRadioButton.setForeground(new Color(31, 65, 45));
		rdbtnNewRadioButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		rdbtnNewRadioButton.setActionCommand("Pagamento");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 0;
		panelRadioB.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnCartoDeDbito = new JRadioButton("Cart\u00E3o de D\u00E9bito");
		buttonGroup.add(rdbtnCartoDeDbito);
		rdbtnCartoDeDbito.setBackground(new Color(234, 242, 237));
		rdbtnCartoDeDbito.setForeground(new Color(31, 65, 45));
		rdbtnCartoDeDbito.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		rdbtnCartoDeDbito.setActionCommand("Pagamento\r\n");
		GridBagConstraints gbc_rdbtnCartoDeDbito = new GridBagConstraints();
		gbc_rdbtnCartoDeDbito.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCartoDeDbito.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCartoDeDbito.gridx = 0;
		gbc_rdbtnCartoDeDbito.gridy = 1;
		panelRadioB.add(rdbtnCartoDeDbito, gbc_rdbtnCartoDeDbito);
		
		JRadioButton rdbtnCartoDeCrdito = new JRadioButton("Cart\u00E3o de Cr\u00E9dito");
		buttonGroup.add(rdbtnCartoDeCrdito);
		rdbtnCartoDeCrdito.setBackground(new Color(234, 242, 237));
		rdbtnCartoDeCrdito.setForeground(new Color(31, 65, 45));
		rdbtnCartoDeCrdito.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		rdbtnCartoDeCrdito.setActionCommand("Pagamento");
		GridBagConstraints gbc_rdbtnCartoDeCrdito = new GridBagConstraints();
		gbc_rdbtnCartoDeCrdito.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCartoDeCrdito.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnCartoDeCrdito.gridx = 0;
		gbc_rdbtnCartoDeCrdito.gridy = 2;
		panelRadioB.add(rdbtnCartoDeCrdito, gbc_rdbtnCartoDeCrdito);
		
		JLabel lblValores = new JLabel("Valor");
		lblValores.setForeground(new Color(217, 173, 181));
		lblValores.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblValores = new GridBagConstraints();
		gbc_lblValores.gridwidth = 2;
		gbc_lblValores.fill = GridBagConstraints.BOTH;
		gbc_lblValores.insets = new Insets(0, 0, 5, 5);
		gbc_lblValores.gridx = 1;
		gbc_lblValores.gridy = 5;
		panelInfo.add(lblValores, gbc_lblValores);
		
		JSeparator separator3 = new JSeparator();
		separator3.setForeground(new Color(217, 173, 181));
		separator3.setBorder(new LineBorder(new Color(217, 173, 181), 100));
		separator3.setBackground(new Color(217, 173, 181));
		GridBagConstraints gbc_separator3 = new GridBagConstraints();
		gbc_separator3.fill = GridBagConstraints.BOTH;
		gbc_separator3.gridwidth = 6;
		gbc_separator3.insets = new Insets(0, 0, 5, 0);
		gbc_separator3.gridx = 1;
		gbc_separator3.gridy = 6;
		panelInfo.add(separator3, gbc_separator3);
		
		JPanel panelValores = new JPanel();
		panelValores.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_panelValores = new GridBagConstraints();
		gbc_panelValores.gridwidth = 6;
		gbc_panelValores.gridheight = 5;
		gbc_panelValores.fill = GridBagConstraints.BOTH;
		gbc_panelValores.gridx = 1;
		gbc_panelValores.gridy = 7;
		panelInfo.add(panelValores, gbc_panelValores);
		GridBagLayout gbl_panelValores = new GridBagLayout();
		gbl_panelValores.columnWidths = new int[] {120, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 30, 0, 0};
		gbl_panelValores.rowHeights = new int[]{39, 0, 0};
		gbl_panelValores.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelValores.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelValores.setLayout(gbl_panelValores);
		
		JLabel lblValorBruto = new JLabel("Valor Total (Bruto):");
		GridBagConstraints gbc_lblValorBruto = new GridBagConstraints();
		gbc_lblValorBruto.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorBruto.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblValorBruto.gridx = 0;
		gbc_lblValorBruto.gridy = 0;
		panelValores.add(lblValorBruto, gbc_lblValorBruto);
		lblValorBruto.setForeground(new Color(31, 65, 45));
		lblValorBruto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		
		JLabel lblRS1 = new JLabel("R$");
		lblRS1.setForeground(new Color(31, 65, 45));
		lblRS1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRS1 = new GridBagConstraints();
		gbc_lblRS1.anchor = GridBagConstraints.EAST;
		gbc_lblRS1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRS1.gridx = 1;
		gbc_lblRS1.gridy = 0;
		panelValores.add(lblRS1, gbc_lblRS1);
		
		JLabel lblValorBruto2 = new JLabel("00,00\r\n");
		lblValorBruto2.setBackground(new Color(234, 242, 237));
		lblValorBruto2.setForeground(new Color(31, 65, 45));
		lblValorBruto2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblValorBruto2 = new GridBagConstraints();
		gbc_lblValorBruto2.anchor = GridBagConstraints.WEST;
		gbc_lblValorBruto2.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorBruto2.gridx = 2;
		gbc_lblValorBruto2.gridy = 0;
		panelValores.add(lblValorBruto2, gbc_lblValorBruto2);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setForeground(new Color(31, 65, 45));
		lblValorTotal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblValorTotal = new GridBagConstraints();
		gbc_lblValorTotal.anchor = GridBagConstraints.WEST;
		gbc_lblValorTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorTotal.gridx = 16;
		gbc_lblValorTotal.gridy = 0;
		panelValores.add(lblValorTotal, gbc_lblValorTotal);
		
		JLabel lblRS3 = new JLabel("R$");
		lblRS3.setForeground(new Color(31, 65, 45));
		lblRS3.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRS3 = new GridBagConstraints();
		gbc_lblRS3.anchor = GridBagConstraints.EAST;
		gbc_lblRS3.insets = new Insets(0, 0, 5, 5);
		gbc_lblRS3.gridx = 17;
		gbc_lblRS3.gridy = 0;
		panelValores.add(lblRS3, gbc_lblRS3);
		
		JLabel lblValorTotal2 = new JLabel("00,00\r\n");
		lblValorTotal2.setForeground(new Color(31, 65, 45));
		lblValorTotal2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblValorTotal2 = new GridBagConstraints();
		gbc_lblValorTotal2.anchor = GridBagConstraints.WEST;
		gbc_lblValorTotal2.insets = new Insets(0, 0, 5, 0);
		gbc_lblValorTotal2.gridx = 18;
		gbc_lblValorTotal2.gridy = 0;
		panelValores.add(lblValorTotal2, gbc_lblValorTotal2);
		
		JLabel lblImpostos = new JLabel("Impostos:");
		lblImpostos.setForeground(new Color(31, 65, 45));
		lblImpostos.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblImpostos = new GridBagConstraints();
		gbc_lblImpostos.anchor = GridBagConstraints.WEST;
		gbc_lblImpostos.insets = new Insets(0, 0, 0, 5);
		gbc_lblImpostos.gridx = 0;
		gbc_lblImpostos.gridy = 1;
		panelValores.add(lblImpostos, gbc_lblImpostos);
		
		JLabel lblRS2 = new JLabel("R$");
		lblRS2.setForeground(new Color(31, 65, 45));
		lblRS2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRS2 = new GridBagConstraints();
		gbc_lblRS2.anchor = GridBagConstraints.EAST;
		gbc_lblRS2.insets = new Insets(0, 0, 0, 5);
		gbc_lblRS2.gridx = 1;
		gbc_lblRS2.gridy = 1;
		panelValores.add(lblRS2, gbc_lblRS2);
		
		JLabel lblImposto2 = new JLabel("00,00\r\n");
		lblImposto2.setForeground(new Color(31, 65, 45));
		lblImposto2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblImposto2 = new GridBagConstraints();
		gbc_lblImposto2.anchor = GridBagConstraints.WEST;
		gbc_lblImposto2.insets = new Insets(0, 0, 0, 5);
		gbc_lblImposto2.gridx = 2;
		gbc_lblImposto2.gridy = 1;
		panelValores.add(lblImposto2, gbc_lblImposto2);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setForeground(new Color(31, 65, 45));
		lblTroco.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTroco = new GridBagConstraints();
		gbc_lblTroco.insets = new Insets(0, 0, 0, 5);
		gbc_lblTroco.anchor = GridBagConstraints.WEST;
		gbc_lblTroco.gridx = 16;
		gbc_lblTroco.gridy = 1;
		panelValores.add(lblTroco, gbc_lblTroco);
		
		JLabel lblRS4 = new JLabel("R$");
		lblRS4.setForeground(new Color(31, 65, 45));
		lblRS4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRS4 = new GridBagConstraints();
		gbc_lblRS4.anchor = GridBagConstraints.EAST;
		gbc_lblRS4.insets = new Insets(0, 0, 0, 5);
		gbc_lblRS4.gridx = 17;
		gbc_lblRS4.gridy = 1;
		panelValores.add(lblRS4, gbc_lblRS4);
		
		JLabel lblTroco2 = new JLabel("00,00\r\n");
		lblTroco2.setForeground(new Color(31, 65, 45));
		lblTroco2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTroco2 = new GridBagConstraints();
		gbc_lblTroco2.anchor = GridBagConstraints.WEST;
		gbc_lblTroco2.gridx = 18;
		gbc_lblTroco2.gridy = 1;
		panelValores.add(lblTroco2, gbc_lblTroco2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(234, 242, 237));
		panelCentro.add(panel_5, BorderLayout.SOUTH);
		
		JButton btnFinalizar = new JButton(" Finalizar\r\n\r\n ");
		btnFinalizar.setBorder(new LineBorder(new Color(217, 173, 181), 2, true));
		btnFinalizar.setBackground(new Color(234, 242, 237));
		btnFinalizar.setForeground(new Color(217, 173, 181));
		btnFinalizar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 42));
		panel_5.add(btnFinalizar);
		
		JPanel panelMenuSuperior = new JPanel();
		panelMenuSuperior.setBackground(new Color(150, 191, 120));
		contentPane.add(panelMenuSuperior, BorderLayout.NORTH);
		panelMenuSuperior.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIcons = new JPanel();
		panelIcons.setBackground(new Color(150, 191, 120));
		panelMenuSuperior.add(panelIcons, BorderLayout.EAST);
		GridBagLayout gbl_panelIcons = new GridBagLayout();
		gbl_panelIcons.columnWidths = new int[]{30, 30, 20, 30, 20, 0};
		gbl_panelIcons.rowHeights = new int[]{33, 0};
		gbl_panelIcons.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelIcons.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelIcons.setLayout(gbl_panelIcons);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(234, 242, 237));
		separator.setBackground(new Color(234, 242, 237));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panelIcons.add(separator, gbc_separator);
		
		JButton btnConfiguracao = new JButton("");
		btnConfiguracao.setIcon(new ImageIcon(VendasPagamento.class.getResource("/img/solucao.png")));
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnConfiguracao = new GridBagConstraints();
		gbc_btnConfiguracao.insets = new Insets(0, 0, 0, 5);
		gbc_btnConfiguracao.gridx = 1;
		gbc_btnConfiguracao.gridy = 0;
		panelIcons.add(btnConfiguracao, gbc_btnConfiguracao);
		
		JButton btnNotificacao = new JButton("");
		btnNotificacao.setIcon(new ImageIcon(VendasPagamento.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 2;
		gbc_btnNotificacao.gridy = 0;
		panelIcons.add(btnNotificacao, gbc_btnNotificacao);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(VendasPagamento.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 5, 10);
		gbc_btnUser.gridx = 4;
		gbc_btnUser.gridy = 0;
		panelIcons.add(btnUser, gbc_btnUser);
		
		JPanel panelMenuLateral = new JPanel();
		panelMenuLateral.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelMenuLateral.setBackground(new Color(150, 191, 120));
		contentPane.add(panelMenuLateral, BorderLayout.WEST);
		panelMenuLateral.setLayout(new BorderLayout(0, 0));
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(VendasPagamento.class.getResource("/img/menu-aberto.png")));
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBorder(null);
		btnMenu.setBackground(new Color(150, 191, 120));
		panelMenuLateral.add(btnMenu, BorderLayout.SOUTH);
	}

}
