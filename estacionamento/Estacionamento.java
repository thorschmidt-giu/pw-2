package estacionamento;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Giulia
 */
public class Estacionamento {

    public static void main(String[] args) {
        
        double entrada,saida,tempo,total;
        String placa,modeloCarro,nomeDono;
        DecimalFormat formato = new DecimalFormat ("00.00");
        
        modeloCarro = JOptionPane.showInputDialog("O modelo de seu carro é: ");
        placa = JOptionPane.showInputDialog("A placa do seu carro é: ");
        nomeDono = JOptionPane.showInputDialog("Digite seu nome completo: ");
        entrada = Double.parseDouble(JOptionPane.showInputDialog("A hora de sua entrada foi:\n" 
                + "ex: 13.30"));
        saida = Double.parseDouble(JOptionPane.showInputDialog("A hora de sua saida foi:\n" 
                + "ex: 15.30"));
        tempo = saida-entrada;
        total = Math.ceil(tempo) * 4;
        
        if (entrada >24 || saida >24 || tempo <0){
                JOptionPane.showMessageDialog(null,"[erro fatal] Digite os horarios de forma certa");
                System.exit(0);
                 
    }
        JOptionPane.showMessageDialog(null, "Placa do carro: "
                + placa
        +"\n Modelo do carro: "
        + modeloCarro
        +"\n Nome Proprietario: "
        + nomeDono
        +"\n Horario da entrada: "
        + formato.format (entrada)
        +"\n Horario da saida: "
        + formato.format (saida)
        +"\n Tempo no estacionamento: "
        + formato.format (tempo)
        +"\n Valor a pagar: R$"
        + formato.format (total));
}
}
