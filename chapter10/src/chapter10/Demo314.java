package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo314 {

	private JFrame frame;
	private JTextField ln;

	private JTextField fn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo314 window = new Demo314();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo314() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	
	
	{
		ImageIcon west = new ImageIcon("../chapter10/src/chapter10/Western.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 11, 534, 383);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			
		{
				if (fn.getText().equals("first name"))
				     fn.setText("");
			}
		});
		fn.setBounds(51, 5, 176, 31);
		fn.setForeground(new Color(0, 0, 0));
		fn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fn.setText("first name");
		panel.add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			
		{
				if (ln.getText().equals("last name"))
				     ln.setText("");
			}
		});
		ln.setBounds(232, 5, 176, 31);
		ln.setForeground(new Color(0, 0, 0));
		ln.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ln.setText("last name");
		panel.add(ln);
		ln.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(413, 9, 111, 174);
		panel.add(btnNewButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(61, 47, 143, 44);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select school", "", "crecent heights", "lb pearson", "james fowler", "western"}));
		comboBox_1.setForeground(new Color(0, 64, 64));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(71, 102, 318, 51);
		panel.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(232, 47, 176, 44);
		panel.add(comboBox);
		
		JLabel IMGA = new JLabel("");
		IMGA.setBounds(51, 170, 195, 89);
		panel.add(IMGA);
		IMGA.setIcon (west);
		
}
}
