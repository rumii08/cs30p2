package chapter11cs30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studentsemesteraverage extends JFrame {

    private JTextField nameField;
    private JTextField[] courseFields = new JTextField[6];
    private JTextField[] gradeFields = new JTextField[6];
    private JTextField avgField;

    public studentsemesteraverage() {
        super("Student Semester Average");

        setLayout(new BorderLayout());

        // ---------------- TOP PANEL ----------------
        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        topPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        topPanel.add(nameField);
        add(topPanel, BorderLayout.NORTH);

        // ---------------- CENTER PANEL ----------------
        JPanel centerPanel = new JPanel(new GridLayout(7, 3, 5, 5));
        centerPanel.add(new JLabel("Course"));
        centerPanel.add(new JLabel("Grade"));
        centerPanel.add(new JLabel(""));

        for (int i = 0; i < 6; i++) {
            courseFields[i] = new JTextField();
            gradeFields[i] = new JTextField();

            centerPanel.add(courseFields[i]);
            centerPanel.add(gradeFields[i]);
            centerPanel.add(new JLabel(""));
        }

        add(centerPanel, BorderLayout.CENTER);

        // ---------------- BOTTOM PANEL ----------------
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3));

        JButton calcBtn = new JButton("Calculate Average");
        JButton clearBtn = new JButton("Clear");

        avgField = new JTextField();
        avgField.setEditable(false);

        bottomPanel.add(calcBtn);
        bottomPanel.add(clearBtn);
        bottomPanel.add(avgField);

        add(bottomPanel, BorderLayout.SOUTH);

        // ---------------- BUTTON LISTENERS ----------------
        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAverage();
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // ---------------- FRAME SETT2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222INGS ----------------
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void calculateAverage() {
        double total = 0;
        int count = 0;

        for (JTextField gradeField : gradeFields) {
            try {
                double g = Double.parseDouble(gradeField.getText());
                total += g;
                count++;
            } catch (Exception ignored) {}
        }

        if (count > 0) {
            avgField.setText(String.format("%.2f", total / count));
        } else {
            avgField.setText("No grades");
        }
    }

    private void clearFields() {
        nameField.setText("");
        avgField.setText("");

        for (int i = 0; i < 6; i++) {
            courseFields[i].setText("");
            gradeFields[i].setText("");
        }
    }

    public static void main(String[] args) {
        new studentsemesteraverage();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


