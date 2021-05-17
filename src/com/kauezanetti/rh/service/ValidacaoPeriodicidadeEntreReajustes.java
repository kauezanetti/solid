package com.kauezanetti.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.kauezanetti.rh.ValidacaoException;
import com.kauezanetti.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{
	public void validar(Funcionario funcionario, BigDecimal aumento) {		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoReajuste > 6) {
			throw new ValidacaoException("Intervalor entre reajuste salarial deve ser de no minimo 6 meses!");
		}
	}
}
