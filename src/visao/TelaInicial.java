package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaInicial extends JFrame {

	private JPanel contentPane;
//	TelaInicial frame = new TelaInicial();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.setVisible(true);
					window.setLocationRelativeTo(null);
					window.setExtendedState(window.getExtendedState() | JFrame.MAXIMIZED_BOTH);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
//	public void abrir() {
//
//	frame.setVisible(true);
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
//	}
	public TelaInicial() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\PitecoLogo\\3.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 10));
		panel.setBackground(new Color(123, 166, 111));
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPiteco = new JLabel("PITECO\r\n");
		lblPiteco.setVerticalTextPosition(SwingConstants.TOP);
		lblPiteco.setVerticalAlignment(SwingConstants.TOP);
		lblPiteco.setPreferredSize(new Dimension(37, 300));
		lblPiteco.setForeground(Color.WHITE);
		lblPiteco.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 61));
		lblPiteco.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPiteco.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPiteco, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/1.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(234, 242, 237));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sua feirinha na");
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(31,65,45));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 65));
		lblNewLabel.setBounds(122, 93, 468, 61);
		panel_1.add(lblNewLabel);
		
		JLabel lblPalmaDaSua = new JLabel("palma da m\u00E3o!");
		lblPalmaDaSua.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblPalmaDaSua.setVerticalAlignment(SwingConstants.TOP);
		lblPalmaDaSua.setForeground(new Color(31, 65, 45));
		lblPalmaDaSua.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 65));
		lblPalmaDaSua.setBounds(122, 152, 468, 78);
		panel_1.add(lblPalmaDaSua);
		
		JLabel lblPalmaDaSua_1 = new JLabel("O Piteco organiza seu neg\u00F3cio.\r\n");
		lblPalmaDaSua_1.setVerticalAlignment(SwingConstants.TOP);
		lblPalmaDaSua_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblPalmaDaSua_1.setForeground(new Color(31,65,45));
		lblPalmaDaSua_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 32));
		lblPalmaDaSua_1.setBounds(122, 229, 468, 41);
		panel_1.add(lblPalmaDaSua_1);
		
		JLabel lblPalmaDaSua_1_1 = new JLabel("Come\u00E7e j\u00E1!\r\n");
		lblPalmaDaSua_1_1.setForeground(new Color(31,65,45));
		lblPalmaDaSua_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 32));
		lblPalmaDaSua_1_1.setBounds(122, 259, 468, 54);
		panel_1.add(lblPalmaDaSua_1_1);
		
		JButton btn_adm = new JButton("Administrador");
		btn_adm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLoginAdm login_adm = new TelaLoginAdm();
				login_adm.abrir();
			}
		});
		btn_adm.setForeground(Color.WHITE);
		btn_adm.setBorder(null);
		btn_adm.setBackground(new Color(150, 191, 120));
		btn_adm.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
		btn_adm.setBounds(152, 345, 416, 61);
		panel_1.add(btn_adm);
		
		JButton btn_vendedor = new JButton("Vendedor\r\n");
		btn_vendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLoginVendedor login_vendedor = new TelaLoginVendedor();
				login_vendedor.abrir();
			}
		});
		btn_vendedor.setPreferredSize(new Dimension(99, 23));
		btn_vendedor.setBorder(null);
		btn_vendedor.setForeground(Color.WHITE);
		btn_vendedor.setBackground(new Color(150, 191, 120));
		btn_vendedor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
		btn_vendedor.setBounds(152, 417, 416, 54);
		panel_1.add(btn_vendedor);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/ilustracaoTelaInicial.png")));
		lblNewLabel_2.setBounds(10, 501, 410, 238);
		panel_1.add(lblNewLabel_2);
	}
}
