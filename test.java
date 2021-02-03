import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 456);
		setTitle("Real Estate Adda Interface");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 255, 434, -251);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222, 40));
		panel_1.setBounds(0, 0, 744, 423);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainFrame.main(null);
				setVisible(false);
			}
		});
		panel_2.setBackground(new Color(0, 0, 0, 40));
		panel_2.setBounds(0, 0, 744, 423);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Made by:");
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(665, 375, 69, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblAbhinavSinghAryan = new JLabel("Abhinav Singh, Aryan Sharma, Diwakar Bharti, Dheeraj Kumar");
		lblAbhinavSinghAryan.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
		lblAbhinavSinghAryan.setBackground(Color.LIGHT_GRAY);
		lblAbhinavSinghAryan.setBounds(317, 390, 417, 22);
		panel_2.add(lblAbhinavSinghAryan);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Tanishq\\Pictures\\Title.jpg"));
		lblNewLabel.setBounds(0, 0, 753, 429);
		contentPane.add(lblNewLabel);
	}

}
