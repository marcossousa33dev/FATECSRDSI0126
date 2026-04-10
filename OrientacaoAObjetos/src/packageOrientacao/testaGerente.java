
package packageOrientacao;

public class testaGerente {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.salario = 1000;
        
        
        g.aumentaSalario();
        System.out.println(g.salario);
        
        g.aumentaSalario(0.2);
        System.out.println(g.salario);
    }
    
}
