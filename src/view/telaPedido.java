/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.*;
import data.*;
import java.util.List;
import javax.swing.JOptionPane;
import static view.telaInicial.contaEncontrada;
import static view.telaInicial.nomecliente;

/**
 *
 * @author julro
 */
public class telaPedido extends javax.swing.JFrame {

    /**
     * Creates new form telaPedido
     */
    
    public static String itens;
    public static double valTotal;
    public static Pedido novoPedido = new Pedido();
    public static int pontosganhos = 0;
    public static int pontosUsados = 0;
    public telaPedido() {
        initComponents();
        preencherCBs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbPrinc = new javax.swing.JLabel();
        pnPedido = new javax.swing.JPanel();
        lbLanches = new javax.swing.JLabel();
        cbLanches = new javax.swing.JComboBox<>();
        lbBebidas = new javax.swing.JLabel();
        cbBebidas = new javax.swing.JComboBox<>();
        lbAcomp = new javax.swing.JLabel();
        cbAcomp = new javax.swing.JComboBox<>();
        lbSobremesa = new javax.swing.JLabel();
        cbSobremesa = new javax.swing.JComboBox<>();
        rbGorjeta = new javax.swing.JRadioButton();
        txtGorjeta = new javax.swing.JFormattedTextField();
        lbPagamento = new javax.swing.JLabel();
        cbPagamento = new javax.swing.JComboBox<>();
        btnPronto = new javax.swing.JButton();
        lbPontos = new javax.swing.JLabel();
        txtPontos = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbPrinc.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 22)); // NOI18N
        lbPrinc.setForeground(new java.awt.Color(255, 0, 0));
        lbPrinc.setText("Vamos preparar seu pedido!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPrinc)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbPrinc)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbLanches.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lbLanches.setForeground(new java.awt.Color(255, 0, 0));
        lbLanches.setLabelFor(cbLanches);
        lbLanches.setText("Lanche:");

        lbBebidas.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lbBebidas.setForeground(new java.awt.Color(255, 0, 0));
        lbBebidas.setLabelFor(cbBebidas);
        lbBebidas.setText("Bebida:");

        lbAcomp.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lbAcomp.setForeground(new java.awt.Color(255, 0, 0));
        lbAcomp.setLabelFor(cbAcomp);
        lbAcomp.setText("Acompanhamento:");

        lbSobremesa.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lbSobremesa.setForeground(new java.awt.Color(255, 0, 0));
        lbSobremesa.setLabelFor(cbSobremesa);
        lbSobremesa.setText("Sobremesa:");

        rbGorjeta.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        rbGorjeta.setForeground(new java.awt.Color(255, 0, 0));
        rbGorjeta.setText("Deseja adicionar gorjeta?");
        rbGorjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGorjetaActionPerformed(evt);
            }
        });

        txtGorjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtGorjeta.setEnabled(false);

        lbPagamento.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lbPagamento.setForeground(new java.awt.Color(255, 0, 0));
        lbPagamento.setText("Forma de pagamento:");

        cbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão débito", "Cartão crédito", "PIX" }));
        cbPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPagamentoActionPerformed(evt);
            }
        });

        btnPronto.setBackground(new java.awt.Color(255, 0, 0));
        btnPronto.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        btnPronto.setForeground(new java.awt.Color(255, 255, 255));
        btnPronto.setText("Pronto");
        btnPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntoActionPerformed(evt);
            }
        });

        lbPontos.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lbPontos.setForeground(new java.awt.Color(255, 0, 0));
        lbPontos.setText("Pontos para usar:");

        txtPontos.setEditable(false);
        txtPontos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtPontos.setText("0");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("*cada ponto dá um desconto de R$0,10");

        javax.swing.GroupLayout pnPedidoLayout = new javax.swing.GroupLayout(pnPedido);
        pnPedido.setLayout(pnPedidoLayout);
        pnPedidoLayout.setHorizontalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPedidoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnPronto))
                            .addGroup(pnPedidoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPedidoLayout.createSequentialGroup()
                                .addComponent(cbLanches, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBebidas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnPedidoLayout.createSequentialGroup()
                                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnPedidoLayout.createSequentialGroup()
                                        .addComponent(lbLanches)
                                        .addGap(64, 64, 64)
                                        .addComponent(lbBebidas))
                                    .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbAcomp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbAcomp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lbSobremesa)
                                    .addComponent(rbGorjeta)
                                    .addComponent(txtGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbPagamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lbPontos)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnPedidoLayout.setVerticalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLanches)
                    .addComponent(lbBebidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLanches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbAcomp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSobremesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPontos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPronto)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbGorjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGorjetaActionPerformed
        if (rbGorjeta.isSelected()) {
            txtGorjeta.setEnabled(true);
        } else {
            txtGorjeta.setEnabled(false);
        }
    }//GEN-LAST:event_rbGorjetaActionPerformed

    private void btnProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntoActionPerformed
        if(contaEncontrada != null){
            if(Integer.parseInt(txtPontos.getText()) > contaEncontrada.getPontos()){
            JOptionPane.showMessageDialog(rootPane, "Você não tem essa quantidade de pontos!");
        }
        }
        prepararPedido();
    }//GEN-LAST:event_btnProntoActionPerformed

    private void cbPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPagamentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(telaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPronto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<Acompanhamento> cbAcomp;
    private javax.swing.JComboBox<Bebida> cbBebidas;
    private javax.swing.JComboBox<Lanche> cbLanches;
    private javax.swing.JComboBox<String> cbPagamento;
    private javax.swing.JComboBox<Sobremesa> cbSobremesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAcomp;
    private javax.swing.JLabel lbBebidas;
    private javax.swing.JLabel lbLanches;
    private javax.swing.JLabel lbPagamento;
    private javax.swing.JLabel lbPontos;
    private javax.swing.JLabel lbPrinc;
    private javax.swing.JLabel lbSobremesa;
    private javax.swing.JPanel pnPedido;
    private javax.swing.JRadioButton rbGorjeta;
    private javax.swing.JFormattedTextField txtGorjeta;
    private javax.swing.JFormattedTextField txtPontos;
    // End of variables declaration//GEN-END:variables
    
    
    private void preencherCBs(){
        LancheDAO LDAO = new LancheDAO();
        List<Lanche> listaL = LDAO.getLanches();
        
        cbLanches.addItem(null);
        for(Lanche l : listaL){
            cbLanches.addItem(l);
        }
        
        BebidaDAO BDAO = new BebidaDAO();
        List<Bebida> listaB = BDAO.getBebidas();
        
        cbBebidas.addItem(null);
        for(Bebida b : listaB){
            cbBebidas.addItem(b);
        }
        
        AcompanhamentoDAO AcDAO = new AcompanhamentoDAO();
        List<Acompanhamento> listaAc = AcDAO.getAc();
        
        cbAcomp.addItem(null);
        for(Acompanhamento a : listaAc){
            cbAcomp.addItem(a);
        }
        
        SobremesaDAO SDAO = new SobremesaDAO();
        List<Sobremesa> listaS = SDAO.getSob();
        
        cbSobremesa.addItem(null);
        for(Sobremesa s : listaS){
            cbSobremesa.addItem(s);
        }
    }
    
    private void prepararPedido(){
        Lanche lancheSel = (Lanche) cbLanches.getSelectedItem();
        String lanche;
        double valLanche;
        int idLanche;
        
        Bebida bebidaSel = (Bebida) cbBebidas.getSelectedItem();
        String bebida;
        double valBebida;
        int idBebida;
        
        Acompanhamento acSel = (Acompanhamento) cbAcomp.getSelectedItem();
        String acompanhamento;
        double valAc;
        int idAc;
        
        Sobremesa sobSel = (Sobremesa) cbSobremesa.getSelectedItem();
        String sobremesa;
        double valSob;
        int idSob;
        
        double valGorjeta = 0;
        String formaP = cbPagamento.getSelectedItem().toString();
        
        if(lancheSel == null){
            valLanche = 0;
            lanche = "";
        }else{
            valLanche = lancheSel.getValor();
            lanche = lancheSel.getNome();
            idLanche = lancheSel.getId_lanche();
        }
        
        if(bebidaSel == null){
            valBebida = 0;
            bebida = "";
        }else{
            valBebida = bebidaSel.getValor();
            bebida = bebidaSel.getNome() + " " + bebidaSel.getQuantidade() + "ml";
            idBebida = bebidaSel.getId_bebida();
        }
        
        if(acSel == null){
            valAc = 0;
            acompanhamento = "";
        }else{
            valAc = acSel.getValor();
            acompanhamento = acSel.getNome();
            idAc = acSel.getId_acompanhamento();
        }
        
        if(sobSel == null){
            valSob = 0;
            sobremesa = "";
        }else{
            valSob = sobSel.getValor();
            sobremesa = sobSel.getNome() + " de " + sobSel.getSabor();
            idSob = sobSel.getId_sobremesa();
        }
        
        if(!txtGorjeta.getText().isEmpty()){
            valGorjeta = Double.parseDouble(txtGorjeta.getText().replace(",", "."));
        }
        
        double valAntesDesc = valLanche + valBebida + valAc + valSob;
        itens = lanche +"\n"+ bebida +"\n"+ acompanhamento +"\n"+ sobremesa;
        pontosUsados = 0;
        double desconto = 0.0;
        
        if(contaEncontrada != null){
            pontosUsados = Integer.parseInt(txtPontos.getText());
            
            if(pontosUsados > contaEncontrada.getPontos()){
                JOptionPane.showMessageDialog(rootPane, "Você não tem essa quantidade de pontos!");
                
            }else{
                 desconto = 0.10 * pontosUsados;
                
                 valAntesDesc = valAntesDesc - desconto;
                 int novosPontos = contaEncontrada.getPontos() - pontosUsados;
                 contaEncontrada.setPontos(novosPontos);
            }
        }
        
        valTotal = valAntesDesc + valGorjeta;
        double pontos = valTotal / 2;
        pontosganhos = (int)pontos;
        
        PedidoDAO pDAO = new PedidoDAO();
        
        if(contaEncontrada != null){
            novoPedido.setConta_id(contaEncontrada);
        }else{
            novoPedido.setConta_id(null);
        }
        novoPedido.setLanche_id(lancheSel);
        novoPedido.setBebida_id(bebidaSel);
        novoPedido.setAcompanhamento_id(acSel);
        novoPedido.setSobremesa_id(sobSel);
        novoPedido.setNomecliente(nomecliente);
        novoPedido.setValortotal(valTotal);
        novoPedido.setFormapagamento(formaP);
        novoPedido.setPontosusados(pontosUsados);
        novoPedido.setDesconto(desconto);
        novoPedido.setGorjeta(valGorjeta);
        
        pDAO.registrarPedido(novoPedido);
        
        telaFinal telaF = new telaFinal();
        telaF.mostrarPedido(itens, valTotal, formaP);
        if(contaEncontrada != null){
            telaF.conceberPontos(pontosganhos, pontosUsados);
        }
        telaF.setVisible(true);
        dispose();
    }
    
    public void habilitarPontos(){
        txtPontos.setEditable(true);
    }
}
