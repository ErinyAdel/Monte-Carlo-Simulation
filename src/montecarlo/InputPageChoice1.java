package montecarlo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputPageChoice1 extends javax.swing.JFrame
{
    private final ArrayList<JTextField> listOfDataTexts = new ArrayList<>();
    private final ArrayList<JTextField> listOfFreqTexts = new ArrayList<>();
    private static Model m = new Model();
    private static int dataSize;
    private static int simulationsSize;
    
    public InputPageChoice1() {
        initComponents();
    }
    
    public void addFieldsData(int size)
    {        
        for(int i=0; i<size; i++){
            listOfDataTexts.add(new JTextField());
        }
        int j = 4;
        for (int i = 0; i < size; i++) {
            listOfDataTexts.get(i).setBounds(60, 50 * j, 50, 25);
            listOfDataTexts.get(i).setVisible(true);
            add(listOfDataTexts.get(i));
            j++;
        }
    }
    
    public void addFieldsFreq(int size)
    {
        for(int i=0; i<size; i++){
            listOfFreqTexts.add(new JTextField());
        }
        int j = 4;
        for (int i = 0; i < size; i++) {
            listOfFreqTexts.get(i).setBounds(310, 50 * j, 50, 25);
            add(listOfFreqTexts.get(i));
            j++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Number Of Data");

        jLabel4.setText("Number Of Simulations");

        jLabel5.setText("    Data");

        jLabel6.setText("Frequency");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(jTextField2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(266, 266, 266)
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(217, 217, 217)
                            .addComponent(jLabel6))))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2)
                .addGap(341, 341, 341)
                .addComponent(jButton3)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String str = jTextField1.getText();
            Model.setNumOfData(Integer.parseInt(str));
            dataSize = Model.getNumOfData();

            String str2 = jTextField2.getText();
            Model.setNumOfSimulations(Integer.parseInt(str2));
            simulationsSize = Model.getNumOfSimulations();

            addFieldsData(dataSize);
            addFieldsFreq(dataSize);
        }
        catch(Exception ex) {
            JOptionPane.showConfirmDialog(rootPane,"Should Fill All Fields With Integer Values");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            ArrayList<Integer> dataInput = new ArrayList<>();

            for(int i=0; i<dataSize; i++) {
                dataInput.add(i,dataFromTextFields().get(i));
            }
            m.setData(dataInput);

            //
            ArrayList<Double> freqInput = new ArrayList<>();

            for(int i=0; i<dataSize; i++) {
                freqInput.add(i,freqFromTextFields().get(i));
            }
            m.setFrequency(freqInput);

            //
            RandomNumbers page = new RandomNumbers();
            page.setVisible(true);
        }
        catch(Exception ex) {
            JOptionPane.showConfirmDialog(rootPane,"Should Fill All Fields With Integer Values");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public ArrayList<Integer> dataFromTextFields()
    {
        ArrayList<Integer> dataInput = new ArrayList<>();

        for (int i=0; i<listOfDataTexts.size(); i++) {
            String str = listOfDataTexts.get(i).getText();
            dataInput.add(i,Integer.parseInt(str));
        }
        return dataInput;
    }
    
    public ArrayList<Double> freqFromTextFields()
    {
        ArrayList<Double> freqInput = new ArrayList<>();
 
        for (int i=0; i<listOfFreqTexts.size(); i++) {
            String str = listOfFreqTexts.get(i).getText();
            freqInput.add(i,Double.parseDouble(str));
        }
        return freqInput;
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
            java.util.logging.Logger.getLogger(InputPageChoice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputPageChoice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputPageChoice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputPageChoice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputPageChoice1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
