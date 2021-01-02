package rh.promocao;

import rh.ValidacaoException;
import rh.model.Cargo;
import rh.model.Funcionario;

public class Promocao {

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
}
