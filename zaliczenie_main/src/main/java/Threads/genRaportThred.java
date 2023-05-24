package threads;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;


public class genRaportThred extends Thread{
    private JButton przycisk;

    public JButton getPrzycisk() {
        return przycisk;
    }

    public void setPrzycisk(JButton przycisk) {
        this.przycisk = przycisk;
    }
    


    public genRaportThred(JButton przycisk) {
        this.przycisk = przycisk; 
    }
    
    
    @Override
    public void run(){
        
        try{
            
            getPrzycisk().setEnabled(false); 
            Thread.sleep(5000);

        }
        catch(Exception ex){
            System.out.println("Watek sie zatrzymal");
            
        }
        finally{
            getPrzycisk().setEnabled(true);
            
        }
        
    }
}
