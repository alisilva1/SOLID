package rh.Reajuste;

import rh.ValidacaoException;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidade implements ValidacaoReajuste {
    public void Validar(Funcionario funcionario, BigDecimal aumento) {

        LocalDate dataDoUltimoReajuste = rh.model.Funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long diference = ChronoUnit.MONTHS.between(dataDoUltimoReajuste, dataAtual);

        if (diference < 6) {
            throw new ValidacaoException("Tempo necessário entre dois ajustes deve ser maior que 6 meses");
        }

    }
}
