
package contabancaria;

import javax.swing.JOptionPane;


public class ContaBancaria1 {

   
    public static void main(String[] args) {
        ContaDados dados = new ContaDados();
        
        JOptionPane.showMessageDialog(null,"Bem vindo. Para acessar sua conta, procure estar com seu cpf em mãos, pois serão solicitados:\n"
                + "O numero da sua conta\n"
                + "O numero da sua agencia\n"
                + "A sua senha pessaol\n"
                + "O seu nome completo\n"
                + "E o número da sua agencia.");
        
         int Agencia,auxConta;
       String auxSenha,nome;
       
        int auxAgencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de sua agencia"));
       auxConta = (Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da sua conta")));
       auxSenha = (JOptionPane.showInputDialog(null,"Digite a sua senha"));
       nome = (JOptionPane.showInputDialog(null,"Digite seu nome"));
       dados.login(auxAgencia, auxConta, auxSenha,nome);
       
      JOptionPane.showMessageDialog(null,"Bem vindo:"+dados.setNome());
      JOptionPane.showMessageDialog(null,"Seu cpf:"+dados.setCpf());
      JOptionPane.showMessageDialog(null,"Sua agencia:"+dados.setAgencia());
      JOptionPane.showMessageDialog(null,"Sua conta:"+dados.setConta());
      JOptionPane.showMessageDialog(null,"Sua senha pessoal:"+dados.setSenha());
      
      


    } 
}
