package rh.model;

import java.math.BigDecimal;

	/*
	//Se eu extender o funcionário terceirizado, a herança não vai respeitar o parametro de Liskov Substitution Principle, onde eu vou ter um funcionário terceirizado
	//realizando funções como aumento e promoção pela empresa contratante e não pela empresa terceirizada.
	//Para evitar problemas relacionados a Herança, foi indicado a utilização da composição

     Por isso comentei o funcionario
	 */

public class Terceirizado /* extends Funcionario */{

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }


    //Getter and Setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
