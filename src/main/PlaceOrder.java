package main;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PlaceOrder extends javax.swing.JFrame {

    private List burgerList;

    public PlaceOrder(List burgerList) {
        initComponents();
        this.burgerList = burgerList;
        txtOrderId.setText(burgerList.generateOrderId());
        price.setText("LKR " + (double) Burger.BURGER_PRICE * Integer.parseInt(txtQty.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        orderIdLabel = new javax.swing.JLabel();
        customerIdLabel = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        qtyLabel = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtOrderId = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        btnQtyIncrease = new javax.swing.JButton();
        btnQtyDecrease = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPlaceOrder = new javax.swing.JButton();
        btnHomePage = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Order");
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(255, 51, 51));

        headerLabel.setBackground(new java.awt.Color(255, 0, 0));
        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Place Order");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.setLayout(new java.awt.GridLayout(1, 0));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        orderIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        orderIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        orderIdLabel.setText("Order ID :");

        customerIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        customerIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        customerIdLabel.setText("Customer ID :");

        txtCustomerId.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtCustomerId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerIdKeyReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        qtyLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        qtyLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtyLabel.setText("Burger QTY :");

        txtQty.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtQty.setText("1");
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        txtOrderId.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtOrderId.setEnabled(false);

        txtCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        customerNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        customerNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        customerNameLabel.setText("Customer Name :");

        btnQtyIncrease.setText(">");
        btnQtyIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtyIncreaseActionPerformed(evt);
            }
        });

        btnQtyDecrease.setText("<");
        btnQtyDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtyDecreaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerIdLabel)
                            .addComponent(orderIdLabel)
                            .addComponent(customerNameLabel))
                        .addGap(26, 26, 26)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(txtCustomerName)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addComponent(qtyLabel)
                        .addGap(59, 59, 59)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQtyDecrease)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQtyIncrease)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIdLabel)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIdLabel)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnQtyDecrease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQtyIncrease))
                    .addComponent(qtyLabel))
                .addGap(444, 444, 444))
        );

        mainPanel.add(leftPanel);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnPlaceOrder.setBackground(new java.awt.Color(0, 153, 51));
        btnPlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnHomePage.setBackground(new java.awt.Color(255, 51, 51));
        btnHomePage.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnHomePage.setForeground(new java.awt.Color(255, 255, 255));
        btnHomePage.setText("Back to Homepage");
        btnHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomePageActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 0, 0));
        priceLabel.setText("NET Total :");

        price.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        price.setForeground(new java.awt.Color(255, 51, 51));
        price.setText("LKR --");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(price))
                    .addComponent(btnHomePage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(price))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        mainPanel.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomePageActionPerformed
        this.dispose();
        new HomePage(burgerList).setVisible(true);

    }//GEN-LAST:event_btnHomePageActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        String orderId = burgerList.generateOrderId();
        String customerId = txtCustomerId.getText();
        String customerName;
        if (burgerList.isDuplicateCustomer(customerId)) {
            customerName = burgerList.getDuplicateCustomerName(customerId);
        } else {
            customerName = txtCustomerName.getText();
        }
        String orderQty = txtQty.getText();
        int orderStatus = Burger.PROCESSING;

        if (customerId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your phone number...");
        } else if (!burgerList.isValidPhoneNumber(customerId)) {
            JOptionPane.showMessageDialog(this, "Please enter your valid phone number...");
        } else if (customerName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name...");
        } else if (orderQty.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity cannot be empty value...");
        } else if (Integer.parseInt(txtQty.getText()) == 0 || Integer.parseInt(txtQty.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Please add at least one quantity...");
        } else {

            int b = JOptionPane.showConfirmDialog(this, "Do you want to place this order?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
            if (b == JOptionPane.YES_OPTION) {
                Burger burger = new Burger(orderId, customerId, customerName, Integer.parseInt(orderQty), orderStatus);
                if (burgerList.placeOrder(burger)) {
                    try {
                        FileWriter fileWriter = new FileWriter("Burger.txt", true);
                        fileWriter.write(orderId + "," + customerId + "," + customerName + "," + orderQty + "," + orderStatus + "\n");
                        fileWriter.flush();
                        JOptionPane.showMessageDialog(this, "Order placed successfully...");
                        clear();
                    } catch (IOException ex) {

                    }
                }
            }

        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        String qty = txtQty.getText();

        if (qty.isEmpty() || qty.equals("0")) {
            price.setText("LKR 0.0");
            return;
        }

        price.setText("LKR " + (double) Burger.BURGER_PRICE * Integer.parseInt(qty));
    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtCustomerIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyReleased
        String customerId = txtCustomerId.getText();

        if (customerId.isEmpty()) {
            txtCustomerName.setText("");
            txtCustomerName.setEditable(true);
            return;
        }

        if (burgerList.isValidPhoneNumber(customerId) && burgerList.isDuplicateCustomer(customerId)) {
            txtCustomerName.setText(burgerList.getDuplicateCustomerName(customerId));
            txtCustomerName.setEditable(false);
        } else {
            txtCustomerName.setText("");
            txtCustomerName.setEditable(true);
        }
    }//GEN-LAST:event_txtCustomerIdKeyReleased

    private void btnQtyDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtyDecreaseActionPerformed
        String qtyText = txtQty.getText();
        if (qtyText.isEmpty()) {
            txtQty.setText("1");
        } else {
            int qty = Integer.parseInt(qtyText);
            if (qty > 1) {
                qty--;
            }
            txtQty.setText(String.valueOf(qty));
        }
        updateTotal();
    }//GEN-LAST:event_btnQtyDecreaseActionPerformed

    private void btnQtyIncreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtyIncreaseActionPerformed
        String qtyText = txtQty.getText();
        if (qtyText.isEmpty()) {
            txtQty.setText("1");
        } else {
            int qty = Integer.parseInt(qtyText);
            qty++;
            txtQty.setText(String.valueOf(qty));
        }
        updateTotal();
    }//GEN-LAST:event_btnQtyIncreaseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnHomePage;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnQtyDecrease;
    private javax.swing.JButton btnQtyIncrease;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JLabel price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txtOrderId.setText(burgerList.generateOrderId());
        txtCustomerId.setText("");
        txtCustomerName.setText("");
        price.setText("LKR 500.0");
        txtQty.setText("1");
    }

    private void updateTotal() {
        String qtyText = txtQty.getText();
        if (qtyText.isEmpty()) {
            price.setText("LKR --");
            return;
        }
        int qty = Integer.parseInt(qtyText);
        price.setText("LKR " + (double) qty * Burger.BURGER_PRICE);
    }
}
