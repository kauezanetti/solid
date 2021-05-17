package com.kauezanetti.rh.service;

import java.math.BigDecimal;
import com.kauezanetti.rh.model.Funcionario;

public interface ValidacaoReajuste {
	void validar(Funcionario funcionario, BigDecimal aumento);
}
