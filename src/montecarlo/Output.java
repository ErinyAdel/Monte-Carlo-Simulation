package montecarlo;

import java.util.ArrayList;
import javax.swing.JTextField;

public class Output extends javax.swing.JFrame 
{
    private ArrayList<JTextField> list = new ArrayList<>();
    private ArrayList<JTextField> list2 = new ArrayList<>();
    private ArrayList<JTextField> list3 = new ArrayList<>();
    private ArrayList<JTextField> list4 = new ArrayList<>();
    private ArrayList<JTextField> list5 = new ArrayList<>();
    private ArrayList<JTextField> list6 = new ArrayList<>();
    
    private static Model m = new Model();
    private static int numOfData = m.getNumOfData();
    private static int numOfSimulations = m.getNumOfSimulations();
    
    public Output() 
    {
        initComponents();
        prob(numOfData);
        cumulativeProb(numOfData);
        range1(numOfData);
        range2(numOfData);
        randomNumbers(numOfSimulations);
        simulations(numOfSimulations);
    }
    
    public void prob(int size)
    {               
        for(int i=0; i<size; i++){
            list.add(new JTextField());
        }
        m.getProbabiltyFromFreq();
        int j = 1;      
        for (int i = 0; i < size; i++) {
            list.get(i).setBounds(10,45*j,50,25);
            add(list.get(i));
            JTextField tf = list.get(i);
            
            String str = String.valueOf(Model.getProbabilitiesList().get(i));
            tf.setText(str);
            j++;
        }
    }
    
    public void cumulativeProb(int size)
    {           
        for(int i=0; i<size; i++){
            list2.add(new JTextField());
        }
        m.getCumulativeProbability();
        int j = 1;      
        for (int i = 0; i < size; i++) {
            list2.get(i).setBounds(70, 45 * j, 50, 25);
            add(list2.get(i));
            JTextField tf = list2.get(i);
            
            String str = String.valueOf(Model.getCumulativeProbabilitiesList().get(i));
            tf.setText(str);
            j++;
            
        }
    }
    
    public void range1(int size)
    {
        for(int i=0; i<size; i++){
            list3.add(new JTextField());
        }
        m.setIntervalOfRandomNumbers();
        int j = 1;      
        for (int i = 0; i < size; i++) {
            list3.get(i).setBounds(130,45*j,50,25);
            add(list3.get(i));
            JTextField tf = list3.get(i);
   
            String str = String.valueOf(Model.StartList.get(i));
            tf.setText(str);
            j++;
            
        }
    }
    
    public void range2(int size)
    {
        for(int i=0; i<size; i++){
            list4.add(new JTextField());
        }
        int j = 1;      
        for (int i = 0; i < size; i++) {
            list4.get(i).setBounds(190,45*j,50,25);
            add(list4.get(i));
            JTextField tf = list4.get(i);
            String str = String.valueOf(Model.EndList.get(i));
            tf.setText(str);
            j++;
            
        }
    }
    
    public void randomNumbers(int size)
    {        
        for(int i=0; i<size; i++){
            list5.add(new JTextField());
        }
        int j = 1;      
        for (int i=0; i<size; i++) {
            list5.get(i).setBounds(250,45*j,50,25);
            add(list5.get(i));
            
            JTextField tf = list5.get(i);
            String str = String.valueOf(m.getRandomNumbersList().get(i));
            tf.setText(str);
            j++;
            
        }
    }
    
    public void simulations(int size)
    {        
        for(int i=0; i<size; i++){
            list6.add(new JTextField());
        }
        int j = 1;
        m.Simulations();
        for (int i = 0; i<size; i++) {
            list6.get(i).setBounds(310,45*j,50,25);
            add(list6.get(i));
            JTextField tf = list6.get(i);
            
            String str = String.valueOf(Model.getSimulationsList().get(i));
            tf.setText(str);
            j++;
            
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
