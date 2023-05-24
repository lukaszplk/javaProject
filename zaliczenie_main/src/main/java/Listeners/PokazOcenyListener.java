package Listeners;

import Klasy.Student;
import Klasy.Kurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTextArea;


public class PokazOcenyListener implements ActionListener{
    private Vector<Student> listaStudentow;
    private JComboBox student;
    private JTextArea output;

    public PokazOcenyListener(Vector<Student> listaSTudentow, JComboBox student, JTextArea output) {
        this.listaStudentow = listaSTudentow;
        this.student = student;
        this.output = output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Kurs k : listaStudentow.get(student.getSelectedIndex()).getListaKursow()){
            output.append(k.getNazwaKursu() + "\n");
            for(String ocena: k.getListaOcen()){
                
                output.append(ocena + " ");
                    
            }
            output.append("\n");
                    
                
        }
    }
}
    

