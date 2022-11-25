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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controle.VendaBD;
import modelo.ItemVenda;
import modelo.Venda;

import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import visao.TelaLoginAdm;

public class VendasPagamento extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	VendaBD vbd = new VendaBD();
	private JTextField txtValorDinheiro;
	float valorTotal;
	JLabel lblTroco2;
	JLabel lblValorDinheiro;
	JLabel lblRS2;
	JLabel lblTroco;
	JLabel lblRS4;
	
	
	public static float roundAvoid(double value, int places) {
		float scale = (float) Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}

	public DefaultTableModel listagemItensVenda(Venda venda) {
		ItemVenda item = new ItemVenda();

		DefaultTableModel modelo_tabela = new DefaultTableModel(new Object[][] {

		}, new String[] { "C\u00F3digo", "Pagamento", "Quantidade" });

		for (int i = 0; i < venda.getArrayItensVenda().size(); i++) {
			item = venda.getArrayItensVenda().get(i);
			modelo_tabela
					.addRow(new Object[] { item.getCodigoItem(), item.getPrecoTotalItem(), item.getQuantidadeItem() });
		}
		return modelo_tabela;
	}
	
	public float valorTotalVenda(Venda venda) {
		float valor = 0;
		
		for(int i = 0; i < venda.getArrayItensVenda().size(); i++) {
			valor += venda.getArrayItensVenda().get(i).getPrecoTotalItem();
		}
		return roundAvoid(valor, 2);
	}

	public VendasPagamento(Venda venda) {

		System.out.println(venda.getArrayItensVenda().size());
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
		gbl_panelTitulo.columnWidths = new int[] { 1101, 0, 0 };
		gbl_panelTitulo.rowHeights = new int[] { 30, 100, 0 };
		gbl_panelTitulo.columnWeights = new double[] { 1.0, 4.9E-324, Double.MIN_VALUE };
		gbl_panelTitulo.rowWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
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
		gbl_panelInfo.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelInfo.rowHeights = new int[] { 30, 0, 0, 130, 0, 30, 0, 30, 0, 30, 0, 0 };
		gbl_panelInfo.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0 };
		gbl_panelInfo.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
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

		/*
		 * scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() { protected
		 * void configureScrollBarColors() { this.thumbColor = Color.decode("#7BA66F");
		 * }
		 * 
		 * @Override protected JButton createDecreaseButton(int orientation) { JButton
		 * button = super.createDecreaseButton(orientation); button.setBackground(new
		 * Color(234, 242, 237)); button.setForeground(null);
		 * button.setSelectedIcon(null);
		 * button.setBorder(BorderFactory.createLineBorder(new Color(234, 242, 237),
		 * 2)); return button; }
		 * 
		 * @Override protected JButton createIncreaseButton(int orientation) { JButton
		 * button = super.createIncreaseButton(orientation); button.setBackground(new
		 * Color(234, 242, 237)); button.setForeground(null);
		 * button.setSelectedIcon(null);
		 * button.setBorder(BorderFactory.createLineBorder(new Color(234, 242, 237),
		 * 2)); return button; } });
		 */

		table = new JTable();
		table.setRowHeight(25);
		table.setSelectionBackground(new Color(217, 173, 181));
		table.setGridColor(new Color(31, 65, 45));
		table.setForeground(new Color(31, 65, 45));
		table.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		table.setBackground(new Color(234, 242, 237));
		table.setModel(new DefaultTableModel(new Object[][] {

		}, new String[] { "C\u00F3digo", "Pagamento", "Quantidade" }));
		table.setModel(listagemItensVenda(venda));
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
		gbl_panelRadioB.columnWidths = new int[] { 110, 109, 0, 0 };
		gbl_panelRadioB.rowHeights = new int[] { 23, 0, 0, 0 };
		gbl_panelRadioB.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelRadioB.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelRadioB.setLayout(gbl_panelRadioB);

		JRadioButton rbtnDinheiro = new JRadioButton("Dinheiro\r\n");
		rbtnDinheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblValorDinheiro.setVisible(true);
				lblRS2.setVisible(true);
				txtValorDinheiro.setVisible(true);
			}
		});
		
		buttonGroup.add(rbtnDinheiro);
		rbtnDinheiro.setBackground(new Color(234, 242, 237));
		rbtnDinheiro.setForeground(new Color(31, 65, 45));
		rbtnDinheiro.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		rbtnDinheiro.setActionCommand("Pagamento");
		GridBagConstraints gbc_rbtnDinheiro = new GridBagConstraints();
		gbc_rbtnDinheiro.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnDinheiro.anchor = GridBagConstraints.NORTHWEST;
		gbc_rbtnDinheiro.gridx = 0;
		gbc_rbtnDinheiro.gridy = 0;
		panelRadioB.add(rbtnDinheiro, gbc_rbtnDinheiro);

		JRadioButton rdbtnCartaoDeDebito = new JRadioButton("Cart\u00E3o de D\u00E9bito");
		rdbtnCartaoDeDebito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblValorDinheiro.setVisible(false);
				lblRS2.setVisible(false);
				txtValorDinheiro.setVisible(false);
				txtValorDinheiro.setText("");
				lblTroco.setVisible(false);
				lblRS4.setVisible(false);
				lblTroco2.setVisible(false);
				lblTroco2.setText("0,0");
				
			}
		});
		buttonGroup.add(rdbtnCartaoDeDebito);
		rdbtnCartaoDeDebito.setBackground(new Color(234, 242, 237));
		rdbtnCartaoDeDebito.setForeground(new Color(31, 65, 45));
		rdbtnCartaoDeDebito.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		rdbtnCartaoDeDebito.setActionCommand("Pagamento\r\n");
		GridBagConstraints gbc_rdbtnCartaoDeDebito = new GridBagConstraints();
		gbc_rdbtnCartaoDeDebito.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCartaoDeDebito.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCartaoDeDebito.gridx = 0;
		gbc_rdbtnCartaoDeDebito.gridy = 1;
		panelRadioB.add(rdbtnCartaoDeDebito, gbc_rdbtnCartaoDeDebito);

		JRadioButton rdbtnCartaoDeCredito = new JRadioButton("Cart\u00E3o de Cr\u00E9dito");
		rdbtnCartaoDeCredito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblValorDinheiro.setVisible(false);
				lblRS2.setVisible(false);
				txtValorDinheiro.setVisible(false);
				txtValorDinheiro.setText("");
				lblTroco.setVisible(false);
				lblRS4.setVisible(false);
				lblTroco2.setVisible(false);
				lblTroco2.setText("0,0");
				
			}
		});
		buttonGroup.add(rdbtnCartaoDeCredito);
		rdbtnCartaoDeCredito.setBackground(new Color(234, 242, 237));
		rdbtnCartaoDeCredito.setForeground(new Color(31, 65, 45));
		rdbtnCartaoDeCredito.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		rdbtnCartaoDeCredito.setActionCommand("Pagamento");
		GridBagConstraints gbc_rdbtnCartaoDeCredito = new GridBagConstraints();
		gbc_rdbtnCartaoDeCredito.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCartaoDeCredito.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnCartaoDeCredito.gridx = 0;
		gbc_rdbtnCartaoDeCredito.gridy = 2;
		panelRadioB.add(rdbtnCartaoDeCredito, gbc_rdbtnCartaoDeCredito);

		JLabel lblValores = new JLabel("Valor da Venda");
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
		gbl_panelValores.columnWidths = new int[] { 120, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0,
				30, 0, 0 };
		gbl_panelValores.rowHeights = new int[] { 39, 0, 0 };
		gbl_panelValores.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelValores.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelValores.setLayout(gbl_panelValores);

		JLabel lblValorBruto = new JLabel("Valor Total:");
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

		JLabel lblTotal = new JLabel("00,00\r\n");
		lblTotal.setBackground(new Color(234, 242, 237));
		lblTotal.setForeground(new Color(31, 65, 45));
		lblTotal.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.WEST;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 2;
		gbc_lblTotal.gridy = 0;
		panelValores.add(lblTotal, gbc_lblTotal);
		lblTotal.setText(String.valueOf(valorTotalVenda(venda)));

		lblValorDinheiro = new JLabel("Pagamento do Cliente:");
		lblValorDinheiro.setForeground(new Color(31, 65, 45));
		lblValorDinheiro.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblValorDinheiro = new GridBagConstraints();
		gbc_lblValorDinheiro.anchor = GridBagConstraints.WEST;
		gbc_lblValorDinheiro.insets = new Insets(0, 0, 0, 5);
		gbc_lblValorDinheiro.gridx = 0;
		gbc_lblValorDinheiro.gridy = 1;
		panelValores.add(lblValorDinheiro, gbc_lblValorDinheiro);
		lblValorDinheiro.setVisible(false);

		lblRS2 = new JLabel("R$");
		lblRS2.setForeground(new Color(31, 65, 45));
		lblRS2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRS2 = new GridBagConstraints();
		gbc_lblRS2.anchor = GridBagConstraints.EAST;
		gbc_lblRS2.insets = new Insets(0, 0, 0, 5);
		gbc_lblRS2.gridx = 1;
		gbc_lblRS2.gridy = 1;
		panelValores.add(lblRS2, gbc_lblRS2);
		lblRS2.setVisible(false);
		
		txtValorDinheiro = new JTextField();
		txtValorDinheiro.setForeground(new Color(31, 65, 45));
		txtValorDinheiro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				atualizarTroco(venda);
			}
		});
		txtValorDinheiro.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		txtValorDinheiro.setFont(new Font("Dialog", Font.PLAIN, 23));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panelValores.add(txtValorDinheiro, gbc_textField);
		txtValorDinheiro.setColumns(10);
		txtValorDinheiro.setVisible(false);
		

		lblTroco = new JLabel("Troco:");
		lblTroco.setForeground(new Color(31, 65, 45));
		lblTroco.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTroco = new GridBagConstraints();
		gbc_lblTroco.insets = new Insets(0, 0, 0, 5);
		gbc_lblTroco.anchor = GridBagConstraints.WEST;
		gbc_lblTroco.gridx = 16;
		gbc_lblTroco.gridy = 1;
		panelValores.add(lblTroco, gbc_lblTroco);
		lblTroco.setVisible(false);

		lblRS4 = new JLabel("R$");
		lblRS4.setForeground(new Color(31, 65, 45));
		lblRS4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRS4 = new GridBagConstraints();
		gbc_lblRS4.anchor = GridBagConstraints.EAST;
		gbc_lblRS4.insets = new Insets(0, 0, 0, 5);
		gbc_lblRS4.gridx = 17;
		gbc_lblRS4.gridy = 1;
		panelValores.add(lblRS4, gbc_lblRS4);
		lblRS4.setVisible(false);

		lblTroco2 = new JLabel("00,00\r\n");
		lblTroco2.setForeground(new Color(31, 65, 45));
		lblTroco2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTroco2 = new GridBagConstraints();
		gbc_lblTroco2.anchor = GridBagConstraints.WEST;
		gbc_lblTroco2.gridx = 18;
		gbc_lblTroco2.gridy = 1;
		panelValores.add(lblTroco2, gbc_lblTroco2);
		lblTroco2.setVisible(false);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(234, 242, 237));
		panelCentro.add(panel_5, BorderLayout.SOUTH);

		JButton btnFinalizar = new JButton(" Finalizar\r\n\r\n ");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendaBD vbd = new VendaBD();
				venda.setUsuario(TelaLoginAdm.user);
				venda.setVenda_valor(Float.parseFloat(lblTotal.getText()));
				LocalDateTime data = LocalDateTime.now();
				java.sql.Date data_venda = java.sql.Date.valueOf(data.toLocalDate());
				venda.setVenda_data(data_venda);
				System.out.println(data_venda);
				
				int pagamento = 0;
				
				if(rbtnDinheiro.isSelected() == true || rdbtnCartaoDeDebito.isSelected() == true || rdbtnCartaoDeCredito.isSelected() == true) {
					if (rbtnDinheiro.isSelected() == true) {
						pagamento = 1;
					}
					else if (rdbtnCartaoDeDebito.isSelected() == true){
						pagamento = 2;
					}
					else if(rdbtnCartaoDeCredito.isSelected() == true) {
						pagamento = 3;
					}
					
					venda.setTipo_pagamento(pagamento);
					
					vbd.executarVenda(venda);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Selecione um método de pagamento antes de finalizar a venda!");
				}
				
				
			}
		});
		
		JButton btnCancelar = new JButton(" Cancelar ");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaVenda tv = new TelaVenda();
				tv.abrir();
			}
		});
		btnCancelar.setForeground(new Color(217, 173, 181));
		btnCancelar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 42));
		btnCancelar.setBorder(new LineBorder(new Color(217, 173, 181), 2, true));
		btnCancelar.setBackground(new Color(234, 242, 237));
		panel_5.add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel_5.add(panel);
		btnFinalizar.setBorder(new LineBorder(new Color(217, 173, 181), 2, true));
		btnFinalizar.setBackground(new Color(234, 242, 237));
		btnFinalizar.setForeground(new Color(217, 173, 181));
		btnFinalizar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 42));
		panel_5.add(btnFinalizar);
	}
	
	protected void atualizarTroco(Venda venda) {
		
		valorTotal = Float.parseFloat(txtValorDinheiro.getText()) - valorTotalVenda(venda);
		lblTroco.setVisible(true);
		lblRS4.setVisible(true);
		lblTroco2.setVisible(true);
		lblTroco2.setText(String.valueOf(roundAvoid(valorTotal, 2)));
		
	}

}
