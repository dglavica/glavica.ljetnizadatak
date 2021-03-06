/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ObradaTvrtka;
import javax.swing.DefaultListModel;
import model.Tvrtka;

/**
 *
 * @author Avalg
 */
public class FormaTvrtka extends javax.swing.JFrame {

    private ObradaTvrtka obrada;
    private Tvrtka tvrtka;

    /**
     * Creates new form FormaTvrtka
     */
    public FormaTvrtka() {
        initComponents();
        obrada = new ObradaTvrtka();
        tvrtka = new Tvrtka();

        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstTvrtke = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNazivTvrtke = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVlasnik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDjelatnost = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lstTvrtke.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTvrtkeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTvrtke);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Popis tvrtki");

        jLabel2.setText("Naziv tvrtke");

        jLabel3.setText("OIB");

        jLabel4.setText("Vlasnik");

        jLabel5.setText("Djelatnost");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(39, 39, 39)
                        .addComponent(btnPromjeni)
                        .addGap(37, 37, 37)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtNazivTvrtke)
                            .addComponent(jLabel3)
                            .addComponent(txtOib)
                            .addComponent(jLabel4)
                            .addComponent(txtVlasnik, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(txtDjelatnost))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNazivTvrtke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(txtVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDjelatnost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObrisi))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstTvrtkeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTvrtkeValueChanged
        try {
            txtNazivTvrtke.setText(lstTvrtke.getSelectedValue().getNazivTvrtke());
            txtOib.setText(lstTvrtke.getSelectedValue().getOib());
            txtVlasnik.setText(lstTvrtke.getSelectedValue().getVlasnik());
            txtDjelatnost.setText(lstTvrtke.getSelectedValue().getDjelatnost());
        } catch (Exception e) {

        }
    }//GEN-LAST:event_lstTvrtkeValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        tvrtka.setNazivTvrtke(txtNazivTvrtke.getText());
        tvrtka.setOib(txtOib.getText());
        tvrtka.setVlasnik(txtVlasnik.getText());
        tvrtka.setDjelatnost(txtDjelatnost.getText());
        obrada.kreirajTvrtka(tvrtka);
        ucitaj();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        tvrtka.setSifra(lstTvrtke.getSelectedValue().getSifra());
        tvrtka.setNazivTvrtke(txtNazivTvrtke.getText());
        tvrtka.setOib(txtOib.getText());
        tvrtka.setVlasnik(txtVlasnik.getText());
        tvrtka.setDjelatnost(txtDjelatnost.getText());
        obrada.promjeniTvrtka(tvrtka);
        ucitaj();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        tvrtka.setSifra(lstTvrtke.getSelectedValue().getSifra());
        obrada.obrisiTvrtka(tvrtka);
        ucitaj();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        obrada.zatvoriVezu();
    }//GEN-LAST:event_formWindowClosed

    private void ucitaj() {
        DefaultListModel<Tvrtka> tv = new DefaultListModel<>();
        lstTvrtke.setModel(tv);
        for (Tvrtka t : obrada.getTvrtke()) {
            tv.addElement(t);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Tvrtka> lstTvrtke;
    private javax.swing.JTextField txtDjelatnost;
    private javax.swing.JTextField txtNazivTvrtke;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtVlasnik;
    // End of variables declaration//GEN-END:variables
}
