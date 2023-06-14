import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReajusteSalarialTest {

    ReajusteSalarial reajusteSalarial = new ReajusteSalarial();

    @Test
    public void reajusteDeveriaSerDezPorCentoDoSalario(){

        Funcionario funcionario = new Funcionario("Luiz", new BigDecimal("1000.00"));
        reajusteSalarial.reajusteSalarioDoFuncionario(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());

    }

    @Test
    public void reajusteDeveriaSerVintePorCentoDoSalario(){

        Funcionario funcionario = new Funcionario("Paula", new BigDecimal("2000.00"));
        reajusteSalarial.reajusteSalarioDoFuncionario(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
    }

    @Test
    public void naoDeveriaTerReajusteNoSalario() {

        Funcionario funcionario = new Funcionario("Simone", new BigDecimal("1500.00"));

        assertThrows(IllegalArgumentException.class, () -> reajusteSalarial.reajusteSalarioDoFuncionario(funcionario, Desempenho.A_DESEJAR));
    }



}
