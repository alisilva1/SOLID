package rh.Reajuste;

import rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void Validar(Funcionario funcionario, BigDecimal aumento);
}
