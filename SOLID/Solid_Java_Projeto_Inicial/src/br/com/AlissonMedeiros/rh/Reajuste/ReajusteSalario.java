package rh.Reajuste;

import rh.ValidacaoException;
import rh.model.Funcionario;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


class ReajustarSalario {

    private List<ValidacaoReajuste> validacoes;

    public ReajustarSalario(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void ReajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v -> v.Validar(funcionario,aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(salarioReajustado);

    }
}
