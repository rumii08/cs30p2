package chapter11cs30;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class myfilept2of2 {

	private JFrame frame;
    private static final String FILE_PATH = "C:\\Users\\38086508\\git\\cs30p2\\chapter11cs30\\src\\chapter11cs30\\zzz.txt";
	private File textFile;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myfilept2of2 window = new myfilept2of2();
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
	public myfilept2of2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		textFile = new File(FILE_PATH);
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 433, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel disp = new JLabel("");
		disp.setBounds(124, 16, 0, 0);
		panel.add(disp);
		
		JButton btnNewButton = new JButton("Keep File");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(TextFile.exists())
					
					disp.setText("The file already exists ");
				else 
					
					try
				
				catch(IOExeption e)
				
				disp.setText("Error : " + e. getMessage);
				System.err.println()			
				
				if textFile.delete()
				
				
			}
		});
		btnNewButton.setBounds(63, 115, 89, 23);
		panel.add(btnNewButton);
	}
}
