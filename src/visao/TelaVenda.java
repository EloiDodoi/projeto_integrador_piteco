package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

import controle.VendaBD;
import modelo.ItemVenda;
import modelo.Venda;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_5;
	private JPanel itensVenda;
	private JLabel lblValorDoProduto;
	private JLabel lblNewLabel;
	
	Venda venda = new Venda();
	
	private JTextField cur_textField = null;
	private JTextField cur_textField_1 = null;
	int numItens = 0;
	
	ArrayList<JButton> lista_botoes_excluir = new ArrayList<JButton>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setBackground(new Color(150, 191, 120));
		panel_1.setLayout(new BorderLayout(0, 0));

		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/menu-aberto.png")));
		btnMenu.setBorder(null);
		btnMenu.setForeground(new Color(234, 242, 237));
		btnMenu.setBackground(new Color(150, 191, 120));
		panel_1.add(btnMenu, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		panel_2.setBackground(new Color(150, 191, 120));
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8, BorderLayout.EAST);
		panel_8.setBackground(new Color(150, 191, 120));
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[] { 30, 30, 20, 30, 20 };
		gbl_panel_8.rowHeights = new int[] { 33, 0 };
		gbl_panel_8.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_8.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_8.setLayout(gbl_panel_8);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel_8.add(separator, gbc_separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(234, 242, 237));
		separator.setForeground(new Color(234, 242, 237));

		JButton btnConfiguracao = new JButton("");
		GridBagConstraints gbc_btnConfiguracao = new GridBagConstraints();
		gbc_btnConfiguracao.insets = new Insets(0, 0, 0, 5);
		gbc_btnConfiguracao.gridx = 1;
		gbc_btnConfiguracao.gridy = 0;
		panel_8.add(btnConfiguracao, gbc_btnConfiguracao);
		btnConfiguracao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/solucao.png")));
		btnConfiguracao.setBorder(null);
		btnConfiguracao.setBackground(new Color(150, 191, 120));

		JButton btnNotificacao = new JButton("");
		GridBagConstraints gbc_btnNotificacao = new GridBagConstraints();
		gbc_btnNotificacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnNotificacao.gridx = 2;
		gbc_btnNotificacao.gridy = 0;
		panel_8.add(btnNotificacao, gbc_btnNotificacao);
		btnNotificacao.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/notificacao.png")));
		btnNotificacao.setBorder(null);
		btnNotificacao.setBackground(new Color(150, 191, 120));

		JButton btnUser = new JButton("");
		GridBagConstraints gbc_btnUser = new GridBagConstraints();
		gbc_btnUser.insets = new Insets(5, 0, 5, 10);
		gbc_btnUser.gridx = 4;
		gbc_btnUser.gridy = 0;
		panel_8.add(btnUser, gbc_btnUser);
		btnUser.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/img/farmer.png")));
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(150, 191, 120));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 242, 237));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(234, 242, 237));
		panel.add(panel_3, BorderLayout.NORTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 1101, 0 };
		gbl_panel_3.rowHeights = new int[] { 30, 100 };
		gbl_panel_3.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0 };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblVendedor = new JLabel("Venda\r\n");
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

		JSeparator separator1 = new JSeparator();
		GridBagConstraints gbc_separator1 = new GridBagConstraints();
		gbc_separator1.gridwidth = 2;
		gbc_separator1.fill = GridBagConstraints.BOTH;
		gbc_separator1.insets = new Insets(20, 30, 5, 10);
		gbc_separator1.gridx = 0;
		gbc_separator1.gridy = 0;
		panel_3.add(separator1, gbc_separator1);
		separator1.setBorder(new LineBorder(new Color(31, 65, 45), 50));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(234, 242, 237));
		panel.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnNewButton = new JButton(" Pagamento ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasPagamento telavp = new VendasPagamento(venda);
				telavp.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBackground(new Color(234, 242, 237));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 45));
		btnNewButton.setForeground(new Color(217, 173, 181));
		btnNewButton.setBorder(new LineBorder(new Color(217, 173, 181), 3, true));
		panel_4.add(btnNewButton);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(234, 242, 237));
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(31, 65, 45));
		panel_5.add(scrollPane, BorderLayout.CENTER);

		itensVenda = new JPanel();
		itensVenda.setBackground(new Color(234, 242, 237));
		scrollPane.setViewportView(itensVenda);
		itensVenda.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(234, 242, 237));
		panel.add(panel_6, BorderLayout.EAST);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] { 141, 0 };
		gbl_panel_6.rowHeights = new int[] { 31, 0, 0, 0, 0, 0 };
		gbl_panel_6.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_6.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_6.setLayout(gbl_panel_6);

		JButton btnAdicionarItem = new JButton("Adicionar Item");
		btnAdicionarItem.setForeground(new Color(234, 242, 237));
		GridBagConstraints gbc_btnAdicionarItem = new GridBagConstraints();
		gbc_btnAdicionarItem.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdicionarItem.anchor = GridBagConstraints.NORTH;
		gbc_btnAdicionarItem.gridx = 0;
		gbc_btnAdicionarItem.gridy = 2;
		panel_6.add(btnAdicionarItem, gbc_btnAdicionarItem);
		btnAdicionarItem.setBorder(new LineBorder(new Color(31, 65, 45), 2));
		btnAdicionarItem.setBackground(new Color(31, 65, 45));
		btnAdicionarItem.setFont(new Font("Dialog", Font.PLAIN, 22));

		btnAdicionarItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ItemVenda novoItem = new ItemVenda();
				venda.adicionarItem(novoItem);
				
				
				JPanel itemVenda = new JPanel();
				itemVenda.setBackground(new Color(150, 191, 120));
				GridBagLayout gbl_panel_Itens = new GridBagLayout();
				gbl_panel_Itens.columnWidths = new int[] { 30, 0, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panel_Itens.rowHeights = new int[] { 0, 30, 30, 30, 0 };
				gbl_panel_Itens.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, Double.MIN_VALUE };
				gbl_panel_Itens.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				itemVenda.setLayout(gbl_panel_Itens);

				JPanel panel_6 = new JPanel();
				panel_6.setBackground(new Color(234, 242, 237));
				GridBagConstraints gbc_panel_6 = new GridBagConstraints();
				gbc_panel_6.gridwidth = 13;
				gbc_panel_6.insets = new Insets(0, 0, 5, 0);
				gbc_panel_6.fill = GridBagConstraints.BOTH;
				gbc_panel_6.gridx = 0;
				gbc_panel_6.gridy = 0;
				itemVenda.add(panel_6, gbc_panel_6);

				GridBagLayout gbl_panel_6 = new GridBagLayout();
				gbl_panel_6.columnWidths = new int[] { 53, 1, 0 };
				gbl_panel_6.rowHeights = new int[] { 39, 0 };
				gbl_panel_6.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
				gbl_panel_6.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
				panel_6.setLayout(gbl_panel_6);

				lblNewLabel = new JLabel("Item");
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
				lblNewLabel.setForeground(new Color(217, 173, 181));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				panel_6.add(lblNewLabel, gbc_lblNewLabel);

				JSeparator separator_1 = new JSeparator();
				separator_1.setBackground(new Color(217, 173, 181));
				separator_1.setForeground(new Color(217, 173, 181));
				GridBagConstraints gbc_separator_1 = new GridBagConstraints();
				gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_separator_1.gridx = 1;
				gbc_separator_1.gridy = 0;
				panel_6.add(separator_1, gbc_separator_1);

				JLabel lblProduto = new JLabel("Código do Produto");
				lblProduto.setHorizontalAlignment(SwingConstants.RIGHT);
				lblProduto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				lblProduto.setForeground(new Color(31, 65, 45));
				GridBagConstraints gbc_lblProduto = new GridBagConstraints();
				gbc_lblProduto.anchor = GridBagConstraints.WEST;
				gbc_lblProduto.insets = new Insets(5, 0, 5, 5);
				gbc_lblProduto.gridx = 1;
				gbc_lblProduto.gridy = 1;
				itemVenda.add(lblProduto, gbc_lblProduto);

				textField = new JTextField();
				textField.setBorder(new LineBorder(new Color(31, 65, 45), 2));
				textField.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 9;
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.gridx = 3;
				gbc_textField.gridy = 1;
				itemVenda.add(textField, gbc_textField);
				textField.setColumns(10);
				textField.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						atualizarValorUnitario();
							
					}

				
				});

				JLabel lblQuantidade = new JLabel("Quantidade");
				lblQuantidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				lblQuantidade.setForeground(new Color(31, 65, 45));
				GridBagConstraints gbc_lblQuantidade = new GridBagConstraints();
				gbc_lblQuantidade.anchor = GridBagConstraints.WEST;
				gbc_lblQuantidade.insets = new Insets(0, 0, 5, 5);
				gbc_lblQuantidade.gridx = 1;
				gbc_lblQuantidade.gridy = 2;
				itemVenda.add(lblQuantidade, gbc_lblQuantidade);

				textField_1 = new JTextField();
				textField_1.setBorder(new LineBorder(new Color(31, 65, 45), 2));
				textField_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.gridwidth = 9;
				gbc_textField_1.insets = new Insets(0, 0, 5, 5);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 3;
				gbc_textField_1.gridy = 2;
				itemVenda.add(textField_1, gbc_textField_1);
				textField_1.setColumns(10);
				textField_1.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						
						
						atualizarValorUnitario();
						
						
					}
				});
				if(cur_textField != null) {
					cur_textField.setEditable(false);
					cur_textField_1.setEditable(false);
				}
				cur_textField = textField;
				cur_textField_1 = textField_1;
				numItens +=1;

				JButton btnDeletarItem = new JButton(" X ");
				btnDeletarItem.setForeground(new Color(234, 242, 237));
				btnDeletarItem.setBorder(new LineBorder(new Color(217, 173, 181), 2));
				btnDeletarItem.setBackground(new Color(217, 173, 181));
				btnDeletarItem.setFont(new Font("Dialog", Font.PLAIN, 27));
				itemVenda.add(btnDeletarItem);
				lista_botoes_excluir.add(btnDeletarItem);
				btnDeletarItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JButton btn = (JButton) e.getSource();
						int pos = lista_botoes_excluir.indexOf(btn);
						lista_botoes_excluir.remove(pos);
						venda.getArrayItensVenda().remove(pos);
						
						
						itensVenda.remove(itemVenda);
						itensVenda.revalidate();
						itensVenda.repaint();
						
					}
				});

				JLabel lblValor = new JLabel("Valor");
				lblValor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				lblValor.setForeground(new Color(31, 65, 45));
				GridBagConstraints gbc_lblValor = new GridBagConstraints();
				gbc_lblValor.insets = new Insets(0, 0, 0, 5);
				gbc_lblValor.anchor = GridBagConstraints.WEST;
				gbc_lblValor.gridx = 1;
				gbc_lblValor.gridy = 3;
				itemVenda.add(lblValor, gbc_lblValor);

				JLabel lblNewLabel_1 = new JLabel("R$");
				lblNewLabel_1.setForeground(new Color(31, 65, 45));
				lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 31));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel_1.gridx = 2;
				gbc_lblNewLabel_1.gridy = 3;
				itemVenda.add(lblNewLabel_1, gbc_lblNewLabel_1);

				lblValorDoProduto = new JLabel("0,0");
				lblValorDoProduto.setForeground(new Color(255, 255, 255));
				lblValorDoProduto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 27));
				GridBagConstraints gbc_lblValorDoProduto = new GridBagConstraints();
				gbc_lblValorDoProduto.anchor = GridBagConstraints.WEST;
				gbc_lblValorDoProduto.insets = new Insets(0, 0, 0, 5);
				gbc_lblValorDoProduto.gridx = 3;
				gbc_lblValorDoProduto.gridy = 3;
				itemVenda.add(lblValorDoProduto, gbc_lblValorDoProduto);
				itensVenda.add(itemVenda);
				itensVenda.revalidate();
				itensVenda.repaint();

			}
		});

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
	}
	
	protected void atualizarValorUnitario() {
		
		if(textField.getText().isEmpty() == false) {
			
			VendaBD vbd = new VendaBD();
			int codProduto = Integer.parseInt(textField.getText());
			
			lblNewLabel.setText("Item - " + vbd.nomeProduto(codProduto));
			
			if(textField_1.getText().isEmpty() == false) {
				float quantidade = Float.parseFloat(textField_1.getText());
			
				float total = vbd.precoUnitario(codProduto, quantidade);
				lblValorDoProduto.setText(String.valueOf(total));
				
				ItemVenda itemVenda = venda.getArrayItensVenda().get(numItens-1);
				itemVenda.setCodigoItem(codProduto);
				itemVenda.setPrecoTotalItem(total);
				itemVenda.setQuantidadeItem(quantidade);
				
				
			}
		
		}
	
	}

}
