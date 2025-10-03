package main;

import javax.swing.JOptionPane;

public class UpdateOrder extends javax.swing.JFrame {

    private BurgerCollection burgerCollection;
    private Burger customer;

    public UpdateOrder(BurgerCollection burgerCollection) {
        initComponents();
        this.burgerCollection = burgerCollection;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        orderStatusComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdateOrder = new javax.swing.JButton();
        alertLabel = new javax.swing.JLabel();
        alertLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Order Details");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Order Status :");

        orderStatusComboBox.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        orderStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancelled", "Processing", "Delivered" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Order ID :");

        txtOrderId.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtOrderId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOrderIdKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Customer ID :");

        txtCustomerId.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtCustomerId.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Name :");

        txtCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtCustomerName.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Order QTY :");

        txtQty.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total :");

        price.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        price.setForeground(new java.awt.Color(255, 51, 51));
        price.setText("LKR 0.0");

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdateOrder.setBackground(new java.awt.Color(51, 204, 0));
        btnUpdateOrder.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnUpdateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateOrder.setText("Update Order");
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        alertLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 51));

        alertLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alertLabel2.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alertLabel)
                            .addComponent(alertLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(txtOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addGap(443, 443, 443))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQty)
                                    .addComponent(price)
                                    .addComponent(orderStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerId))
                                .addGap(65, 65, 65))
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(336, 336, 336))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(alertLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new HomePage(burgerCollection).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOrderIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyReleased
        String orderId = txtOrderId.getText();

        if (orderId.isEmpty()) {
            orderStatusComboBox.setSelectedIndex(0);
            txtCustomerId.setText("");
            txtCustomerName.setText("");
            txtQty.setText("");
            price.setText("LKR --");
            alertLabel.setText("");
            alertLabel2.setText("");
            return;
        }

        this.customer = burgerCollection.searchOrder(orderId);

        if (this.customer == null) {
            alertLabel.setText("");
            alertLabel2.setText("");
            orderStatusComboBox.setSelectedIndex(0);
            txtCustomerId.setText("");
            txtCustomerName.setText("");
            txtQty.setText("");
            price.setText("LKR --");
            return;
        }

        if (this.customer.getOrderStatus() == BurgerCollection.CANCEL) {
            alertLabel.setText("This order has been Cancelled");
            alertLabel2.setText("Sorry, you can not update this order");
            orderStatusComboBox.setEnabled(false);
            txtQty.setEnabled(false);
        } else if (this.customer.getOrderStatus() == BurgerCollection.DELIVERED) {
            alertLabel.setText("This order has been Delivered");
            alertLabel2.setText("Sorry, you can not update this order");
            orderStatusComboBox.setEnabled(false);
            txtQty.setEnabled(false);
        }

        orderStatusComboBox.setSelectedIndex(customer.getOrderStatus());
        txtCustomerId.setText(customer.getCustomerId());
        txtCustomerName.setText(customer.getCustomerName());
        txtQty.setText(String.valueOf(customer.getOrderQty()));
        price.setText("LKR " + String.valueOf((double) customer.getOrderQty() * BurgerCollection.BURGER_PRICE));
    }//GEN-LAST:event_txtOrderIdKeyReleased

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
        int qty = Integer.parseInt(txtQty.getText());
        int status = orderStatusComboBox.getSelectedIndex();

        if (qty < 1) {
            JOptionPane.showMessageDialog(this, "Please add at least one quantity...");
        } else {
            customer.setOrderQty(qty);
            customer.setOrderStatus(status);
            JOptionPane.showMessageDialog(this, "Order updated successfully...");
            clear();
        }
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        String qty = txtQty.getText();

        if (qty.isEmpty() || qty.equals("0")) {
            price.setText("LKR 500.0");
            txtQty.setText("1");
            return;
        }

        price.setText("LKR " + (double) BurgerCollection.BURGER_PRICE * Integer.parseInt(qty));
    }//GEN-LAST:event_txtQtyKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JLabel alertLabel2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> orderStatusComboBox;
    private javax.swing.JLabel price;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txtOrderId.setText("");
        orderStatusComboBox.setSelectedIndex(0);
        txtCustomerId.setText("");
        txtCustomerName.setText("");
        txtQty.setText("");
        price.setText("LKR --");
        alertLabel.setText("");
        alertLabel2.setText("");
    }
}
