import java.math.BigDecimal;

public class ReajusteSalarial {

    public void reajusteSalarioDoFuncionario(Funcionario funcionario, Desempenho desempenho){

        if (desempenho == Desempenho.BOM){

            BigDecimal reajusteBom = funcionario.getSalario().multiply(new BigDecimal("0.10"));
            funcionario.reajusteDoSalario(reajusteBom);

        }else if (desempenho == Desempenho.OTIMO){

            BigDecimal reajusteOtimo = funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.reajusteDoSalario(reajusteOtimo);

        }else if (desempenho == Desempenho.A_DESEJAR){
            throw new IllegalArgumentException("Funcionário não deve receber reajuste por ter um desempenho ruim!");
        }

    }

}
