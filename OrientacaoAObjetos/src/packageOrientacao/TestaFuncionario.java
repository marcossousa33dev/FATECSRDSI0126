package packageOrientacao;

public class TestaFuncionario {


    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
        f.setNome("José Risadinha");
        f.setSalario(1200);
        
        System.out.println("Nome: " + f.getNome());
        System.out.println("Salario: " + f.getSalario());
    }
    
}
