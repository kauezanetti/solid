package com.kauezanetti.rh.service.reajuste;

import java.math.BigDecimal;
import com.kauezanetti.rh.model.Funcionario;

public interface ValidacaoReajuste {
	void validar(Funcionario funcionario, BigDecimal aumento);
}
