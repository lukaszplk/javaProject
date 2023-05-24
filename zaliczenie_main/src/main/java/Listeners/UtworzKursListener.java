package Listeners;

import Klasy.Kurs;
import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class UtworzKursListener implements ActionListener{
    private JTextField nazwa;
    private JTextField godziny;
    private Vector<Kurs> listaKursow;
    private JFrame frame;

    public UtworzKursListener(JFrame frame, JTextField nazwa, JTextField godziny, Vector<Kurs> listaKursow) {
        this.nazwa = nazwa;
        this.frame = frame;
        this.godziny = godziny;
        this.listaKursow = listaKursow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        System.out.println("dodawnie kursu");
        listaKursow.add(new Kurs(nazwa.getText(), Integer.parseInt(godziny.getText())));
        frame.dispose();
    }

    
    
    
}
