package montecarlo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputPageChoice2 extends javax.swing.JFrame 
{
    private final ArrayList<JTextField> listOfDataTexts = new ArrayList<>();
    private final ArrayList<JTextField> listOfFreqTexts = new ArrayList<>();
    private static Model m = new Model();
    private static int dataSize;
    private static int simulationsSize;
    
    public InputPageChoice2() 
    {
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
    
    public void addFieldsProb(int size)
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Number Of Data");

        jLabel4.setText("Number Of Simulations");

        jLabel5.setText("    Data");

        jLabel6.setText("Probability");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 190, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(77, 77, 77))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(55, 55, 55)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
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
            addFieldsProb(dataSize);
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
                freqInput.add(i,probFromTextFields().get(i));
            }
            m.setFrequency(freqInput);

            //
            RandomNumbers page = new RandomNumbers();
            page.setVisible(true);
        }
        catch(Exception ex) {
            JOptionPane.showConfirmDialog(rootPane,"Data Inputs should be integer values");
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
    
    public ArrayList<Double> probFromTextFields()
    {
        ArrayList<Double> probInput = new ArrayList<>();
 
        for (int i=0; i<listOfFreqTexts.size(); i++) {
            String str = listOfFreqTexts.get(i).getText();
            probInput.add(i,Double.parseDouble(str));
        }
        return probInput;
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
            java.util.logging.Logger.getLogger(InputPageChoice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputPageChoice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputPageChoice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputPageChoice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputPageChoice2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
