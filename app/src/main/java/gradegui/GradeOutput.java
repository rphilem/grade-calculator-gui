/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradegui;

import javax.swing.*;

public class GradeOutput extends JFrame {
    public GradeOutput(Student s) {
        setTitle("Grade Output");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel result = new JLabel("Student: " + s.getStudentName() +
            " | Average: " + String.format("%.2f", s.getAverageGrade()));
        result.setBounds(20, 40, 200, 25);
        add(result);

        setVisible(true);
    }
}
