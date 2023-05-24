
package Listeners;

import Klasy.Kurs;
import Klasy.Liczba;
import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class UsunKursListener implements ActionListener{
    private Vector<Kurs> listaKursow;
    private JComboBox kurs;
    private JFrame frame;
    
    
    public UsunKursListener(JFrame frame, Vector<Kurs> listaKursow, JComboBox kurs){
        this.listaKursow = listaKursow;
        this.frame = frame;
        this.kurs = kurs;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        listaKursow.remove(kurs.getSelectedItem());
        frame.dispose();
    }
}
