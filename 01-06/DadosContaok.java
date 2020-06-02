
package conta_bancaria;


class DadosConta {
    int numConta;
    String nome;
    int idade;
    String Cidade;
    private double saldo;
    private double limite;
    int Saldo;
    
    public int getNumConta() {
        return numConta;
       
    }
    
    public void setNumConta (int numConta){
    this.numConta = numConta;
    }
     
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
      public int getIdade(){
        return idade;
    }
    
    public void setNome( int idade ){
        this.idade = idade;
    }
     public String getCidade(){
        return Cidade;
    }
    
    public void setCidade(String cidade){
        this.Cidade = cidade;
    }

    void setIdade(int i) {
       this.idade = idade;
    }
public void setlimite(double limite) {
    this.limite = limite;
}
    
public int getSaldo(){
    return (int) saldo;
}
 public void setSaldo( int Saldo ){
        this.Saldo = Saldo;
 }
   public void deposito(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Saldo atual após o deposito: " + this.saldo);
    }
    
    public void retirada (double valor){
        if (valor > this.saldo) {
            System.out.println("SALDO INSUFICIENTE PARA RETIRADA!");
        }
        else{ this.saldo = this.saldo - valor;
        }
 
        
        
}}
