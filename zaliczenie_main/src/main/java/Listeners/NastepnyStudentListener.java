package Listeners;

import Klasy.Liczba;
import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JTextField;


public class NastepnyStudentListener implements ActionListener{
    private Vector<Student> listaStudentow;
    private static int currentIndex = 0;
    private JTextField imieValue;
    private JTextField nazwiskoValue;
    private JTextField kierunekValue;

    public NastepnyStudentListener(Vector<Student> listaSTudentow, JTextField imieValue, JTextField nazwiskoValue, JTextField kierunekValue) {
        this.listaStudentow = listaSTudentow;
        this.imieValue = imieValue;      
        this.nazwiskoValue = nazwiskoValue;
        this.kierunekValue = kierunekValue;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("current index" + currentIndex);
        System.out.println("liczba studentow" + listaStudentow.size());
        if(currentIndex>=listaStudentow.size()){
            currentIndex=0;
        }
        imieValue.setText(listaStudentow.get(currentIndex).getImie());
        nazwiskoValue.setText(listaStudentow.get(currentIndex).getNazwisko());
        kierunekValue.setText(listaStudentow.get(currentIndex).getKierunekStudenta());
        
        currentIndex++;
    }
    
}
