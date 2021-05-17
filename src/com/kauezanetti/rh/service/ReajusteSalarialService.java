package com.kauezanetti.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import com.kauezanetti.rh.ValidacaoException;
import com.kauezanetti.rh.model.Funcionario;

public class ReajusteSalarialService {
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		funcionario.setSalario(salarioAtual.add(aumento));
		funcionario.setDataUltimoReajuste(LocalDate.now());
	}
}
