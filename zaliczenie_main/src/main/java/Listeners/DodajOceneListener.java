package Listeners;

import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class DodajOceneListener implements ActionListener{
    private Vector<Student> listaStudentow;
    private JTextField gradeValue;
    private JFrame frame;
    private JComboBox student;
    private JComboBox kurs;

    public DodajOceneListener(JFrame frame, Vector<Student> listaStudentow,JComboBox student, JComboBox kurs, JTextField gradeValue) {
        this.listaStudentow = listaStudentow;
        this.student = student;
        this.frame = frame;
        this.kurs = kurs;
        this.gradeValue = gradeValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        listaStudentow.get(student.getSelectedIndex()).getListaKursow().get(kurs.getSelectedIndex()).getListaOcen().add(gradeValue.getText());
        System.out.println("Ocena dodana");
        frame.dispose();
    }  
}
