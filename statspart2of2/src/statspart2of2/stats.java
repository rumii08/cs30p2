package statspart2of2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class stats {

	private JFrame frame;
	private JTextField txtEnterTextField;
	private JTextField txtEnterNumberOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stats window = new stats();
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
	public stats() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 10);
		frame.getContentPane().add(panel);
		
		txtEnterTextField = new JTextField();
		txtEnterTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			if(file name;)
			
			
			
		});
		txtEnterTextField.setText("enter file name here");
		txtEnterTextField.setBounds(10, 10, 220, 47);
		frame.getContentPane().add(txtEnterTextField);
		txtEnterTextField.setColumns(10);
		
		txtEnterNumberOf = new JTextField();
		txtEnterNumberOf.setText("enter number of students here");
		txtEnterNumberOf.setBounds(10, 68, 225, 56);
		frame.getContentPane().add(txtEnterNumberOf);
		txtEnterNumberOf.setColumns(10);
		
		JButton btnNewButton = new JButton("create data file");
		btnNewButton.setBounds(250, 16, 142, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("analyze scores");
		btnNewButton_1.setBounds(253, 77, 126, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 135, 404, 115);
		frame.getContentPane().add(textArea);
	}
}
