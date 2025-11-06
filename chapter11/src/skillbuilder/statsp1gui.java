package skillbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class statsp1gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statsp1gui window = new statsp1gui();
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
	public statsp1gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Student = new JLabel("Student Text Scores");
		Student.setForeground(new Color(0, 128, 192));
		Student.setFont(new Font("Tahoma", Font.PLAIN, 28));
		Student.setBounds(95, 22, 259, 34);
		panel.add(Student);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(40);
		textArea.setEditable(false);
		textArea.setBounds(10, 67, 458, 189);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("analyze scores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(153, 264, 163, 23);
		panel.add(btnNewButton);
	}
}
