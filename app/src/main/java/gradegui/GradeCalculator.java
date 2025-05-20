/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradegui;

import javax.swing.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame {
    private JTextField nameField, quiz1Field, quiz2Field, quiz3Field;
    private JButton computeButton;

    public GradeCalculator() {
        setTitle("Grade Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Labels and Text Fields
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(10, 10, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 10, 150, 25);
        add(nameField);

        JLabel q1Label = new JLabel("Quiz 1:");
        q1Label.setBounds(10, 45, 100, 25);
        add(q1Label);

        quiz1Field = new JTextField();
        quiz1Field.setBounds(120, 45, 150, 25);
        add(quiz1Field);

        JLabel q2Label = new JLabel("Quiz 2:");
        q2Label.setBounds(10, 80, 100, 25);
        add(q2Label);

        quiz2Field = new JTextField();
        quiz2Field.setBounds(120, 80, 150, 25);
        add(quiz2Field);

        JLabel q3Label = new JLabel("Quiz 3:");
        q3Label.setBounds(10, 115, 100, 25);
        add(q3Label);

        quiz3Field = new JTextField();
        quiz3Field.setBounds(120, 115, 150, 25);
        add(quiz3Field);

        computeButton = new JButton("Compute");
        computeButton.setBounds(90, 160, 120, 30);
        add(computeButton);

        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                computeGrade();
            }
        });

        setVisible(true);
    }

    private void computeGrade() {
        try {
            String name = nameField.getText();
            float q1 = Float.parseFloat(quiz1Field.getText());
            float q2 = Float.parseFloat(quiz2Field.getText());
            float q3 = Float.parseFloat(quiz3Field.getText());

            Student s = new Student();
            s.setStudentName(name);
            s.setQuiz1(q1);
            s.setQuiz2(q2);
            s.setQuiz3(q3);
            s.computeAverage();

            new GradeOutput(s);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid quiz scores.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}
