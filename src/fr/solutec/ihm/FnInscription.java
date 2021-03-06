/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.ihm;

import fr.solutec.dao.PoidsDao;
import fr.solutec.dao.UserDao;
import static fr.solutec.dao.UserDao.nombre_Inscrit;
import fr.solutec.model.Poids;
import fr.solutec.model.User;
import javax.swing.JOptionPane;

/**
 *
 * @author ESIC
 */
public class FnInscription extends javax.swing.JFrame {

    /**
     * Creates new form FnInscription
     */
    public FnInscription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        P_fond3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        T_Login = new javax.swing.JTextField();
        T_Nom = new javax.swing.JTextField();
        T_Prenom = new javax.swing.JTextField();
        T_Mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        T_Taille = new javax.swing.JTextField();
        T_Poid = new javax.swing.JTextField();
        CB_Genre = new javax.swing.JComboBox<>();
        B_Retour = new javax.swing.JButton();
        B_Valid_Inscri = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        T_Mdp = new javax.swing.JTextField();
        T_Age = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_fond3.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulaire d'inscription :");

        javax.swing.GroupLayout P_fond3Layout = new javax.swing.GroupLayout(P_fond3);
        P_fond3.setLayout(P_fond3Layout);
        P_fond3Layout.setHorizontalGroup(
            P_fond3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_fond3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        P_fond3Layout.setVerticalGroup(
            P_fond3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_fond3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nom :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Prenom :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mail :");

        jLabel7.setText("Genre");

        T_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_LoginActionPerformed(evt);
            }
        });

        T_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_NomActionPerformed(evt);
            }
        });

        T_Mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_MailActionPerformed(evt);
            }
        });

        jLabel8.setText("Taille :");

        jLabel9.setText("Poids actuel :");

        CB_Genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin", " " }));

        B_Retour.setText("Abandon");
        B_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RetourActionPerformed(evt);
            }
        });

        B_Valid_Inscri.setText("Enregistrer");
        B_Valid_Inscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Valid_InscriActionPerformed(evt);
            }
        });

        jLabel10.setText("Mot de passe :");

        T_Mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_MdpActionPerformed(evt);
            }
        });

        jLabel11.setText("Age :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_fond3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Retour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Valid_Inscri))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(159, 159, 159))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(142, 142, 142)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(111, 111, 111)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(T_Nom)
                            .addComponent(T_Prenom)
                            .addComponent(T_Mail)
                            .addComponent(T_Taille)
                            .addComponent(T_Poid)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(T_Mdp)
                            .addComponent(T_Age))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_fond3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(T_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(T_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(T_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(T_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CB_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(T_Taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(T_Poid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(T_Mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Retour)
                    .addComponent(B_Valid_Inscri))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_NomActionPerformed

    private void T_MailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_MailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_MailActionPerformed

    private void T_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_LoginActionPerformed

    
    
    // Retour acceuil
    
    private void B_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RetourActionPerformed
        
        
            FnAcceuil Acceuil = new FnAcceuil();
            this.setVisible(false);
            Acceuil.setVisible(true);
        
        
    }//GEN-LAST:event_B_RetourActionPerformed

    
    
    
    
    private int id_User ;
    private String login;
    private String nom ;
    private String prenom ;
    private String mail;
    private String mdp ; 
    private double taille;
    private int age;
    private String sexe; 
    private double poids;
    
    
    
    // validation et enregistrement variables puis Retour acceuil
    
    private void B_Valid_InscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Valid_InscriActionPerformed

        String login = T_Login.getText ();
        String nom = T_Nom.getText();
        String prenom = T_Prenom.getText();
        String mail = T_Mail.getText();
        String mdp = T_Mdp.getText();
        Double taille = Double.parseDouble( T_Taille.getText());
        int age = Integer.parseInt(T_Age.getText());
        String sexe = CB_Genre.getSelectedItem().toString();
        double poids = Double.parseDouble (T_Poid.getText());
    
        
         
        User user =new User();
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setMail(mail);
        user.setMdp(mdp);
        user.setLogin(login);
        user.setTaille(taille);
        user.setAge(age);
        user.setSexe(sexe);
        


        
        
        try {
            UserDao.insert_Us(user);
          User user1 =  UserDao.user_Inscrit(login, mdp);
      Poids poids1 = new Poids();
poids1.setVal_Poids(poids);
poids1.setUser(user1);
            PoidsDao.insert_Poid(poids1);
            this.setVisible(false);
            FnAcceuil Acceuil = new FnAcceuil();
            this.setVisible(false);
            Acceuil.setVisible(true);
            
            
            
        } catch (Exception e){ JOptionPane.showMessageDialog(rootPane, e.getMessage());}
  
        
    }//GEN-LAST:event_B_Valid_InscriActionPerformed

    private void T_MdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_MdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_MdpActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FnInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FnInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FnInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FnInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FnInscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Retour;
    private javax.swing.JButton B_Valid_Inscri;
    private javax.swing.JComboBox<String> CB_Genre;
    private javax.swing.JPanel P_fond3;
    private javax.swing.JTextField T_Age;
    private javax.swing.JTextField T_Login;
    private javax.swing.JTextField T_Mail;
    private javax.swing.JTextField T_Mdp;
    private javax.swing.JTextField T_Nom;
    private javax.swing.JTextField T_Poid;
    private javax.swing.JTextField T_Prenom;
    private javax.swing.JTextField T_Taille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
