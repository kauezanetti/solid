package com.kauezanetti.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste{

	BigDecimal valor;
	LocalDate data;
	
	public Anuenio(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}
	
	@Override
	public BigDecimal valor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate data() {
		// TODO Auto-generated method stub
		return null;
	}

}
