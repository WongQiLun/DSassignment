/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsomeshit;

import Class.DoublyLinkedListADT;
import Class.DuplicateWord;
import Class.DuplicateWordADT;
import Class.Node;
import Class.QuickSort;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import testsomeshit.GUI;
import static testsomeshit.GUI.infoBox;
import Class.Word;
import Class.WordDoublyLinkedList;
import Class.WordList;
import Class.WordListADT;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import static testsomeshit.GUI.infoBox;

/**
 *
 * @author ongchunheng
 */
public class FilterSearch_UI extends javax.swing.JFrame {

    File file = null;
    String[] x;
    
    public static WordListADT<Word> wArray = new WordList();

    DoublyLinkedListADT<Word> wDLL = new WordDoublyLinkedList();
    
    public static DuplicateWordADT<Word> wDuplicate = new DuplicateWord();
    
    public static boolean displayed = false;

    String stringresult = "";

    /**
     * Creates new form FilterSearch_UI
     */
    public FilterSearch_UI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextPane();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnString = new javax.swing.JRadioButton();
        btnInt = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextPane();
        btnOpen = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpFileName = new javax.swing.JTextPane();
        jbtnSort = new javax.swing.JButton();
        btnWhole = new javax.swing.JRadioButton();
        btnContains = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JRadioButton();
        btnEnd = new javax.swing.JRadioButton();
        btnDuplicate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        radAll = new javax.swing.JRadioButton();
        radOthers = new javax.swing.JRadioButton();
        txtPara = new javax.swing.JTextField();
        jbtnRemoveDup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Results");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtResult.setEditable(false);
        jScrollPane1.setViewportView(txtResult);

        jLabel2.setText("Enter the words you want to search.");

        buttonGroup1.add(btnString);
        btnString.setSelected(true);
        btnString.setText("String");

        buttonGroup1.add(btnInt);
        btnInt.setText("Integer");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("         Search Engine");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSave.setText("Save Output");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtContent.setEditable(false);
        jScrollPane2.setViewportView(txtContent);

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        jtpFileName.setEditable(false);
        jScrollPane3.setViewportView(jtpFileName);

        jbtnSort.setText("Sort to output");
        jbtnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSortActionPerformed(evt);
            }
        });

        buttonGroup2.add(btnWhole);
        btnWhole.setSelected(true);
        btnWhole.setText("Match whole word");

        buttonGroup2.add(btnContains);
        btnContains.setText("Contains");

        buttonGroup2.add(btnStart);
        btnStart.setText("Starts with");

        buttonGroup2.add(btnEnd);
        btnEnd.setText("Ends with");

        btnDuplicate.setText("Check Duplicate");
        btnDuplicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuplicateActionPerformed(evt);
            }
        });

        jLabel4.setText("Paragraph :");

        buttonGroup3.add(radAll);
        radAll.setSelected(true);
        radAll.setText("All");
        radAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAllActionPerformed(evt);
            }
        });

        buttonGroup3.add(radOthers);
        radOthers.setText("Others");
        radOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOthersActionPerformed(evt);
            }
        });

        txtPara.setEnabled(false);

        jbtnRemoveDup.setText("Remove Duplicate");
        jbtnRemoveDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveDupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnString)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnContains))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnRemoveDup)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDuplicate))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnSort)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnSearch)
                                            .addGap(63, 63, 63))
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(radAll)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(radOthers)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPara, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(189, 189, 189)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnEnd)
                                                .addComponent(btnStart))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnBack)
                                            .addGap(130, 130, 130)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnOpen))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnWhole))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnOpen))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnString)
                    .addComponent(btnInt))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radAll)
                    .addComponent(radOthers)
                    .addComponent(txtPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWhole)
                    .addComponent(btnStart))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDuplicate)
                    .addComponent(btnContains)
                    .addComponent(btnEnd)
                    .addComponent(jbtnRemoveDup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(jbtnSort)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //search even for capital letters // search for specific paragraphs
        if ((radAll.isSelected() || !txtPara.getText().equals("")) && !txtSearch.getText().equals("")) {
            
            stringresult = "";
            int search_para = 0;
                    
            if (txtPara.getText().equals("0") || txtPara.getText().matches(".*[a-zA-Z]+.*")) {
                JOptionPane.showMessageDialog(null, "Invalid paragraph input! Paragraph starts from 1.");
            } else {
                
                if (radAll.isSelected()) {   // Search all
                    search_para = 0;
                } else {
                    search_para = Integer.parseInt(txtPara.getText());                   
                }
                
                String search = txtSearch.getText();

                if (btnInt.isSelected()) {  //btnInt
                    displayed = false;
                    String stringresult = "";
                    for (int i = 0; i < 10; i++) {
                        stringresult = wArray.sInt(search, search_para);
                    }
                    txtResult.setText(stringresult);

                } else {          //btnString.isSelected

                    if (btnWhole.isSelected()) {      //btnWhole
                        
                        displayed = false;
                        String stringresult="";
                        
                        for(int i=0 ; i<10 ; i++){    //Big O
                             stringresult = wArray.sWhole(search, search_para);
                        }
                        
                        txtResult.setText(stringresult);
                        

                    } else if (btnContains.isSelected()) {    //btnContains
                        
                        
                        displayed = false;
                        String stringresult = "";
                        for (int i = 0; i < 10; i++) {
                            stringresult = wArray.sContains(search, search_para);
                        }
                        
                        txtResult.setText(stringresult);

                    } else if (btnStart.isSelected()) {     //btnStart
                        displayed = false;
                        String stringresult = "";
                        for (int i = 0; i < 10; i++) {
                            stringresult  = wArray.sStart(search, search_para);
                        }
                        txtResult.setText(stringresult);

                    } else {    //btnEnd
                        displayed = false;
                        String stringresult = "";
                        for (int i = 0; i < 10; i++) {
                            stringresult  = wArray.sEnd(search, search_para);
                        }
                        txtResult.setText(stringresult);

                    }
                }//end else btnString.isSelected
            }
        }
        
        else {
            JOptionPane.showMessageDialog(null, "No words were entered!");
            txtSearch.setText("");
            txtResult.setText("");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Open");
        int returnVal = chooser.showOpenDialog(null);
        file = null;
        try {
            file = chooser.getSelectedFile();
            jtpFileName.setText(file.getName());
        } catch (Exception e) {

            infoBox("error: file not found \n Please select a file to read from ", "File not found");
        }

        Scanner s = null;
        try {
            s = new Scanner(file); //Read the selected file content
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = "";

        while (s.hasNextLine()) {
            line += s.nextLine() + " \n";

        }

        String[] stringArray = line.split(" ");
        Word[] items = new Word[1000];
        int xxx = 0;
        int paragraph = 1;
        wArray.clear();
        wDLL = new WordDoublyLinkedList();
        wDuplicate = new DuplicateWord(); 
        for (String e : stringArray) {        //Insert into WordList ADT
            if (e.contains("\n") && !e.isEmpty()) {
                paragraph++;
                Word w = new Word(e.substring(1), paragraph, paragraph);
                //System.out.println(e);
                if (!w.getData().isEmpty()) {
                    wArray.add(w);
                    items[xxx] = w;
                    xxx++;
                    wDLL.append(w);
                    wDuplicate.add(w);
                    //System.out.println(w);
                }
            } else {
                Word w = new Word(e.trim(), paragraph, paragraph);
                //System.out.println(e);
                if (!w.getData().isEmpty()) {
                    wArray.add(w);
                    items[xxx] = w;
                    xxx++;
                    wDLL.append(w);
                    wDuplicate.add(w);
                    //System.out.println(w);
                }
            }

        }

//        System.out.print((wArray));
//        System.out.print((paragraph));
        txtContent.setContentType("text/plain");
        txtResult.setContentType("text/html");
        txtContent.setText(line.trim());

        line = line.replaceAll("\\W", " ");//replaces all nonwords into blanks
        x = line.split("(\\b)");//split by non word characters and word boundries

        for (int y = 0; y < x.length; y++) {
            x[y] = x[y].trim();
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void jbtnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSortActionPerformed
        
        DoublyLinkedListADT<Word> wDLL2;
        wDLL2 = wDLL;     
        wDLL2.quickSort();    
         wDLL2.displaySwapCount();       
        String y = "";
        Node<Word> currentNode = wDLL2.getFirstNode();
        int nodeNumber = wDLL2.getNodeNumber();
        for (int counter = 1; counter <= nodeNumber; counter++) {
            y += wDLL2.getItem(counter).getData() + "<br />";

        }
        txtResult.setText(y);
    }//GEN-LAST:event_jbtnSortActionPerformed

    private void btnDuplicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuplicateActionPerformed
        // TODO add your handling code here:
        //
                DoublyLinkedListADT<Word> wDLL2;
        wDLL2 = wDLL;
       
       
        wDLL2.quickSort();
        DuplicateWordADT<Word> item = (DuplicateWord<Word>)wDLL2.ConvertToDuplicate();
        DuplicateWordADT<Word> itemDup = (DuplicateWord<Word>)item.getDuplicates();
        
        
        txtResult.setText(itemDup.toString());
        
        
    }//GEN-LAST:event_btnDuplicateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SaveOutput();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void radOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOthersActionPerformed
        // TODO add your handling code here:
        txtPara.setEnabled(true);
    }//GEN-LAST:event_radOthersActionPerformed

    private void radAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAllActionPerformed
        // TODO add your handling code here:
        txtPara.setText("");
        txtPara.setEnabled(false);
    }//GEN-LAST:event_radAllActionPerformed

    private void jbtnRemoveDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveDupActionPerformed
        // TODO add your handling code here:
                //
                DoublyLinkedListADT<Word> wDLL2;
        wDLL2 = wDLL;
       
       
        wDLL2.quickSort();
        DuplicateWordADT<Word> item = (DuplicateWord<Word>)wDLL2.ConvertToDuplicate();
        DuplicateWordADT<Word> itemDup = (DuplicateWord<Word>)item.removeDuplicates();
        
        
        txtResult.setText(itemDup.toString());
        
        
    
    }//GEN-LAST:event_jbtnRemoveDupActionPerformed

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
            java.util.logging.Logger.getLogger(FilterSearch_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterSearch_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterSearch_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterSearch_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterSearch_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnContains;
    private javax.swing.JButton btnDuplicate;
    private javax.swing.JRadioButton btnEnd;
    private javax.swing.JRadioButton btnInt;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JRadioButton btnStart;
    private javax.swing.JRadioButton btnString;
    private javax.swing.JRadioButton btnWhole;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnRemoveDup;
    private javax.swing.JButton jbtnSort;
    private javax.swing.JTextPane jtpFileName;
    private javax.swing.JRadioButton radAll;
    private javax.swing.JRadioButton radOthers;
    public javax.swing.JTextPane txtContent;
    private javax.swing.JTextField txtPara;
    public javax.swing.JTextPane txtResult;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

   


   private void SaveOutput() {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Save output as");
        int returnVal = chooser.showOpenDialog(null);
        file = null;
        try {

            file = chooser.getSelectedFile();

        } catch (Exception e) {
            infoBox("error: file not found \n Please select a file to write to", "File not found");
        }
        String line = txtResult.getText().replaceAll("(?s)<[^>]*>(\\s*<[^>]*>)*", " ");
        line = line.replaceAll(" ","\n");
        line =  line.replaceAll("(?m)^[ \t]*\r?\n", "");
        if (!file.getName().contains(".txt")) {
            file = new File(chooser.getSelectedFile() + ".txt");
        }
        FileWriter x = null;
        System.out.print(line);
        try {
            x = new FileWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            x.write(line);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);

        }
                 try {
                x.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
}
