/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warb;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Fabz Don
 */
public class addstudent extends javax.swing.JFrame {
private static SessionFactory factory;
    /**
     * Creates new form addstudent
     */
    public addstudent() {
        initComponents();
        this.setTitle("Add Student");
        updatetable();
    }
    
    private void savestudent(){
        try{
         Session s1 = connection.Controller.getSessionFactory().openSession();   
         Transaction tr = s1.beginTransaction(); 
         crud.Student student = new crud.Student();
         
         student.setFirstName(txtfname.getText());
         student.setMiddleName(txtmname.getText());
         student.setLastName(txtlname.getText());
         student.setBirthCertNum(txtbirthcertnum.getText());
         
         //student.setDob(txtdob.getText());
         student.setDareReg(null);
         student.setSportsHouse(null);
         student.setClub(null);
         student.setGender(null);
         student.setStudentAddress(null);
         student.setMotherName(null);
         student.setMotherOccupation(null);
         student.setMotherTel(null);
         student.setFatherName(null);
          student.setFatherTel(null);
         student.setFatherAddress(null);
         student.setGuardianName(null);
         student.setGuardianOccupation(null);
         student.setGuardianAddress(null);
         student.setGuardianTel(null);
         
        
         
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    void updatetable(){
        
        try{
            Session s1 = connection.Controller.getSessionFactory().openSession();
        Transaction tr = s1.beginTransaction();
         List purchases = s1.createQuery("FROM Student" ).list(); 
         for (Iterator iterator = purchases.iterator(); iterator.hasNext();){
         crud.Student student1 = (crud.Student) iterator.next(); 
         String firstname = student1.getFirstName();
         String middlename = student1.getMiddleName();
         String lastname = student1.getLastName();
         String birthcertnum = student1.getBirthCertNum();
         String house = student1.getSportsHouse();
       
              String tbdata [] = {firstname,middlename,lastname,birthcertnum,house};
         DefaultTableModel tbmodel = (DefaultTableModel)studenttable.getModel();
         tbmodel.addRow(tbdata);
            
        }
        }
         catch(Exception e){
            e.printStackTrace();
        }
        
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studenttable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbirthcertnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdatereg = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtsports = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtcllub = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtstuaddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtmothername = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtmotheroccupation = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtmothertele = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtfathername = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtfathertelephone = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtfatheraddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtguardianname = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtguardianoccupation = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtguardianaddress = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtguardiantele = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(15, 48, 99));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\home 40 px.png")); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 110));

        jButton4.setBackground(new java.awt.Color(247, 249, 251));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\icons8-add-user-male-48.png")); // NOI18N
        jButton4.setText("Add Student");
        jButton4.setBorder(null);
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 110));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\icons8-health-64.png")); // NOI18N
        jButton2.setText("Health");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, 110));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\icons8-settings-64.png")); // NOI18N
        jButton5.setText("Settings");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 250, 110));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\icons8-purchase-order-64.png")); // NOI18N
        jButton6.setText("Assessment");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 250, 110));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\icons8-attendance-64.png")); // NOI18N
        jButton7.setText("Attendance");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 250, 110));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 730));

        jPanel2.setBackground(new java.awt.Color(170, 171, 184));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        jLabel1.setText("Add Student");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1270, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        studenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middle Name", "Birth Cert Num"
            }
        ));
        jScrollPane1.setViewportView(studenttable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1270, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("First Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));
        jPanel3.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 200, 30));

        jLabel4.setText("Middel Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));
        jPanel3.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, 30));

        jLabel5.setText("Last Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));
        jPanel3.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 200, 30));

        jLabel6.setText("Birth Cert #");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 30));
        jPanel3.add(txtbirthcertnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 30));

        jLabel7.setText("DOB");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 30));

        jLabel8.setText("Date Registered");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 30));
        jPanel3.add(txtdatereg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 30));

        jLabel16.setText("Sports House");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, 30));
        jPanel3.add(txtsports, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 200, 30));

        jLabel17.setText("Club");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 120, 30));
        jPanel3.add(txtcllub, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 200, 30));

        jLabel18.setText("Gender");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 120, 30));
        jPanel3.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 200, 30));

        jLabel19.setText("Student Address");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 120, 30));
        jPanel3.add(txtstuaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 200, 30));

        jLabel20.setText("Mother Name");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 30));
        jPanel3.add(txtmothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 200, 30));

        jLabel21.setText("Mother Occupation");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 30));
        jPanel3.add(txtmotheroccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 200, 30));

        jLabel22.setText("Mother Telephone");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 120, 30));
        jPanel3.add(txtmothertele, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 200, 30));

        jLabel23.setText("Father Name");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 120, 30));
        jPanel3.add(txtfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 200, 30));

        jLabel24.setText("Father Telephome");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 120, 30));
        jPanel3.add(txtfathertelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 200, 30));

        jLabel25.setText("Father Address");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 120, 30));
        jPanel3.add(txtfatheraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 200, 30));

        jLabel26.setText("Guardian Name");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 120, 30));
        jPanel3.add(txtguardianname, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 200, 30));

        jLabel27.setText("Guardian Occupation");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 120, 30));
        jPanel3.add(txtguardianoccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 200, 30));

        jLabel28.setText("Guardian Address");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 120, 30));
        jPanel3.add(txtguardianaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 200, 30));

        jLabel29.setText("Guardian Telephone");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 120, 30));
        jPanel3.add(txtguardiantele, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 200, 30));

        jButton1.setText("Add Student");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, 120, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nick\\Downloads\\icons8-user-80.png")); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 100, 120));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1270, 390));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Record Management", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 30));

        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 1270, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1290, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // jTabbedPane1.setSelectedIndex(2);
        //jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
                if ("metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studenttable;
    private javax.swing.JTextField txtbirthcertnum;
    private javax.swing.JTextField txtcllub;
    private javax.swing.JTextField txtdatereg;
    private javax.swing.JTextField txtfatheraddress;
    private javax.swing.JTextField txtfathername;
    private javax.swing.JTextField txtfathertelephone;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtguardianaddress;
    private javax.swing.JTextField txtguardianname;
    private javax.swing.JTextField txtguardianoccupation;
    private javax.swing.JTextField txtguardiantele;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtmothername;
    private javax.swing.JTextField txtmotheroccupation;
    private javax.swing.JTextField txtmothertele;
    private javax.swing.JTextField txtsports;
    private javax.swing.JTextField txtstuaddress;
    // End of variables declaration//GEN-END:variables
}
