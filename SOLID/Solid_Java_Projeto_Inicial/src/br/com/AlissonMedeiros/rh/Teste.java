package rh;

import rh.Reajuste.ReajustarSalario;
import rh.model.Cargo;
import rh.model.Funcionario;
import rh.promocao.Promocao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;

public class Teste {
    public static void main(String[] args) {
        Funcionario Alfa = new Funcionario("Alisson","138", Cargo.ANALISTA, BigDecimal.valueOf(2350));
        //ReajustarSalario.ReajustarSalarioFuncionario(Alfa,BigDecimal.valueOf(2350));
        Promocao.promover(Alfa,true);
        System.out.println(MessageFormat.format("Funcionário: {0} seu salário foi reajustado para {1} em {2}", Alfa.getNome(),Alfa.getSalario(),Alfa.getDataUltimoReajuste()));
        System.out.println(MessageFormat.format("o seu cargo atual é de {0}",Alfa.getCargo()));
    }
}
