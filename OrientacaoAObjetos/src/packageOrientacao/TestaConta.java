
package packageOrientacao;

public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1234;
        
        c1.saldo = 1000;
        c1.imprimeExtrato();  
        
        c1.saque(200);
        c1.imprimeExtrato();
        
    }
    
}
