package Threads;

import Klasy.Str;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JTextField;

public class WyslijWiadomoscThread extends Thread{
    private JTextField textField;
    private PrintWriter out;
    private Str msg;

    public WyslijWiadomoscThread(PrintWriter out, Str msg) {       
        this.out = out;
        this.msg = msg;
    }

    public PrintWriter getOut() {
        return out;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }
    
    
    @Override
    public void run(){
        while(true){
          try{
                System.out.println("Wysylam");
                Thread.sleep(5000);
                out.println(msg.getMsg());

            }
            catch(Exception ex){
                System.out.println("Watek sie zatrzymal");
                break;
            }  
        }    
    } 
}
