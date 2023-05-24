package Klasy;

import Listeners.DodajStudentaListener;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DodajKursOkno extends JFrame{
    private JPanel panel;
    private JComboBox btn1;
    private JComboBox btn2;
    private JButton dodajStudentaButton;
    private JTextField imieStudentaValue;
    private JTextField nazwiskoStudentaValue;
    private JTextField wiekStudentaValue;
    private JTextField kierunekStudentaValue;
    private Vector<Student> listaStudentow;
    private JFrame frame1;
    
    
    public DodajKursOkno(JFrame frame1, Vector<Kurs> listaKursow, Vector<Student> listaStudentow, JTextField imieStudentaValue,
            JTextField nazwiskoStudentaValue, JTextField wiekStudentaValue, JTextField kierunekStudentaValue){
        super("Okno");
        this.frame1 = frame1;
        this.listaStudentow = listaStudentow;
        this.imieStudentaValue = imieStudentaValue;
        this.nazwiskoStudentaValue = nazwiskoStudentaValue;
        this.wiekStudentaValue = wiekStudentaValue;
        this.kierunekStudentaValue = kierunekStudentaValue;
        System.out.println("Dodajkursokno");
        btn1 = new JComboBox(listaKursow);
        btn2 = new JComboBox(listaKursow);
        dodajStudentaButton = new JButton("dodajStudenta");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(btn1);
        panel.add(btn2);
        panel.add(dodajStudentaButton);
        setContentPane(panel);
        this.setVisible(true);
        this.setSize(300, 150);
        dodajStudentaButton.addActionListener(
                            new DodajStudentaListener(frame1, this, listaStudentow, btn1, btn2, imieStudentaValue, nazwiskoStudentaValue, wiekStudentaValue, kierunekStudentaValue));
    }
}
