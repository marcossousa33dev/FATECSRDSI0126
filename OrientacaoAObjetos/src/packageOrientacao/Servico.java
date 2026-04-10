package packageOrientacao;

public class Servico {
    private String nomeServico;
    private int codigoServico;
    private String dataDeContratacao;    
    
    public Servico(){
        System.out.println("Estanciado o serviço");
    }

    public Servico(String nomeServico, int codigoServico, String dataDeContratacao){
        setNomeServico(nomeServico);
        setCodigoServico(codigoServico);
        setDataDeContratacao(dataDeContratacao);
        
        System.out.println(getNomeServico());
        System.out.println(getCodigoServico());
        System.out.println(getDataDeContratacao());
    }
    
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }
    
    public double calculaTaxa(){
        return 12.5;
    }    
}
