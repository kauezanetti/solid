package com.kauezanetti.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import com.kauezanetti.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public void reajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void validacao(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
