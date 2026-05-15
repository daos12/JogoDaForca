package jogodaforca;

import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;

public class JogoDaForca extends javax.swing.JFrame {

    public JogoDaForca() {
        initComponents();
        
        //Centralizar a janela JFrama, inicia ao centro
        setLocationRelativeTo(null);
        adicionarImagemFundo();
        
    }
    
    public void adicionarImagemFundo(){
        ImageIcon icon = new ImageIcon("src/img/imgFundo.jpg");
        icon.setImage(icon.getImage().getScaledInstance(jlFundo.getWidth(), jlFundo.getHeight(), 1));
        jlFundo.setIcon(icon);
       //https://www.youtube.com/watch?v=AwHnAXtoEIM&list=PLiDBeYc8RzQw5r7JYS_-cnKoqKD1SLxpN&index=3
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbProximo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbProximo.setText("PRÓXIMA");
        jPanel1.add(jbProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jButton2.setText("SAIR");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 80, -1));
        jPanel1.add(jlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 623, 494));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaForca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbProximo;
    private javax.swing.JLabel jlFundo;
    // End of variables declaration//GEN-END:variables
}
