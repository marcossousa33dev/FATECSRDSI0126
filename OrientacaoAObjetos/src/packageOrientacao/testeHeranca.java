package packageOrientacao;

public class testeHeranca {

    public static void main(String[] args) {
        
        SeguroDeVeiculo sv = new SeguroDeVeiculo();        
               
        sv.setNomeServico("Seguro de veículo");
        sv.setDataDeContratacao("12/03/2026");
        sv.setValorDoSeguroDeVeiculo(125.99);
        
        System.out.println(sv.getNomeServico());
        System.out.println(sv.getValorDoSeguroDeVeiculo());
        System.out.println(sv.getDataDeContratacao());

        Emprestimo e = new Emprestimo();
        e.setNomeServico("Empréstimo");
        e.setValor(1250);
        e.setTaxa(0.1);
        
        System.out.println(e.getNomeServico());
        System.out.println(e.getValor());
        System.out.println(e.getTaxa());        
                
        System.out.println("Taxa Seguro:" + sv.calculaTaxa());
        System.out.println("Taxa Empréstimo:" + e.calculaTaxa());;;
        
    }    
}
