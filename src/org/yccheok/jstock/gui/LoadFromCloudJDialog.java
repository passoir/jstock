/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2009 Yan Cheng Cheok <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.yccheok.jstock.gui.analysis.MemoryLogJDialog;
import org.yccheok.jstock.internationalization.GUIBundle;
import org.yccheok.jstock.internationalization.MessagesBundle;

/**
 *
 * @author yccheok
 */
public class LoadFromCloudJDialog extends javax.swing.JDialog {

    /** Creates new form LoadFromCloudJDialog */
    public LoadFromCloudJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);

        final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
        if (jStockOptions.isRememberGoogleAccountEnabled()) {
            this.jCheckBox1.setSelected(true);
            this.jTextField1.setText(Utils.decrypt(jStockOptions.getGoogleUsername()));
            this.jPasswordField1.setText(Utils.decrypt(jStockOptions.getGooglePassword()));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui"); // NOI18N
        setTitle(bundle.getString("LoadFromCloudJDialog_Title")); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));
        getContentPane().add(jPanel6, java.awt.BorderLayout.WEST);
        getContentPane().add(jPanel5, java.awt.BorderLayout.EAST);

        jXHeader1.setDescription(bundle.getString("LoadFromCloudJDialog_Description")); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32x32/download_from_cloud.png"))); // NOI18N
        jXHeader1.setTitle(bundle.getString("LoadFromCloudJDialog_Title")); // NOI18N
        getContentPane().add(jXHeader1, java.awt.BorderLayout.NORTH);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/apply.png"))); // NOI18N
        jButton1.setText(bundle.getString("LoadFromCloudJDialog_OK")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/button_cancel.png"))); // NOI18N
        jButton2.setText(bundle.getString("LoadFromCloudJDialog_Cancel")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText(bundle.getString("LoadFromCloudJDialog_LoadingFromCloud...")); // NOI18N
        jPanel4.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/spinner.gif"))); // NOI18N
        jPanel4.add(jLabel4);

        jLabel5.setText(bundle.getString("WizardDownloadlIndicatorJPanel_ViewLog")); // NOI18N
        this.jLabel3.setVisible(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel4.add(jLabel5);

        jPanel1.add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LoadFromCloudJDialog_GoogleAccount"))); // NOI18N

        jLabel1.setText(bundle.getString("LoadFromCloudJDialog_Username")); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText(bundle.getString("SaveToCloudJDialog_Password")); // NOI18N

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 10));
        jLabel6.setText("(e.g. john@gmail.com)");

        jCheckBox1.setText(bundle.getString("LoadFromCloudJDialog_KeepMeSignedIn")); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText(bundle.getString("LoadFromCloudJDialog_WarningAllYourDataWillBeOverwriteByCloudData")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-420)/2, (screenSize.height-334)/2, 420, 334);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cancel();
        // No matter Cancel or OK, once user untick, we will remove account
        // information.
        final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
        if (this.jCheckBox1.isSelected() == false) {
            jStockOptions.setRememberGoogleAccountEnabled(false);
            jStockOptions.setGoogleUsername("");
            jStockOptions.setGooglePassword("");
        }
    }//GEN-LAST:event_formWindowClosed

    private void cancel() {
        if (loadFromCloudTask != null) {
            loadFromCloudTask.cancel(true);
            loadFromCloudTask = null;
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        MemoryLogJDialog memoryLogJDialog = new MemoryLogJDialog(MainFrame.getInstance(), true);
        memoryLogJDialog.setLocationRelativeTo(this);
        memoryLogJDialog.setLog(memoryLog);
        memoryLogJDialog.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jLabel5MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (this.jTextField1.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, MessagesBundle.getString("warning_message_username_cannot_be_empty"), MessagesBundle.getString("warning_title_username_cannot_be_empty"), JOptionPane.WARNING_MESSAGE);
            this.jTextField1.requestFocus();
            return;
        }

        if (false == org.apache.commons.validator.EmailValidator.getInstance().isValid(this.jTextField1.getText())) {
            JOptionPane.showMessageDialog(this, MessagesBundle.getString("warning_message_invalid_email_address"), MessagesBundle.getString("warning_title_invalid_email_address"), JOptionPane.WARNING_MESSAGE);
            this.jTextField1.requestFocus();
            return;
        }
        
        if (this.jPasswordField1.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(this, MessagesBundle.getString("warning_message_password_cannot_be_empty"), MessagesBundle.getString("warning_title_password_cannot_be_empty"), JOptionPane.WARNING_MESSAGE);
            this.jPasswordField1.requestFocus();
            return;
        }

        this.jButton1.setEnabled(false);
        this.jTextField1.setEnabled(false);
        this.jPasswordField1.setEnabled(false);
        this.jCheckBox1.setEnabled(false);
        this.loadFromCloudTask = this.getLoadFromCloudTask();
        this.loadFromCloudTask.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private static class Status {
        public final String message;
        public final Icon icon;
        private Status(String message, Icon icon) {
            if (message == null || icon == null) {
                throw new IllegalArgumentException("Method arguments cannot be null");
            }
            this.message = message;
            this.icon = icon;
        }
        public static Status newInstance(String message, Icon icon) {
            return new Status(message, icon);
        }
    }
    
    private SwingWorker<Boolean, Status> getLoadFromCloudTask() {
        SwingWorker<Boolean, Status> worker = new SwingWorker<Boolean, Status>() {
            @Override
            protected void done() {
                boolean result = false;
                
                if (this.isCancelled() == false) {
                    try {
                        result = this.get();
                    } catch (InterruptedException ex) {
                        log.error(null, ex);
                    } catch (ExecutionException ex) {
                        log.error(null, ex);
                    }
                }

                jButton1.setEnabled(true);
                jTextField1.setEnabled(true);
                jPasswordField1.setEnabled(true);
                jCheckBox1.setEnabled(true);

                if (result == true) {
                    JOptionPane.showMessageDialog(LoadFromCloudJDialog.this, GUIBundle.getString("LoadFromCloudJDialog_Success"));

                    final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
                    // Only save account information when cloud operation success.
                    if (jCheckBox1.isSelected() == true) {
                        jStockOptions.setRememberGoogleAccountEnabled(true);
                        jStockOptions.setGoogleUsername(Utils.encrypt(jTextField1.getText()));
                        jStockOptions.setGooglePassword(Utils.encrypt(new String(jPasswordField1.getPassword())));
                    }
                    // Close the dialog once cloud operation success.
                    setVisible(false);
                    dispose();
                }
            }

            @Override
            protected void process(java.util.List<Status> statuses) {
                for (Status status : statuses) {
                    writeToMemoryLog(status.message);
                    jLabel3.setText(status.message);
                    jLabel4.setIcon(status.icon);
                    jLabel3.setVisible(true);
                    jLabel4.setVisible(true);
                    if (status.icon == Icons.ERROR || status.icon == Icons.WARNING) {
                        jLabel3.setForeground(Color.RED);
                        jLabel5.setVisible(true);
                    }
                    else
                    {
                        jLabel3.setForeground(Color.BLUE);
                        jLabel5.setVisible(false);
                    }
                }
            }

            @Override
            protected Boolean doInBackground() {
                if (isCancelled()) {
                    return false;
                }

                memoryLog.clear();

                publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_LoadingFromCloud..."), Icons.BUSY));

                final String username = jTextField1.getText();
                final String password = new String(jPasswordField1.getPassword());

                final File file = Utils.loadFromCloud(username, password);
                if (file == null) {
                    publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_LoadingFromCloudFail"), Icons.ERROR));
                    return false;
                }
                publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_ExtractingData..."), Icons.BUSY));
                final boolean status = Utils.extractZipFile(file, true);
                if (false == status) {
                    publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_ExtractingDataFail"), Icons.ERROR));
                }

                final File f = new File(org.yccheok.jstock.gui.Utils.getUserDataDirectory() + "config" + File.separator + "options.xml");
                final JStockOptions jStockOptions = Utils.fromXML(JStockOptions.class, f);
                if (jStockOptions != null) {
                    MainFrame.getInstance().getJStockOptions().insensitiveCopy(jStockOptions);
                }

                MainFrame.getInstance().reloadAfterDownloadFromCloud();

                publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_Success"), Icons.OK));

                return status;
            }
        };
        return worker;
    }

    private void writeToMemoryLog(String message) {
        // http://www.leepoint.net/notes-java/io/10file/sys-indep-newline.html
        // public static String newline = System.getProperty("line.separator");
        // When NOT to use the system independent newline characters
        // JTextArea lines should be separated by a single '\n' character, not the sequence that is used for file line separators in the operating system.
        // Console output (eg, System.out.println()), works fine with '\n', even on Windows.
        final String s = dateFormat.format(new Date()) + "\n" + message;
        this.memoryLog.add(s);
    }

    private volatile SwingWorker<Boolean, Status> loadFromCloudTask = null;
    private final List<String> memoryLog = new ArrayList<String>();
    private static final DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
    
    private static final Log log = LogFactory.getLog(LoadFromCloudJDialog.class);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    // End of variables declaration//GEN-END:variables

}