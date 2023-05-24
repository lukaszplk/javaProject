package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Klasy.Str;
import Threads.WyslijWiadomoscThread;
import Threads.ZamknijSerwerThread;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class ZamknijSerwerListener implements ActionListener{
    Str msg;
    WyslijWiadomoscThread thread;
    JButton btn;
    public ZamknijSerwerListener(JButton btn, Str msg, WyslijWiadomoscThread thread){
        this.msg = msg;
        this.thread = thread;
        this.btn = btn;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new ZamknijSerwerThread(msg, thread, btn).start();
    }
    
}
