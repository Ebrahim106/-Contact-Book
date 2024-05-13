package project;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MyFram extends javax.swing.JFrame {
  DefaultTableModel model;
  File f;
  
    public MyFram()  {
        initComponents();
       ImageIcon icon = new ImageIcon("src/phone-book.png");
        setIconImage(icon.getImage());
        setTitle("Contacts");
        model=(DefaultTableModel) Table.getModel();
        Table.setAutoCreateRowSorter(true);
       
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        NewContactPanel = new javax.swing.JPanel();
        NameLable = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        PhoneLable = new javax.swing.JLabel();
        PhoneField = new javax.swing.JTextField();
        EmailLabil = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        MyContactsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        SearchField = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        SearchButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(763, 494));

        mainpanel.setBackground(new java.awt.Color(255, 102, 102));

        NewContactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        NewContactPanel.setOpaque(false);

        NameLable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NameLable.setText("Name ");

        NameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        PhoneLable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PhoneLable.setText("Phone ");

        PhoneField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        EmailLabil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmailLabil.setText("Email");

        EmailField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/add-user.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/eraser.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/refresh.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/delete.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewContactPanelLayout = new javax.swing.GroupLayout(NewContactPanel);
        NewContactPanel.setLayout(NewContactPanelLayout);
        NewContactPanelLayout.setHorizontalGroup(
            NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewContactPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(NameLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PhoneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(EmailLabil, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewContactPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(NewContactPanelLayout.createSequentialGroup()
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NewContactPanelLayout.setVerticalGroup(
            NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewContactPanelLayout.createSequentialGroup()
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLable)
                    .addComponent(PhoneLable)
                    .addComponent(EmailLabil))
                .addGap(17, 17, 17)
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(ClearButton)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addContainerGap())
        );

        MyContactsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MyContactsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MyContactsLabel.setText("My contacts");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Name ", "Phone ", "Email "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(0).setPreferredWidth(30);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Name ", "Phone", "Email", " " }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        SearchButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/search.png"))); // NOI18N
        SearchButtom.setText("Search");
        SearchButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewContactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(MyContactsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addComponent(MyContactsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewContactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButtom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       int i =Table.getSelectedRow();
        if(i <0){
            JOptionPane.showMessageDialog(this , "PLEASE SELECT ONE ROW  !!" , "Not selected row !!" , JOptionPane.ERROR_MESSAGE);
        }else{
           model.removeRow(i);
           numberOfContacts--;
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
       if(cheakMainInfo()) {
        Contacts c=new Contacts(NameField.getText(),PhoneField.getText(),EmailField.getText());  
        if(!c.flag() ){
              JOptionPane.showMessageDialog(this, c.getMessage(), "Error Message" , JOptionPane.INFORMATION_MESSAGE);
        }else{
            int i = Table.getSelectedRow();
        model.setValueAt(c.getName(), i , 1);
        model.setValueAt(c.getPhone(),i , 2);
        model.setValueAt(c.getEmail(),i, 3);
    
        }   
       }else{
          JOptionPane.showMessageDialog(this, "Please enter the main information","Error message ", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
         NameField.setText("");
         PhoneField.setText("");
         EmailField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
       if(cheakMainInfo()) {
        Contacts c=new Contacts(NameField.getText(),PhoneField.getText(),EmailField.getText());  
        if(!c.flag() ){
              JOptionPane.showMessageDialog(this, c.getMessage(), "Error Message" , JOptionPane.INFORMATION_MESSAGE);
        }else{
             model.addRow(new Object []{Table.getRowCount() +1, c.getName(), c.getPhone(),  c.getEmail()});
              numberOfContacts++;  
              NameField.setText("");
              PhoneField.setText("");
              EmailField.setText("");
              
        }   
       }else{
          JOptionPane.showMessageDialog(this, "Please enter the main information","Error message ", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SearchButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtomActionPerformed
     if (SearchField.getText().trim().isEmpty()) {
          JOptionPane.showMessageDialog(this, "ENTER THE NAME OR PHONE OR EMAIL TO SEARCH WITH ","Error message ", JOptionPane.ERROR_MESSAGE);
        }else {
            if (ComboBox.getSelectedItem().equals("All")) {
                for (int i = 0; i < numberOfContacts; i++) {
                    for (int j = 1; j < 4; j++) {
                      if (model.getValueAt(i , j).equals(SearchField.getText().trim())) {
                            search(i);
                            return;
                            
                        }
                    }
                }
         }else if(ComboBox.getSelectedItem().equals("Name ")){
               for (int i = 0; i < numberOfContacts; i++) {
               if (model.getValueAt(i , 1).equals(SearchField.getText().trim())) {
                            search(i);
                            return;
                    }      
               }
             
         }else if (ComboBox.getSelectedItem().equals("Phone")){
              for (int i = 0; i < numberOfContacts; i++) {
                    if (model.getValueAt(i , 2).equals(SearchField.getText().trim())) {
                            search(i);
                             return;
               }
            }     
         }else{
              for (int i = 0; i < numberOfContacts; i++) {
                if (model.getValueAt(i , 3).equals(SearchField.getText().trim())) {
                            search(i);
               }            return;
            }   
         }
             JOptionPane.showMessageDialog(this, "Not founded data in the Option : " + ComboBox.getSelectedItem() , "Not founded !!" , JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_SearchButtomActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed
   
    public void search(int i){
     Table.setRowSelectionInterval(i , i);
        NameField.setText(model.getValueAt(i , 1)+"");
        PhoneField.setText(model.getValueAt(i , 2)+"");
        EmailField.setText(model.getValueAt(i , 3)+"");
        JOptionPane.showMessageDialog(this,"Founded in the " + ComboBox.getSelectedItem()+ " data !!" , "Result of your search" , JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean cheakMainInfo(){
         return 
                 !NameField.getText().isEmpty()&&
                 !PhoneField.getText().isEmpty()&&
                 !EmailField.getText().isEmpty();
        
    }
   
    
    public static void main(String args[])  {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                    new MyFram().setVisible(true);
             
                  
                }
            
        });
    }
public static int numberOfContacts;



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabil;
    private javax.swing.JLabel MyContactsLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLable;
    private javax.swing.JPanel NewContactPanel;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLable;
    private javax.swing.JButton SearchButtom;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTable Table;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainpanel;
    // End of variables declaration//GEN-END:variables
}
