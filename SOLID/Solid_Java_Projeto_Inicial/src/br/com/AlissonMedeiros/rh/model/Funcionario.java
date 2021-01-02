package rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

//O que é um funcionário
public class Funcionario {

	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

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

	public void atualizaSalario(BigDecimal novoSalario){
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

    public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
    }
}
