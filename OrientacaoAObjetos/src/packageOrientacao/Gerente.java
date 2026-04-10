package packageOrientacao;

public class Gerente {
    String nome;
    double salario;
    
    void aumentaSalario(){
        this.aumentaSalario(0.32);
    }
    
    void aumentaSalario(double taxa){
        this.salario += this.salario * taxa;
    }    
}
