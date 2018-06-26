package nlgsearchengine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author AmrReda
 */
public class UserInterface extends javax.swing.JFrame {
    private String fileNameToSearch = "";
    private final List<File> allFiles = new ArrayList<>();
    private final Map<String, Set<String>> promptMap = new HashMap<>();
    private File nlgFile;
    private File targetFolder;
    private String total = "\n";
    private String missingPrompts = "";

    public UserInterface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nlgTextField = new javax.swing.JTextField();
        targetTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nlgButton = new javax.swing.JButton();
        targetButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(5, 5));
        setPreferredSize(new java.awt.Dimension(1600, 900));

        nlgTextField.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        nlgTextField.setText("  Nlg");
        nlgTextField.setPreferredSize(new java.awt.Dimension(73, 28));
        nlgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nlgTextFieldActionPerformed(evt);
            }
        });

        targetTextField.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        targetTextField.setText("  Target Path");

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel1.setText("NLG File Path ");

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setText("Target Folder Path");

        nlgButton.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        nlgButton.setText("Search ");
        nlgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nlgButtonActionPerformed(evt);
            }
        });

        targetButton.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        targetButton.setText("Search");
        targetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetButtonActionPerformed(evt);
            }
        });

        startButton.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel3.setText("                                                                                 NLG Search Engine");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        jLabel5.setText("Developed By @Amr Reda ");

        logTextArea.setEditable(false);
        logTextArea.setColumns(20);
        logTextArea.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        logTextArea.setRows(5);
        jScrollPane2.setViewportView(logTextArea);

        resultTextArea1.setEditable(false);
        resultTextArea1.setColumns(20);
        resultTextArea1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        resultTextArea1.setRows(5);
        jScrollPane3.setViewportView(resultTextArea1);

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setText("Missing Prompts");

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setText("Action Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(nlgTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(targetTextField)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(targetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nlgButton, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nlgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nlgButton))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(cancelButton))
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public String getFileNameToSearch() {
        return fileNameToSearch;
    }

    public void setFileNameToSearch(String fileNameToSearch) {
        this.fileNameToSearch = fileNameToSearch;
    }

    public List<File> getResult() {
        return allFiles;
    }
    private void nlgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nlgButtonActionPerformed
        JFileChooser nlgFC = initFileChooser();
        int retVal = nlgFC.showDialog(this, "NLG File");
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File selectedfile = nlgFC.getSelectedFile();
            nlgFile = selectedfile;
            try {
                listPrompt(selectedfile);
            } catch (IOException ex) {
                Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, selectedfile.getAbsolutePath());
            try {
                nlgTextField.setText(selectedfile.getCanonicalPath());
            } catch (IOException ex) {
                Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_nlgButtonActionPerformed

    private void targetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetButtonActionPerformed
        allFiles.clear();
        JFileChooser targetFC = initFileChooser();
        targetFC.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retVal = targetFC.showDialog(this, "Target Folder");
        if (retVal == JFileChooser.APPROVE_OPTION) {
            targetFolder = targetFC.getSelectedFile();
            listFiles(targetFolder);
           // System.out.print("AllFiles" + allFiles.size());
            try {
                targetTextField.setText(targetFolder.getCanonicalPath());
            } catch (IOException ex) {
                Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_targetButtonActionPerformed
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
       missingPrompts = "";
       resultTextArea1.setText("");
        try {
            searchPrompts(promptMap);
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nlgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nlgTextFieldActionPerformed
        try {
            listPrompt(nlgFile);
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nlgTextFieldActionPerformed
    private JFileChooser initFileChooser() {
        final JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File("C:\\"));
        return fc;
    }

    public void searchDirectory(File directory, String fileNameToSearch) {
        setFileNameToSearch(fileNameToSearch);
        if (directory.isDirectory()) {
            listFiles(directory);
        } else {
          //  System.out.println(directory.getAbsoluteFile() + " is not a directory!");
        }
    }

    private void listFiles(File file) {
        if (file.isDirectory()) {
            if (file.canRead()) {
                for (File temp : file.listFiles()) {
                    if (temp.isDirectory()) {
                        listFiles(temp);
                    } else {
                        allFiles.add(temp);
                    }
                }
            } else {
               // System.out.println(file.getAbsoluteFile() + "Permission Denied");
            }
        }
    }

    private void listPrompt(File file) throws FileNotFoundException, IOException {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            String lineWithoutSpace;
            String lineWithoutPrompt;
            String[] parts;
            while ((line = bufferedReader.readLine()) != null) {
                lineWithoutSpace = line.replaceAll("\\s+", "");
                if (lineWithoutSpace.startsWith("prompt")) {
                    lineWithoutPrompt = lineWithoutSpace.replaceAll("prompt", "");
                    parts = lineWithoutPrompt.split("#");
                    mapUtil(parts[0], parts[1]);
                    stringBuffer.append(lineWithoutPrompt);
                    stringBuffer.append("\n");
                }
            }
            fileReader.close();
            String key = "";
            Set<String> values = new HashSet<>();

            for (Map.Entry<String, Set<String>> entry : promptMap.entrySet()) {
                key = entry.getKey();
                values = entry.getValue();
                total = total + "Prompt File Name: " + key + ".prompts" + "\n" + values + "\n";
            }
            logTextArea.setText(total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, Set<String>> mapUtil(String part1, String part2) {
        Set<String> valueSet = new HashSet<>();
        if (promptMap.containsKey(part1)) {
            promptMap.get(part1).add(part2);
        } else {
            valueSet.add(part2);
            promptMap.put(part1, valueSet);
        }
        return promptMap;
    }

    private void searchFile(File file, Set<String> promptSet) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
        }
        fileReader.close();
        int searchResult;
        for (String prompt : promptSet) {
            //System.out.print( "+++ Prompts********" + prompt+ "\n");
            searchResult = stringBuffer.indexOf(prompt);
            if (searchResult == -1) {
                missingPrompts = missingPrompts +"\n"+"****Missing Prompt****"+"\n"+ prompt ;
              //  System.out.print("MissingPrompts ________"+ missingPrompts + "+++ Prompts" + prompt+ "\n");
            }
        }

    }

    private void searchPrompts(Map<String, Set<String>> promptFilesMap) throws IOException {
        Map<String, File> targetMap = convertListToMap();
        //System.out.print("convertListToMap()" + convertListToMap().isEmpty());
        for (Map.Entry<String, Set<String>> entry : promptFilesMap.entrySet()) {
            String promptFile = entry.getKey() + ".prompts";
            //System.out.println("PromptFile**** " + promptFile+ "\n");
            Set<String> prompts = entry.getValue();
            if (targetMap.containsKey(promptFile)) {
                /*System.out.println("targetMap.containsKey(promptFile)#########"
                + targetMap.containsKey(promptFile)+ "\n");*/
                searchFile(targetMap.get(promptFile), prompts);
            }else{
            missingPrompts = missingPrompts + "\n" + "***Missing Prompt File*** \n" +promptFile; 
            }
            resultTextArea1.setText(missingPrompts);
        }
         
    }

    private Map<String, File> convertListToMap() {
        Map<String, File> filesMap = new HashMap<>();
        allFiles.forEach((file) -> {
            filesMap.put(file.getName(), file);
           // System.out.print("++++++++++File.getName() +++++++++++++++"+file.getName()+ "\n");
        });
        return filesMap;
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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JButton nlgButton;
    private javax.swing.JTextField nlgTextField;
    private javax.swing.JTextArea resultTextArea1;
    private javax.swing.JButton startButton;
    private javax.swing.JButton targetButton;
    private javax.swing.JTextField targetTextField;
    // End of variables declaration//GEN-END:variables
}
