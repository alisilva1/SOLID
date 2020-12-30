package rh.Reajuste;

import rh.ValidacaoException;
import rh.model.Funcionario;
import java.math.BigDecimal;
import java.math.RoundingMode;

class ReajustarSalario {
    public void ReajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcionario.atualizaSalario(salarioReajustado);

    }
}
