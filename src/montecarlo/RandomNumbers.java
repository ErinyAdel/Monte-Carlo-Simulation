package montecarlo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RandomNumbers extends javax.swing.JFrame
{
    private ArrayList<JTextField> listOfRDTexts = new ArrayList<>();
    private static Model m = new Model();
    private int numberOfSimu = Model.getNumOfSimulations();
    
    public RandomNumbers()
    {
        initComponents();
        addFieldsFreq(numberOfSimu);
    }

    public void addFieldsFreq(int size)
    {
        for(int i=0; i<size; i++){
            listOfRDTexts.add(new JTextField());
        }
        int j = 1;
        for (int i=0; i<size; i++) {
            listOfRDTexts.get(i).setBounds(200,30*j,50,20);
            add(listOfRDTexts.get(i));
            j++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        /*try
        {*/
            ArrayList<Integer> randomNumsInput = new ArrayList<>();        
            for(int i=0; i<numberOfSimu; i++) {
                randomNumsInput.add(i,rdFromTextFields().get(i));
            }
            m.setRandomNumbers(randomNumsInput);
            //
            Output2 out = new Output2();
            out.setVisible(true);
        /*}
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Should Fill All Fields With Integer Values");
        }
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    public ArrayList<Integer> rdFromTextFields()
    {
        ArrayList<Integer> randomNumsInput = new ArrayList<>();
        
        for (int i = 0; i < listOfRDTexts.size(); i++) {
            String str = listOfRDTexts.get(i).getText();
            randomNumsInput.add(i,Integer.parseInt(str));
        }
        return randomNumsInput;
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
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomNumbers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
