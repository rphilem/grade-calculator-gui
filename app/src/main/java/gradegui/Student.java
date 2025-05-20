/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradegui;

public class Student {
    private String studentName;
    private float quiz1, quiz2, quiz3, averageGrade;

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setQuiz1(float score) {
        this.quiz1 = score;
    }

    public void setQuiz2(float score) {
        this.quiz2 = score;
    }

    public void setQuiz3(float score) {
        this.quiz3 = score;
    }

    public void computeAverage() {
        this.averageGrade = (quiz1 + quiz2 + quiz3) / 3;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getAverageGrade() {
        return averageGrade;
    }
}
