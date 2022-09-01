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


public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
		panel.setBackground(new Color(150, 191, 120));
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\PitecoLogo\\1.png"));
		
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
		
		JButton btnAdm = new JButton("Administrador");
		btnAdm.setForeground(Color.WHITE);
		btnAdm.setBorder(null);
		btnAdm.setBackground(new Color(150, 191, 120));
		btnAdm.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
		btnAdm.setBounds(122, 386, 468, 70);
		panel_1.add(btnAdm);
		
		JButton btnVendedor = new JButton("Vendedor\r\n");
		btnVendedor.setPreferredSize(new Dimension(99, 23));
		btnVendedor.setBorder(null);
		btnVendedor.setForeground(Color.WHITE);
		btnVendedor.setBackground(new Color(150, 191, 120));
		btnVendedor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
		btnVendedor.setBounds(122, 467, 468, 70);
		panel_1.add(btnVendedor);
	}
}
