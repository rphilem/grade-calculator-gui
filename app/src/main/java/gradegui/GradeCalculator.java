/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradegui;

import javax.swing.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame {
    private JTextField txtName, txtQuiz1, txtQuiz2, txtQuiz3, txtAverage;
    private JLabel lblName, lblQuiz1, lblQuiz2, lblQuiz3, lblAverage;
    private JButton computeButton;

    public GradeCalculator() {
        setTitle("Grade Calculator");
        setSize(450, 330); // Matches Milestone layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Layout constants
        int labelX = 30;
        int fieldX = 230;
        int labelWidth = 200;
        int fieldWidth = 150;
        int fieldHeight = 25;
        int spacing = 40;

        // Student Name
        lblName = new JLabel("Student Name:");
        lblName.setBounds(labelX, 30, labelWidth, fieldHeight);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(fieldX, 30, fieldWidth, fieldHeight);
        add(txtName);

        // Quiz 1
        lblQuiz1 = new JLabel("Quiz 1:");
        lblQuiz1.setBounds(labelX, 30 + spacing, labelWidth, fieldHeight);
        add(lblQuiz1);

        txtQuiz1 = new JTextField();
        txtQuiz1.setBounds(fieldX, 30 + spacing, fieldWidth, fieldHeight);
        add(txtQuiz1);

        // Quiz 2
        lblQuiz2 = new JLabel("Quiz 2:");
        lblQuiz2.setBounds(labelX, 30 + spacing * 2, labelWidth, fieldHeight);
        add(lblQuiz2);

        txtQuiz2 = new JTextField();
        txtQuiz2.setBounds(fieldX, 30 + spacing * 2, fieldWidth, fieldHeight);
        add(txtQuiz2);

        // Quiz 3
        lblQuiz3 = new JLabel("Quiz 3:");
        lblQuiz3.setBounds(labelX, 30 + spacing * 3, labelWidth, fieldHeight);
        add(lblQuiz3);

        txtQuiz3 = new JTextField();
        txtQuiz3.setBounds(fieldX, 30 + spacing * 3, fieldWidth, fieldHeight);
        add(txtQuiz3);

        // Average (output)
        lblAverage = new JLabel("Average Grade:");
        lblAverage.setBounds(labelX, 30 + spacing * 4, labelWidth, fieldHeight);
        add(lblAverage);

        txtAverage = new JTextField();
        txtAverage.setBounds(fieldX, 30 + spacing * 4, fieldWidth, fieldHeight);
        txtAverage.setEditable(false);
        add(txtAverage);

        // Compute Button
        computeButton = new JButton("Compute");
        computeButton.setBounds((450 - 150) / 2, 30 + spacing * 5, 150, 30);
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
            String name = txtName.getText();
            float q1 = Float.parseFloat(txtQuiz1.getText());
            float q2 = Float.parseFloat(txtQuiz2.getText());
            float q3 = Float.parseFloat(txtQuiz3.getText());

            Student s = new Student();
            s.setStudentName(name);
            s.setQuiz1(q1);
            s.setQuiz2(q2);
            s.setQuiz3(q3);
            s.computeAverage();

            txtAverage.setText(String.format("%.2f", s.getAverageGrade()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid quiz scores.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}
