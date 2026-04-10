package packageOrientacao;

public class TesteAula {

    public static void main(String[] args) {
        SeguroDeVeiculo sdv = new SeguroDeVeiculo();
        Emprestimo e = new Emprestimo();
                
        e.setValor(1000);
        sdv.setValorDoSeguroDeVeiculo(1000);
        
        System.out.println("Empréstimo -> " + e.calculaTaxa());
        System.out.println("Seguro ->" + sdv.calculaTaxa());  
        
    }
    
}
