package rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

//O que é um funcionário
public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.dataUltimoReajuste = LocalDate.now();
	}
	/*
	//Se eu extender o funcionário terceirizado, a herança não vai respeitar o parametro de Liskov Substitution Principle, onde eu vou ter um funcionário terceirizado
	//realizando funções como aumento e promoção pela empresa contratante e não pela empresa terceirizada.
	//Para evitar problemas relacionados a Herança, foi indicado a utilização da composição

	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;


	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
	*/


	/* Metodo criado no funcionário que para obter melhor coesão será recriado em outro pacote e classe.

	public void reajustarSalario(BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);  //RoundingMode.HALF_UP divide aumento/salario e arredonda para cima. Calcula a porcentagem do aumento
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		this.salario = this.salario.add(aumento);	//Soma o salário com o aumento
		this.dataUltimoReajuste = LocalDate.now();
	}

	Novo metodo coeso */



	//Getter and Setter for new Class

	public String getNome() {
		return dadosPessoais.getNome();
	}

	public void setNome(String nome) {
		dadosPessoais.setNome(nome);
	}

	public String getCpf() {
		return dadosPessoais.getCpf();
	}

	public void setCpf(String cpf) {
		dadosPessoais.setCpf(cpf);
	}
	public Cargo getCargo() {
		return dadosPessoais.getCargo();
	}

	public void setCargo(Cargo cargo) {
		dadosPessoais.setCargo(cargo);
	}

	public BigDecimal getSalario() {
		return dadosPessoais.getSalario();
	}

	public void setSalario(BigDecimal salario) {
		dadosPessoais.setSalario(salario);
	}

	//Methods
	public void atualizaSalario(BigDecimal novoSalario){
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

    public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
}
