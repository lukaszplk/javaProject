package Listeners;

import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class DodajObecnoscListener implements ActionListener{
    private Vector<Student> listaStudentow;
    private JTextField obecnoscValue;
    private JFrame frame;
    private JComboBox student;
    private JComboBox kurs;

    public DodajObecnoscListener(JFrame frame, Vector<Student> listaStudentow,JComboBox student, JComboBox kurs, JTextField obecnoscValue) {
        this.listaStudentow = listaStudentow;
        this.student = student;
        this.frame = frame;
        this.kurs = kurs;
        this.obecnoscValue = obecnoscValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        listaStudentow.get(student.getSelectedIndex()).getListaKursow().get(kurs.getSelectedIndex()).getListaOcen().add(obecnoscValue.getText());
        System.out.println("Obecnosc dodana");
        frame.dispose();
    }  
}
