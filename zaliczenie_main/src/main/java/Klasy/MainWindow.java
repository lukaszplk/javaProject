/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Klasy;

import Listeners.NastepnyStudentListener;
import Listeners.ZamknijOknoListener;
import Listeners.ZamknijSerwerListener;
import Threads.NasluchiwaczThread;
import Threads.WyslijWiadomoscThread;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import listeners.GenRaportListener;

/**
 *
 * @author mrluk
 */
public class MainWindow extends javax.swing.JFrame {
    Vector<Kurs> listaKursow = new Vector<Kurs>();
    Vector<Wykladowca> listaWykladowcow = new Vector<Wykladowca>();
    Vector<Student> listaStudentow = new Vector<Student>();
    Vector<Zadanie> listaZadan = new Vector<Zadanie>();
    WyslijWiadomoscThread thread;
    private Str msg = new Str("");
    
    
    public MainWindow() {
        initComponents();
        listaKursow.add(new Kurs("kurs1", 10));
        listaKursow.add(new Kurs("kurs2", 10));
        listaStudentow.add(new Student("infa", listaKursow, "jan", "kowalski",23));
        this.setVisible(true);
        nastepnyStudentButton.addActionListener(new NastepnyStudentListener(listaStudentow, imieStudentValue, nazwiskoStudentValue, kierunekStudentValue));
        anulujButton.addActionListener(new ZamknijOknoListener(this));
        generujRaportButton.addActionListener(new GenRaportListener(listaStudentow, generujRaportButton));
        SocketKlienta socketKlienta = new SocketKlienta();
        thread = new WyslijWiadomoscThread(socketKlienta.getOut(), msg);
        thread.start();
        new NasluchiwaczThread(out,
                                socketKlienta.getIn(),
                                socketKlienta.getOut(),
                                socketKlienta.getSocket()).start();
        zamknijSerwer.addActionListener(new ZamknijSerwerListener(zamknijSerwer, msg, thread));
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pokazOcenyButton = new javax.swing.JButton();
        dodajOceneButton = new javax.swing.JButton();
        pokazObecnosciButton = new javax.swing.JButton();
        dodajObecnoscButton = new javax.swing.JButton();
        dodajKursButton = new javax.swing.JButton();
        usunKursButton = new javax.swing.JButton();
        dodajStudentaButton = new javax.swing.JButton();
        usunStudentaButton = new javax.swing.JButton();
        anulujButton = new javax.swing.JButton();
        generujRaportButton = new javax.swing.JButton();
        imieStudentValue = new javax.swing.JTextField();
        nazwiskoStudentValue = new javax.swing.JTextField();
        kierunekStudentValue = new javax.swing.JTextField();
        nastepnyStudentButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        out = new javax.swing.JTextArea();
        zamknijSerwer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Szczegoly studenta");

        jLabel2.setText("Imie");

        jLabel3.setText("kierunek");

        jLabel4.setText("Nazwisko");

        pokazOcenyButton.setText("pokazOceny");
        pokazOcenyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazOcenyButtonActionPerformed(evt);
            }
        });

        dodajOceneButton.setText("dodajOcene");
        dodajOceneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajOceneButtonActionPerformed(evt);
            }
        });

        pokazObecnosciButton.setText("pokazObecnosci");
        pokazObecnosciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazObecnosciButtonActionPerformed(evt);
            }
        });

        dodajObecnoscButton.setText("dodajObecnosc");
        dodajObecnoscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajObecnoscButtonActionPerformed(evt);
            }
        });

        dodajKursButton.setText("dodajKurs");
        dodajKursButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajKursButtonActionPerformed(evt);
            }
        });

        usunKursButton.setText("usunKurs");
        usunKursButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunKursButtonActionPerformed(evt);
            }
        });

        dodajStudentaButton.setText("dodajStudenta");
        dodajStudentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajStudentaButtonActionPerformed(evt);
            }
        });

        usunStudentaButton.setText("usunStudenta");
        usunStudentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunStudentaButtonActionPerformed(evt);
            }
        });

        anulujButton.setText("Zakoncz");
        anulujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujButtonActionPerformed(evt);
            }
        });

        generujRaportButton.setText("generujRaport");
        generujRaportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generujRaportButtonActionPerformed(evt);
            }
        });

        imieStudentValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imieStudentValueActionPerformed(evt);
            }
        });

        nazwiskoStudentValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwiskoStudentValueActionPerformed(evt);
            }
        });

        kierunekStudentValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kierunekStudentValueActionPerformed(evt);
            }
        });

        nastepnyStudentButton.setText("nastepnyStudent");
        nastepnyStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nastepnyStudentButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Serwer");

        out.setColumns(20);
        out.setRows(5);
        jScrollPane1.setViewportView(out);

        zamknijSerwer.setText("zamknij serwer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(0, 511, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nazwiskoStudentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(kierunekStudentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(imieStudentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(dodajKursButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pokazObecnosciButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pokazOcenyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(dodajObecnoscButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dodajOceneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(usunKursButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(33, 33, 33)
                                            .addComponent(zamknijSerwer, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(nastepnyStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(dodajStudentaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(usunStudentaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(generujRaportButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(anulujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imieStudentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nazwiskoStudentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nastepnyStudentButton)
                    .addComponent(kierunekStudentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokazOcenyButton)
                    .addComponent(dodajOceneButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokazObecnosciButton)
                    .addComponent(dodajObecnoscButton)
                    .addComponent(dodajStudentaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usunStudentaButton)
                    .addComponent(dodajKursButton)
                    .addComponent(usunKursButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(zamknijSerwer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anulujButton)
                            .addComponent(generujRaportButton)))
                    .addComponent(jScrollPane1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajStudentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajStudentaButtonActionPerformed
        new nowyStudentOkno(listaStudentow, listaKursow);
    }//GEN-LAST:event_dodajStudentaButtonActionPerformed

    private void imieStudentValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imieStudentValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imieStudentValueActionPerformed

    private void nazwiskoStudentValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwiskoStudentValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwiskoStudentValueActionPerformed

    private void usunStudentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunStudentaButtonActionPerformed
        new UsunStudentaOkno(listaStudentow);
    }//GEN-LAST:event_usunStudentaButtonActionPerformed

    private void nastepnyStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nastepnyStudentButtonActionPerformed
        
    }//GEN-LAST:event_nastepnyStudentButtonActionPerformed

    private void kierunekStudentValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kierunekStudentValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kierunekStudentValueActionPerformed

    private void dodajOceneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajOceneButtonActionPerformed
        new DodajOceneOkno(listaStudentow);
    }//GEN-LAST:event_dodajOceneButtonActionPerformed

    private void pokazOcenyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazOcenyButtonActionPerformed
        new PokazOcenyOkno(listaStudentow);
    }//GEN-LAST:event_pokazOcenyButtonActionPerformed

    private void pokazObecnosciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazObecnosciButtonActionPerformed
        new PokazObecnosciOkno(listaStudentow);
    }//GEN-LAST:event_pokazObecnosciButtonActionPerformed

    private void dodajObecnoscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajObecnoscButtonActionPerformed
        new DodajObecnoscOkno(listaStudentow);
    }//GEN-LAST:event_dodajObecnoscButtonActionPerformed

    private void dodajKursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajKursButtonActionPerformed
        new UtworzKursOkno(listaKursow);
    }//GEN-LAST:event_dodajKursButtonActionPerformed

    private void usunKursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunKursButtonActionPerformed
        new UsunKursOkno(listaKursow);
    }//GEN-LAST:event_usunKursButtonActionPerformed

    private void generujRaportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generujRaportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generujRaportButtonActionPerformed

    private void anulujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujButtonActionPerformed
        
        
        zamknijSerwer.doClick();
        this.dispose();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        thread.interrupt();
        
        System.exit(0);
    }//GEN-LAST:event_anulujButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anulujButton;
    private javax.swing.JButton dodajKursButton;
    private javax.swing.JButton dodajObecnoscButton;
    private javax.swing.JButton dodajOceneButton;
    private javax.swing.JButton dodajStudentaButton;
    private javax.swing.JButton generujRaportButton;
    private javax.swing.JTextField imieStudentValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kierunekStudentValue;
    private javax.swing.JButton nastepnyStudentButton;
    private javax.swing.JTextField nazwiskoStudentValue;
    private javax.swing.JTextArea out;
    private javax.swing.JButton pokazObecnosciButton;
    private javax.swing.JButton pokazOcenyButton;
    private javax.swing.JButton usunKursButton;
    private javax.swing.JButton usunStudentaButton;
    private javax.swing.JButton zamknijSerwer;
    // End of variables declaration//GEN-END:variables
}
