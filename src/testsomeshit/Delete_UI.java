/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsomeshit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import static testsomeshit.GUI.infoBox;
import static Class.FileFunction.*;

/**
 *
 * @author ymhomer
 */
public class Delete_UI extends javax.swing.JFrame {

    //Global valuable
    //String defaultFilePath = "C:\\Users\\user\\Documents\\NetBeansProjects\\DSAssignment";
    String defaultFilePath = System.getProperty("user.dir");
    File file = new File(defaultFilePath);
    String fileOpened = "";
    String pathOpened = "";
    //File fullpath = new File(defaultFilePath + fileOpened);
    
    /**
     * Creates new form Delete_UI
     */
    public Delete_UI() {
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

        jtxtFileName = new javax.swing.JTextField();
        jbtBrowse = new javax.swing.JButton();
        jlblFileName = new javax.swing.JLabel();
        jlbTitle = new javax.swing.JLabel();
        jlblContent = new javax.swing.JLabel();
        jbtDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtContent = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remove File");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setName("RemoveFile"); // NOI18N

        jtxtFileName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFileNameFocusGained(evt);
            }
        });

        jbtBrowse.setMnemonic('B');
        jbtBrowse.setText("Browse");
        jbtBrowse.setToolTipText("Select your file");
        jbtBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBrowseActionPerformed(evt);
            }
        });

        jlblFileName.setText("File opened : ");

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setText("Remove file");

        jlblContent.setText("Content : ");

        jbtDelete.setMnemonic('D');
        jbtDelete.setText("Delete");
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        jtxtContent.setEditable(false);
        jtxtContent.setName("jpContent"); // NOI18N
        jScrollPane1.setViewportView(jtxtContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblFileName)
                            .addComponent(jlblContent)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtBrowse))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtDelete)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitle)
                .addGap(17, 17, 17)
                .addComponent(jlblFileName)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblContent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFileNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFileNameFocusGained
        onBrowse();
    }//GEN-LAST:event_jtxtFileNameFocusGained
    
    private void jbtBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBrowseActionPerformed
        onBrowse();//fileContent();
    }//GEN-LAST:event_jbtBrowseActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed
        if (checkField(jtxtFileName.getText())){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete the file below?\n" + fileOpened,"Delete file",dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {
                //infoBox(pathOpened, "Delete file");
                //File filePath = new File(defaultFilePath + "\\" +fileOpened);
                
                File filePath = new File(pathOpened);

                try {
                    delete(filePath);

                    //Reset UI
                    jtxtFileName.setText("");
                    jtxtContent.setText("");
                    jtxtFileName.enable();
                    jtxtFileName.hasFocus();
                    
                    this.dispose();
                    new GUI_Publisher().setVisible(true);
                    
                } catch (Exception ex) {
                    Logger.getLogger(Delete_UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(dialogResult == JOptionPane.NO_OPTION){
                infoBox(pathOpened, "No");
                //Do nothing
            }
        }
        else{
            infoBox("Please open a file to continue.", "Delete file");
            openFile();
        }
    }//GEN-LAST:event_jbtDeleteActionPerformed
    
    private void onBrowse(){
        if(checkField(jtxtFileName.getText())){
            jtxtFileName.disable();
        }
        else{
            infoBox("No file is selected.\n Please select a file to continue. ", "No file selected");
            openFile();
            jtxtFileName.hasFocus();
        }
    }
    
    private void openFile() {
        JFileChooser chooser = new JFileChooser(defaultFilePath);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Open");
        int returnVal = chooser.showOpenDialog(null);
        
        try {
            
            file = chooser.getSelectedFile();
            jtxtFileName.setText(file.getName());
            
            fileOpened = file.getName();
            pathOpened = file.getPath();
            
        } catch (Exception e) {

            infoBox("error: " + e + "file not found \n Please select a file to read from ", "File not found");
        }

        Scanner s = null;
        try {
            s = new Scanner(file); //Read the selected file content
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = "";
        while (s.hasNextLine()) {

            line += s.nextLine() + "\n";
        }

        jtxtContent.setContentType("text/plain");

        jtxtContent.setText(line);
        line = line.replaceAll("\\W", " ");//replaces all nonwords into blanks
        String[] x = line.split("(\\b)");//split by non word characters and word boundries

        for (int y = 0; y < x.length; y++) {
            x[y] = x[y].trim();
        }
       //put in search arrays
    }

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
            java.util.logging.Logger.getLogger(Delete_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBrowse;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JLabel jlblContent;
    private javax.swing.JLabel jlblFileName;
    private javax.swing.JTextPane jtxtContent;
    private javax.swing.JTextField jtxtFileName;
    // End of variables declaration//GEN-END:variables

    private ListModel<String> view(String one) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
