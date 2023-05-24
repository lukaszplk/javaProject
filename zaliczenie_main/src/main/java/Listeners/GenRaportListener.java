package listeners;

import Klasy.Kurs;
import Klasy.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.JButton;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import threads.genRaportThred;

public class GenRaportListener implements ActionListener{
    private Vector<Student> listaStudentow;
    private JButton btn;

    
    public GenRaportListener(Vector<Student> listaStudentow, JButton btn){
        this.listaStudentow = listaStudentow;
        this.btn = btn;
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter( new FileNameExtensionFilter("Pliki tekstowe","txt","rtf"));
        
        
        fileChooser.getSelectedFile();
        fileChooser.showOpenDialog(fileChooser);
        
        try {
            System.out.println(fileChooser.getSelectedFile().getPath());
            System.out.println();
            FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile().getPath());
            for(Student s : listaStudentow){
                fileWriter.write(s.toString() + "\n");
                for(Kurs k : s.getListaKursow()){
                    fileWriter.write(k.getNazwaKursu() + "\n");
                    fileWriter.write("oceny:\n");
                    for(String ocena : k.getListaOcen()){
                        fileWriter.write(ocena + " ");
                    }
                    fileWriter.write("obecnosci:\n");
                    for(String obecnosc : k.getListaObecnosci()){
                        fileWriter.write(obecnosc + " ");
                    }
                    
                }
            }
            
            
            fileWriter.close();
            
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        genRaportThred t = new genRaportThred(btn);
        t.start();
    }
    
}
