package contaluz;

import javax.swing.JOptionPane;

/**
 * @author Giulia
 */
public class Contaluz {

    public static void main(String[] args) {
    
        Luz dados = new Luz();
        
        dados.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Leitura Anterior: ")));
        dados.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Leitura Atual: ")));
        
        dados.gasto(dados.getLeituraAtual(),dados.getLeituraAnterior());
        dados.taxaTusd(dados.getGasto());
        dados.taxaTe(dados.getGasto());
        dados.total(dados.getTaxaTusd(),dados.getTaxaTe());
        dados.calcSemBand(dados.getTotal(), dados.getIcms());
        
        dados.bandeira(dados.getGasto());
        dados.acrescimo(dados.getBandeira(),dados.getIcms());
        dados.calcComBand(dados.getBandeira(),dados.getIcms());
        dados.notafiscal(dados.getLeituraAnterior(),dados.getLeituraAtual(),dados.getGasto(),dados.getTaxaTusd(),dados.getTaxaTe(),dados.getTotal(),dados.getIcms(),dados.getBandeira(),dados.getAcrescimo(),dados.getTotalConta());
        
    }

    
}

    
    
