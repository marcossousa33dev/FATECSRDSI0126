
package packageOrientacao;

public class Cliente {
    private String nome;
    private int codigo;
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    void cadastraCliente(String nomeCliente, int codigoCliente){        
        this.nome = nomeCliente;
        this.codigo = codigoCliente;
        
        this.mostraMensagem();
    }
    
    void mostraMensagem(){
        System.out.println("O Cliente " + this.nome + 
                " foi cadastrado com sucesso, com o código " + this.codigo + "!!!");
    }
}
