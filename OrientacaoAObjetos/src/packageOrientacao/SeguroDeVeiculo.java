package packageOrientacao;

public class SeguroDeVeiculo extends Servico {    
    
    private double valorDoSeguroDeVeiculo;
    private double franquia;    

    public double getValorDoSeguroDeVeiculo() {
        return valorDoSeguroDeVeiculo;
    }

    public void setValorDoSeguroDeVeiculo(double valorDoSeguroDeVeiculo) {
        this.valorDoSeguroDeVeiculo = valorDoSeguroDeVeiculo;
    }

    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }   
    
    @Override
    public double calculaTaxa(){
        return super.calculaTaxa() + this.valorDoSeguroDeVeiculo * 0.2;
    }  
}
