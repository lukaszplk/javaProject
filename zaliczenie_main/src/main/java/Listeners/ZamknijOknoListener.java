package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ZamknijOknoListener implements ActionListener{
    private JFrame frame;
    
    public ZamknijOknoListener(JFrame okno){
        this.frame = okno;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
    }
    
}
