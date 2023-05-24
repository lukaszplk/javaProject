package Listeners;

import Klasy.Kurs;
import Klasy.Liczba;
import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class DodajStudentaListener implements ActionListener{
    private JComboBox btn1;
    private JComboBox btn2;
    private JTextField imieStudentaValue;
    private JTextField nazwiskoStudentaValue;
    private JTextField wiekStudentaValue;
    private JTextField kierunekStudentaValue;
    private Vector<Student> listaStudentow;
    private JFrame frame1;
    private JFrame frame2;

    public DodajStudentaListener(JFrame frame1, JFrame frame2, Vector<Student> listaStudentow, JComboBox btn1, JComboBox btn2, JTextField imieStudentaValue, JTextField nazwiskoStudentaValue, JTextField wiekStudentaValue, JTextField kierunekStudentaValue) {
        this.frame1 = frame1;
        this.frame2 = frame2;
        this.listaStudentow = listaStudentow;
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.imieStudentaValue = imieStudentaValue;
        this.nazwiskoStudentaValue = nazwiskoStudentaValue;
        this.wiekStudentaValue = wiekStudentaValue;
        this.kierunekStudentaValue = kierunekStudentaValue;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Vector<Kurs> listaK = new Vector<Kurs>();
        listaK.add(((Kurs)btn1.getSelectedItem()).kopiuj());
        listaK.add(((Kurs)btn2.getSelectedItem()).kopiuj());
        
        System.out.println("dodawnie studenta");
        listaStudentow.add(new Student(kierunekStudentaValue.getText(),
                                                                listaK,
                                                                imieStudentaValue.getText(),
                                                                nazwiskoStudentaValue.getText(),
                                                                Integer. parseInt(wiekStudentaValue.getText())));
        frame2.dispose();
        frame1.dispose();
    }
    
}
