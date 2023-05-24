package Threads;

import Klasy.SocketKlienta;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;


public class NasluchiwaczThread extends Thread{
    private BufferedReader in;
    private JTextArea output;
    private PrintWriter out;
    private Socket socket;

    public BufferedReader getIn() {
        return in;
    }

    public void setIn(BufferedReader in) {
        this.in = in;
    }

    public JTextArea getOutput() {
        return output;
    }

    public void setOutput(JTextArea output) {
        this.output = output;
    }

    public PrintWriter getOut() {
        return out;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public NasluchiwaczThread(JTextArea output, BufferedReader in, PrintWriter out, Socket socket) {
        this.in = in;
        this.output = output;
        this.out = out;
        this.socket = socket;
    }
    
    
    @Override 
    public void run(){
        String line;
        while(true){
            try {
                line = in.readLine();
                if(line.equals(SocketKlienta.KONIEC_POLACZENIA)){
                    break;
                }else{
                    getOutput().append(line + "\n");
                }
                
            } catch (IOException ex) {
                System.out.println("Blad przy czytaniu wiadomosci");
            }
        }
        try{
            getIn().close();
            getOut().close();
            getSocket().close();
            System.out.println("Wszsytko zamkniete");
        }catch (Exception ex){
            System.out.println("blad przy zamykaniu polaczenia");
        }
    }
}
