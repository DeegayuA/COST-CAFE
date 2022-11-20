package cafeape;


import java.awt.event.KeyEvent;
import java.sql.*;
import java.time.LocalDateTime;
import javax.swing.*;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;




public class BillMaker extends javax.swing.JFrame {

    public BillMaker() {
        initComponents();
        showProducts();
        Price.setEditable(false);
        SellerTb.setEditable(false);
        Item_Name.setEditable(false);
        getSellerName();
    }
    ResultSet Rs = null,Rs1 = null;
    Connection Con = null;
    Statement St = null, St1 = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ItemsBT = new javax.swing.JLabel();
        HistoryBT = new javax.swing.JLabel();
        BillMakerBT = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SellerTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bill = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ItemList = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GraTotBox = new javax.swing.JTextField();
        QTY = new javax.swing.JTextField();
        Item_Name = new javax.swing.JTextField();
        AddToBill = new javax.swing.JButton();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 204, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel3.setBackground(new java.awt.Color(182, 204, 254));

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Access Level = Admin");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeape/coffee (2).png"))); // NOI18N

        ItemsBT.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        ItemsBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeape/product.png"))); // NOI18N
        ItemsBT.setText("  Items");
        ItemsBT.setToolTipText("Items");
        ItemsBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemsBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsBTMouseClicked(evt);
            }
        });

        HistoryBT.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        HistoryBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeape/bill.png"))); // NOI18N
        HistoryBT.setText("  History ");
        HistoryBT.setToolTipText("History");
        HistoryBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HistoryBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryBTMouseClicked(evt);
            }
        });

        BillMakerBT.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        BillMakerBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeape/sales.png"))); // NOI18N
        BillMakerBT.setText("  Bill Maker ");
        BillMakerBT.setToolTipText("Sales");
        BillMakerBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BillMakerBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillMakerBTMouseClicked(evt);
            }
        });

        logout1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeape/settings.png"))); // NOI18N
        logout1.setText("  Logout");
        logout1.setToolTipText("Logout");
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Hubballi", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("COST CAFE 2.0");
        jLabel13.setToolTipText("Name of the cafe");

        jPanel4.setBackground(new java.awt.Color(237, 242, 251));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Item Name");

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Item Adding Menu");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seller");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QTY.");

        SellerTb.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Price");

        Price.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N

        Bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Price", "Qty.", "Total"
            }
        ));
        jScrollPane2.setViewportView(Bill);

        ItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Price"
            }
        ));
        ItemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ItemList);

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Item List");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pending Bill");

        GraTotBox.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        GraTotBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        QTY.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        QTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QTYKeyPressed(evt);
            }
        });

        Item_Name.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N

        AddToBill.setBackground(new java.awt.Color(171, 196, 255));
        AddToBill.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AddToBill.setText("ADD TO BILL");
        AddToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBillActionPerformed(evt);
            }
        });

        Print.setBackground(new java.awt.Color(0, 0, 0));
        Print.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Bill Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Item_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(SellerTb, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(AddToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                            .addComponent(GraTotBox))))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(AddToBill)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print)
                    .addComponent(GraTotBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ItemsBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(BillMakerBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(HistoryBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(logout1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(27, 27, 27)
                .addComponent(ItemsBT)
                .addGap(40, 40, 40)
                .addComponent(BillMakerBT)
                .addGap(40, 40, 40)
                .addComponent(HistoryBT)
                .addGap(264, 264, 264)
                .addComponent(logout1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void showProducts(){
        try{
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001"); 
           St = Con.createStatement();
           Rs = St.executeQuery("select * from Products");
           ItemList.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    int Bill_Number;
    private void countBill(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(" Select Max(Bill_Number) from Products");
            Rs1.next();
            Bill_Number = Rs1.getInt(1)+1;
            
        } catch (Exception e){
            
        }
    }
    String Username;
    private void getSellerName(){
        
        try{
            St = Con.createStatement();
            Rs = St.executeQuery(" select * from logbook where ID=(select max(ID) from logbook);");
            Rs.next();
            Username = Rs.getString(1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        } 
       
    }
    private void insertBill()
    {
               try{
               countBill();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001");
               PreparedStatement Pst = Con.prepareStatement("insert into Bills values(?,?,?,?)");
               Pst.setInt(1,Bill_Number);
               Pst.setString(2, SellerTb.getText());
               LocalDateTime now = LocalDateTime.now();
               Pst.setString(3, now.toString());
               Pst.setInt(4, GrdTot);
               int row = Pst.executeUpdate();
               JOptionPane.showMessageDialog(this,"Bill Added!!!");
               Con.close();
               showProducts();
               } catch(SQLException ex){
                 JOptionPane.showMessageDialog(this, ex);
               } 
    }                                    
    int GrdTot =  0;
    private void addtobill(){
        try{
            if(Item_Name.getText().isEmpty() || QTY.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this,"Please Check the given information again!!!");
       }else{
      
       int total = Integer.valueOf(Price.getText())*Integer.valueOf(QTY.getText());
       GrdTot = GrdTot + total;
       GraTotBox.setText("Total = Rs "+ GrdTot);
       DefaultTableModel model = (DefaultTableModel) Bill.getModel();
       String nextRowId = Integer.toString(model.getRowCount());
       model.addRow(new Object[]{
           Integer.valueOf(nextRowId)+1,
           Item_Name.getText(),
           Price.getText(),
           QTY.getText(),
           total
       }); 
       }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,  "QTY must be a Number");
           // JOptionPane.showMessageDialog(this, ex);
        }
    }

    
    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void BillMakerBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillMakerBTMouseClicked
       new BillMaker().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BillMakerBTMouseClicked

    private void HistoryBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryBTMouseClicked
        new History2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistoryBTMouseClicked

    private void ItemsBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsBTMouseClicked
       new Items().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ItemsBTMouseClicked
int Key = 0;
int Stock;
    private void ItemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemListMouseClicked
        DefaultTableModel model = (DefaultTableModel) ItemList.getModel();
        int MyIndex = ItemList.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        Item_Name.setText(model.getValueAt(MyIndex, 1).toString());
        Price.setText(model.getValueAt(MyIndex, 3).toString());
        SellerTb.setText(Username.toString());

    }//GEN-LAST:event_ItemListMouseClicked

    private void QTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QTYKeyPressed
        if(evt. getKeyCode() == KeyEvent. VK_ENTER) {
            addtobill();
        }
    }//GEN-LAST:event_QTYKeyPressed
                        
    private void AddToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBillActionPerformed
        addtobill();
    }//GEN-LAST:event_AddToBillActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try{
            insertBill();
            Bill.print();
        }catch(Exception e){

        }
    }//GEN-LAST:event_PrintActionPerformed
                                                           


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
            java.util.logging.Logger.getLogger(BillMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBill;
    private javax.swing.JTable Bill;
    private javax.swing.JLabel BillMakerBT;
    private javax.swing.JTextField GraTotBox;
    private javax.swing.JLabel HistoryBT;
    private javax.swing.JTable ItemList;
    private javax.swing.JTextField Item_Name;
    private javax.swing.JLabel ItemsBT;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Print;
    private javax.swing.JTextField QTY;
    private javax.swing.JTextField SellerTb;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logout1;
    // End of variables declaration//GEN-END:variables
}
