package projetorpg;

import ferramentas.CaixaDeDialogo;
import modelos.Personagem;

/**
 *
 * @author elton_schwarzer
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
       rbGrupo.add(rbGuerreiro);
       rbGrupo.add(rbMago);
       rbGrupo.add(rbPaladino);
    }

       
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGrupo = new javax.swing.ButtonGroup();
        rbGuerreiro = new javax.swing.JRadioButton();
        rbMago = new javax.swing.JRadioButton();
        rbPaladino = new javax.swing.JRadioButton();
        btAvancar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomePersonagem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        rbGuerreiro.setSelected(true);
        rbGuerreiro.setText("GUERREIRO");

        rbMago.setText("MAGO");

        rbPaladino.setText("PALADINO");

        btAvancar.setText("AVANÇAR");
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAvancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbGuerreiro)
                        .addGap(39, 39, 39)
                        .addComponent(rbMago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(rbPaladino)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGuerreiro)
                    .addComponent(rbMago)
                    .addComponent(rbPaladino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
    
        if(txtNomePersonagem.getText().trim().length()>3){

            //Avançar para a tela confronto
            //Enviar os dados da Classe escolhida para a tela Confronto
            Personagem personagemEscolhido = escolherClasse();

            TelaConfronto tela = new TelaConfronto(personagemEscolhido);
            tela.setVisible(true); //Mostra a tela de confronto

            //Colocar a tela atual não visível
            this.setVisible(false);
        }else{
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe um nome com pelo menso 4 caracteres: ","ERROOOOOUUUUU",'e');
        }
        
    }//GEN-LAST:event_btAvancarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup rbGrupo;
    private javax.swing.JRadioButton rbGuerreiro;
    private javax.swing.JRadioButton rbMago;
    private javax.swing.JRadioButton rbPaladino;
    private javax.swing.JTextField txtNomePersonagem;
    // End of variables declaration//GEN-END:variables

    private Personagem escolherClasse() {
        
        try{
            Personagem personagem = new Personagem();
            //Preenche os atributos do personagem conforme a classe
            personagem.setNome(txtNomePersonagem.getText().trim());
            if(rbGuerreiro.isSelected()){
                personagem.setClasse("Guerreiro");
                personagem.setNivel(1);
                personagem.setVida(100);
                personagem.setAtaque(60);
                
            }else if(rbMago.isSelected()){
                personagem.setClasse("Mago");
                personagem.setNivel(1);
                personagem.setVida(50);
                personagem.setAtaque(100);
                
            }else{
                personagem.setClasse("Paladino");
                personagem.setNivel(1);
                personagem.setVida(50);
                personagem.setAtaque(100);
                
            }
            //Retorna o objeto preenchido
            return personagem;
        }catch(Exception ex){
            
        }
        return null;
    }
}
