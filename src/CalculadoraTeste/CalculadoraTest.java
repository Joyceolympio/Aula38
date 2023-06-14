package CalculadoraTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void deveriaSomarDoisNumerosInteiros(){
        int soma = calc.soma(4, 6);
        Assertions.assertEquals(10, soma);
    }

    @Test
    public void deveriaSubtrairDoisNumerosInteiros(){
        int subtracao = calc.subtracao(7, 2);
        Assertions.assertEquals(5, subtracao);
    }



















//    public static void main(String[] args) {
//
//        CalculadoraTeste.Calculadora calc = new CalculadoraTeste.Calculadora();
//
//        int soma = calc.soma(5, 7);
//        System.out.println("O resultado da soma é: " + soma);
//
//        int subtracao = calc.subtracao(10, 6);
//        System.out.println("O resultado da subtração é: " + subtracao);
//
//    }

}
