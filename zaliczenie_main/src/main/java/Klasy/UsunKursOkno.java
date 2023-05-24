package Klasy;

import Listeners.UsunKursListener;
import Listeners.UsunStudentaListener;
import Listeners.ZamknijOknoListener;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class UsunKursOkno extends JFrame{
    private JPanel panel;
    private JComboBox kursyButton;
    private JButton zamknijButton;
    private JButton usunButton;
    

    
    public UsunKursOkno(Vector<Kurs> listaKursow){
        super("Usuwanie kursu");
        System.out.println("Usuwanie kursu");
        kursyButton = new JComboBox(listaKursow);
        zamknijButton = new JButton("Zamknij");
        usunButton = new JButton("Usun");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(kursyButton);
        panel.add(usunButton);
        panel.add(zamknijButton);
        setContentPane(panel);
        this.setSize(500, 100);
        this.setVisible(true); 

        usunButton.addActionListener(new UsunKursListener(this, listaKursow, kursyButton));
        zamknijButton.addActionListener(new ZamknijOknoListener(this));
    }
}
