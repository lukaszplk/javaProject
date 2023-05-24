package Threads;

import Klasy.SocketKlienta;
import Klasy.Str;
import Listeners.ZamknijSerwerListener;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class ZamknijSerwerThread extends Thread {
    Str msg;
    WyslijWiadomoscThread thread;
    JButton btn;

    public ZamknijSerwerThread(Str msg, WyslijWiadomoscThread thread, JButton btn) {
        this.msg = msg;
        this.thread = thread;
        this.btn = btn;
    }
    
    @Override 
    public void run(){
        btn.setEnabled(false);
        System.out.println("Msg = Koniec");
        this.msg.setMsg("Koniec");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(ZamknijSerwerListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        thread.interrupt();
        btn.setEnabled(true);
    }
}
