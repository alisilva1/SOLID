package rh;

import rh.model.Cargo;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;

public class Teste {
    public static void main(String[] args) {
        Funcionario Alfa = new Funcionario("Alisson","1388723", Cargo.ANALISTA, BigDecimal.valueOf(2350));
        System.out.println(MessageFormat.format("Funcionário: {0} seu salário foi reajustado para {1} em {2}", Alfa.getNome(),Alfa.getSalario(),Alfa.getDataUltimoReajuste()));
    }
}
