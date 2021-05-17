package com.kauezanetti.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private String empresa;
	DadosPessoais dadosPessoais;
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
