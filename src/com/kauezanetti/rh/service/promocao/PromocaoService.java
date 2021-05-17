package com.kauezanetti.rh.service.promocao;

import com.kauezanetti.rh.ValidacaoException;
import com.kauezanetti.rh.model.Cargo;
import com.kauezanetti.rh.model.Funcionario;

public class PromocaoService {
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == funcionario.getCargo()) {
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		}
		
		if (!metaBatida) {
			throw new ValidacaoException("A meta não foi batida");
		}
		
		Cargo novoCargo = cargoAtual.getProximoCargo();
		funcionario.promover(novoCargo);
	}
}
