package rh.promocao;

import rh.ValidacaoException;
import rh.model.Cargo;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {
    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor){
        this.valor = valor;
        this.data = LocalDate.now();
    }

    //Getter and Setter

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

    //Function

    public static void promover(Funcionario funcionario, boolean metaAlcancada){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Nao e possivel promover um gerente!");
        }
        if(metaAlcancada==true){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else{
            throw new ValidacaoException("Funcionario nao alcancou a meta!");
        }

    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(new BigDecimal("0.1"));
    }
}
