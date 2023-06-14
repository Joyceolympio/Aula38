import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {

    //Atributos
    String nome;
    BigDecimal salario;

    //Construtor
    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }




    public BigDecimal getSalario() {
        return salario;
    }


    //Método que adiciona o novo salário com reajuste e arredonda o valor
    public void reajusteDoSalario(BigDecimal reajuste){
        this.salario = this.salario.add(reajuste).setScale(2, RoundingMode.HALF_UP);
    }
}
