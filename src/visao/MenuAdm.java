package visao;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class MenuAdm extends JPanel {

	/**
	 * Create the panel.
	 */
	MenuAdm menu = new MenuAdm();
	public MenuAdm() {
		
		
		setBackground(new Color(150, 191, 120));
		setBounds(100, 100, 228, 600);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(150, 191, 120));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setBounds(10, 100, 200, 50);
		panel_1.add(btnEstoque);
		btnEstoque.setContentAreaFilled(false);
		btnEstoque.setBorder(null);
		btnEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			menu.setVisible(false);
			}
		});
		btnEstoque.setIcon(new ImageIcon(MenuAdm.class.getResource("/img/estoque-pronto.png")));
		btnEstoque.setBackground(new Color(150, 191, 120));
		btnEstoque.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		btnEstoque.setForeground(new Color(85, 121, 74));
		btnEstoque.setBorderPainted(false);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setIcon(new ImageIcon(MenuAdm.class.getResource("/img/carrinho-de-compras.png")));
		btnVendas.setBounds(10, 140, 200, 50);
		btnVendas.setBorder(null);
		panel_1.add(btnVendas);
		btnVendas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVendas.setForeground(new Color(85, 121, 74));
		btnVendas.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		btnVendas.setBorderPainted(false);
		btnVendas.setBackground(new Color(150, 191, 120));
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.setIcon(new ImageIcon(MenuAdm.class.getResource("/img/prancheta.png")));
		btnRelatorios.setBounds(10, 300, 200, 50);
		panel_1.add(btnRelatorios);
		btnRelatorios.setBorder(null);
		btnRelatorios.setHorizontalAlignment(SwingConstants.LEFT);
		btnRelatorios.setForeground(new Color(85, 121, 74));
		btnRelatorios.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		btnRelatorios.setBorderPainted(false);
		btnRelatorios.setBackground(new Color(150, 191, 120));
		
		JButton btnControle = new JButton("Controle");
		btnControle.setIcon(new ImageIcon(MenuAdm.class.getResource("/img/estrela.png")));
		btnControle.setBounds(10, 340, 200, 50);
		panel_1.add(btnControle);
		btnControle.setBorder(null);
		btnControle.setHorizontalAlignment(SwingConstants.LEFT);
		btnControle.setForeground(new Color(85, 121, 74));
		btnControle.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		btnControle.setBorderPainted(false);
		btnControle.setBackground(new Color(150, 191, 120));
		
		JPanel linha = new JPanel();
		linha.setBackground(new Color(85, 121, 74));
		linha.setBounds(10, 95, 210, 2);
		panel_1.add(linha);
		
		JPanel linha_1 = new JPanel();
		linha_1.setBackground(new Color(85, 121, 74));
		linha_1.setBounds(10, 295, 210, 2);
		panel_1.add(linha_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(150, 191, 120));
		add(panel_2, BorderLayout.NORTH);
		
		JLabel lblPiteco = new JLabel("PITECO");
		panel_2.add(lblPiteco);
		lblPiteco.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 40));
		lblPiteco.setForeground(Color.WHITE);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon(MenuAdm.class.getResource("/img/porta.png")));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnSair, BorderLayout.SOUTH);
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setForeground(new Color(85, 121, 74));
		btnSair.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		btnSair.setBorderPainted(false);
		btnSair.setBorder(new EmptyBorder(0, 10, 0, 0));
		btnSair.setBackground(new Color(150, 191, 120));
	}
}
