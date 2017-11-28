/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoVendedor;
import fatec.poo.model.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author 0030481611020
 */
public class GuiVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GuiVendedor
     */
    public GuiVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        txtCEP = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        txtTaxaComissao = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        cbxUF = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblCidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblSalarioBase = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTaxaComissao = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setMnemonic('c');
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtCEP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCEP.setEnabled(false);

        lblCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCPF.setText("CPF");

        btnIncluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setMnemonic('i');
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        txtTaxaComissao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTaxaComissao.setEnabled(false);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setMnemonic('a');
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        cbxUF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        cbxUF.setEnabled(false);

        lblNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNome.setText("Nome");

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setMnemonic('e');
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblEndereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEndereco.setText("Endereço");

        btnSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setMnemonic('s');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCidade.setText("Cidade");

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setEnabled(false);

        lblTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone");

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEndereco.setEnabled(false);

        lblSalarioBase.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSalarioBase.setText("Salário Base");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCidade.setEnabled(false);

        lblCEP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCEP.setText("CEP");

        txtDDD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDDD.setEnabled(false);

        lblUF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUF.setText("UF");

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelefone.setEnabled(false);

        lblTaxaComissao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTaxaComissao.setText("Taxa de Comissão ");

        txtSalarioBase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSalarioBase.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(lblCidade)
                            .addComponent(lblSalarioBase)
                            .addComponent(lblCEP)
                            .addComponent(lblCPF)
                            .addComponent(lblNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnConsultar)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnIncluir)
                        .addGap(42, 42, 42)
                        .addComponent(btnAlterar)
                        .addGap(30, 30, 30)
                        .addComponent(btnExcluir)
                        .addGap(29, 29, 29)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(txtSalarioBase))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTaxaComissao)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTelefone)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTelefone)
                    .addComponent(lblCEP)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSalarioBase)
                    .addComponent(lblTaxaComissao)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        vendedor = null;        
        String cpf = txtCPF.getText().replace(".", "").replace("-", "");
             
        if(!validaCPF(cpf)){
            JOptionPane.showMessageDialog(null,"CPF inválido");
            txtCPF.setText("");
            txtCPF.requestFocus();
        }else{  
            vendedor = daovendedor.consultar(cpf);
            if(vendedor == null){
                txtNome.requestFocus();
                habilitaInsercao(true);            
                txtCPF.setEnabled(false);            
                btnConsultar.setEnabled(false);
                btnExcluir.setEnabled(false);                    
                btnAlterar.setEnabled(false);
            }else{
                txtNome.setText(vendedor.getNome());
                txtEndereco.setText(vendedor.getEndereco());
                txtCidade.setText(vendedor.getCidade());
                cbxUF.setSelectedItem(vendedor.getUf());
                txtCEP.setText(vendedor.getCep());
                txtDDD.setText(vendedor.getDdd());
                txtTelefone.setText(vendedor.getTelefone());
                txtSalarioBase.setText(String.valueOf(vendedor.getSalarioBase()));
                txtTaxaComissao.setText(String.valueOf(vendedor.getComissao()));

                habilitaInsercao(true);
                txtCPF.setEnabled(false);            
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(false);              
            }       
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed
     
    
    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        vendedor = new Vendedor(txtCPF.getText().replace("/", "").replace(".", "").replace("-", ""),
                                txtNome.getText(), Double.parseDouble(txtSalarioBase.getText().replace(",", ".")));
        vendedor.setCidade(txtCidade.getText());
        vendedor.setCep(txtCEP.getText().replace("-", ""));
        vendedor.setUf(cbxUF.getSelectedItem().toString());
        vendedor.setEndereco(txtEndereco.getText());
        vendedor.setDdd(txtDDD.getText());
        vendedor.setTelefone(txtTelefone.getText().replace("-", ""));
        vendedor.setComissao(Double.parseDouble(txtTaxaComissao.getText().replace(",", ".")));
        
        daovendedor.inserir(vendedor);
        clear();
        habilitaInsercao(false);
        txtCPF.setEnabled(true);
        btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0){//Sim
            vendedor.setSalarioBase(Double.parseDouble(txtSalarioBase.getText().replace(",", ".")));
            vendedor.setNome(txtNome.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setCep(txtCEP.getText().replace("-", ""));
            vendedor.setUf(cbxUF.getSelectedItem().toString());
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setDdd(txtDDD.getText());
            vendedor.setTelefone(txtTelefone.getText().replace("-", ""));
            vendedor.setComissao(Double.parseDouble(txtTaxaComissao.getText().replace(",", ".")));
            
            daovendedor.alterar(vendedor);
            clear();
            habilitaInsercao(false);
            btnConsultar.setEnabled(true);
            txtCPF.setEnabled(true);
        } 
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0){
            daovendedor.excluir(vendedor); 
            
            clear();
            habilitaInsercao(false);
            btnConsultar.setEnabled(true);
            txtCPF.setEnabled(true);
        }   
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1611029","BD1611029");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@Apolo:1521:xe");
        daovendedor = new DaoVendedor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiVendedor().setVisible(true);
            }
        });
    }

    private void habilitaInsercao(boolean habilita){
        txtCPF.setEnabled(habilita);
        txtNome.setEnabled(habilita);
        txtEndereco.setEnabled(habilita);
        txtCidade.setEnabled(habilita);
        cbxUF.setEnabled(habilita);
        txtCEP.setEnabled(habilita);
        txtSalarioBase.setEnabled(habilita);
        txtTaxaComissao.setEnabled(habilita);
        txtDDD.setEnabled(habilita);
        txtTelefone.setEnabled(habilita);
        btnAlterar.setEnabled(habilita);
        btnConsultar.setEnabled(habilita);
        btnIncluir.setEnabled(habilita);
        btnExcluir.setEnabled(habilita);
    }
    
    private void clear(){
        txtCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        cbxUF.setSelectedIndex(1);
        txtCEP.setText("");
        txtSalarioBase.setText("");
        txtTaxaComissao.setText("");
        txtDDD.setText("");
        txtTelefone.setText("");
    }
    
    private boolean validaCPF(String CPF){         
        int valid = 0;
        String erro = "";
        int numMult, i, result, numCpf;
        
        if(
           CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") ||           
           CPF.equals("33333333333") || CPF.equals("33333333333") || CPF.equals("44444444444") ||
           CPF.equals("55555555555") || CPF.equals("66666666666") || CPF.equals("77777777777") ||
           CPF.equals("88888888888") || CPF.equals("99999999999") || CPF.length() != 11){
            return false;
        }
        
        numMult = 10;
        i = 0;
        result = 0;
        while (numMult >= 2) {
            numCpf = Integer.parseInt(CPF.substring(i,i+1));
            result = result + numCpf * numMult;
            numMult -= 1;
            i += 1;
        }
        result = result * 10;
        result = result % 11;
        if (result == 10) {
            result = 0;
        }
        if (result == Integer.parseInt(CPF.substring(9,10))) {
            numMult = 11;
            i = 0;
            result = 0;
            while (numMult >= 2) {
                numCpf = Integer.parseInt(CPF.substring(i,i+1));
                result = result + numCpf * numMult;
                numMult -= 1;
                i += 1;
            }
            result = result * 10;
            result = result % 11;
            if (result == 10) {
                result = 0;
            }
            if (result == Integer.parseInt(CPF.substring(10,11))) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTaxaComissao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTaxaComissao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private Vendedor vendedor;
    private DaoVendedor daovendedor;
    private Conexao conexao;
}
