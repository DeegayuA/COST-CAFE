package cafeape;


import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;




public class Items extends javax.swing.JFrame {

    public Items() {
        initComponents();
        showProducts();
    }
    ResultSet Rs = null,Rs1 = null;
    Connection Con = null;
    Statement St = null, St1 = null;
    int Product_Number;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Product_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ItemsBT = new javax.swing.JLabel();
        HistoryBT = new javax.swing.JLabel();
        BillMakerBT = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        FliterCategory = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 204, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(237, 242, 251));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 768));

        Product_Name.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Product_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_NameMouseClicked(evt);
            }
        });
        Product_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_NameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Item Name");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Category");

        Price.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Price");

        Category.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Cold Drinks", "Hot Drinks", "Cakes", "Sweets", "Pastry", "Buns" }));
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(15, 155, 88));
        add.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(219, 68, 55));
        delete.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(244, 180, 0));
        edit.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Item List");

        ProductList.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ProductList.setModel(new javax.swing.table.DefaultTableModel(
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
        ProductList.setToolTipText("Product List");
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductList);

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Item Adding Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel16)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel14)))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 0, 1020, 770));

        jPanel3.setBackground(new java.awt.Color(182, 204, 254));

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

        FliterCategory.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        FliterCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Cold Drinks", "Hot Drinks", "Cakes", "Sweets", "Pastry", "Buns" }));
        FliterCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FliterCategoryItemStateChanged(evt);
            }
        });
        FliterCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FliterCategoryActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Filter by :");

        reset.setBackground(new java.awt.Color(66, 133, 234));
        reset.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Hubballi", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("COST CAFE 2.0");
        jLabel13.setToolTipText("Name of the cafe");

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Access Level = Admin");

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
                        .addComponent(BillMakerBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(HistoryBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(FliterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(logout1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ItemsBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(1040, Short.MAX_VALUE))
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
                .addGap(64, 64, 64)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addComponent(FliterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(logout1))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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

    private void countProd(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(" Select Max(Product_Number) from Products");
            Rs1.next();
            Product_Number = Rs1.getInt(1)+1;
            
        } catch (Exception e){
            
        }
    }
    private void filterProducts(){
        try{
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001"); 
           St = Con.createStatement();
           Rs = St.executeQuery("select * from Products where Category ='"+FliterCategory.getSelectedItem().toString()+"'");
           ProductList.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void showProducts(){
        try{
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001"); 
           St = Con.createStatement();
           Rs = St.executeQuery("select * from Products");
           ProductList.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void addnew(){
        if (Product_Name.getText().isEmpty() || Price.getText().isEmpty() || Category.getSelectedIndex() == -1){
           JOptionPane.showMessageDialog(this,"Please Check the given information again!!!");
           
       }else{
               try{
               countProd();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001");
               PreparedStatement Pst = Con.prepareStatement("insert into Products values(?,?,?,?)");
               Pst.setInt(1,Product_Number);
               Pst.setString(2, Product_Name.getText());
               Pst.setString(3, Category.getSelectedItem().toString());
               Pst.setInt(4, Integer.parseInt(Price.getText()));
               int row = Pst.executeUpdate();
               JOptionPane.showMessageDialog(this,"Item Added!!!");
               Con.close();
               showProducts();
               } catch(Exception ex){
                JOptionPane.showMessageDialog(this,  "Price must be a Number");                 
                //JOptionPane.showMessageDialog(this, ex);
               } 
      }
    }  int Key = 0;

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        showProducts();
    }//GEN-LAST:event_resetActionPerformed

    private void FliterCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FliterCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FliterCategoryActionPerformed

    private void FliterCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FliterCategoryItemStateChanged
        filterProducts();
    }//GEN-LAST:event_FliterCategoryItemStateChanged

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

    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
        int MyIndex = ProductList.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        Product_Name.setText(model.getValueAt(MyIndex, 1).toString());
        Category.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        Price.setText(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ProductListMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        if (Product_Name.getText().isEmpty() || Price.getText().isEmpty() || Category.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"Please Check the given information again!!!");

        }else{
            try{
                countProd();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001");
                PreparedStatement Pst = Con.prepareStatement("update Products set Product_Name=?,Category=?,Price=? where Product_Number=?");
                Pst.setInt(4,Key);
                Pst.setString(1, Product_Name.getText());
                Pst.setString(2, Category.getSelectedItem().toString());
                Pst.setInt(3, Integer.parseInt(Price.getText()));
                int row = Pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Item Updated!!!");
                Con.close();
                showProducts();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(this,  "Price must be a Number");  
                //JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (Product_Name.getText().isEmpty() || Price.getText().isEmpty() || Category.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"Please Check the given information again!!!");

        }else{
            try{
                countProd();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAFECOST","root","Deegayu2001");
                PreparedStatement Pst = Con.prepareStatement("delete from Products where Product_Number=?");
                Pst.setInt(1,Key);
                int row = Pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Item Deleted!!!");
                Con.close();
                showProducts();
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addnew();
    }//GEN-LAST:event_addActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void Product_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_NameActionPerformed

    private void Product_NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_NameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_NameMouseClicked


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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillMakerBT;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JComboBox<String> FliterCategory;
    private javax.swing.JLabel HistoryBT;
    private javax.swing.JLabel ItemsBT;
    private javax.swing.JTextField Price;
    private javax.swing.JTable ProductList;
    private javax.swing.JTextField Product_Name;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
