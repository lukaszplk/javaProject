package Klasy;

import Listeners.UsunStudentaListener;
import Listeners.ZamknijOknoListener;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class UsunStudentaOkno extends JFrame{
    private JPanel panel;
    private JComboBox studenciButton;
    private JButton zamknijButton;
    private JButton usunButton;
    private Vector<Student> listaStudentow;

    
    public UsunStudentaOkno(Vector<Student> listaStudentow){
        super("Usuwanie studenta");
        System.out.println("Usuwanie studenta");
        studenciButton = new JComboBox(listaStudentow);
        zamknijButton = new JButton("Zamknij");
        usunButton = new JButton("Usun");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(studenciButton);
        panel.add(usunButton);
        panel.add(zamknijButton);
        setContentPane(panel);
        this.setSize(500, 100);
        this.setVisible(true); 
        this.listaStudentow = listaStudentow;
        usunButton.addActionListener(new UsunStudentaListener(this, listaStudentow, studenciButton));
        zamknijButton.addActionListener(new ZamknijOknoListener(this));
    }
 
}
