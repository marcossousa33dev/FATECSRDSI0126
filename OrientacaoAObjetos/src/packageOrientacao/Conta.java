package packageOrientacao;

public class Conta {
    //Trabalhamos os Estados -> Atributos "Variáveis"
    int numero;
    double saldo;
    double limite = 0;
    
    //Trabalhar os comportamentos -> Métodos "Funções"
    public void deposita(double valorDeposito){
        this.saldo += valorDeposito;
        this.descontaTarifa();
    }
    
    public void saque(double valorSaque){        
        if (this.saldo - valorSaque < 0){
            System.out.println("Amigo, o saldo vai ficar negativo, não prosseguir.");
        }else{
            this.saldo -= valorSaque;
            this.descontaTarifa();
        }
    }
    
    private void descontaTarifa(){
        this.saldo -= 0.1;
    }
    
    public double consultaSaldoDisponivel(){
        return this.saldo + this.limite;
    }
    
    public void imprimeExtrato(){
        System.out.println("Saldo: " + this.saldo);
    }    
    
}
