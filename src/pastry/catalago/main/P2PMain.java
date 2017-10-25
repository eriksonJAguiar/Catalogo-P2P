package pastry.catalago.main;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Date;
import rice.environment.Environment;

public class P2PMain extends javax.swing.JFrame {

    private static Environment env;
    private P2PReplicatorNode node;
    private String user;

    public P2PMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelPrincipal = new javax.swing.JPanel();
        jPainelP2P = new javax.swing.JPanel();
        jLabel_bindPort = new javax.swing.JLabel();
        jLabel_bootAddress = new javax.swing.JLabel();
        jLabel_bootPort = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();
        jTextField_bindPort = new javax.swing.JTextField();
        jTextField_bootAddress = new javax.swing.JTextField();
        jTextField_bootPort = new javax.swing.JTextField();
        jTextField_userName = new javax.swing.JTextField();
        jButton_startP2PNetwork = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTextArea_logText = new javax.swing.JTextArea();
        jPanelConf = new javax.swing.JPanel();
        jScrollPane_Catalago = new javax.swing.JScrollPane();
        jList_Catalago = new javax.swing.JList<>();
        jButton_Download = new javax.swing.JButton();
        jButton_Upload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPainelP2P.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrar na rede peer to peer"));
        jPainelP2P.setToolTipText("");

        jLabel_bindPort.setText("Número da sua porta:");

        jLabel_bootAddress.setText("Endereço IP:");

        jLabel_bootPort.setText("Porta da rede:");

        jLabel_userName.setText("Nome do usuário:");

        jButton_startP2PNetwork.setText("Entrar");
        jButton_startP2PNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_startP2PNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_startP2PNetworkActionPerformed(evt);
            }
        });

        jTextArea_logText.setColumns(20);
        jTextArea_logText.setRows(5);
        jScrollPane.setViewportView(jTextArea_logText);

        javax.swing.GroupLayout jPainelP2PLayout = new javax.swing.GroupLayout(jPainelP2P);
        jPainelP2P.setLayout(jPainelP2PLayout);
        jPainelP2PLayout.setHorizontalGroup(
            jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelP2PLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_bindPort)
                    .addComponent(jLabel_bootAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_bootPort, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_userName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_startP2PNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jTextField_bindPort)
                    .addComponent(jTextField_bootAddress)
                    .addComponent(jTextField_bootPort)
                    .addComponent(jTextField_userName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPainelP2PLayout.setVerticalGroup(
            jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelP2PLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelP2PLayout.createSequentialGroup()
                        .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bindPort)
                            .addComponent(jTextField_bindPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bootAddress)
                            .addComponent(jTextField_bootAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bootPort)
                            .addComponent(jTextField_bootPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPainelP2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_userName)
                            .addComponent(jTextField_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButton_startP2PNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane))
                .addContainerGap())
        );

        jPanelConf.setBorder(javax.swing.BorderFactory.createTitledBorder("Manipular arquivos"));

        jList_Catalago.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane_Catalago.setViewportView(jList_Catalago);

        jButton_Download.setText("Download");
        jButton_Download.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DownloadActionPerformed(evt);
            }
        });

        jButton_Upload.setText("Upload");
        jButton_Upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConfLayout = new javax.swing.GroupLayout(jPanelConf);
        jPanelConf.setLayout(jPanelConfLayout);
        jPanelConfLayout.setHorizontalGroup(
            jPanelConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_Catalago, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Download, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Upload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelConfLayout.setVerticalGroup(
            jPanelConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConfLayout.createSequentialGroup()
                        .addComponent(jButton_Download, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane_Catalago))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPainelPrincipalLayout = new javax.swing.GroupLayout(jPainelPrincipal);
        jPainelPrincipal.setLayout(jPainelPrincipalLayout);
        jPainelPrincipalLayout.setHorizontalGroup(
            jPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPainelP2P, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPainelPrincipalLayout.setVerticalGroup(
            jPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelP2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_startP2PNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_startP2PNetworkActionPerformed
        final int bindport = Integer.parseInt(jTextField_bindPort.getText());
        final String bootaddress = jTextField_bootAddress.getText();
        final int bootport = Integer.parseInt(jTextField_bootPort.getText());
        user = jTextField_userName.getText();
        Thread startNode = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    env = new Environment();
                    env.getParameters().setString("nat_search_policy", "never");
                    final InetAddress addr = InetAddress.getByName(bootaddress);
                    InetSocketAddress bootAddress = new InetSocketAddress(addr, bootport);
                    node = new P2PReplicatorNode(bindport, bootAddress, env, user, jTextArea_logText);
                } catch (UnknownHostException ex) {
                    ex.printStackTrace();
                } catch (Exception ex) {
                    jTextArea_logText.append("Não foi possível entrar no nó.\n");
                }

            }
        });
        startNode.start();
    }//GEN-LAST:event_jButton_startP2PNetworkActionPerformed

    private void jButton_DownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DownloadActionPerformed
        
    }//GEN-LAST:event_jButton_DownloadActionPerformed

    private void jButton_UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UploadActionPerformed
        Thread startPublish = new Thread(new Runnable() {
            @Override
            public void run() {
                File f = new File("storage/catalogo.xml");
                node.publishUpdate(new Date(f.lastModified()));
                jTextArea_logText.append("Announcing last file update time.\n");
            }
        });
        startPublish.start();
    }//GEN-LAST:event_jButton_UploadActionPerformed

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
            java.util.logging.Logger.getLogger(P2PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P2PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P2PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P2PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P2PMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Download;
    private javax.swing.JButton jButton_Upload;
    private javax.swing.JButton jButton_startP2PNetwork;
    private javax.swing.JLabel jLabel_bindPort;
    private javax.swing.JLabel jLabel_bootAddress;
    private javax.swing.JLabel jLabel_bootPort;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JList<String> jList_Catalago;
    private javax.swing.JPanel jPainelP2P;
    private javax.swing.JPanel jPainelPrincipal;
    private javax.swing.JPanel jPanelConf;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane_Catalago;
    private javax.swing.JTextArea jTextArea_logText;
    private javax.swing.JTextField jTextField_bindPort;
    private javax.swing.JTextField jTextField_bootAddress;
    private javax.swing.JTextField jTextField_bootPort;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}
