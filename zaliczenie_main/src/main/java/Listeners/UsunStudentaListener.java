
package Listeners;

import Klasy.Liczba;
import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class UsunStudentaListener implements ActionListener{
    private Vector<Student> listaStudentow;
    private JComboBox student;
    private JFrame frame;
    
    public UsunStudentaListener(JFrame frame, Vector<Student> listaStudentow, JComboBox student){
        this.listaStudentow = listaStudentow;
        this.student = student;
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        listaStudentow.remove(student.getSelectedItem());
        frame.dispose();
    }
}
