package projetorpg;

import ferramentas.CaixaDeDialogo;
import java.util.Random;
import modelos.Oponente;
import modelos.Personagem;

/**
 *
 * @author elton_schwarzer
 */
public class TelaConfronto extends javax.swing.JFrame {
    Personagem personagem;
    Oponente oponente = new Oponente();
    Random gerador = new Random();
    int vidaMaximaOponente = 0;
    /**
     * Creates new form TelaConfronto
     */
    public TelaConfronto(Personagem personagem) {
        initComponents();
        
        this.personagem = personagem;
        //preenche com o nomde da classe escolhida
        mostrarPersonagem();
        
        gerarOponente(); //GERANDO UM OPONENTE COM ATAQUE E VIDA ALEATÓRIOS
        mostrarOponente();
       
    }
    
    private void mostrarPersonagem(){
        lblClasse.setText(personagem.getNome()+" - " + personagem.getClasse());
        lblVidaPersonagem.setText(String.valueOf(personagem.getVida()));
        lblAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
             
    }
    
    private void gerarOponente(){
        try{
            
            oponente.setAtaque(gerador.nextInt(135) + 1);
            oponente.setVida(gerador.nextInt(300) + 1);
            vidaMaximaOponente = oponente.getVida();
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage().toString(), 'e');
        }
    }
    
    private void mostrarOponente(){
        lblVidaOponente.setText(String.valueOf(oponente.getVida()));
        lblAtaqueOponente.setText(String.valueOf(oponente.getAtaque()));
              
        //INCLUSÃO DE BARRA DE PROGRESSO DA VIDA DO OPONENTE 
        prbVidaOponente.setMinimum(0);
        prbVidaOponente.setMaximum(vidaMaximaOponente);
        prbVidaOponente.setValue(oponente.getVida());
        prbVidaOponente.setStringPainted(true);
        prbVidaOponente.setString(String.valueOf(oponente.getVida()));
        
    }
    
    private void ataque(){
        //PERSONAGEM ATACA O OPONENTE
        int ataque = 0;
        int valorDado = gerador.nextInt(20) + 1;
        if(valorDado > 13){ //ATAQUE CRÍTICO;
            ataque = personagem.getAtaque() / 2;
        }else{
            ataque = personagem.getAtaque() / 3;
        }
        System.out.println("DADO: " + valorDado);
        System.out.println("ATAQUE: " + ataque);
        
        int vidaRestante = oponente.getVida() - ataque;
        oponente.setVida(vidaRestante);
    }
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblClasse = new javax.swing.JLabel();
        lblVidaPersonagem = new javax.swing.JLabel();
        btnAtaque = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblAtaquePersonagem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVidaOponente = new javax.swing.JLabel();
        lblAtaqueOponente = new javax.swing.JLabel();
        prbVidaOponente = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Personagem:");

        jLabel2.setText("Vida Atual:");

        lblClasse.setText("...");

        lblVidaPersonagem.setText("...");

        btnAtaque.setText("Ataque");
        btnAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueActionPerformed(evt);
            }
        });

        jLabel3.setText("Ataque:");

        lblAtaquePersonagem.setText("...");

        jLabel4.setText("Oponente:");

        jLabel5.setText("Vida Atual:");

        jLabel6.setText("Ataque:");

        lblVidaOponente.setText("...");

        lblAtaqueOponente.setText("...");

        prbVidaOponente.setValue(50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(btnAtaque)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblClasse, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(lblVidaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAtaquePersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAtaqueOponente)
                                    .addComponent(lblVidaOponente))))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prbVidaOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblClasse)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVidaPersonagem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(lblVidaOponente))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtaquePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(prbVidaOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblAtaqueOponente))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btnAtaque)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueActionPerformed
        // TODO add your handling code here:       
       ataque();
       
       //VERIFICAR SE O OPONENTE AINDA ESTÁ VIDO
       if(oponente.getVida() > 0){
           mostrarOponente();
       }else{
           gerarOponente();
           mostrarOponente();
       }
       
    }//GEN-LAST:event_btnAtaqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfronto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAtaqueOponente;
    private javax.swing.JLabel lblAtaquePersonagem;
    private javax.swing.JLabel lblClasse;
    private javax.swing.JLabel lblVidaOponente;
    private javax.swing.JLabel lblVidaPersonagem;
    private javax.swing.JProgressBar prbVidaOponente;
    // End of variables declaration//GEN-END:variables
}
