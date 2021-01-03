package rh.Reajuste;

import rh.ValidacaoException;
import rh.model.Funcionario;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class ReajustarSalario {

    private List<ValidacaoReajuste> validacoes;

    public ReajustarSalario(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void ReajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){

        this.validacoes.forEach(v -> v.Validar(funcionario,aumento));

        /*
        é a mesma coisa do código acima   1) private List da Interface / 2) Constructor / 3) forEach;

        ValidacaoPercentual validacaoPercentual = new ValidacaoPercentual();
        ValidacaoPeriodicidade validacaoPeriodicidade = new ValidacaoPeriodicidade();

        validacaoPercentual.validar(funcionario,aumento);
        validacaoPeriodicidade.validar(funcionario,aumento);
         */


        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(salarioReajustado);

    }
}
